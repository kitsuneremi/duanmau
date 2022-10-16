CREATE DATABASE du_an_mau_1
USE du_an_mau_1
GO
-- ChucVu
CREATE TABLE ChucVu(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
Ma VARCHAR(20) UNIQUE,
Ten NVARCHAR(50) DEFAULT NULL
)
GO
-- CuaHang
CREATE TABLE CuaHang(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT newid(),
Ma VARCHAR(20) UNIQUE,
Ten NVARCHAR(50) DEFAULT NULL,
DiaChi NVARCHAR(100) DEFAULT NULL,
ThanhPho NVARCHAR(50) DEFAULT NULL,
QuocGia NVARCHAR(50) DEFAULT NULL
)
GO
-- NhanVien
CREATE TABLE NhanVien(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
Ma VARCHAR(20) UNIQUE,
Ten NVARCHAR(30) DEFAULT NULL,
TenDem NVARCHAR(30) DEFAULT NULL,
Ho NVARCHAR(30) DEFAULT NULL,
GioiTinh NVARCHAR(10) DEFAULT NULL,
NgaySinh DATE DEFAULT NULL,
DiaChi NVARCHAR(100) DEFAULT NULL,
Sdt VARCHAR(30) DEFAULT NULL,
MatKhau VARCHAR(MAX) DEFAULT NULL,
IdCH UNIQUEIDENTIFIER,
IdCV UNIQUEIDENTIFIER,
IdGuiBC UNIQUEIDENTIFIER,
TrangThai INT DEFAULT 0
)
GO
-- KhachHang
CREATE TABLE KhachHang(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
Ma VARCHAR(20) UNIQUE,
Ten NVARCHAR(30),
TenDem NVARCHAR(30) DEFAULT NULL,
Ho NVARCHAR(30) DEFAULT NULL,
NgaySinh DATE DEFAULT NULL,
Sdt VARCHAR(30) DEFAULT NULL,
DiaChi NVARCHAR(100) DEFAULT NULL,
ThanhPho NVARCHAR(50) DEFAULT NULL,
QuocGia NVARCHAR(50) DEFAULT NULL,
MatKhau VARCHAR(MAX) DEFAULT NULL
)
GO
--HoaDon
CREATE TABLE HoaDon(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
IdKH UNIQUEIDENTIFIER,
IdNV UNIQUEIDENTIFIER,
Ma VARCHAR(20) UNIQUE,
NgayTao DATE DEFAULT NULL,
NgayThanhToan DATE DEFAULT NULL,
NgayShip DATE DEFAULT NULL,
NgayNhan DATE DEFAULT NULL,
TinhTrang INT DEFAULT 0,
TenNguoiNhan NVARCHAR(50) DEFAULT NULL,
DiaChi NVARCHAR(100) DEFAULT NULL,
Sdt VARCHAR(30) DEFAULT NULL,
)
GO
CREATE TABLE GioHang(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
IdKH UNIQUEIDENTIFIER,
IdNV UNIQUEIDENTIFIER,
Ma VARCHAR(20) UNIQUE,
NgayTao DATE DEFAULT NULL,
NgayThanhToan DATE DEFAULT NULL,
TenNguoiNhan NVARCHAR(50) DEFAULT NULL,
DiaChi NVARCHAR(100) DEFAULT NULL,
Sdt VARCHAR(30) DEFAULT NULL,
TinhTrang INT DEFAULT 0
)
GO
-- SanPham
CREATE TABLE SanPham(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
Ma VARCHAR(20) UNIQUE,
Ten NVARCHAR(30)
)
GO
-- NSX
CREATE TABLE NSX(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
Ma VARCHAR(20) UNIQUE,
Ten NVARCHAR(30)
)
GO
-- MauSac
CREATE TABLE MauSac(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
Ma VARCHAR(20) UNIQUE,
Ten NVARCHAR(30)
)
GO
-- DongSP
CREATE TABLE DongSP(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
Ma VARCHAR(20) UNIQUE,
Ten NVARCHAR(30)
)
GO
-- ChiTietSP
CREATE TABLE ChiTietSP(
Id UNIQUEIDENTIFIER PRIMARY KEY DEFAULT NEWID(),
IdSP UNIQUEIDENTIFIER,
IdNsx UNIQUEIDENTIFIER,
IdMauSac UNIQUEIDENTIFIER,
IdDongSP UNIQUEIDENTIFIER,
NamBH INT DEFAULT NULL,
MoTa NVARCHAR(50) DEFAULT NULL,
SoLuongTon INT,
GiaNhap DECIMAL(20,0) DEFAULT 0,
GiaBan DECIMAL(20,0) DEFAULT 0,
)

GO
-- HoaDonChiTiet
CREATE TABLE HoaDonChiTiet(
IdHoaDon UNIQUEIDENTIFIER,
IdChiTietSP UNIQUEIDENTIFIER,
SoLuong INT,
DonGia DECIMAL(20,0) DEFAULT 0,
CONSTRAINT PK_HoaDonCT PRIMARY KEY (IdHoaDon,IdChiTietSP),
CONSTRAINT FK1 FOREIGN KEY(IdHoaDon) REFERENCES HoaDon(Id),
CONSTRAINT FK2 FOREIGN KEY(IdChiTietSP) REFERENCES ChiTietSP(Id),
)
GO
CREATE TABLE GioHangChiTiet(
IdGioHang UNIQUEIDENTIFIER,
IdChiTietSP UNIQUEIDENTIFIER,
SoLuong INT,
DonGia DECIMAL(20,0) DEFAULT 0,
DonGiaKhiGiam DECIMAL(20,0) DEFAULT 0,
CONSTRAINT PK_GioHangCT PRIMARY KEY (IdGioHang,IdChiTietSP),
CONSTRAINT FK1_IdGioHang FOREIGN KEY(IdGioHang) REFERENCES GioHang(Id),
CONSTRAINT FK2_IdChiTietSP FOREIGN KEY(IdChiTietSP) REFERENCES ChiTietSP(Id),
)
GO
--TẠO QUAN HỆ GIỮA CÁC BẢNG
--NhanVien - CuaHang
ALTER TABLE NhanVien ADD FOREIGN KEY (IdCH) REFERENCES CuaHang(Id)
--NhanVien - ChucVu
ALTER TABLE NhanVien ADD FOREIGN KEY (IdCV) REFERENCES ChucVu(Id)
--NhanVien - GuiBaoCao
ALTER TABLE NhanVien ADD FOREIGN KEY (IdGuiBC) REFERENCES NhanVien(Id)
-- HoaDon - KhachHang
ALTER TABLE HoaDon ADD FOREIGN KEY (IdKH) REFERENCES KhachHang(Id)
-- GioHang - KhachHang
ALTER TABLE GioHang ADD FOREIGN KEY (IdKH) REFERENCES KhachHang(Id)
-- HoaDon - NhanVien
ALTER TABLE HoaDon ADD FOREIGN KEY (IdNV) REFERENCES NhanVien(Id)
-- ChiTietSP - SanPham
ALTER TABLE ChiTietSP ADD FOREIGN KEY(IdSP) REFERENCES SanPham(Id)
-- ChiTietSP - NSX
ALTER TABLE ChiTietSP ADD FOREIGN KEY(IdNsx) REFERENCES Nsx(Id)
-- ChiTietSP - MauSac
ALTER TABLE ChiTietSP ADD FOREIGN KEY(IdMauSac) REFERENCES MauSac(Id)
-- ChiTietSP - DongSP
ALTER TABLE ChiTietSP ADD FOREIGN KEY(IdDongSP) REFERENCES DongSP(Id)




insert into ChiTietSP(idsp,idnsx,idmausac,iddongsp,nambh,mota,soluongton,gianhap,giaban) values('C27C2A31-8BF3-4CDB-9E2F-8A017221DC08',newid(),newid(),newid(),10,'avx',25,5000,10000)

delete from ChiTietSP
delete from SanPham


select SanPham.Ma, ChiTietSP.IdNsx, ChiTietSP.IdMauSac, ChiTietSP.IdDongSP, SanPham.Ten, ChiTietSP.NamBH, ChiTietSP.MoTa, ChiTietSP.SoLuongTon, ChiTietSP.GiaNhap, ChiTietSP.GiaBan from SanPham join ChiTietSP on SanPham.Ma = ChiTietSP.IdSP
select * from SanPham join ChiTietSP on SanPham.Id = ChiTietSP.IdSP
select * from ChiTietSP

insert into DongSP(Ma,Ten) values ('ma01','ten01')

insert into chitietsp(idsp,idnsx,idmausac,iddongsp,nambh,mota,soluongton,gianhap,giaban) values(CONVERT(uniqueidentifier,'B1D26680-4B93-43B2-8BA4-7B3A9FC82D07'),CONVERT(uniqueidentifier,'76208129-3A15-46D1-A779-5FE4BD0F2FC5'),CONVERT(uniqueidentifier,'B9A5E41A-183F-4535-BB0C-A0FC8D501740'),CONVERT(uniqueidentifier,'572CF416-32C6-4B6A-BF5B-66745EC76E09'),15,'aaa',65,20,15)


insert into SanPham(Id,Ma,Ten) values (newid(),'ma01','ten01')
insert into DongSP(Id,Ma,Ten) values (newid(),'ma01','ten01')
insert into MauSac(Id,Ma,Ten) values (newid(),'ma01','ten01')
insert into NSX(Id,Ma,Ten) values (newid(),'ma01','ten01')

select * from ChiTietSP
select * from SanPham
select * from MauSac
select * from NSX
select * from DongSP
select SanPham.id, SanPham.Ma, SanPham.Ten, ChiTietSP.idnsx, ChiTietSP.idmausac, ChiTietSP.iddongsp, ChiTietSP.nambh, ChiTietSP.mota, ChiTietSP.soluongton, ChiTietSP.gianhap, ChiTietSP.giaban from SanPham join ChiTietSP on SanPham.Id = ChiTietSP.IdSP



update sanpham set ma = 'madadcsua', ten = 'tendaduocsua' where id = convert(uniqueidentifier,'7D8F7997-9181-4DB4-9F43-D013C948B324')
update Chitietsp set idnsx = convert(uniqueidentifier,'76208129-3A15-46D1-A779-5FE4BD0F2FC5'),idmausac = convert(uniqueidentifier,'B9A5E41A-183F-4535-BB0C-A0FC8D501740'), iddongsp = convert(uniqueidentifier,'572CF416-32C6-4B6A-BF5B-66745EC76E09'),nambh = 200,mota = 'motaaaa',soluongton = 1,gianhap = 5,giaban = 20 where idsp = convert(uniqueidentifier,'7D8F7997-9181-4DB4-9F43-D013C948B324')


insert into nsx values(newid(),'mansxp03','tennsx03')

select id from hoadon order by id asc
select * from HoaDon
select * from HoaDonChiTiet

insert into KhachHang(id) values(NEWID())
select id from KhachHang

insert into hoadonchitiet(idhoadon,idchitietsp,soluong,dongia) values (convert(uniqueidentifier,'3BCA45C2-7429-4A0C-BDB2-C10DEB7350EB'),convert(uniqueidentifier,'BC50FF8C-029F-42E7-A428-DA3D668C5986'),1,50000)
insert into hoadon(id,idkh,idnv,ma,ngaytao,ngaythanhtoan,tinhtrang) values (newid(),convert(uniqueidentifier,'73FE85CB-5BD1-4C57-81CA-3A2974EF15DC'),convert(uniqueidentifier,'30F858CE-D607-44F2-A61D-B34FF91B4B94'),'abcdef','2/2/2022','2/2/2022',1)

select IdHoaDon from HoaDonChiTiet

delete  from HoaDonChiTiet
delete  from HoaDon

select ma,matkhau from nhanvien
select * from nhanvien
update nhanvien set ma = 'manhanvien01', ten = 'ten01',matkhau = 'abc' where id = convert(uniqueidentifier,'30F858CE-D607-44F2-A61D-B34FF91B4B94')

select * from KhachHang
update KhachHang set ma = 'makhachhang01',ten = 'nguyen van a',matkhau = 'abc' where id = convert(uniqueidentifier,'73FE85CB-5BD1-4C57-81CA-3A2974EF15DC')
select ma from NhanVien
Declare @id uniqueidentifier;
set @id = NEWID();
insert into hoadon(id,idkh,idnv,ma,ngaytao,ngaythanhtoan,tinhtrang) values (@id,convert(uniqueidentifier,'73FE85CB-5BD1-4C57-81CA-3A2974EF15DC'),convert(uniqueidentifier,'30F858CE-D607-44F2-A61D-B34FF91B4B94'),'aaaa','2/2/2022','2/2/2022',1);
insert into hoadonchitiet(idhoadon,idchitietsp,soluong,dongia) values (@id,convert(uniqueidentifier,'BC50FF8C-029F-42E7-A428-DA3D668C5986'),1,50000)

select * from KhachHang
delete from khachhang where id = '933A39DA-8A47-4FF8-91A6-F26CFFDB8221'


select * from sanpham 
select * from ChiTietSP
delete from ChiTietSP where id = '10D9B6C3-319F-41B9-B0C2-83525E445F48'
delete from sanpham where id = '97229510-1259-4528-B911-F11332C1D7B8'


select * from SanPham
select * from ChiTietSP

delete from HoaDonChiTiet
delete from HoaDon
delete from ChiTietSP
delete from sanpham

select * from HoaDon
select * from HoaDonChiTiet

select * from mausac

select * from chitietsp

select idhoadon from HoaDonChiTiet where IdChiTietSP = convert(uniqueidentifier,'5FE15CFD-E1BA-49E1-97ED-19F4A7CF38BA')
insert into hoadonchitiet values('F584DB59-4A83-4394-B722-B0DC65B27D42','696345D5-1EE0-4C65-ACF3-CD1883A63046',10,10)
