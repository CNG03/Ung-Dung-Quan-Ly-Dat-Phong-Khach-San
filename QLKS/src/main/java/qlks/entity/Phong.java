/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlks.entity;

import java.io.Serializable;

/**
 *
 * @author CNG;
 */
public class Phong implements Serializable {

    public int getSoPhong() {
        return soPhong;
    }

    public void setSoPhong(int soPhong) {
        this.soPhong = soPhong;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public int getSoLuongGiuong() {
        return soLuongGiuong;
    }

    public void setSoLuongGiuong(int soLuongGiuong) {
        this.soLuongGiuong = soLuongGiuong;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public boolean isDaDuocDat() {
        return daDuocDat;
    }

    public void setDaDuocDat(boolean daDuocDat) {
        this.daDuocDat = daDuocDat;
    }

    public Phong() {
    }

    public Phong(int soPhong, String loaiPhong, int soLuongGiuong, double gia) {
        this.soPhong = soPhong;
        this.loaiPhong = loaiPhong;
        this.soLuongGiuong = soLuongGiuong;
        this.gia = gia;
        this.daDuocDat = false;
    }
    private int soPhong;
    private String loaiPhong;
    private int soLuongGiuong;
    private double gia;  // giá phòng tính theo giờ ví dụ 100k/1h
    private boolean daDuocDat;
    
}
