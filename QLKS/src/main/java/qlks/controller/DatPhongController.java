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
import qlks.dao.DatPhongDao;
import qlks.entity.Datphong;
import qlks.entity.Phong;
import qlks.view.DatPhongView;
import qlks.view.HomeView;

/**
 *
 * @author CNG;
 */
public class DatPhongController {

    public DatPhongController(DatPhongView dpv) throws IOException, ClassNotFoundException {
        this.dpv = dpv;
        dpv.addCancleListener(new CancleListener());
        dpv.addChonPhongListener(new chonPhongListener());
        dpv.showTable();
        dpv.addOkeListener(new OkeListener());
        //dpv.laySoPhongDuocchon();
    }
    private DatPhongView dpv;
    
    
    
    public void showDatPhongView()
    {
        this.dpv.setVisible(true);
    }
    
    class CancleListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                HomeView home = new HomeView();
                HomeController homeController = new HomeController(home);
                try {
                    homeController.showHome();
                } catch (IOException ex) {
                    Logger.getLogger(DatPhongController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(DatPhongController.class.getName()).log(Level.SEVERE, null, ex);
                }
                dpv.setVisible(false);
            } catch (IOException ex) {
                Logger.getLogger(DatPhongController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DatPhongController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    class chonPhongListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            List<Integer> dsp = dpv.getSelectedRows();
            String result = String.join(", ", dsp.stream().map(Object::toString).toArray(String[]::new));
            dpv.setLabelValue(result);
            
            
             try {
                if(dpv.isNullPhong()) {
                    JOptionPane.showMessageDialog(dpv, "Khách hàng không chọn phòng nào");
                    dpv.setVisible(true);
                }
            } catch (IOException ex) {
                Logger.getLogger(DatPhongController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DatPhongController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
   

    
//    class OkeListener implements ActionListener {
//        public void actionPerformed(ActionEvent e) {
//            DatPhongDao dpd = new DatPhongDao();
//            Datphong dp = dpv.getDatPhongInfo();
//            if(dp ==null){
//                JOptionPane.showMessageDialog(dpv, "Thêm phòng không thành công! tra ve doi tuong null");
//                dpv.setVisible(true);
//                return;
//            }
//           
//            
//            try {
//                if (dpd.saveDatPhong(dp)) {
//                    
//                    HomeView home = new HomeView();
//                    HomeController homeController = new HomeController(home);
//                    homeController.showHome();
//                    List<Datphong> test =dpd.readDatPhongFromFile();
//                    for(Datphong b : test) {
//                        if (b != null) {
//                            System.out.println(b.getKH().getHoten());
//                        }
//                    }
//
//                    dpv.setVisible(false);
//                    return;
//                } else {
//                    JOptionPane.showMessageDialog(dpv, "Thêm phòng không thành công!");
//                    return;
//                }
//            } catch (IOException ex) {
//                Logger.getLogger(DatPhongController.class.getName()).log(Level.SEVERE, null, ex);
//                dpv.setVisible(true);
//                return;
//            } catch (ClassNotFoundException ex) {
//                Logger.getLogger(DatPhongController.class.getName()).log(Level.SEVERE, null, ex);
//                dpv.setVisible(true);
//                return;
//            }
//        }
//    }
    
    class OkeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        
        boolean isValid = true;
        List<String> errorMessages = new ArrayList<String>();
            try {
                if (dpv.isNullPhong()) {
                    errorMessages.add("Khách hàng không chọn phòng nào");
                    isValid = false;
                }   } catch (IOException ex) {
                Logger.getLogger(DatPhongController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DatPhongController.class.getName()).log(Level.SEVERE, null, ex);
            }
        if (!dpv.hopLeTenKH()) {
            errorMessages.add("Tên khách hàng không hợp lệ, hoặc chứa số!");
            isValid = false;
        }
        if (!dpv.hopLeAddress()) {
            errorMessages.add("Địa chỉ không được để trống!");
            isValid = false;
        }
        if (!dpv.hopLePhone()) {
            errorMessages.add("Số điện thoại bị để trống hoặc không phải là số nguyên!");
            isValid = false;
        }
        if (!dpv.hopLeEmail()) {
            errorMessages.add("Email bị để trống!");
            isValid = false;
        }
        
        if (!dpv.hopLyNgayDatPhong()) {
            errorMessages.add("Ngày đặt phòng không hợp lý có thể là do ngày được chọn nhỏ hơn ngày hiện tại!");
            isValid = false;
        }
        
        
        
            try {
                if (dpv.isNullPhong()) {
                    errorMessages.add("Không có phòng nào được chọn!");
                    isValid = false;
                }   } catch (IOException ex) {
                Logger.getLogger(DatPhongController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DatPhongController.class.getName()).log(Level.SEVERE, null, ex);
            }
        if (isValid) {
            try {
                DatPhongDao dpd = new DatPhongDao();
                Datphong dp = dpv.getDatPhongInfo();
                if (dp == null) {
                    JOptionPane.showMessageDialog(dpv, "Thêm phòng không thành công! tra ve doi tuong null");
                    dpv.setVisible(true);
                    return;
                }
                if (dpd.saveDatPhong(dp)) {
                    HomeView home = new HomeView();
                    HomeController homeController = new HomeController(home);
                    homeController.showHome();
                    dpv.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(dpv, "Thêm phòng không thành công!");
                    // sau khi may lam duoc ham tra lai phong duoc chon thi se de o day de khong bi bug
                }
                } catch (IOException ex) {
                    Logger.getLogger(DatPhongController.class.getName()).log(Level.SEVERE, null, ex);
                    dpv.setVisible(true);
                    return;
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(DatPhongController.class.getName()).log(Level.SEVERE, null, ex);
                    dpv.setVisible(true);
                    return;
                }
        } else {
            String errorMessage = String.join("\n", errorMessages);
            JOptionPane.showMessageDialog(dpv, errorMessage);
        }
    }
    
}
    
}
