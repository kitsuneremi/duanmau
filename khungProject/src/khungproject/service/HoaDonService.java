/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package khungproject.service;

import java.util.ArrayList;
import khungproject.DomainModels.HoaDonChiTietModel;
import khungproject.DomainModels.HoaDonModel;
import khungproject.Repository.HoaDonRepo;
import khungproject.ViewModel.ChiTietSPViewModel;
import khungproject.ViewModel.SanPhamViewModel;

/**
 *
 * @author Binh
 */
public interface HoaDonService {
    
    public HoaDonRepo repo = new HoaDonRepo();

    public ArrayList<ChiTietSPViewModel> getlistsp();

    public String tratensp(String id);

    public String traidctsp(String idsp);

    public String traidsp(String ma);

    public boolean luuhoadon(HoaDonChiTietModel hdctm, HoaDonModel hdm, String makh);

    public ArrayList<HoaDonModel> loadhoadon();

    public boolean updatehoadon(SanPhamViewModel ctspvm);

    public String tramanhanvien(String idnv);

    public ArrayList<String> loadcbbmanhanvien();

    public String tratennhanvien(String ma);
    
    public String traidhoadon(String ma);
}
