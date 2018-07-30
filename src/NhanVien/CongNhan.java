/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NhanVien;

import java.util.Scanner;

/**
 *
 * @author NgocAnh
 */
public class CongNhan extends NhanVien{
    
    private int ngayCong;
    
    public CongNhan(){
       super();
    }

    public CongNhan(int ngayCong, int ma, String ten, GioiTinh gioiTinh,float tienLuong) {
        super(ma, ten, gioiTinh, tienLuong);
        this.ngayCong = ngayCong;
    }

   

    public int getNgayCong() {
        return ngayCong;
    }

    public void setNgayCong(int ngayCong) {
        this.ngayCong = ngayCong;
    }
    @Override
    public void nhapThongTin(){
        
        System.out.println("ngay cong cua nhan vien:");
        this.ngayCong = new Scanner(System.in).nextInt();
    }
    
    @Override
    public float tinhThuNhap() {
        float thuNhap= this.getTienLuong()+ (this.getNgayCong()/26)*this.getTienLuong();
        return thuNhap;
        
    }
    @Override
    public void hienThongTin(){
        super.hienThongTin();
        System.out.println("tien luong cua nhan vien la :"+ this.getTienLuong());
        
    }


    
    
    

    
    
}

