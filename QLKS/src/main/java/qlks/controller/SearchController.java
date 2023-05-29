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
import qlks.view.HomeView;
import qlks.view.SearchView;

/**
 *
 * @author CNG;
 */
public class SearchController {

    public SearchController(SearchView view) {
        this.view = view;
        view.addCancleListener(new CancleListener());
        view.addSearchListener(new SearchListener());
    }
    
    public void showView() {
        view.setVisible(true);
        view.setDefaultSelected();
        view.showDefaultTable();
    }
    private SearchView view;
    
    
    class CancleListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            
            try {
                
                HomeView home = new HomeView();
                HomeController homeController = new HomeController(home);
                try {
                    homeController.showHome();
                } catch (IOException ex) {
                    Logger.getLogger(SearchController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(SearchController.class.getName()).log(Level.SEVERE, null, ex);
                }
                view.setVisible(false);
                
            } catch (IOException ex) {
                Logger.getLogger(SearchController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SearchController.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
    }
    
    class SearchListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(view.tenKHisSelected()) {
                try {
                    view.showSearchKH(view.getTextSearch());
                } catch (IOException ex) {
                    Logger.getLogger(SearchController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(SearchController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(view.maDPisSelected()) {
                try {
                    view.showSearchMaDP(view.getTextSearch());
                } catch (IOException ex) {
                    Logger.getLogger(SearchController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(SearchController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(view.maHDisSelected()) {
                try {
                    view.showSearchMaHD(view.getTextSearch());
                } catch (IOException ex) {
                    Logger.getLogger(SearchController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(SearchController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(view.tenPhongisSelected()) {
                try {
                    view.showSearchPhong(view.getTextSearch());
                } catch (IOException ex) {
                    Logger.getLogger(SearchController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(SearchController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
               
           
        }
    }
}
