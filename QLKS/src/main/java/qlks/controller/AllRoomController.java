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
import qlks.view.AllRoomView;
import qlks.view.HomeView;

/**
 *
 * @author CNG;
 */
public class AllRoomController {

    public AllRoomController() {
    }

    public AllRoomController(AllRoomView view) {
        this.view = view;
        view.addOkeListener(new CancleListener());
    }
    
    public void showTable() throws IOException, ClassNotFoundException {
        view.showTable();
    }
    
    public void showAllRoom() {
        view.setVisible(true);
    }
    
    private AllRoomView view;
    
    class CancleListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            
            try {
                
                HomeView home = new HomeView();
                HomeController homeController = new HomeController(home);
                try {
                    homeController.showHome();
                } catch (IOException ex) {
                    Logger.getLogger(AllRoomController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(AllRoomController.class.getName()).log(Level.SEVERE, null, ex);
                }
                view.setVisible(false);
                
            } catch (IOException ex) {
                Logger.getLogger(AllRoomController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AllRoomController.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
    }
}
