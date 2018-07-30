/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyNhanVien;

import NhanVien.GioiTinh;
import NhanVien.INhanVien;

/**
 *
 * @author NgocAnh
 */
public interface IQuanLyNhanVien {
    
     int QUAN_LY = 1;  // gan gia tri cua hang so quanly bang 1
     int NHAN_VIEN_VAN_PHONG = 2;  //gắn giá trị của hằng số static bằng 2
     int CONG_NHAN = 3;  // gắn giá trị của hằng số static bằng 3
     // int loaiNhanVien();
    
    INhanVien[] nhapDanhSach();
 
    void hienThongTinNhanVien(INhanVien[] dsNhanVien);
    
    INhanVien[] timThuNhapTheoGioiTinh(INhanVien[] dsNhanVien, GioiTinh gioiTinh);
    
    INhanVien[] timThuNhapTheoViTri(INhanVien[] dsNhanVien, int loaiNhanVien);
    
}
