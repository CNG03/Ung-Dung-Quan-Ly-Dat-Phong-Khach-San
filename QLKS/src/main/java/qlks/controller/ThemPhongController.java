/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlks.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import qlks.dao.ThemPhongDao;
import qlks.entity.Phong;
import qlks.entity.User;
import qlks.view.HomeView;
import qlks.view.ThemPhongView;

/**
 *
 * @author CNG;
 */
public class ThemPhongController {

    public ThemPhongController(ThemPhongView tpview) {
        this.tpview = tpview;
        tpview.addCancleListener(new CancleListener());
        tpview.addXacNhanListener(new XacNhanListener());
    }
    private ThemPhongView tpview;
    
    
    
    public void showThemPhongView()
    {
        this.tpview.setVisible(true);
    }
    
    
    
    class CancleListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            
            try {
                
                HomeView home = new HomeView();
                HomeController homeController = new HomeController(home);
                try {
                    homeController.showHome();
                } catch (IOException ex) {
                    Logger.getLogger(ThemPhongController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ThemPhongController.class.getName()).log(Level.SEVERE, null, ex);
                }
                tpview.setVisible(false);
                
            } catch (IOException ex) {
                Logger.getLogger(ThemPhongController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ThemPhongController.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
    }
    
    class XacNhanListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            boolean isValid = true;
            List<String> errorMessages = new ArrayList<String>();
            
            
            if(!tpview.hopLeTenPhong()) {
                errorMessages.add("Tên phòng phải là một dãy số nguyên và không âm!");
                isValid = false;
            }
            if(!tpview.hopLeGia()) {
                errorMessages.add("Giá không được để trống và phải là số dương!");
                isValid = false;
            }
            if(isValid)
            {
                try {
                    Phong phong = new Phong(tpview.getSoPhong(), tpview.getLoaiPhong(), tpview.getSoLuongGiuong(), tpview.getGia());
                    ThemPhongDao tpd = new ThemPhongDao();
                    if(phong == null) return;
                if (tpd.savePhong(phong)) {
                    
                    HomeView home = new HomeView();
                    HomeController homeController = new HomeController(home);
                    homeController.showHome();
                    tpview.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(tpview, "Thêm phòng không thành công!\n Có thể là do phòng đã tồn tại!");
                }
                } catch (IOException ex) {
                    Logger.getLogger(ThemPhongController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ThemPhongController.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
            String errorMessage = String.join("\n", errorMessages);
            JOptionPane.showMessageDialog(tpview, errorMessage);
        }
            
        }
    }
}
