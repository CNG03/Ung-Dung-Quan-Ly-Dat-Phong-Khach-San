/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlks.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import qlks.dao.ThemPhongDao;
import qlks.entity.Phong;
import qlks.view.HomeView;
import qlks.view.SuaXoaPhongView;

/**
 *
 * @author CNG;
 */
public class SuaXoaPhongController {

    public SuaXoaPhongController() {
    }

    public SuaXoaPhongController(SuaXoaPhongView view) throws IOException, ClassNotFoundException {
        this.view = view;
        view.addCancleListener(new CancleListener());
        view.addSuaListener(new SuaListener());
        view.addChonDongListener(new ChonDongListener());
        view.addXoaListener(new XoaListener());
    }
    
    public void showSuaXoaPhongView() {
        view.setVisible(true);
    }
    
    public void showTable() throws IOException, ClassNotFoundException {
        view.showTable();
    }
    public void showModifed() {
        try {
            view.showModified();
        } catch (IOException ex) {
            Logger.getLogger(SuaXoaPhongController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SuaXoaPhongController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private SuaXoaPhongView view;
    
    class CancleListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            
            try {
                
                HomeView home = new HomeView();
                HomeController homeController = new HomeController(home);
                try {
                    homeController.showHome();
                } catch (IOException ex) {
                    Logger.getLogger(SuaXoaPhongController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(SuaXoaPhongController.class.getName()).log(Level.SEVERE, null, ex);
                }
                view.setVisible(false);
                
            } catch (IOException ex) {
                Logger.getLogger(SuaXoaPhongController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(SuaXoaPhongController.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
    }
    
    class ChonDongListener implements ListSelectionListener {
         public void valueChanged(ListSelectionEvent e) {
             try {
                 // Handle event here
                 view.showModified();
             } catch (IOException ex) {
                 Logger.getLogger(SuaXoaPhongController.class.getName()).log(Level.SEVERE, null, ex);
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(SuaXoaPhongController.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
    }
    
    
    
    class SuaListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        if(view.isSelectedRow()) {
            int dialogResult = JOptionPane.showConfirmDialog(view, "Bạn có chắc chắn muốn sửa phòng này?");
            if(dialogResult == JOptionPane.YES_OPTION) {
                boolean isValid = true;
                List<String> errorMessages = new ArrayList<String>();

                try {
                    if(!view.hopLeTenPhong()) {
                        errorMessages.add("Tên phòng phải là một dãy số nguyên và không âm!");
                        isValid = false;
                    }
                } catch (IOException ex) {
                    Logger.getLogger(SuaXoaPhongController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(SuaXoaPhongController.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(!view.hopLeGia()) {
                    errorMessages.add("Giá không được để trống và phải là số dương!");
                    isValid = false;
                }

                if(isValid) {
                    try {
                        Phong phong = new Phong(view.getSoPhong(), view.getLoaiPhong(), view.getSoLuongGiuong(), view.getGia());
                        ThemPhongDao tpd = new ThemPhongDao();

                        if(phong == null) return;

                        List<Phong> dsPhong = tpd.readPhongFromFile();
                        Iterator<Phong> iterator = dsPhong.iterator();
                        while (iterator.hasNext()) {
                            Phong p = iterator.next();
                            if (p.getSoPhong() == view.getSelectedRow()) {
                                iterator.remove();
                            }
                        }
                        dsPhong.add(phong);

                        if (tpd.saveDanhSachPhong(dsPhong)) {
                            view.clearTable();
                            showTable();
                            view.showDefault();
                        } else {
                            JOptionPane.showMessageDialog(view, "Thêm phòng không thành công!\n Có thể là do phòng đã tồn tại!");
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(ThemPhongController.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(ThemPhongController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    String errorMessage = String.join("\n", errorMessages);
                    JOptionPane.showMessageDialog(view, errorMessage);
                }
            } else {
                return;
            }
        } else {
            return;
        }
    }
}
    class XoaListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        if (view.isSelectedRow()) {
            int dialogResult = JOptionPane.showConfirmDialog(view, "Bạn có chắc chắn muốn xóa phòng này?");
            if (dialogResult == JOptionPane.YES_OPTION) {
                try {
                    ThemPhongDao tpd = new ThemPhongDao();
                    List<Phong> dsPhong = tpd.readPhongFromFile();
                    Iterator<Phong> iterator = dsPhong.iterator();
                    while (iterator.hasNext()) {
                        Phong p = iterator.next();
                        if (p.getSoPhong() == view.getSelectedRow()) {
                            iterator.remove();
                        }
                    }
                    if (tpd.saveDanhSachPhong(dsPhong)) {
                        view.clearTable();
                        showTable();
                        view.showDefault();
                    } else {
                        JOptionPane.showMessageDialog(view, "Xóa phòng không thành công!");
                    }
                } catch (IOException | ClassNotFoundException ex) {
                    Logger.getLogger(SuaXoaPhongController.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                return;
            }
        } else {
            return;
        }
    }
}

}
