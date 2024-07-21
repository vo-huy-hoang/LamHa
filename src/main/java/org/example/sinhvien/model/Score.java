package org.example.sinhvien.model;

public class Score {
    private String studentId;
    private String maMH;
    private Integer hocKy;
    private Double diemLan1;
    private Double diemLan2;

    public Score() {
    }

    public Score(String studentId, String maMH, Integer hocKy, Double diemLan1, Double diemLan2) {
        this.studentId = studentId;
        this.maMH = maMH;
        this.hocKy = hocKy;
        this.diemLan1 = diemLan1;
        this.diemLan2 = diemLan2;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public Integer getHocKy() {
        return hocKy;
    }

    public void setHocKy(Integer hocKy) {
        this.hocKy = hocKy;
    }

    public Double getDiemLan1() {
        return diemLan1;
    }

    public void setDiemLan1(Double diemLan1) {
        this.diemLan1 = diemLan1;
    }

    public Double getDiemLan2() {
        return diemLan2;
    }

    public void setDiemLan2(Double diemLan2) {
        this.diemLan2 = diemLan2;
    }
}
