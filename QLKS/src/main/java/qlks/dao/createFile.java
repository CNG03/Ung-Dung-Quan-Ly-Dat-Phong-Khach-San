/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlks.dao;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author CNG;
 */


// day la mot class dung de toa ra file neu trong he thong khong co
public class createFile {
    public void autoCreateFileDatPhong() {
        try {
            
            File file = new File("src\\main\\java\\qlks\\File//DatPhong.dat");
            if (!file.exists()) {
            file.createNewFile();
            }   
           
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void autoCreateFileDanhSachPhongDat() {
        try {
            
            File file = new File("src\\main\\java\\qlks\\File//DanhSachPhong.dat");
            if (!file.exists()) {
            file.createNewFile();
            }   
           
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void autoCreateFileHoaDonDat() {
        try {
            
            File file = new File("src\\main\\java\\qlks\\File//HoaDon.dat");
            if (!file.exists()) {
            file.createNewFile();
            }   
           
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void autoCreateFileIndexDat() {
        try {
            
            File file = new File("src\\main\\java\\qlks\\File//index.dat");
            if (!file.exists()) {
            file.createNewFile();
            }   
           
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void autoCreateAllFile() {
        autoCreateFileDatPhong();
        autoCreateFileDanhSachPhongDat();
        autoCreateFileIndexDat();
        autoCreateFileHoaDonDat();
    }
}
