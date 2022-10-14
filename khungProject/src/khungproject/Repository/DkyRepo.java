package khungproject.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import khungproject.Modelx.KhachHangModel;

public class DkyRepo {
    public boolean dangky(KhachHangModel khm){
        try {
            String sql = "insert into khachhang(id,ma,ten,tendem,ho,ngaysinh,sdt,diachi,thanhpho,quocgia,matkhau) values(newid(),?,?,?,?,?,?,?,?,?,?)";
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, khm.getMa());
            ps.setString(2, khm.getTen());
            ps.setString(3, khm.getTendem());
            ps.setString(4, khm.getHo());
            ps.setDate(5, new java.sql.Date(khm.getNgaySinh().getTime()));
            ps.setString(6, khm.getSdt());
            ps.setString(7, khm.getDiachi());
            ps.setString(8, khm.getThanhpho());
            ps.setString(9, khm.getQuocgia());
            ps.setString(10, khm.getMatkhau());
            try{
                return ps.executeUpdate() > 0;
            }catch(NullPointerException ex){
                ps.close();
                String sql1 = "insert into khachhang(id,ma,ten,matkhau) values(newid(),?,?,?)";
                PreparedStatement ps1 = conn.prepareStatement(sql1);
                ps1.setString(1, khm.getMa());
                ps1.setString(2, khm.getTen());
                ps1.setString(3, khm.getMatkhau());
                return ps1.executeUpdate() > 0;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
        
    }
}
