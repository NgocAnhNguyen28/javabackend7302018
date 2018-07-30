/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyNhanVien;

import NhanVien.CongNhan;
import NhanVien.GioiTinh;
import NhanVien.INhanVien;
import NhanVien.NhanVienVanPhong;
import NhanVien.QuanLy;

import java.util.Scanner;

/**
 *
 * @author NgocAnh
 */

    public class QuanLyNhanVien implements IQuanLyNhanVien{
    // xu ly tren danh sach nhan vien

   

    private int loaiNhanVien() {    // hàm để private không cho class khác truy cập vào- hàm để phân loại nhân viên
        System.out.println("1. Quan ly");// trình bày các loại nhân viên để lựa chọn
        System.out.println("2. Nhan vien van phong");
        System.out.println("3. Cong nhan");
        System.out.print("Chon kieu nhan vien can them: ");
        int luaChon = new Scanner(System.in).nextInt();  // khởi tạo giá trị của biến truyền vào
        if (luaChon < 1 || luaChon > 3) {    // tạo ra điều kiện cho giá trị nếu khác các giá trị 123 thì quay lại hàm loai nhan vien
            return loaiNhanVien();
        }
        return luaChon;  // ham quay lại lựa chọn?
    }

    public INhanVien[] nhapDanhSach() {    // hàm với kiểu mảng nhân viên của class nhân viên  
        INhanVien[] dsNhanvien = null;   // khai báo mảng nhan viên là danh sach nhân viên = null;
        System.out.print("Nhap so luong nhan vien: ");
        int tongNV = new Scanner(System.in).nextInt();//kiem tra tong nhap vao >0
        dsNhanvien = new INhanVien[tongNV];   // khởi tạo mảng danh sách nhân viên bằng số tổng nhân viên nhập vào
        for (int i = 0; i < dsNhanvien.length; i++) {// vòng lập đi lập lại sô lần bằng tổng số nhân viên nhập vào
            int loaiNhanVien = loaiNhanVien();// gắn giá trị của loại nhân viên của hàm loainhanvien vào loaiNhanVien
            switch (loaiNhanVien) {// kiểm tra loại nhan viên
                case QUAN_LY: //case 1:
                    dsNhanvien[i] = new QuanLy(); // mảng danh sách nhân viên theo thứ tự i dược khởi tạo bằng hàm quản lý
                case NHAN_VIEN_VAN_PHONG:
                    dsNhanvien[i] = new NhanVienVanPhong();
                default:
                    dsNhanvien[i] =new CongNhan();
            }
            System.out.println("Nhap thong tin nhan vien thu " + i);
            dsNhanvien[i].nhapThongTin(); // mảng danh sách nhân viên nhập theo tổng số nhân viên nhập vào chạy hàm nhập thông tin
        }

        return dsNhanvien; // thoát chương trình thì trả lại mảng danh sách nhan viên
    }

    public void hienThongTinNhanVien(INhanVien[] dsNhanVien) {// hàm hiện thông tin với mảng danh sách nhân viên của mảng nhân viên nhập vào
        if (dsNhanVien != null) { // nếu mảng khác null
            for (INhanVien nhanVien : dsNhanVien) {//
                if (nhanVien != null) {
                    nhanVien.hienThongTin();
                    System.out.println("------------------------------------");
                }

            }
        } else {
            System.out.println("Danh sach rong");
        }
    }

    // tra ve nhung nhan vien co thu nhap cao nhat theo gioi tinh
    public INhanVien[] timThuNhapTheoGioiTinh(INhanVien[] dsNhanVien, GioiTinh gioiTinh) {//mảng của class nhân viên và mảng danh sách nhân viên và obj gioiTinh nhập vào 
        INhanVien[] dsNhanVienTheoThuNhap = new INhanVien[dsNhanVien.length];// khai báo và khởi tạo mảng dsnvttn bằng tổng độ dài hàm danh sách nhân viên
        int count = 0;
        if (dsNhanVien != null) {// nếu ds nhân viên khác null
            float thuNhapMax =0;
            for (INhanVien nhanVien : dsNhanVien) {
                if (nhanVien != null && nhanVien.tinhThuNhap() > thuNhapMax && nhanVien.getGioiTinh() == gioiTinh) {
                    thuNhapMax = nhanVien.tinhThuNhap();
                }
            }

            for (INhanVien nhanVien : dsNhanVien) {
                if (nhanVien != null && nhanVien.tinhThuNhap() == thuNhapMax && nhanVien.getGioiTinh() == gioiTinh) {
                    dsNhanVienTheoThuNhap[count] = nhanVien;
                    count++;
                }
            }
        }
        return dsNhanVienTheoThuNhap;
    }

    private int getClassFromObj(INhanVien nv) {
//vi du
//        nv = new QuanLy();
        if (nv instanceof QuanLy) {
            return QUAN_LY;
        }

        if (nv instanceof NhanVienVanPhong) {
            return NHAN_VIEN_VAN_PHONG;
        }
        return CONG_NHAN;
    }

    // tra ve danh sach nhan vien thu nhap cao nhat o moi vi tri
    public INhanVien[] timThuNhapTheoViTri(INhanVien[] dsNhanVien, int loaiNhanVien) {
        INhanVien[] dsNhanVienTheoThuNhap = null;
        int count = 0;
        float thuNhapMax = 0;

        if (dsNhanVien != null) {
            dsNhanVienTheoThuNhap = new INhanVien[dsNhanVien.length];
            for (INhanVien nhanVien : dsNhanVien) {
                if (nhanVien != null) {
                    if (getClassFromObj(nhanVien) == loaiNhanVien && nhanVien.tinhThuNhap() > thuNhapMax) {
                        thuNhapMax = nhanVien.tinhThuNhap();
                    }
                }
            }
            System.out.println("max: " + thuNhapMax);
            for (INhanVien nhanVien : dsNhanVien) {
                if (nhanVien != null && nhanVien.tinhThuNhap() == thuNhapMax && getClassFromObj(nhanVien) == loaiNhanVien) {
                    dsNhanVienTheoThuNhap[count] = nhanVien;
                    count++;
                }
            }
        }
        return dsNhanVienTheoThuNhap;
    }
}


