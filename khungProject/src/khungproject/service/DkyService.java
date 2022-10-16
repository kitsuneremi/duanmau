package khungproject.service;

import khungproject.DomainModels.KhachHangModel;
import khungproject.Repository.DkyRepo;

public interface DKyService {

    public DkyRepo repo = new DkyRepo();

    public boolean dangky(KhachHangModel khm);
}
