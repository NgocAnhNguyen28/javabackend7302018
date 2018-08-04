/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NhanVien;

/**
 *
 * @author NgocAnh
 */
public class TienLuongE extends Exception{

    @Override
    public String getMessage() {
        return "tien luong khong hop le, yeu cau nhap lai"+ super.getMessage(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
