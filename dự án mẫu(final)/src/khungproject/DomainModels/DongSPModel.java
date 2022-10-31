package khungproject.DomainModels;

public class DongSPModel {

    String id, ma, ten;

    public DongSPModel() {
    }

    public DongSPModel(String id, String ma, String ten) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
    }

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
        return "DongSPModel{" + "id=" + id + ", ma=" + ma + ", ten=" + ten + '}';
    }

}
