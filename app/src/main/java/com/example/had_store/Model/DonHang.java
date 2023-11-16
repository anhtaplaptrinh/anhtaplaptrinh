package com.example.had_store.Model;

import java.util.Date;

public class DonHang {
    private int maDon;
    private Date ngayLap;
    private String trangThaiDon,pTVanChuyen;
    private int maDonCt,maNv;

    public DonHang() {
    }

    @Override
    public String toString() {
        return "DonHang{" +
                "maDon=" + maDon +
                ", ngayLap=" + ngayLap +
                ", trangThaiDon='" + trangThaiDon + '\'' +
                ", pTVanChuyen='" + pTVanChuyen + '\'' +
                ", maDonCt=" + maDonCt +
                ", maNv=" + maNv +
                '}';
    }

    public int getMaDon() {
        return maDon;
    }

    public void setMaDon(int maDon) {
        this.maDon = maDon;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public String getTrangThaiDon() {
        return trangThaiDon;
    }

    public void setTrangThaiDon(String trangThaiDon) {
        this.trangThaiDon = trangThaiDon;
    }

    public String getpTVanChuyen() {
        return pTVanChuyen;
    }

    public void setpTVanChuyen(String pTVanChuyen) {
        this.pTVanChuyen = pTVanChuyen;
    }

    public int getMaDonCt() {
        return maDonCt;
    }

    public void setMaDonCt(int maDonCt) {
        this.maDonCt = maDonCt;
    }

    public int getMaNv() {
        return maNv;
    }

    public void setMaNv(int maNv) {
        this.maNv = maNv;
    }

    public DonHang(int maDon, Date ngayLap, String trangThaiDon, String pTVanChuyen, int maDonCt, int maNv) {
        this.maDon = maDon;
        this.ngayLap = ngayLap;
        this.trangThaiDon = trangThaiDon;
        this.pTVanChuyen = pTVanChuyen;
        this.maDonCt = maDonCt;
        this.maNv = maNv;
    }
}
