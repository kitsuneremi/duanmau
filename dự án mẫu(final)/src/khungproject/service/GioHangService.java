
package khungproject.service;

import java.util.ArrayList;
import khungproject.DomainModels.GioHangModel;
import khungproject.Repository.GioHangRepo;

import khungproject.ViewModel.GioHangViewModel;


public interface GioHangService {
    public GioHangRepo repo = new GioHangRepo();
    public ArrayList<GioHangViewModel> getlist();
    
    public boolean insert(GioHangModel ghm);
    
    public boolean update(GioHangModel ghm);
    
    public boolean delete(String id);
}
