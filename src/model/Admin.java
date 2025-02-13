package model;
public class Admin {
    private  int  id;
    private String cccd ;
    private String tendangnhap ;
    private String matkhau ;
    private String sodienthoai;
    private String hovaten;
    private String gioitinh ;
    public Admin() {
    }
    public Admin(int id, String cccd, String tendangnhap, String matkhau, String sodienthoai, String hovaten, String gioitinh) {
        this.id = id;
        this.cccd = cccd;
        this.tendangnhap = tendangnhap;
        this.matkhau = matkhau;
        this.sodienthoai = sodienthoai;
        this.hovaten = hovaten;
        this.gioitinh = gioitinh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getTendangnhap() {
        return tendangnhap;
    }

    public void setTendangnhap(String tendangnhap) {
        this.tendangnhap = tendangnhap;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getHovaten() {
        return hovaten;
    }

    public void setHovaten(String hovaten) {
        this.hovaten = hovaten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }
}
