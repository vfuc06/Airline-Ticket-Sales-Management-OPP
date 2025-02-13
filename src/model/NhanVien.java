package model;
public class NhanVien {
    private int MaNhanvien;
    private String TennhanVien;
    private String Sodienthoai;
    private String Diachi;

    public NhanVien() {
    }
    public NhanVien(String sodienthoai, String diachi, int maNhanvien, String tennhanVien) {
        Sodienthoai = sodienthoai;
        Diachi = diachi;
        maNhanvien = maNhanvien;
        TennhanVien = tennhanVien;
    }

    public int getMaNhanvien() {
        return MaNhanvien;
    }

    public void setMaNhanvien(int maNhanvien) {
        MaNhanvien = maNhanvien;
    }

    public String getTennhanVien() {
        return TennhanVien;
    }

    public void setTennhanVien(String tennhanVien) {
        TennhanVien = tennhanVien;
    }

    public String getSodienthoai() {
        return Sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        Sodienthoai = sodienthoai;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }
}
