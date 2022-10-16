package khungproject.service.impl;

import java.util.ArrayList;
import khungproject.ViewModel.ChiTietSPViewModel;
import khungproject.DomainModels.DongSPModel;
import khungproject.DomainModels.MauSacModel;
import khungproject.DomainModels.NSXModel;
import khungproject.DomainModels.SanPhamModel;

public class ChiTietSPService implements khungproject.service.ChiTietSPService {

    @Override
    public ArrayList<ChiTietSPViewModel> getlistsp() {
        return repo.getlistsp();

    }

    @Override
    public boolean themsp(ChiTietSPViewModel spm) {
        return repo.themsp(spm);
    }

    @Override
    public boolean updatesp(ChiTietSPViewModel spm, String id) {
        return repo.updatesp(spm, id);
    }

    @Override
    public boolean deletesp(String id) {
        return repo.deletesp(id);

    }

    @Override
    public String traten(String loai, String id) {
        return repo.traten(loai, id);
    }

    @Override
    public SanPhamModel traidsp1(String ma) {
        return repo.traidsp1(ma);
    }

    @Override
    public ArrayList<MauSacModel> getcbbmau() {
        return repo.getcbbmau();
    }

    @Override
    public ArrayList<NSXModel> getcbbnsx() {
        return repo.getcbbnsx();
    }

    @Override
    public ArrayList<DongSPModel> getcbbdongsp() {
        return repo.getcbbdongsp();
    }

    @Override
    public boolean deleteall(String idsp, String idctsp) {
        return repo.deleteall(idsp, idctsp);
    }

    @Override
    public ArrayList<String> g(String y) {
        return repo.g(y);
    }
}
