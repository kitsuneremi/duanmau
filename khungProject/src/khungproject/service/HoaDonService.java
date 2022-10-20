package khungproject.service;

import java.util.ArrayList;
import khungproject.DomainModels.HoaDonChiTietModel;
import khungproject.DomainModels.HoaDonModel;
import khungproject.Repository.HoaDonRepo;
import khungproject.ViewModel.ChiTietSPViewModel;
import khungproject.ViewModel.HoaDonViewModel;

public interface HoaDonService {

    public HoaDonRepo repo = new HoaDonRepo();

    public ArrayList<ChiTietSPViewModel> getlistsp();

    public String tra(String x, String y);

    public boolean luuhoadon(HoaDonChiTietModel hdctm, HoaDonModel hdm, String makh);

    public ArrayList<HoaDonModel> loadhoadon();

    public boolean updatehoadon(HoaDonChiTietModel hdctm, String idsp);

    public ArrayList<String> loadcbbmanhanvien();

}
