package model;

public class KhachHang {
    private String MaKhachHang;
    private String CCCD;
    private String Sodienthoai;
    private String TenKhachHang;
    public KhachHang() {
    }
    public KhachHang(String maKhachHang, String CCCD, String sodienthoai, String tenKhachHang) {
        MaKhachHang = maKhachHang;
        this.CCCD = CCCD;
        Sodienthoai = sodienthoai;
        TenKhachHang = tenKhachHang;
    }

    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        MaKhachHang = maKhachHang;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getSodienthoai() {
        return Sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        Sodienthoai = sodienthoai;
    }

    public String getTenKhachHang() {
        return TenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        TenKhachHang = tenKhachHang;
    }

}
