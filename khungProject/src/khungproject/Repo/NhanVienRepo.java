package khungproject.Repo;

import java.sql.*;
import java.util.ArrayList;
import khungproject.Modelx.DangNhapModel;

public class NhanVienRepo {
    public ArrayList<DangNhapModel> dangnhapnhanvien(){
        try {
            ArrayList<DangNhapModel> list = new ArrayList<>();
            String sql = "select ma,matkhau from nhanvien";
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                DangNhapModel dnm = new DangNhapModel();
                dnm.setMa(rs.getString(1));
                dnm.setPass(rs.getString(2));
                list.add(dnm);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public ArrayList<DangNhapModel> dangnhapkhachhang(){
        try {
            ArrayList<DangNhapModel> list = new ArrayList<>();
            String sql = "select ma,matkhau from khachhang";
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                DangNhapModel dnm = new DangNhapModel();
                dnm.setMa(rs.getString(1));
                dnm.setPass(rs.getString(2));
                list.add(dnm);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
