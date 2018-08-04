/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyNhanVien;

/**
 *
 * @author NgocAnh
 */
public class LoaiNhanVienE extends Exception{

    @Override
    public String getMessage() {
        return "loai nhân viên không hợp lệ, mời chọn lại"+ super.getMessage(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
