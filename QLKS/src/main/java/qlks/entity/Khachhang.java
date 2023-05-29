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
public class Khachhang implements Serializable{

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Khachhang() {
    }

    public Khachhang(String hoten, String address, int sdt, String email) {
        this.hoten = hoten;
        this.address = address;
        this.sdt = sdt;
        this.email = email;
    }
    private int maKH;

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }
    private String hoten;
    private String address;
    private int sdt;
    private String email;
}
