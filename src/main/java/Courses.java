
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
public class Courses {
    private Integer id;
    private String giangVien;
    private String thanhVien;
    private Date thoiGian;
    
    public Courses(Integer id, String giangVien, String thanhVien, Date thoiGian) {
        this.id = id;
        this.giangVien = giangVien;
        this.thanhVien = thanhVien;
        this.thoiGian = thoiGian;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGiangVien() {
        return giangVien;
    }

    public void setGiangVien(String giangVien) {
        this.giangVien = giangVien;
    }

    public String getThanhVien() {
        return thanhVien;
    }

    public void setThanhVien(String thanhVien) {
        this.thanhVien = thanhVien;
    }

    public Date getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(Date thoiGian) {
        this.thoiGian = thoiGian;
    }

    @Override
    public String toString() {
        return "Courses{" + "id=" + id + ", giangVien=" + giangVien + 
                ", thanhVien=" + thanhVien + ", thoiGian=" + thoiGian + '}';
    }
    
    
    public void display(){
        System.out.println(" ");
    }
    
}
