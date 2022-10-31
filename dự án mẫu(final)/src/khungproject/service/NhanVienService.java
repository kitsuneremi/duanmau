package khungproject.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import khungproject.DomainModels.DangNhapModel;
import khungproject.DomainModels.NhanVienModel;
import khungproject.Repository.DBConnection;
import khungproject.Repository.NhanVienRepo;
import khungproject.ViewModel.NhanVienViewModel;


public interface NhanVienService {
    public NhanVienRepo repo = new NhanVienRepo();
    public ArrayList<NhanVienViewModel> getlist();

    public boolean insert(NhanVienModel nvm);

    public boolean update(NhanVienModel nvm);
    
    public boolean delete(String id);
}
