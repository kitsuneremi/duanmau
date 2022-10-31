package khungproject.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import khungproject.DomainModels.KhachHangModel;
import khungproject.DomainModels.KhachHangModelx;
import khungproject.Repository.DBConnection;
import khungproject.Repository.KhachHangRepo;
import khungproject.ViewModel.KhachHangViewModel;
import khungproject.ViewModel.KhachHangViewModelx;

public interface KhachHangService {

    public KhachHangRepo repo = new KhachHangRepo();

    public ArrayList<KhachHangViewModelx> getlistkh();

    public boolean insert(KhachHangModel khmd);
    
    public boolean update(KhachHangModel khmd);

    public boolean delete(KhachHangModel khmd);
}
