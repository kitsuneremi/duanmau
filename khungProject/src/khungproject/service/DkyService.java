package khungproject.service;

import khungproject.Modelx.KhachHangModel;

import khungproject.Repository.DkyRepo;

public class DkyService {

    private DkyRepo repo = new DkyRepo();

    public boolean dangky(KhachHangModel khm) {
        return repo.dangky(khm);

    }
}
