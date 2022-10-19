package khungproject.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.sql.*;
import khungproject.ViewModel.ChiTietSPViewModel;
import khungproject.DomainModels.HoaDonChiTietModel;
import khungproject.DomainModels.HoaDonModel;
import khungproject.DomainModels.SanPhamModel;
import khungproject.ViewModel.SanPhamViewModel;

public class HoaDonRepo {

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

    public boolean luuhoadon(HoaDonChiTietModel hdctm, HoaDonModel hdm, String makh) {
        try {
            String s1 = "select id from khachhang where ma = ?";
            String s2 = "declare @id uniqueidentifier;set @id = newid(); insert into hoadon(id,idkh,ma,ngaytao,tinhtrang) values (@id,convert(uniqueidentifier,?),?,?,?)";
            Connection conn = DBConnection.connection();

            String idkh = "";
            PreparedStatement ps = conn.prepareStatement(s1);
            ps.setString(1, makh);
            ResultSet rs1 = ps.executeQuery();
            while (rs1.next()) {
                idkh = rs1.getString(1);
            }
            ps.close();

            ps = conn.prepareStatement(s2);
            ps.setString(1, idkh);
            ps.setString(2, hdm.getMa());
            ps.setDate(3, new java.sql.Date(hdm.getNgaytao().getTime()));
            ps.setInt(4, hdm.getTinhtrang());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public ArrayList<HoaDonModel> loadhoadon() {
        try {
            String sql = "select hoadon.id,hoadon.ma,hoadon.ngaytao,hoadon.idnv,hoadon.tinhtrang from hoadon";
            ArrayList<HoaDonModel> list = new ArrayList<>();
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
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

    public boolean updatehoadon(SanPhamViewModel ctspvm) {
        try {
            String s1 = "select id from chitietsp where idsp = convert(uniqueidentifier,?)";
            String s2 = "update hoadon set tinhtrang = 1,ngaythanhtoan = ? where id = convert(uniqueidentifier,?)";
            String s3 = "insert into HoaDonChiTiet values(convert(uniqueidentifier,?),convert(uniqueidentifier,?),?,?)";
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(s1);
            String b = "";
            ps.setString(1, ctspvm.getIdsp());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                b = rs.getString(1);
            }
            ps.close();

            ps = conn.prepareStatement(s2);
            Date d = new Date();
            ps.setDate(1, new java.sql.Date(d.getTime()));
            ps.setString(2, ctspvm.getIdhd());
            ps.executeUpdate();
            ps.close();

            
            
            ps = conn.prepareStatement(s3);
            ps.setString(1, ctspvm.getIdhd());
            ps.setString(2, b);
            ps.setInt(3, ctspvm.getSoluong());
            ps.setDouble(4, ctspvm.getDongia());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public String tramanhanvien(String idnv) {
        try {
            String sql = "select ma from nhanvien where id = convert(uniqueidentifier,?)";
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, idnv);
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

    public ArrayList<String> loadcbbmanhanvien() {
        try {
            ArrayList<String> list = new ArrayList<>();
            String sql = "select ma from NhanVien";
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(rs.getString(1));
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public String traidhoadon(String ma){
        try {
            String sql = "select id from hoadon where ma = ?";
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

    public String tratennhanvien(String ma) {
        try {
            String sql = "select ten from NhanVien where ma = ?";
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

    public boolean updateslsp(String ma) {
        try {
            String sql = "update chitietsp set slsp = ? where ";
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);

            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
