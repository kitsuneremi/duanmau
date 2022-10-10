package khungproject.Repo;

import java.util.ArrayList;
import java.util.Date;
import java.sql.*;
import khungproject.Modelx.ChiTietSPModel;
import khungproject.Modelx.HoaDonChiTietModel;
import khungproject.Modelx.HoaDonModel;
import khungproject.Modelx.SanPhamModel;

public class HoaDonRepo {

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
    
    
    
    public boolean luuhoadon(HoaDonChiTietModel hdctm,HoaDonModel hdm,String makh,Double tongtien){
        try {
            String s1 = "select id from khachhang where ma = ?";
            String s2 = "declare @id uniqueidentifier;set @id = newid(); insert into hoadon(id,idkh,ma,ngaytao,tinhtrang) values (@id,convert(uniqueidentifier,?),?,?,?); insert into hoadonchitiet(idhoadon,idchitietsp,soluong,dongia) values (@id,convert(uniqueidentifier,?),?,?)";
            Connection conn = DBConnection.connection();

            String idkh = "";           
            PreparedStatement ps = conn.prepareStatement(s1);
            ps.setString(1, makh);
            ResultSet rs1 = ps.executeQuery();
            while(rs1.next()){
                idkh = rs1.getString(1);
            }
            ps.close();
            ps = conn.prepareStatement(s2);
            ps.setString(1, idkh);
            ps.setString(2, hdm.getMa());
            ps.setDate(3, new java.sql.Date(hdm.getNgaytao().getTime()));
            ps.setInt(4, hdm.getTinhtrang());
            ps.setString(5, hdctm.getSpm().getId());
            ps.setInt(6, hdctm.getSoluong());
            ps.setDouble(7, tongtien);
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    
    
    public ArrayList<HoaDonModel> loadhoadon(){
        try {
            String sql = "select hoadon.id,hoadon.ma,hoadon.ngaytao,hoadon.idnv,hoadon.tinhtrang,hoadonchitiet.dongia from hoadon join hoadonchitiet on hoadonchitiet.idhoadon = hoadon.id";
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
                hdm.setDongia(rs.getDouble(6));
                list.add(hdm);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public boolean updatehoadon(int tinhtrang,Date ngaythanhtoan,String ma){
        try {
            String sql = "update hoadon set tinhtrang = ?,ngaythanhtoan = ? where ma = ?";
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, tinhtrang);
            ps.setDate(2, new java.sql.Date(ngaythanhtoan.getTime()));
            ps.setString(3, ma);
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            System.out.println("loi o day");
            ex.printStackTrace();
            return false;
        }
    }
    
    public String tramanhanvien(String idnv){
        try {
            String sql = "select ma from nhanvien where id = convert(uniqueidentifier,?)";
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, idnv);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                return rs.getString(1);
            }
            return null;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public ArrayList<String> loadcbbmanhanvien(){
        try {
            ArrayList<String> list = new ArrayList<>();
            String sql = "select ma from NhanVien";
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                list.add(rs.getString(1));
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public String tratennhanvien(String ma){
        try {
            String sql = "select ten from NhanVien where ma = ?";
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ma);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                return rs.getString(1);
            }
            return null;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
