/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlks.entity;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author CNG;
 */
public class Datphong implements Serializable{

    public Date getThoiGianDatPhong() {
        return thoiGianDatPhong;
    }

    public void setThoiGianDatPhong(Date thoiGianDatPhong) {
        this.thoiGianDatPhong = thoiGianDatPhong;
    }

    public Date getThoiGianTraPhong() {
        return thoiGianTraPhong;
    }

    public void setThoiGianTraPhong(Date thoiGianTraPhong) {
        this.thoiGianTraPhong = thoiGianTraPhong;
    }

    

    public void setIdDatPhong(int index) {
        this.IdDatPhong = this.idText + index;
    }

    public String getIdDatPhong() {
        return IdDatPhong;
    }

    

    public Khachhang getKH() {
        return KH;
    }

    public void setKH(Khachhang KH) {
        this.KH = KH;
    }

    public List<Phong> getPh() {
        return ph;
    }

    public void setPh(List<Phong> ph) {
        this.ph = ph;
    }
    
    public Datphong() {
    }
    
    // Constructor with parameters
    public Datphong(Khachhang KH, List<Phong> ph, int index) {
        index++;
        this.IdDatPhong = idText + index;
        this.KH = KH;
        this.ph = ph;
    }

    
    private String IdDatPhong;
    private Khachhang KH;
    private List<Phong> ph;
    private Date thoiGianDatPhong;
    private Date thoiGianTraPhong;
    
    private static final String idText = "D";
    private int index=0;
    

    
}
