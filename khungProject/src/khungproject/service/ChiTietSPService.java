package khungproject.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import khungproject.Modelx.ChiTietSPModel;
import khungproject.Modelx.DongSPModel;
import khungproject.Modelx.MauSacModel;
import khungproject.Modelx.NSXModel;
import khungproject.Modelx.SanPhamModel;
import khungproject.Repository.ChiTietSPRepo;
import khungproject.Repository.DBConnection;

public class ChiTietSPService {

    private ChiTietSPRepo repo = new ChiTietSPRepo();

    public ArrayList<ChiTietSPModel> getlistsp() {
        return repo.getlistsp();

    }

    public boolean themsp(ChiTietSPModel spm) {
        return repo.themsp(spm);
    }

    public boolean updatesp(ChiTietSPModel spm, String id) {
        return repo.updatesp(spm, id);
    }

    public boolean deletesp(String id) {
        return repo.deletesp(id);

    }

    public String traten(String loai, String id) {
        return repo.traten(loai, id);
    }

    public SanPhamModel traidsp1(String ma) {
        return repo.traidsp1(ma);
    }

    public ArrayList<MauSacModel> getcbbmau() {
        return repo.getcbbmau();
    }

    public ArrayList<NSXModel> getcbbnsx() {
        return repo.getcbbnsx();
    }

    public ArrayList<DongSPModel> getcbbdongsp() {
        return repo.getcbbdongsp();
    }

    public boolean deleteall(String idsp, String idctsp) {
        return repo.deleteall(idsp, idctsp);
    }

}
