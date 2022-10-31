package khungproject.service.impl;

import java.util.ArrayList;
import khungproject.DomainModels.KhachHangModel;
import khungproject.DomainModels.KhachHangModelx;
import khungproject.Repository.KhachHangRepo;
import khungproject.ViewModel.KhachHangViewModel;
import khungproject.ViewModel.KhachHangViewModelx;

public class KhachHangService implements khungproject.service.KhachHangService {

    @Override
    public ArrayList<KhachHangViewModelx> getlistkh() {
        return repo.getlistkh();
    }

    @Override
    public boolean insert(KhachHangModel khmd) {
        return repo.insert(khmd);
    }

    @Override
    public boolean delete(KhachHangModel khmd) {
        return repo.delete(khmd);
    }

    @Override
    public boolean update(KhachHangModel khmd) {
        return repo.update(khmd);
    }

}
