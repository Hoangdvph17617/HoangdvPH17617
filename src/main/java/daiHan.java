
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DANG HOANG
 */
public class daiHan extends Courses {
    private Integer giamGia;
   
    public daiHan(Integer giamGia, Integer id, String giangVien, String thanhVien, Date thoiGian) {
        super(id, giangVien, thanhVien, thoiGian);
        this.giamGia = giamGia;
    }

    @Override
    public void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setThoiGian(Date thoiGian) {
        super.setThoiGian(thoiGian); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Date getThoiGian() {
        return super.getThoiGian(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setThanhVien(String thanhVien) {
        super.setThanhVien(thanhVien); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getThanhVien() {
        return super.getThanhVien(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setGiangVien(String giangVien) {
        super.setGiangVien(giangVien); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getGiangVien() {
        return super.getGiangVien(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setId(Integer id) {
        super.setId(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer getId() {
        return super.getId(); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}