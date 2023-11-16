package com.example.had_store.Model;

public class SanPham {
    private int maSp;
    private String tenSp;
    private int giaSP,soLuongSp,maHang;
    private String anhSp;

    public SanPham() {
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "maSp=" + maSp +
                ", tenSp='" + tenSp + '\'' +
                ", giaSP=" + giaSP +
                ", soLuongSp=" + soLuongSp +
                ", maHang=" + maHang +
                ", anhSp='" + anhSp + '\'' +
                '}';
    }

    public int getMaSp() {
        return maSp;
    }

    public void setMaSp(int maSp) {
        this.maSp = maSp;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public int getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(int giaSP) {
        this.giaSP = giaSP;
    }

    public int getSoLuongSp() {
        return soLuongSp;
    }

    public void setSoLuongSp(int soLuongSp) {
        this.soLuongSp = soLuongSp;
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public String getAnhSp() {
        return anhSp;
    }

    public void setAnhSp(String anhSp) {
        this.anhSp = anhSp;
    }

    public SanPham(int maSp, String tenSp, int giaSP, int soLuongSp, int maHang, String anhSp) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.giaSP = giaSP;
        this.soLuongSp = soLuongSp;
        this.maHang = maHang;
        this.anhSp = anhSp;
    }
}
