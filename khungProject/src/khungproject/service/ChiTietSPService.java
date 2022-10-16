package khungproject.service;

import java.util.ArrayList;
import khungproject.DomainModels.DongSPModel;
import khungproject.DomainModels.MauSacModel;
import khungproject.DomainModels.NSXModel;
import khungproject.DomainModels.SanPhamModel;
import khungproject.Repository.ChiTietSPRepo;
import khungproject.ViewModel.ChiTietSPViewModel;

public interface ChiTietSPService {

    public ChiTietSPRepo repo = new ChiTietSPRepo();

    public ArrayList<ChiTietSPViewModel> getlistsp();

    public boolean themsp(ChiTietSPViewModel spm);

    public boolean updatesp(ChiTietSPViewModel spm, String id);

    public boolean deletesp(String id);

    public String traten(String loai, String id);

    public SanPhamModel traidsp1(String ma);

    public ArrayList<MauSacModel> getcbbmau();

    public ArrayList<NSXModel> getcbbnsx();

    public ArrayList<DongSPModel> getcbbdongsp();

    public boolean deleteall(String idsp, String idctsp);
    
    public ArrayList<String> g(String y);
}
