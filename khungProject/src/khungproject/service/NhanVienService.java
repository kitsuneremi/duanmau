package khungproject.service;

import java.util.ArrayList;
import khungproject.Modelx.DangNhapModel;

import khungproject.Repository.NhanVienRepo;

public class NhanVienService {

    private NhanVienRepo repo = new NhanVienRepo();

    public ArrayList<DangNhapModel> dangnhapnhanvien() {
        return repo.dangnhapnhanvien();
    }

    public ArrayList<DangNhapModel> dangnhapkhachhang() {
        return repo.dangnhapkhachhang();
    }
}
