package khungproject.Repo;

import khungproject.Modelx.ChiTietSPModel;
import java.sql.*;
import java.util.ArrayList;
import khungproject.Modelx.SanPhamModel;

public class ChiTietSPRepo {

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
            System.out.println("loi o load");
            ex.printStackTrace();
            return null;
        }

    }

    public boolean themsp(ChiTietSPModel spm) {
        try {
            String sql = "insert into chitietsp(idsp,idnsx,idmausac,iddongsp,nambh,mota,soluongton,gianhap,giaban) values(convert(uniqueidentifier,?),convert(uniqueidentifier,?),convert(uniqueidentifier,?),convert(uniqueidentifier,?),?,?,?,?,?)";
            String sql1 = "insert into SanPham(Id,Ma,Ten) values (newid(),?,?)";
            String sql2 = "select id,ma,ten from sanpham";
            Connection conn = DBConnection.connection();

            PreparedStatement ps1 = conn.prepareStatement(sql1);
            ps1.setString(1, spm.getSpm().getMa());
            ps1.setString(2, spm.getSpm().getTen());
            ps1.executeUpdate();

            PreparedStatement ps2 = conn.prepareStatement(sql2);
            ResultSet rs = ps2.executeQuery();

            SanPhamModel s = new SanPhamModel();
            while (rs.next()) {
                s.setId(rs.getString(1));
                s.setMa(rs.getString(2));
                s.setTen(rs.getString(3));
            }
            spm.setSpm(s);

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getId());
            ps.setString(2, spm.getIdnsx());
            ps.setString(3, spm.getIdmausac());
            ps.setString(4, spm.getIddongsp());
            ps.setInt(5, spm.getNambh());
            ps.setString(6, spm.getMota());
            ps.setInt(7, spm.getSoluongsp());
            ps.setFloat(8, spm.getGianhap());
            ps.setFloat(9, spm.getGiaban());
            ps.executeUpdate();

            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean updatesp(ChiTietSPModel spm, String id) {
        try {
            String sql = "update Chitietsp set idnsx = convert(uniqueidentifier,?),idmausac = convert(uniqueidentifier,?), iddongsp = convert(uniqueidentifier,?),nambh = ?,mota = ?,soluongton = ?,gianhap = ?,giaban = ? where idsp = convert(uniqueidentifier,?)";
            String sql2 = "update sanpham set ma = ?, ten = ? where id = convert(uniqueidentifier,?)";
            Connection conn = DBConnection.connection();

            PreparedStatement ps1 = conn.prepareStatement(sql2);
            ps1.setString(1, spm.getSpm().getMa());
            ps1.setString(2, spm.getSpm().getTen());
            ps1.setString(3, id);
            ps1.executeUpdate();
            System.out.println(spm.getSpm().getMa());
            System.out.println(spm.getMota());

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, spm.getIdnsx());
            ps.setString(2, spm.getIdmausac());
            ps.setString(3, spm.getIddongsp());
            ps.setInt(4, spm.getNambh());
            ps.setString(5, spm.getMota());
            ps.setInt(6, spm.getSoluongsp());
            ps.setFloat(7, spm.getGianhap());
            ps.setFloat(8, spm.getGiaban());
            ps.setString(9, id);
            ps.executeUpdate();
            System.out.println("");
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
            System.out.println("da den");
            ps1.setString(1, id);
            ps1.executeUpdate();
            ps1.close();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }

    }

    public String traidnsx(String ten) {
        try {
            String sql = "select id from nsx where ten = ?";
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ten);
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

    public String traiddongsp(String ten) {
        try {
            String sql = "select id from dongsp where ten = ?";
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ten);
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

    public String traidmau(String ten) {
        try {
            String sql = "select id from mausac where ten = ?";
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ten);
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

    public String traidsp(String ten) {
        try {
            String sql = "select id from sanpham where ten = ?";
            Connection conn = DBConnection.connection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, ten);
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

    public String tratennsx(String id) {
        try {
            String sql = "select ten from nsx where id = convert(uniqueidentifier,?)";
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

    public String tratenmau(String id) {
        try {
            String sql = "select ten from mausac where id = convert(uniqueidentifier,?)";
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

    public String tratendongsp(String id) {
        try {
            String sql = "select ten from dongsp where id = convert(uniqueidentifier,?)";
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
}
