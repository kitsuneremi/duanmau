package khungproject.service.impl;

import java.util.ArrayList;
import khungproject.DomainModels.KhachHangModelx;
import khungproject.Repository.KhachHangRepo;
import khungproject.ViewModel.KhachHangViewModel;

public class KhachHangService implements khungproject.service.KhachHangService {

    @Override
    public ArrayList<KhachHangViewModel> getlistkh() {
        return repo.getlistkh();
    }

    @Override
    public boolean insert(KhachHangModelx khmd) {
        return repo.insert(khmd);
    }

    @Override
    public boolean delete(KhachHangModelx khmd) {
        return repo.delete(khmd);
    }

}
