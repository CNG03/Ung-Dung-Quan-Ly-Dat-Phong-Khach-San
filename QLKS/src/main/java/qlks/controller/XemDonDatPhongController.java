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
import qlks.dao.DatPhongDao;
import qlks.dao.HoaDonDao;
import qlks.dao.ThemPhongDao;
import qlks.entity.Datphong;
import qlks.entity.Hoadon;
import qlks.entity.Phong;
import qlks.view.HomeView;
import qlks.view.ThemPhongView;
import qlks.view.XemDonDatPhongView;

/**
 *
 * @author CNG;
 */
public class XemDonDatPhongController {

    public XemDonDatPhongController(XemDonDatPhongView ddpv)  {
        this.ddpv = ddpv;
        ddpv.addCancleListener(new CancleListener());
        ddpv.addXemChiTietListener(new xemChiTietListener());
        ddpv.addOkeListener(new OkeListener());
        ddpv.addTaoHoaDonListener(new TaoHoaDonListener());
        ddpv.addOkeHoaDonListener(new OkeHoaDonListener());
    }
    private XemDonDatPhongView ddpv;
    
    
    public void showTable() throws IOException, ClassNotFoundException {
        ddpv.showTable();
    }
    
    public void showXemDonDatPhong() {
        ddpv.setVisible(true);
    }
    
    class CancleListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            
            try {
                
                HomeView home = new HomeView();
                HomeController homeController = new HomeController(home);
                try {
                    homeController.showHome();
                } catch (IOException ex) {
                    Logger.getLogger(XemDonDatPhongController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(XemDonDatPhongController.class.getName()).log(Level.SEVERE, null, ex);
                }
                ddpv.setVisible(false);
                
            } catch (IOException ex) {
                Logger.getLogger(XemDonDatPhongController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(XemDonDatPhongController.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
    }
    
    class OkeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            
                ddpv.showDonDatPhongTable();
           
        }
    }
    
    class OkeHoaDonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            
            try {
                ddpv.showDonDatPhong();
                ddpv.clearTable();
                ddpv.showTable();
                
                
            } catch (IOException ex) {
                Logger.getLogger(XemDonDatPhongController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(XemDonDatPhongController.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
    }
    
    class xemChiTietListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            
                if(!ddpv.isSelectedRow()) {
                    JOptionPane.showMessageDialog(ddpv, "Bạn chưa chọn đơn đặt phòng nào!");
                    return;
                }
                String idDatPhong = ddpv.getSelectedRowData();
            try {
                ddpv.showDialogContent(idDatPhong);
                ddpv.showDialogCenter();
            } catch (IOException ex) {
                Logger.getLogger(XemDonDatPhongController.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(XemDonDatPhongController.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
    }
    
    class TaoHoaDonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(ddpv.isSelectedRow()) {
            int dialogResult = JOptionPane.showConfirmDialog(ddpv, "Bạn có chắc chắn muốn tạo hóa đơn của khách hàng này?");
            if(dialogResult == JOptionPane.YES_OPTION) {
                boolean isValid = true;
                List<String> errorMessages = new ArrayList<String>();

                try {
                    if(!ddpv.checkNgay()) {
                        errorMessages.add("Ngày không hợp lệ vì khách vẫn chưa nhận nhận phòng!");
                        isValid = false;
                    }
                } catch (IOException ex) {
                    Logger.getLogger(SuaXoaPhongController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(SuaXoaPhongController.class.getName()).log(Level.SEVERE, null, ex);
                }

                if(isValid) {
                    try {
                        Datphong donDatPhong = ddpv.layDonDatPhong();
                        if(donDatPhong == null) return;
                        Hoadon hoadon = new Hoadon(donDatPhong);
                        HoaDonDao hdd = new HoaDonDao();
                        if (hdd.saveHoaDon(hoadon)) {
                            ddpv.traPhong(donDatPhong);
                            DatPhongDao dpd = new DatPhongDao();
                            ddpv.xoaDonDatPhong(donDatPhong);
                            ddpv.showHoaDonDialogCenter(hoadon);
                        } else {
                            JOptionPane.showMessageDialog(ddpv, "Thêm hóa đơn không thành công!");
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(ThemPhongController.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(ThemPhongController.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    String errorMessage = String.join("\n", errorMessages);
                    JOptionPane.showMessageDialog(ddpv, errorMessage);
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
