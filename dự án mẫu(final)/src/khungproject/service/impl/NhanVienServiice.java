package khungproject.service.impl;

import java.util.ArrayList;
import khungproject.DomainModels.DangNhapModel;
import khungproject.DomainModels.NhanVienModel;
import khungproject.ViewModel.NhanVienViewModel;

public class NhanVienServiice implements khungproject.service.NhanVienService {

    @Override
    public ArrayList<NhanVienViewModel> getlist() {
        return repo.getlist();
    }

    @Override
    public boolean insert(NhanVienModel nvm) {
        return repo.insert(nvm);
    }

    @Override
    public boolean update(NhanVienModel nvm) {
        return repo.update(nvm);
    }

    @Override
    public boolean delete(String id) {
        return repo.delete(id);
    }

}
