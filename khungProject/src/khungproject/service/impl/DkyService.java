package khungproject.service.impl;

import khungproject.DomainModels.KhachHangModel;

import khungproject.Repository.DkyRepo;
import khungproject.service.DKyService;

public class DkyService implements DKyService{
    @Override
    public boolean dangky(KhachHangModel khm) {
        return repo.dangky(khm);

    }
}
