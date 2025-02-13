package model;
public class PhieuDatChoKhachHang {
    private int MaPhieu ;
    private String MaKhachHang;
    private String MaChuyenBay ;
    private String HangVe ;
    private String GiaVe;
    private int SoGheDat ;
    private int ThanhTien;
    private String NgayDat ;
    private String tinhTrang;
    public PhieuDatChoKhachHang() {

    }

    public PhieuDatChoKhachHang(int maPhieu, String maKhachHang, String maChuyenBay, String hangVe, String giaVe, int soGheDat, int thanhTien, String ngayDat, String tinhTrang) {
        MaPhieu = maPhieu;
        MaKhachHang = maKhachHang;
        MaChuyenBay = maChuyenBay;
        HangVe = hangVe;
        GiaVe = giaVe;
        SoGheDat = soGheDat;
        ThanhTien = thanhTien;
        NgayDat = ngayDat;
        this.tinhTrang = tinhTrang;
    }

    public int getMaPhieu() {
        return MaPhieu;
    }

    public void setMaPhieu(int maPhieu) {
        MaPhieu = maPhieu;
    }

    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        MaKhachHang = maKhachHang;
    }

    public String getMaChuyenBay() {
        return MaChuyenBay;
    }

    public void setMaChuyenBay(String maChuyenBay) {
        MaChuyenBay = maChuyenBay;
    }

    public String getHangVe() {
        return HangVe;
    }

    public void setHangVe(String hangVe) {
        HangVe = hangVe;
    }

    public String getGiaVe() {
        return GiaVe;
    }

    public void setGiaVe(String giaVe) {
        GiaVe = giaVe;
    }

    public int getSoGheDat() {
        return SoGheDat;
    }

    public void setSoGheDat(int soGheDat) {
        SoGheDat = soGheDat;
    }

    public int getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(int thanhTien) {
        ThanhTien = thanhTien;
    }

    public String getNgayDat() {
        return NgayDat;
    }

    public void setNgayDat(String ngayDat) {
        NgayDat = ngayDat;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
}
