package org.example.sinhvien.model;

public class Clazz {
    private String id;
    private String name;
    private String maKhoa;
    private String maKhoaHoc;
    private String maHDT;

    public Clazz() {
    }

    public Clazz(String id, String name, String maKhoa, String maKhoaHoc, String maHDT) {
        this.id = id;
        this.name = name;
        this.maKhoa = maKhoa;
        this.maKhoaHoc = maKhoaHoc;
        this.maHDT = maHDT;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaKhoa() {
        return maKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        this.maKhoa = maKhoa;
    }

    public String getMaKhoaHoc() {
        return maKhoaHoc;
    }

    public void setMaKhoaHoc(String maKhoaHoc) {
        this.maKhoaHoc = maKhoaHoc;
    }

    public String getMaHDT() {
        return maHDT;
    }

    public void setMaHDT(String maHDT) {
        this.maHDT = maHDT;
    }
}
