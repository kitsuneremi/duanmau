package khungproject.DomainModels;

import khungproject.ViewModel.ChiTietSPViewModel;

public class HoaDonChiTietModel {

    String idhoadon;
    String idctsp;
    int soluong;
    ChiTietSPViewModel ctspvm;
    HoaDonModel hdm;

    public String getIdctsp() {
        return idctsp;
    }

    public void setIdctsp(String idctsp) {
        this.idctsp = idctsp;
    }

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

    public ChiTietSPViewModel getCtspvm() {
        return ctspvm;
    }

    public void setCtspvm(ChiTietSPViewModel ctspvm) {
        this.ctspvm = ctspvm;
    }

    public HoaDonModel getHdm() {
        return hdm;
    }

    public void setHdm(HoaDonModel hdm) {
        this.hdm = hdm;
    }

}
