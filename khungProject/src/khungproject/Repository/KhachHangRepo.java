
package khungproject.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import khungproject.DomainModels.KhachHangModelx;
import khungproject.ViewModel.KhachHangViewModel;

public class KhachHangRepo {
    public ArrayList<KhachHangViewModel> getlistkh(){
        try {
            ArrayList<KhachHangViewModel> list = new ArrayList<>();
            String sql = "select ma,ten,tendem,ho,diachi from khachhang";
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                KhachHangViewModel khvm = new KhachHangViewModel();
                khvm.setMa(rs.getString(1));
                khvm.setTen(rs.getString(2));
                khvm.setTendem(rs.getString(3));
                khvm.setHo(rs.getString(4));
                khvm.setDiachi(rs.getString(5));
                list.add(khvm);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public boolean insert(KhachHangModelx khmd){
        try{
            String sql = "insert into khachhang(id,ma,ten,tendem,ho,diachi) values(newid(),?,?,?,?,?)";
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, khmd.getMa());
            ps.setString(2, khmd.getTen());
            ps.setString(3, khmd.getTendem());
            ps.setString(4, khmd.getHo());
            ps.setString(5, khmd.getDiachi());
            return ps.executeUpdate() > 0;
        }catch(SQLException ex){
            ex.printStackTrace();
            return false;
        }
    }
    
    public boolean delete(KhachHangModelx khmd){
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
