/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlks.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import qlks.entity.Hoadon;
import qlks.view.HomeView;
import qlks.view.XemHoaDonView;

/**
 *
 * @author CNG;
 */
public class XemHoaDonController {

    public XemHoaDonController(XemHoaDonView view) {
        this.view = view;
        view.addCancleListener(new CancleListener());
        view.addXemChiTietListener(new XemChiTietListener());
        view.addOkeListener(new OkeListener());
    }
    private XemHoaDonView view;
    
    
    public void showView() {
        view.setVisible(true);
    }
    public void showTable() throws IOException, ClassNotFoundException {
        view.showTable();
    }
    class CancleListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            
            try {
                
                HomeView home = new HomeView();
                HomeController homeController = new HomeController(home);
                try {
                    homeController.showHome();
                } catch (IOException ex) {
                    Logger.getLogger(XemHoaDonController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(XemHoaDonController.class.getName()).log(Level.SEVERE, null, ex);
                }
                view.setVisible(false);
                
            } catch (IOException ex) {
                Logger.getLogger(XemHoaDonController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(XemHoaDonController.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
    }
    
    class OkeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            
                view.unshowDialog();
           
        }
    }
    
    class XemChiTietListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(view.isSelectedRow()) {
                try {
                    Hoadon hoadon = view.layHoaDon();
                    if(hoadon == null) return;
                    view.showHoaDonDialog(hoadon);
                    view.showDialogCenter();
                } catch (IOException ex) {
                    Logger.getLogger(XemHoaDonController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(XemHoaDonController.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                return;
            }
               
           
        }
    }
}
