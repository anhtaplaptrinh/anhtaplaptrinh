package com.example.had_store.Model;

public class QuanLy {
    private String maQl;
    private String tenQl,matKhauQl;
    private int soQl;
    private String emailQl;
    private String anhQl;

    @Override
    public String toString() {
        return "QuanLy{" +
                "maQl=" + maQl +
                ", tenQl='" + tenQl + '\'' +
                ", matKhauQl='" + matKhauQl + '\'' +
                ", soQl=" + soQl +
                ", emailQl='" + emailQl + '\'' +
                ", anhQl='" + anhQl + '\'' +
                '}';
    }

    public QuanLy() {
    }

    public String getMaQl() {
        return maQl;
    }

    public void setMaQl(String maQl) {
        this.maQl = maQl;
    }

    public String getTenQl() {
        return tenQl;
    }

    public void setTenQl(String tenQl) {
        this.tenQl = tenQl;
    }

    public String getMatKhauQl() {
        return matKhauQl;
    }

    public void setMatKhauQl(String matKhauQl) {
        this.matKhauQl = matKhauQl;
    }

    public int getSoQl() {
        return soQl;
    }

    public void setSoQl(int soQl) {
        this.soQl = soQl;
    }

    public String getEmailQl() {
        return emailQl;
    }

    public void setEmailQl(String emailQl) {
        this.emailQl = emailQl;
    }

    public String getAnhQl() {
        return anhQl;
    }

    public void setAnhQl(String anhQl) {
        this.anhQl = anhQl;
    }

    public QuanLy(String maQl, String tenQl, String matKhauQl, int soQl, String emailQl, String anhQl) {
        this.maQl = maQl;
        this.tenQl = tenQl;
        this.matKhauQl = matKhauQl;
        this.soQl = soQl;
        this.emailQl = emailQl;
        this.anhQl = anhQl;
    }
}
