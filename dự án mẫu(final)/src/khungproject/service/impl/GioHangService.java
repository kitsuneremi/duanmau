
package khungproject.service.impl;

import java.util.ArrayList;
import khungproject.DomainModels.GioHangModel;
import khungproject.ViewModel.GioHangViewModel;


public class GioHangService implements khungproject.service.GioHangService{

    @Override
    public ArrayList<GioHangViewModel> getlist() {
        return repo.getlist();
    }

    @Override
    public boolean insert(GioHangModel ghm) {
        return repo.insert(ghm);
    }

    @Override
    public boolean update(GioHangModel ghm) {
        return repo.update(ghm);
    }

    @Override
    public boolean delete(String id) {
        return repo.delete(id);
    }

}
