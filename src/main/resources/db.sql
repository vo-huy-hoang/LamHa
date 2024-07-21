create database Student;
use Student;

create table MonHoc (
    MaMH char(5) primary key,
    TenMH nvarchar(30),
    SoTrinh int
);
create table Diem (
    MaSV Char(15),
    MaMH char(5),
    HocKy Int,
    DiemLan1 Int,
    DiemLan2 Int,
    foreign key (MaMH) references MonHoc(MaMH),
    foreign key (MaSV) references SinhVien(MaSV)
);
create table HeDT (
    MaHeDT Char(5) primary key ,
    TenHeDT nvarchar(30)
);
create table Lop (
    MaLop char(5) primary key ,
    TenLop nvarchar(50),
    MaKhoa char(5),
    MaHDT char(5),
    MaKhoaHoc char(5),
    foreign key (MaKhoa) references Khoa(MaKhoa),
    foreign key (MaHDT) references HeDT(MaHeDT),
    foreign key (MaKhoaHoc) references HeDT(MaHeDT)
);
create table SinhVien (
    MaSV char(15) primary key ,
    TenSV nvarchar(30),
    GioiTinh BIT,
    NgaySinh DATETIME,
    MaLop char(5),
    QueQuan nvarchar(100),
    foreign key (MaLop) references Lop(MaLop)
);
create table KhoaHoc (
    MaKhoaHoc char(5) primary key ,
    TenKhoaHoc nvarchar(30)
);
create table Khoa (
    MaKhoa char(5) primary key ,
    TenKhoa nvarchar(50),
    DiaChi nvarchar(100),
    DienThoai varchar(15)
);
select * from SinhVien join Lop L on L.MaLop = SinhVien.MaLop;