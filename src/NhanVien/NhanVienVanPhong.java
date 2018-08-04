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
public class NhanVienVanPhong extends NhanVien{
    private float heSo;

    public float getHeSo() {
        return heSo;
    }

    public void setHeSo(float heSo) {
        this.heSo = heSo;
    }

    public NhanVienVanPhong() {
    }

    public NhanVienVanPhong(float heSo, int ma, String ten, GioiTinh gioiTinh,float tienLuong) {
        super(ma, ten, gioiTinh, tienLuong);
        this.heSo = heSo;
    }

    
    @Override
    public void nhapThongTin(){
      
        System.out.println("nhap he so cua quan ly");
        this.heSo =new Scanner(System.in).nextInt();
    }    

    @Override
    public float tinhThuNhap() {
       
        float thuNhap = this.getTienLuong() + this.getHeSo()*this.getTienLuong();
        return thuNhap;
      
    }
    @Override
    public void hienThongTin(){
        super.hienThongTin();
        System.out.println("tien luong cua nhan vien van phong la :" + this.tienLuong); 
    }
    
}
