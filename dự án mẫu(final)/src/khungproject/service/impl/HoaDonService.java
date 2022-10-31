package khungproject.service.impl;

import java.util.ArrayList;
import khungproject.ViewModel.ChiTietSPViewModel;
import khungproject.DomainModels.HoaDonChiTietModel;
import khungproject.DomainModels.HoaDonModel;
import khungproject.ViewModel.HoaDonViewModel;

public class HoaDonService implements khungproject.service.HoaDonService {

    @Override
    public ArrayList<ChiTietSPViewModel> getlistsp() {
        return repo.getlistsp();
    }

    @Override
    public boolean luuhoadon(HoaDonChiTietModel hdctm, HoaDonModel hdm, String makh) {
        return repo.luuhoadon(hdctm, hdm, makh);
    }

    @Override
    public ArrayList<HoaDonModel> loadhoadon() {
        return repo.loadhoadon();
    }

    @Override
    public boolean updatehoadon(HoaDonChiTietModel hdctm, String idsp) {
        return repo.updatehoadon(hdctm,idsp);
    }

    @Override
    public ArrayList<String> loadcbbmanhanvien() {
        return repo.loadcbbmanhanvien();
    }

    @Override
    public String tra(String x, String y) {
        return repo.tra(x, y);
    }
}
