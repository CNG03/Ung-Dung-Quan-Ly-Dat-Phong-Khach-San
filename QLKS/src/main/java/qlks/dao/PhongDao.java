/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlks.dao;

import java.io.IOException;
import java.util.List;
import qlks.entity.Phong;

/**
 *
 * @author CNG;
 */
public class PhongDao {
    public void deletePhong(int soPhong) throws IOException, ClassNotFoundException {
        ThemPhongDao tpd = new ThemPhongDao();
        List<Phong> dsp = tpd.readPhongFromFile();
        for(Phong s : dsp) {
            if(s.getSoPhong() == soPhong) {
                dsp.remove(s);
            }
        }
        tpd.saveDanhSachPhong(dsp);
        
    }
    public void deletePhongList(List<Phong> list) throws IOException, ClassNotFoundException {
        ThemPhongDao tpd = new ThemPhongDao();
        List<Phong> dsp = tpd.readPhongFromFile();
        dsp.removeAll(list);
        tpd.saveDanhSachPhong(dsp);
    }
}
