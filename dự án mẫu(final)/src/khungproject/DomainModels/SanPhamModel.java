
package khungproject.DomainModels;


public class SanPhamModel {
    public String id;
    public String ma;
    public String ten;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "SanPhamModel{" + "id=" + id + ", ma=" + ma + ", ten=" + ten + '}';
    }
    
    
}
