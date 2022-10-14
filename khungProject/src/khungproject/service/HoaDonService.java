package khungproject.service;

import java.util.ArrayList;
import java.util.Date;
import khungproject.Modelx.ChiTietSPModel;
import khungproject.Modelx.HoaDonChiTietModel;
import khungproject.Modelx.HoaDonModel;

import khungproject.Repository.HoaDonRepo;

public class HoaDonService {

    private HoaDonRepo repo = new HoaDonRepo();

    public ArrayList<ChiTietSPModel> getlistsp() {
        return repo.getlistsp();
    }

    public String tratensp(String id) {
        return repo.tratensp(id);
    }

    public String traidctsp(String idsp) {
        return repo.traidctsp(idsp);
    }

    public String traidsp(String ma) {
        return repo.traidsp(ma);
    }

    public boolean luuhoadon(HoaDonChiTietModel hdctm, HoaDonModel hdm, String makh, Double tongtien) {
        return repo.luuhoadon(hdctm, hdm, makh, tongtien);
    }

    public ArrayList<HoaDonModel> loadhoadon() {
        return repo.loadhoadon();
    }

    public boolean updatehoadon(int tinhtrang, Date ngaythanhtoan, String ma) {
        return repo.updatehoadon(tinhtrang, ngaythanhtoan, ma);
    }

    public String tramanhanvien(String idnv) {
        return repo.tramanhanvien(idnv);
    }

    public ArrayList<String> loadcbbmanhanvien() {
        return repo.loadcbbmanhanvien();
    }

    public String tratennhanvien(String ma) {
        return repo.tratennhanvien(ma);
    }
}
