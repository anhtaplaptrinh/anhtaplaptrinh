package com.example.had_store.Model;

public class KhachHang {
    private int maKh;
    private String tenKh;
    private int soKh;
    private String emailKh;
    private String diaChiKh;

    public KhachHang() {
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "maKh=" + maKh +
                ", tenKh='" + tenKh + '\'' +
                ", soKh=" + soKh +
                ", emailKh='" + emailKh + '\'' +
                ", diaChiKh='" + diaChiKh + '\'' +
                ", anhKh='" + anhKh + '\'' +
                '}';
    }

    public int getMaKh() {
        return maKh;
    }

    public void setMaKh(int maKh) {
        this.maKh = maKh;
    }

    public String getTenKh() {
        return tenKh;
    }

    public void setTenKh(String tenKh) {
        this.tenKh = tenKh;
    }

    public int getSoKh() {
        return soKh;
    }

    public void setSoKh(int soKh) {
        this.soKh = soKh;
    }

    public String getEmailKh() {
        return emailKh;
    }

    public void setEmailKh(String emailKh) {
        this.emailKh = emailKh;
    }

    public String getDiaChiKh() {
        return diaChiKh;
    }

    public void setDiaChiKh(String diaChiKh) {
        this.diaChiKh = diaChiKh;
    }

    public String getAnhKh() {
        return anhKh;
    }

    public void setAnhKh(String anhKh) {
        this.anhKh = anhKh;
    }

    public KhachHang(int maKh, String tenKh, int soKh, String emailKh, String diaChiKh, String anhKh) {
        this.maKh = maKh;
        this.tenKh = tenKh;
        this.soKh = soKh;
        this.emailKh = emailKh;
        this.diaChiKh = diaChiKh;
        this.anhKh = anhKh;
    }

    private String anhKh;
}
