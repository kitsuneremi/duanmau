package khungproject.service.impl;


import java.util.ArrayList;
import khungproject.ViewModel.ChiTietSPViewModel;
import khungproject.DomainModels.HoaDonChiTietModel;
import khungproject.DomainModels.HoaDonModel;
import khungproject.ViewModel.SanPhamViewModel;

public class HoaDonService implements khungproject.service.HoaDonService{


    @Override
    public ArrayList<ChiTietSPViewModel> getlistsp() {
        return repo.getlistsp();
    }

    @Override
    public String tratensp(String id) {
        return repo.tratensp(id);
    }

    @Override
    public String traidctsp(String idsp) {
        return repo.traidctsp(idsp);
    }

    @Override
    public String traidsp(String ma) {
        return repo.traidsp(ma);
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
    public boolean updatehoadon(SanPhamViewModel ctspvm){
        return repo.updatehoadon(ctspvm);
    }

    @Override
    public String tramanhanvien(String idnv) {
        return repo.tramanhanvien(idnv);
    }

    @Override
    public ArrayList<String> loadcbbmanhanvien() {
        return repo.loadcbbmanhanvien();
    }

    @Override
    public String tratennhanvien(String ma) {
        return repo.tratennhanvien(ma);
    }
    
    @Override
    public String traidhoadon(String ma){
        return repo.traidhoadon(ma);
    }
}
