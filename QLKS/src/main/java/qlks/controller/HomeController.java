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
import qlks.entity.User;
import qlks.view.AllRoomView;
import qlks.view.DatPhongView;
import qlks.view.ThemPhongView;
import qlks.view.HomeView;
import qlks.view.SearchView;
import qlks.view.SuaXoaPhongView;
import qlks.view.XemDonDatPhongView;
import qlks.view.XemHoaDonView;

/**
 *
 * @author CNG;
 */
public class HomeController {

    public HomeController(HomeView home) {
        this.home = home;
        home.addThemPhongListener(new ThemPhongListener());
        home.addDatPhongListener(new DatPhongListener());
        home.addXemDonDatPhongListener(new XemDonDatPhongListener());
        home.addExitProgramListener(new ExitProgramListener());
        home.addSuaXoaPhongListener(new SuaXoaPhongListener());
        home.addAllRoomListener(new AllRoomListener());
        home.addXemHoaDonListener(new XemHoaDonListener());
        home.addTimKiemListener(new TimKiemListener());
        home.addThoatListener(new ExitProgramListener());
    }
    private HomeView home;
    
    
    
    class ThemPhongListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ThemPhongView dp = new ThemPhongView();
            ThemPhongController tpcontroller = new ThemPhongController(dp);
            tpcontroller.showThemPhongView();
            home.setVisible(false);
        }
    }
    
    class TimKiemListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            SearchView view = new SearchView();
            SearchController controller = new SearchController(view);
            controller.showView();
            home.setVisible(false);
        }
    }
    
    class XemHoaDonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            XemHoaDonView view = new XemHoaDonView();
            XemHoaDonController controller = new XemHoaDonController(view);
            controller.showView();
            home.setVisible(false);
            try {
                controller.showTable();
            } catch (IOException ex) {
                Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    class AllRoomListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            
            
            AllRoomView view = new AllRoomView();
            AllRoomController controller = new AllRoomController(view);
            controller.showAllRoom();
            try {
                controller.showTable();
            } catch (IOException ex) {
                Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
            }
            home.setVisible(false);
        }
    }
    
    class SuaXoaPhongListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            SuaXoaPhongView view = new SuaXoaPhongView();
            try {
                SuaXoaPhongController controller = new SuaXoaPhongController(view);
                controller.showSuaXoaPhongView();
                controller.showTable();
                home.setVisible(false);
            } catch (IOException ex) {
                Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
            
        }
    }
    
    class ExitProgramListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);

        }
    }
    class DatPhongListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            DatPhongView dpv = new DatPhongView();
            DatPhongController dpcontroller;
            try {
                dpcontroller = new DatPhongController(dpv);
                dpcontroller.showDatPhongView();
            } catch (IOException ex) {
                Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
            }
            //dpcontroller.showDatPhongView();
            home.setVisible(false);
        }
    }
    class XemDonDatPhongListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            XemDonDatPhongView xddpv = new XemDonDatPhongView();
            XemDonDatPhongController xddpc = new XemDonDatPhongController(xddpv);
            xddpc.showXemDonDatPhong();
            home.setVisible(false);

            try {
                xddpc.showTable();
            } catch (IOException ex) {
                Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void showHome() throws IOException, ClassNotFoundException{
        this.home.setVisible(true);
        home.showTable();
    }
}
