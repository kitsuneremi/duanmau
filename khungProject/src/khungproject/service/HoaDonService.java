package khungproject.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import khungproject.DomainModels.ChiTietSPModel;
import khungproject.DomainModels.HoaDonChiTietModel;
import khungproject.DomainModels.HoaDonModel;
import khungproject.Repository.DBConnection;

import khungproject.Repository.HoaDonRepo;
import khungproject.ViewModel.ChiTietSPViewModel;

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

    public boolean luuhoadon(HoaDonChiTietModel hdctm, HoaDonModel hdm, String makh) {
        return repo.luuhoadon(hdctm, hdm, makh);
    }

    public ArrayList<HoaDonModel> loadhoadon() {
        return repo.loadhoadon();
    }

    public boolean updatehoadon(ChiTietSPViewModel ctspvm){
        return repo.updatehoadon(ctspvm);
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
    
    public String traidhoadon(String ma){
        return repo.traidhoadon(ma);
    }
}
