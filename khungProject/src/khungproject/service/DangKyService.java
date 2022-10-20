package khungproject.service;

import khungproject.DomainModels.KhachHangModel;
import khungproject.Repository.DangKyRepo;

public interface DangKyService {

    public DangKyRepo repo = new DangKyRepo();

    public boolean dangky(KhachHangModel khm);
}
