package khungproject.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import khungproject.DomainModels.DangNhapModel;
import khungproject.DomainModels.NhanVienModel;
import khungproject.ViewModel.NhanVienViewModel;

public class NhanVienRepo {

    public ArrayList<NhanVienViewModel> getlist() {
        try {
            ArrayList<NhanVienViewModel> list = new ArrayList<>();
            String sql = "select id,ma,ho,tendem,ten,gioitinh,sdt,trangthai from nhanvien";
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVienViewModel nvvm = new NhanVienViewModel();
                nvvm.setId(rs.getString(1));
                nvvm.setMa(rs.getString(2));
                nvvm.setHo(rs.getString(3));
                nvvm.setTendem(rs.getString(4));
                nvvm.setTen(rs.getString(5));
                nvvm.setGioitinh(rs.getInt(6));
                nvvm.setSdt(rs.getString(7));
                nvvm.setTrangthai(rs.getInt(8));
                list.add(nvvm);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public boolean insert(NhanVienModel nvm) {
        try {
            String sql = "insert into nhanvien(id,ma,ten,tendem,ho,gioitinh,sdt,trangthai) values (newid(),?,?,?,?,?,?,?)";
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nvm.getMa());
            ps.setString(2, nvm.getTen());
            ps.setString(3, nvm.getTendem());
            ps.setString(4, nvm.getHo());
            ps.setInt(5, nvm.getGioitinh());
            ps.setString(6, nvm.getSdt());
            ps.setInt(7, nvm.getTrangthai());
            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean update(NhanVienModel nvm) {
        try {
            String sql = "update nhanvien set ma = ?, ten = ?, tendem = ?, ho = ?,gioitinh = ?,sdt = ?,trangthai = ? where id = ?";
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nvm.getMa());
            ps.setString(2, nvm.getTen());
            ps.setString(3, nvm.getTendem());
            ps.setString(4, nvm.getHo());
            ps.setInt(5, nvm.getGioitinh());
            ps.setString(6, nvm.getSdt());
            ps.setInt(7, nvm.getTrangthai());
            ps.setString(8, nvm.getId());
            return ps.executeUpdate() > 0;

        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }

    }
    
    public boolean delete(String id){
        try {
            String sql = "delete from nhanvien where id = ?";
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            try {
                String sql1 = "delete from hoadon where idnv = ?";
                String sql2 = "delete from nhanvien where id = ?";
                Connection conn = DBConnection.connection();
                PreparedStatement ps = conn.prepareStatement(sql1);
                ps.setString(1, id);
                ps.execute();
                ps.close();
                ps = conn.prepareStatement(sql2);
                ps.setString(1, id);
                return ps.executeUpdate() > 0;
            } catch (SQLException ex1) {
                ex.printStackTrace();
                return false;
            }
        }
    }
}
