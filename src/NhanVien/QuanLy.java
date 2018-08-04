/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NhanVien;

import java.util.Scanner;

public class QuanLy extends NhanVien{
    private int soNhanVien;
    private float phuCap;

    public QuanLy() {
        super();
    }

    public QuanLy(int soNhanVien, float phuCap, int ma, String ten, GioiTinh gioiTinh, float tienLuong) {
        super(ma, ten, gioiTinh, tienLuong);
        this.soNhanVien = soNhanVien;
        this.phuCap = phuCap;
    }

    

    public int getSoNhanVien() {
        return soNhanVien;
    }

    public void setSoNhanVien(int soNhanVien) {
        this.soNhanVien = soNhanVien;
    }

    
    

    public float getPhuCap() {
        return phuCap;
    }

    
    public void setPhuCap(float phuCap) {
        this.phuCap = phuCap;
    }

    
    @Override
    public void nhapThongTin() {
       
        System.out.println("phu cap cua quan ly:");
        this.phuCap = new Scanner(System.in).nextInt();
        System.out.println("so nhan vien ");
        this.soNhanVien =new Scanner(System.in).nextInt();
    }
    @Override
    public float tinhThuNhap() {
       if( soNhanVien<10&& soNhanVien >0 ){
            this.phuCap =500;  
        }else if(soNhanVien<=20&& soNhanVien >=10){
            this.phuCap=1000;
        }else if(soNhanVien>20){
            this.phuCap =2000; 
        }
       
            float thuNhap = this.getTienLuong()+ this.getPhuCap();
        
        
        return tienLuong;
    }
    
    public void hienThogTin(){
        super.hienThongTin();
        System.out.println("tien luong cua nhan vien la"+ this.tienLuong);
            }
    
    
}

