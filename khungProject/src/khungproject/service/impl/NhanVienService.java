package khungproject.service.impl;

import java.util.ArrayList;
import khungproject.DomainModels.DangNhapModel;

public class NhanVienService implements khungproject.service.NhanVienService {

    @Override
    public ArrayList<DangNhapModel> dangnhapnhanvien() {
        return repo.dangnhapnhanvien();
    }

    @Override
    public ArrayList<DangNhapModel> dangnhapkhachhang() {
        return repo.dangnhapkhachhang();
    }
}
