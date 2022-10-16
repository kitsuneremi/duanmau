package khungproject.ViewModel;

public class SanPhamViewModel {

    String masp, tensp, mota;
    int nambh, slsp;
    double gianhap, giaban;

    public SanPhamViewModel() {
    }

    public SanPhamViewModel(String masp, String tensp, String mota, int nambh, int slsp, double gianhap, double giaban) {
        this.masp = masp;
        this.tensp = tensp;
        this.mota = mota;
        this.nambh = nambh;
        this.slsp = slsp;
        this.gianhap = gianhap;
        this.giaban = giaban;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getNambh() {
        return nambh;
    }

    public void setNambh(int nambh) {
        this.nambh = nambh;
    }

    public int getSlsp() {
        return slsp;
    }

    public void setSlsp(int slsp) {
        this.slsp = slsp;
    }

    public double getGianhap() {
        return gianhap;
    }

    public void setGianhap(double gianhap) {
        this.gianhap = gianhap;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }

}
