package khungproject.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import khungproject.DomainModels.KhachHangModelx;
import khungproject.Repository.DBConnection;
import khungproject.Repository.KhachHangRepo;
import khungproject.ViewModel.KhachHangViewModel;

public interface KhachHangService {

    public KhachHangRepo repo = new KhachHangRepo();

    public ArrayList<KhachHangViewModel> getlistkh();

    public boolean insert(KhachHangModelx khmd);

    public boolean delete(KhachHangModelx khmd);
}
