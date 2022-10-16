package khungproject.DomainModels;

public class HoaDonChiTietModel {
    String idhoadon;
    int soluong;
    ChiTietSPModel spm;

    public String getIdhoadon() {
        return idhoadon;
    }

    public void setIdhoadon(String idhoadon) {
        this.idhoadon = idhoadon;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public ChiTietSPModel getSpm() {
        return spm;
    }

    public void setSpm(ChiTietSPModel spm) {
        this.spm = spm;
    }

   
}
