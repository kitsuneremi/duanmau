package khungproject.Repo;

import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import khungproject.Modelx.ChiTietSPModel;
import khungproject.Modelx.HoaDonChiTietModel;
import khungproject.Modelx.HoaDonModel;
import khungproject.Modelx.SanPhamModel;

public class Repo {

    public ArrayList<ChiTietSPModel> getlistsp() {
        try {
            ArrayList<ChiTietSPModel> list = new ArrayList<>();
            String sql2 = "select SanPham.id, SanPham.Ma, SanPham.Ten, ChiTietSP.idnsx, ChiTietSP.idmausac, ChiTietSP.iddongsp, ChiTietSP.nambh, ChiTietSP.mota, ChiTietSP.soluongton, ChiTietSP.gianhap, ChiTietSP.giaban from SanPham join ChiTietSP on SanPham.Id = ChiTietSP.IdSP";
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql2);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChiTietSPModel spm = new ChiTietSPModel();
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

    public String tratensp(String id) {
        try {
            String sql = "select ten from sanpham where id = convert(uniqueidentifier,?)";
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
    
    public String traidctsp(String idsp) {
        try {
            String sql = "select id from chitietsp where idsp = ?";
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, idsp);
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
    
    public String traidsp(String ma) {
        try {
            String sql = "select id from sanpham where ma = ?";
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
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
    
    
    
    public boolean luuhoadon(HoaDonChiTietModel hdctm,HoaDonModel hdm){
        try {
            String sql = "insert into hoadonchitiet(idhoadon,idchitietsp,soluong,dongia) values (convert(uniqueidentifier,?),convert(uniqueidentifier,?),?,?)";
            String sql2 = "insert into hoadon(id,idkh,idnv,ma,ngaytao,ngaythanhtoan,tinhtrang) values (newid(),convert(uniqueidentifier,'73FE85CB-5BD1-4C57-81CA-3A2974EF15DC'),convert(uniqueidentifier,'30F858CE-D607-44F2-A61D-B34FF91B4B94'),?,?,?,?)";
            String sql3 = "select id from hoadon";
            Connection conn = DBConnection.connection();

            PreparedStatement ps = conn.prepareStatement(sql2);
            ps.setString(1, hdm.getMa());
            ps.setDate(2, new java.sql.Date(hdm.getNgaytao().getTime()));
            ps.setDate(3, new java.sql.Date(hdm.getNgaytao().getTime()));
            ps.setInt(4, hdm.getTinhtrang());
            ps.executeUpdate();
            ps.close();
            
            
            String x = "";
            ps = conn.prepareStatement(sql3);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                x = rs.getString(1);
            }
            ps.close();
            
            
            ps = conn.prepareStatement(sql);
            ps.setString(1, x);
            ps.setString(2, hdctm.getSpm().getId());
            ps.setInt(3, hdctm.getSoluong());
            ps.setDouble(4, hdctm.getSpm().getGiaban());
            ps.executeUpdate();
            ps.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    public ArrayList<HoaDonModel> loadhoadon(){
        try {
            String sql = "select id,ma,ngaytao,idnv,tinhtrang from hoadon";
            ArrayList<HoaDonModel> list = new ArrayList<>();
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                HoaDonModel hdm = new HoaDonModel();
                hdm.setId(rs.getString(1));
                hdm.setMa(rs.getString(2));
                hdm.setNgaytao(rs.getDate(3));
                hdm.setIdnv(rs.getString(4));
                hdm.setTinhtrang(rs.getInt(5));
                list.add(hdm);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
