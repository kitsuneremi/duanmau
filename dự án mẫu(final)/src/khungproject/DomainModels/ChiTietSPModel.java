package khungproject.DomainModels;

public class ChiTietSPModel {

    private String id;
    private SanPhamModel spm;
    private NSXModel nsx;
    private MauSacModel mausac;
    private DongSPModel dongsp;
    private int nambh;
    private String mota;
    private int soluongsp;
    private Float gianhap;
    private Float giaban;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SanPhamModel getSpm() {
        return spm;
    }

    public void setSpm(SanPhamModel spm) {
        this.spm = spm;
    }

    public NSXModel getNsx() {
        return nsx;
    }

    public void setNsx(NSXModel nsx) {
        this.nsx = nsx;
    }

    public MauSacModel getMausac() {
        return mausac;
    }

    public void setMausac(MauSacModel mausac) {
        this.mausac = mausac;
    }

    public DongSPModel getDongsp() {
        return dongsp;
    }

    public void setDongsp(DongSPModel dongsp) {
        this.dongsp = dongsp;
    }
    
    

    public int getNambh() {
        return nambh;
    }

    public void setNambh(int nambh) {
        this.nambh = nambh;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getSoluongsp() {
        return soluongsp;
    }

    public void setSoluongsp(int soluongsp) {
        this.soluongsp = soluongsp;
    }

    public Float getGianhap() {
        return gianhap;
    }

    public void setGianhap(Float gianhap) {
        this.gianhap = gianhap;
    }

    public Float getGiaban() {
        return giaban;
    }

    public void setGiaban(Float giaban) {
        this.giaban = giaban;
    }

}
