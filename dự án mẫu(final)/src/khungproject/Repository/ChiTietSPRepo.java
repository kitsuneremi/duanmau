package khungproject.Repository;

import khungproject.ViewModel.ChiTietSPViewModel;
import java.sql.*;
import java.util.ArrayList;
import khungproject.DomainModels.ChiTietSPModel;
import khungproject.DomainModels.DongSPModel;
import khungproject.DomainModels.MauSacModel;
import khungproject.DomainModels.NSXModel;
import khungproject.DomainModels.SanPhamModel;

public class ChiTietSPRepo {

    public ArrayList<ChiTietSPViewModel> getlistsp() {
        try {
            ArrayList<ChiTietSPViewModel> list = new ArrayList<>();
            String sql2 = "select SanPham.id, SanPham.Ma, SanPham.Ten, ChiTietSP.idnsx, ChiTietSP.idmausac, ChiTietSP.iddongsp, ChiTietSP.nambh, ChiTietSP.mota, ChiTietSP.soluongton, ChiTietSP.gianhap, ChiTietSP.giaban from SanPham join ChiTietSP on SanPham.Id = ChiTietSP.IdSP";
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql2);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChiTietSPViewModel spm = new ChiTietSPViewModel();
                SanPhamModel s = new SanPhamModel();

                s.setId(rs.getString(1));
                s.setMa(rs.getString(2));
                s.setTen(rs.getString(3));

                spm.setSpm(s);

                spm.setIdnsx(rs.getString(4));
                spm.setIdmausac(rs.getString(5));
                spm.setIddongsp(rs.getString(6));

                spm.setNambh(rs.getInt(7));
                spm.setMota(rs.getString(8));
                spm.setSoluongsp(rs.getInt(9));

                spm.setGianhap(rs.getFloat(10));
                spm.setGiaban(rs.getFloat(11));
                list.add(spm);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }

    }

    public boolean themsp(ChiTietSPModel ctspm) {
        try {
            String sql = "declare @id uniqueidentifier; set @id = newid(); insert into SanPham(Id,Ma,Ten) values (@id,?,?); insert into chitietsp(idsp,idnsx,idmausac,iddongsp,nambh,mota,soluongton,gianhap,giaban) values(@id,convert(uniqueidentifier,?),convert(uniqueidentifier,?),convert(uniqueidentifier,?),?,?,?,?,?)";
            Connection conn = DBConnection.connection();

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, rdn());
            ps.setString(2, ctspm.getSpm().getTen());

            ps.setString(3, ctspm.getNsx().getId());
            ps.setString(4, ctspm.getMausac().getId());
            ps.setString(5, ctspm.getDongsp().getId());
            ps.setInt(6, ctspm.getNambh());
            ps.setString(7, ctspm.getMota());
            ps.setInt(8, ctspm.getSoluongsp());
            ps.setFloat(9, ctspm.getGianhap());
            ps.setFloat(10, ctspm.getGiaban());
            ps.executeUpdate();

            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean updatesp(ChiTietSPModel ctspm) {
        try {
            String sql = "update Chitietsp set idnsx = convert(uniqueidentifier,?), idmausac = convert(uniqueidentifier,?), iddongsp = convert(uniqueidentifier,?),nambh = ?,mota = ?,soluongton = ?,gianhap = ?,giaban = ? where idsp = convert(uniqueidentifier,?)";
            String sql2 = "update sanpham set ten = ? where id = convert(uniqueidentifier,?)";
            Connection conn = DBConnection.connection();

            PreparedStatement ps1 = conn.prepareStatement(sql2);
            ps1.setString(1, ctspm.getSpm().getTen());
            ps1.setString(2, ctspm.getSpm().getId());
            ps1.executeUpdate();

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ctspm.getNsx().getId());
            ps.setString(2, ctspm.getMausac().getId());
            ps.setString(3, ctspm.getDongsp().getId());
            ps.setInt(4, ctspm.getNambh());
            ps.setString(5, ctspm.getMota());
            ps.setInt(6, ctspm.getSoluongsp());
            ps.setFloat(7, ctspm.getGianhap());
            ps.setFloat(8, ctspm.getGiaban());
            ps.setString(9,ctspm.getSpm().getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean deletesp(String id) {
        try {

            String sql = "delete from chitietsp where idsp = convert(uniqueidentifier,?)";
            String sql2 = "delete from sanpham where id = convert(uniqueidentifier,?)";
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.executeUpdate();
            ps.close();

            PreparedStatement ps1 = conn.prepareStatement(sql2);
            ps1.setString(1, id);
            ps1.executeUpdate();
            ps1.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }

    }


    public String traten(String loai, String id) {
        try {
            String sql = "";
            sql = switch (loai) {
                case "nsx" -> "select ten from nsx where id = convert(uniqueidentifier,?)";
                case "mausac" -> "select ten from mausac where id = convert(uniqueidentifier,?)";
                case "dongsp" -> "select ten from dongsp where id = convert(uniqueidentifier,?)";
                case "idsp" -> "select id from sanpham where ten = ?";
                case "idctsp" -> "select id from chitietsp where idsp = convert(uniqueidentifier,?)";
                default -> "select ten from dongsp where id = convert(uniqueidentifier,?)";
            };
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getString(1);
            }
            return null;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public SanPhamModel traidsp1(String ma) {
        try {
            SanPhamModel spm = new SanPhamModel();
            String sql = "select * from SanPham where ma = ?";
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                spm.setId(rs.getString(1));
            }
            return spm;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public ArrayList<MauSacModel> getcbbmau() {
        try {
            String sql = "select * from mausac";
            ArrayList<MauSacModel> list = new ArrayList<>();
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                MauSacModel msm = new MauSacModel();
                msm.setId(rs.getString(1));
                msm.setMa(rs.getString(2));
                msm.setTen(rs.getString(3));
                list.add(msm);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public ArrayList<NSXModel> getcbbnsx() {
        try {
            String sql = "select * from nsx";
            ArrayList<NSXModel> list = new ArrayList<>();
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NSXModel nsxm = new NSXModel();
                nsxm.setId(rs.getString(1));
                nsxm.setMa(rs.getString(2));
                nsxm.setTen(rs.getString(3));
                list.add(nsxm);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public ArrayList<DongSPModel> getcbbdongsp() {
        try {
            String sql = "select * from dongsp";
            ArrayList<DongSPModel> list = new ArrayList<>();
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DongSPModel dspm = new DongSPModel();
                dspm.setId(rs.getString(1));
                dspm.setMa(rs.getString(2));
                dspm.setTen(rs.getString(3));
                list.add(dspm);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    private static String rdn() {
        StringBuilder sb = new StringBuilder();
        String b = "0123456789" + "abcdefghijklmnopqrstuvxyz";
        for (int i = 0; i < 10; i++) {
            int index = (int) (b.length() * Math.random());
            sb.append(b.charAt(index));
        }
        return sb.toString();
    }

    public boolean deleteall(String idsp, String idctsp) {
        try {
            String s = "";
            String s1 = "select idhoadon from hoadonchitiet where idchitietsp = convert(uniqueidentifier,?)";
            String s2 = "delete from hoadonchitiet where idchitietsp = convert(uniqueidentifier,?); delete from hoadon where id = convert(uniqueidentifier,?);delete from chitietsp where id = convert(uniqueidentifier,?);delete from sanpham where id = convert(uniqueidentifier,?)";
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(s1);
            ps.setString(1, idctsp);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                s = rs.getString(1);
            }
            ps.close();

            ps = conn.prepareStatement(s2);
            ps.setString(1, idctsp);
            ps.setString(2, s);
            ps.setString(3, idctsp);
            ps.setString(4, idsp);
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    public ArrayList<String> g(String y) {
        String id, ma, ten;
        int a = 0;
        int b = 0;
        
        for(int i = 0; i <y.length(); i++){
            if(y.substring(i, i + 1).equals("=")){
                a = i + 1;
                break;
            }
        }

        for (int i = 0; i < y.length(); i++) {
            if (y.substring(i, i + 1).equals(",")) {
                b = i;
                break;
            }
        }
        id = y.substring(a, b);

        int c = b + 12;
        for (int i = b + 5; i < y.length(); i++) {
            if (y.substring(i, i + 1).equals(",")) {
                c = i;
                break;
            }
        }
        ma = y.substring(b + 5, c);
        int last3 = c + 6;
        for (int i = last3; i < y.length(); i++) {
            if (y.substring(i, i + 1).equals("}")) {
                last3 = i;
                break;
            }
        }
        ten = y.substring(c + 6, last3);
        ArrayList<String> list = new ArrayList<>();
        list.add(id);
        list.add(ma);
        list.add(ten);
        return list;
    }
}
