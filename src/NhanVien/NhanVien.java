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
public abstract class NhanVien  implements INhanVien{
    
    private int ma;
    private static int maHienTai=0;
    String ten;
    GioiTinh gioiTinh;
    float tienLuong;

 

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public GioiTinh getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(GioiTinh gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public float getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(float tienLuong) {
        this.tienLuong = tienLuong;
    }

    public NhanVien() {
        this.ma = maHienTai;
        maHienTai ++;
    }

    public NhanVien(int ma, String ten, GioiTinh gioiTinh, float tienLuong) {
        this.ma = ma;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.tienLuong = tienLuong;
    }

    
   
    @Override
    public abstract float tinhThuNhap();
    
    
    @Override
    public void nhapThongTin(){
        System.out.println("nhap ten cua cong nhan: ");
        this.ten = new Scanner(System.in).nextLine();
        System.out.println("nhap gioi tinh( 1:nam,0: nu, -1: chua xac dinh");
        int gt = new Scanner(System.in).nextInt();
        this.gioiTinh = GioiTinh.hienThiGioiTinh(gt);
        System.out.println("nhap so luong cua cong nhan");
        this.tienLuong = new Scanner(System.in).nextInt();
        
    }
        
    @Override
    public void hienThongTin(){
        
        System.out.println("ma: "+ this.ma +" \n ten cua cong nhan la: "+this.ten+ "\n gioi tinh: " + this.gioiTinh.getTen());
        
    }
}
