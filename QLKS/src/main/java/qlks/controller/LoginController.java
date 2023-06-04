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
import qlks.dao.*;
import qlks.entity.*;
import qlks.view.*;
/**
 *
 * @author CNG;
 */
public class LoginController {

    public LoginController(LoginView view) {
        this.loginView = view;
        this.userDao = new UserDao();
        view.addLoginListener(new LoginListener());
    }
     
    public void showLoginView() {
        loginView.setVisible(true);
    }
    private UserDao userDao;
    private LoginView loginView;
    private HomeView home;
    
    class LoginListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            User user = loginView.getUser();
            if (userDao.checkUser(user)) {
                try {
                    createFile file = new createFile();
                    file.autoCreateAllFile();
                    home = new HomeView();
                    HomeController homeController = new HomeController(home);
                    try {
                        homeController.showHome();
                    } catch (IOException ex) {
                        Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    loginView.setVisible(false);
                } catch (IOException ex) {
                    Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                loginView.showMessage("Username hoặc Password không đúng.");
            }
        }
    }
}
