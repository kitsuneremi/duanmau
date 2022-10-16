package khungproject.DomainModels;

import khungproject.ViewModel.ChiTietSPViewModel;

public class HoaDonChiTietModel {
    String idhoadon;
    int soluong;
    ChiTietSPViewModel spm;

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

    public ChiTietSPViewModel getSpm() {
        return spm;
    }

    public void setSpm(ChiTietSPViewModel spm) {
        this.spm = spm;
    }

   
}
