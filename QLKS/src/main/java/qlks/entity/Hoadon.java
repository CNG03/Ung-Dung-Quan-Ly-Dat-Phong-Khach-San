/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlks.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author CNG;
 */
public class Hoadon implements Serializable{

    public String getMshd() {
        return mshd;
    }

    public void setMshd(String mshd) {
        this.mshd = mshd;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public Datphong getDatphong() {
        return datphong;
    }

    public void setDatphong(Datphong datphong) {
        this.datphong = datphong;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public Hoadon() {
    }

    public Hoadon(Datphong datphong) {
        this.mshd = "H" + datphong.getIdDatPhong();
        this.ngay = new Date();
        this.datphong = datphong;
        List<Phong> dsPhong = datphong.getPh();
        double tongtien=0;
        for(Phong p : dsPhong) {
            tongtien+=p.getGia();
        }
        Date date = datphong.getThoiGianDatPhong();
        Date date1 = this.ngay;
        long diff = Math.abs(date.getTime() - date1.getTime()); // khoảng cách chênh lệch giữa hai thời điểm
        double minutes = Math.ceil(diff / (60 * 1000.0)); // chuyển sang phút và làm tròn lên
        this.tongTien= (minutes/60)*tongtien;
    }

   
    private String mshd;    // mã số hóa đơn 
    private Date ngay; //ngày lập hóa đơn
    private Datphong datphong;
    private double tongTien;   // luu tru tong so tien phai tra
}
