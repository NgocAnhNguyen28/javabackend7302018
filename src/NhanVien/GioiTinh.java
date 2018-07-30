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
public enum GioiTinh {
     NAM(1,"con trai"),NU(0,"con gai"),KHONGXACDINH(-1,"chua xac dinh");
    
    
    private GioiTinh(int code, String ten) { // constructor tai sao lai de private
        this.code = code;
        this.ten = ten;
    }
    
    private int code;
    private String ten;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    public static GioiTinh hienThiGioiTinh(int code){
      switch (code){
            case 1:
                return NAM;
            case 0:
                return NU;

            default:
                return KHONGXACDINH;
        }
    }
}
    

