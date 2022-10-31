
package khungproject.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import khungproject.DomainModels.KhachHangModel;
import khungproject.ViewModel.KhachHangViewModelx;

public class KhachHangRepo {
    public ArrayList<KhachHangViewModelx> getlistkh(){
        try {
            ArrayList<KhachHangViewModelx> list = new ArrayList<>();
            String sql = "select ma,ten,tendem,ho,diachi,thanhpho,quocgia,ngaysinh,sdt from khachhang";
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                KhachHangViewModelx khvm = new KhachHangViewModelx();
                khvm.setMa(rs.getString(1));
                khvm.setTen(rs.getString(2));
                khvm.setTendem(rs.getString(3));
                khvm.setHo(rs.getString(4));
                khvm.setDiachi(rs.getString(5));
                khvm.setThanhpho(rs.getString(6));
                khvm.setQuocgia(rs.getString(7));
                khvm.setNgaySinh(rs.getDate(8));
                khvm.setSdt(rs.getString(9));
                list.add(khvm);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public boolean insert(KhachHangModel khmd){
        try{
            String sql = "insert into khachhang(id,ma,ten,tendem,ho,diachi,thanhpho,quocgia,matkhau,sdt,ngaysinh) values(newid(),?,?,?,?,?,?,?,?,?,?)";
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, khmd.getMa());
            ps.setString(2, khmd.getTen());
            ps.setString(3, khmd.getTendem());
            ps.setString(4, khmd.getHo());
            ps.setString(5, khmd.getDiachi());
            ps.setString(6, khmd.getThanhpho());
            ps.setString(7, khmd.getQuocgia());
            ps.setString(8, khmd.getMatkhau());
            ps.setString(9, khmd.getSdt());
            ps.setDate(10, new java.sql.Date(khmd.getNgaySinh().getTime()));
            return ps.executeUpdate() > 0;
        }catch(SQLException ex){
            ex.printStackTrace();
            return false;
        }
    }
    
    public boolean update(KhachHangModel khmd){
        try{
            String sql = "update khachhang set ten = ?,tendem = ?,ho = ? ,diachi = ?, thanhpho = ?, quocgia = ?,matkhau = ?,sdt = ?,ngaysinh = ? where ma = ?";
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, khmd.getTen());
            ps.setString(2, khmd.getTendem());
            ps.setString(3, khmd.getHo());
            ps.setString(4, khmd.getDiachi());
            ps.setString(5, khmd.getThanhpho());
            ps.setString(6, khmd.getQuocgia());
            ps.setString(7, khmd.getMatkhau());
            ps.setString(8, khmd.getSdt());
            ps.setDate(9, new java.sql.Date(khmd.getNgaySinh().getTime()));
            ps.setString(10, khmd.getMa());
            return ps.executeUpdate() > 0;
        }catch(SQLException ex){
            ex.printStackTrace();
            return false;
        }
    }
    
    public boolean delete(KhachHangModel khmd){
        try{
            String sql = "delete from khachhang where ma = ?";
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, khmd.getMa());
            return ps.executeUpdate() > 0;
        }catch(SQLException ex){
            ex.printStackTrace();
            return false;
        }
    }
}
