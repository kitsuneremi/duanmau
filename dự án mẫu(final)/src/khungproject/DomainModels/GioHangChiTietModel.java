
package khungproject.DomainModels;


public class GioHangChiTietModel {
    private GioHangModel gioHangModel;
    private ChiTietSPModel chiTietSPModel;
    private int soluong;
    private Double dongia,dongiakhigiam;

    public GioHangModel getGioHangModel() {
        return gioHangModel;
    }

    public void setGioHangModel(GioHangModel gioHangModel) {
        this.gioHangModel = gioHangModel;
    }

    public ChiTietSPModel getChiTietSPModel() {
        return chiTietSPModel;
    }

    public void setChiTietSPModel(ChiTietSPModel chiTietSPModel) {
        this.chiTietSPModel = chiTietSPModel;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public Double getDongia() {
        return dongia;
    }

    public void setDongia(Double dongia) {
        this.dongia = dongia;
    }

    public Double getDongiakhigiam() {
        return dongiakhigiam;
    }

    public void setDongiakhigiam(Double dongiakhigiam) {
        this.dongiakhigiam = dongiakhigiam;
    }
    
    
}
