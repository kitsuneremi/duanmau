package khungproject.service;

import java.util.ArrayList;
import khungproject.DomainModels.DangNhapModel;
import khungproject.Repository.NhanVienRepo;

public interface NhanVienService {

    public NhanVienRepo repo = new NhanVienRepo();

    public ArrayList<DangNhapModel> dangnhapnhanvien();

    public ArrayList<DangNhapModel> dangnhapkhachhang();
}
