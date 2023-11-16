package com.example.had_store.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {
    static final String dbName = "HAD_STORE";
    static  final  int dbVersion=1;
    public DbHelper(Context context){ super(context,dbName,null,dbVersion);}
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table QuanLy (" +
                "maQl Text primary key ," +
                "tenQl TEXT not null," +
                "matKhauQl TEXT not null," +
                "soQl integer not null," +
                "emailQl TEXT not null," +
                "anhQl text not null)");
        sqLiteDatabase.execSQL("insert into QuanLy values ('MQL1','Nguyễn Tuấn Dũng','123',0366691234,'dungntph35067@fpt.edu.vn','linkanh')");

        sqLiteDatabase.execSQL("create table NhanVien (" +
                "maNv Text primary key ," +
                "tenNv TEXT not null," +
                "matKhauNv TEXT not null," +
                "soNv integer not null," +
                "emailNv TEXT not null," +
                "anhNv text not null)");
        sqLiteDatabase.execSQL("insert into NhanVien values ('NV01','Nguyễn Tuấn ','123',0366691234,'dungntph@fpt.edu.vn','linkanh')");

        sqLiteDatabase.execSQL("create table KhachHang (" +
                "maKh integer primary key autoincrement," +
                "tenKh TEXT not null," +
                "soKh integer not null," +
                "emailKh TEXT not null," +
                "diaChiKh TEXT not null," +
                "anhKh text not null)");
        sqLiteDatabase.execSQL("insert into KhachHang values (1,'Nguyễn Dũng',0366691234,'dungnt67@fpt.edu.vn','Nho Quan - Ninh Binh','lnkanh')");


        sqLiteDatabase.execSQL("create table HangSanPham (" +
                "maHang integer primary key autoincrement," +
                "tenHang TEXT not null," +
                "diaChiHang TEXT not null," +
                "anhHang text not null)");
        sqLiteDatabase.execSQL("insert into HangSanPham values (1,'APPLE','Nam Tu Liem - Ha Noi','linkanh')");

        sqLiteDatabase.execSQL("create table SanPham (" +
                "maSp integer primary key autoincrement," +
                "tenSp text not null, " +
                "giaSp integer not null," +
                "soLuongSp integer not null," +
                "maHang integer references HangSanPham(maHang), " +
                "anhSp text not null )");
        sqLiteDatabase.execSQL("insert into SanPham values (1,'IPHONE 15 PRO MAX',35000000,123,1,'linkanh')");

        sqLiteDatabase.execSQL("create table DonHangChiTiet (" +
                "maDonCt integer primary key autoincrement," +
                "soLuong integer not null," +
                "diaChiDhct text not null," +
                "maSp integer references SanPham(maSp), " +
                "maKh integer references KhachHang(maKh) )");
        sqLiteDatabase.execSQL("insert into DonHangChiTiet values (1,4,'Ha Noi',1,1)");

        sqLiteDatabase.execSQL("create table DonHang (" +
                "maDon integer primary key autoincrement," +
                "ngayLap date not null," +
                "trangThaiDon text not null," +
                "pTVanChuyen text not null," +
                "maDonCt integer references DonHangChiTiet(maDonCt), " +
                "maNv integer references NhanVien(maNv) )");
        sqLiteDatabase.execSQL("insert into DonHang values (1,'20/12/2023','Dang doi don vi van chuyen','Van chuyen tan nha',1,1)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists QuanLy");
        sqLiteDatabase.execSQL("drop table if exists SanPham");
        sqLiteDatabase.execSQL("drop table if exists HangSanPham");
        sqLiteDatabase.execSQL("drop table if exists DonHang");
        sqLiteDatabase.execSQL("drop table if exists DonHangChiTiet");
        sqLiteDatabase.execSQL("drop table if exists NhanVien");
        sqLiteDatabase.execSQL("drop table if exists KhachHang");
        onCreate(sqLiteDatabase);
    }
}
