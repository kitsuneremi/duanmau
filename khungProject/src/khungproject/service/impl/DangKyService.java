package khungproject.service.impl;

import khungproject.DomainModels.KhachHangModel;

public class DangKyService implements khungproject.service.DangKyService{
    @Override
    public boolean dangky(KhachHangModel khm) {
        return repo.dangky(khm);

    }
}
