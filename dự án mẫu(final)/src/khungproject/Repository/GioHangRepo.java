
package khungproject.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import khungproject.ViewModel.GioHangViewModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import khungproject.DomainModels.GioHangModel;


public class GioHangRepo {
    public ArrayList<GioHangViewModel> getlist(){
        try {
            ArrayList<GioHangViewModel> list = new ArrayList<>();
            String sql = "select id,idkh,idnv,ma,tennguoinhan,sdt,diachi,ngaytao,ngaythanhtoan,tinhtrang from giohang";
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                GioHangViewModel ghvmd = new GioHangViewModel();
                ghvmd.setId(rs.getString(1));
                ghvmd.setIdkh(rs.getString(2));
                ghvmd.setIdnv(rs.getString(3));
                ghvmd.setMa(rs.getString(4));
                ghvmd.setTennguoinhan(rs.getString(5));
                ghvmd.setSdt(rs.getString(6));
                ghvmd.setNgaytao(rs.getDate(7));
                ghvmd.setNgaythanhtoan(rs.getDate(8));
                ghvmd.setTinhtrang(rs.getInt(9));
                list.add(ghvmd);
            }
            return list;
            
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public boolean insert(GioHangModel ghm){
        try {
            String sql = "insert into giohang (id,idkh,idnv,ma,tennguoinhan,sdt,diachi,ngaytao,ngaythanhtoan,tinhtrang) values(newid(),?,?,?,?,?,?,?,?)";
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ghm.getIdkh());
            ps.setString(2, ghm.getIdnv());
            ps.setString(3, ghm.getMa());
            ps.setString(4, ghm.getTennguoinhan());
            ps.setString(5, ghm.getSdt());
            ps.setString(6, ghm.getDiachi());
            ps.setDate(7, (Date) ghm.getNgaytao());
            ps.setDate(8, (Date) ghm.getNgaythanhtoan());
            ps.setInt(9, ghm.getTinhtrang());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        
    }
    
    public boolean update(GioHangModel ghm){
        try {
            String sql = "update giohang set idkh = ?,idnv = ?,ma = ?,tennguoinhan = ?,sdt = ?,diachi = ?,ngaytao = ?,ngaythanhtoan = ?,tinhtrang = ? where id = ?";
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ghm.getIdkh());
            ps.setString(2, ghm.getIdnv());
            ps.setString(3, ghm.getMa());
            ps.setString(4, ghm.getTennguoinhan());
            ps.setString(5, ghm.getSdt());
            ps.setString(6, ghm.getDiachi());
            ps.setDate(7, (Date) ghm.getNgaytao());
            ps.setDate(8, (Date) ghm.getNgaythanhtoan());
            ps.setInt(9, ghm.getTinhtrang());
            ps.setString(10, ghm.getId());
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    public boolean delete(String id){
        try {
            String sql = "delete from giohang where id = ?";
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
