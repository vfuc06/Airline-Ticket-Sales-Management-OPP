package model;
public class LichBay {
    private  String MaChuyenBay;
    private String SanBayDi;
    private String SanBayDen;
    private String NgayBay;
    private String GioBay;
    private int SoLuongHangGheThuongGia;
    private int SoLuongHangGheThuong;
    private  int SoLuongHangGheThuongGiaCon;
    private  int SoLuongHangGheThuongCon;

    public LichBay() {
    }

    public LichBay(String maChuyenBay, String sanBayDi, String sanBayDen, String ngayBay, String gioBay, int soLuongHangGheThuongGia, int soLuongHangGheThuong, int soLuongHangGheThuongGiaCon, int soLuongHangGheThuongCon) {
        MaChuyenBay = maChuyenBay;
        SanBayDi = sanBayDi;
        SanBayDen = sanBayDen;
        NgayBay = ngayBay;
        GioBay = gioBay;
        SoLuongHangGheThuongGia = soLuongHangGheThuongGia;
        SoLuongHangGheThuong = soLuongHangGheThuong;
        SoLuongHangGheThuongGiaCon = soLuongHangGheThuongGiaCon;
        SoLuongHangGheThuongCon = soLuongHangGheThuongCon;
    }

    public String getMaChuyenBay() {
        return MaChuyenBay;
    }

    public void setMaChuyenBay(String maChuyenBay) {
        MaChuyenBay = maChuyenBay;
    }

    public String getSanBayDi() {
        return SanBayDi;
    }

    public void setSanBayDi(String sanBayDi) {
        SanBayDi = sanBayDi;
    }

    public String getSanBayDen() {
        return SanBayDen;
    }

    public void setSanBayDen(String sanBayDen) {
        SanBayDen = sanBayDen;
    }

    public String getNgayBay() {
        return NgayBay;
    }

    public void setNgayBay(String ngayBay) {
        NgayBay = ngayBay;
    }

    public String getGioBay() {
        return GioBay;
    }

    public void setGioBay(String gioBay) {
        GioBay = gioBay;
    }

    public int getSoLuongHangGheThuongGia() {
        return SoLuongHangGheThuongGia;
    }

    public void setSoLuongHangGheThuongGia(int soLuongHangGheThuongGia) {
        SoLuongHangGheThuongGia = soLuongHangGheThuongGia;
    }

    public int getSoLuongHangGheThuong() {
        return SoLuongHangGheThuong;
    }

    public void setSoLuongHangGheThuong(int soLuongHangGheThuong) {
        SoLuongHangGheThuong = soLuongHangGheThuong;
    }

    public int getSoLuongHangGheThuongGiaCon() {
        return SoLuongHangGheThuongGiaCon;
    }

    public void setSoLuongHangGheThuongGiaCon(int soLuongHangGheThuongGiaCon) {
        SoLuongHangGheThuongGiaCon = soLuongHangGheThuongGiaCon;
    }

    public int getSoLuongHangGheThuongCon() {
        return SoLuongHangGheThuongCon;
    }

    public void setSoLuongHangGheThuongCon(int soLuongHangGheThuongCon) {
        SoLuongHangGheThuongCon = soLuongHangGheThuongCon;
    }
}
