/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qlks.view;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import qlks.dao.ThemPhongDao;
import qlks.entity.Phong;

/**
 *
 * @author CNG;
 */
public class SuaXoaPhongView extends javax.swing.JFrame {

    /**
     * Creates new form SuaXoaPhongView
     */
    public SuaXoaPhongView() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loaiPhongjComboBox = new javax.swing.JComboBox<>();
        soLuongGiuongjComboBox = new javax.swing.JComboBox<>();
        soPhongJLabel = new javax.swing.JLabel();
        loaiPhongJLabel = new javax.swing.JLabel();
        soPhongjFormattedTextField = new javax.swing.JFormattedTextField();
        soLuongGiuongJLabel = new javax.swing.JLabel();
        giajFormattedTextField = new javax.swing.JFormattedTextField();
        giaJLabel = new javax.swing.JLabel();
        suajButton = new javax.swing.JButton();
        xoajButton = new javax.swing.JButton();
        canclejButton = new javax.swing.JButton();
        TieudeJLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        phongTrongjTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        loaiPhongjComboBox.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        loaiPhongjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Phòng Standard", "Phòng Superior", "Phòng Deluxe", "Phòng Executive" }));
        loaiPhongjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loaiPhongjComboBoxActionPerformed(evt);
            }
        });

        soLuongGiuongjComboBox.setEditable(true);
        soLuongGiuongjComboBox.setFont(new java.awt.Font("Segoe UI Black", 2, 14)); // NOI18N
        soLuongGiuongjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        soLuongGiuongjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soLuongGiuongjComboBoxActionPerformed(evt);
            }
        });

        soPhongJLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        soPhongJLabel.setText("Số Phòng");

        loaiPhongJLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loaiPhongJLabel.setText("Loại Phòng");

        soPhongjFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        soPhongjFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soPhongjFormattedTextFieldActionPerformed(evt);
            }
        });

        soLuongGiuongJLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        soLuongGiuongJLabel.setText("Số giường");

        giajFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        giajFormattedTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giajFormattedTextFieldActionPerformed(evt);
            }
        });

        giaJLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        giaJLabel.setText("Giá (/h)");

        suajButton.setBackground(new java.awt.Color(0, 153, 153));
        suajButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        suajButton.setText("Sửa");
        suajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suajButtonActionPerformed(evt);
            }
        });

        xoajButton.setBackground(new java.awt.Color(0, 153, 153));
        xoajButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        xoajButton.setText("Xóa");
        xoajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoajButtonActionPerformed(evt);
            }
        });

        canclejButton.setBackground(new java.awt.Color(0, 153, 153));
        canclejButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        canclejButton.setText("Cancle");

        TieudeJLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TieudeJLabel1.setForeground(new java.awt.Color(30, 22, 107));
        TieudeJLabel1.setText("Thông tin về phòng được chọn");

        jSeparator2.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setBackground(new java.awt.Color(30, 22, 107));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(30, 22, 107));
        jLabel1.setText("Những danh sách phòng trống");

        phongTrongjTable.setBackground(new java.awt.Color(204, 255, 255));
        phongTrongjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Số phòng", "Loại phòng", "Số lượng giường", "Giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        phongTrongjTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(phongTrongjTable);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(soPhongJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(loaiPhongJLabel)
                                    .addComponent(soLuongGiuongJLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(giaJLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(soPhongjFormattedTextField)
                                    .addComponent(loaiPhongjComboBox, 0, 403, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(canclejButton)
                                            .addGap(58, 58, 58)
                                            .addComponent(suajButton)
                                            .addGap(57, 57, 57)
                                            .addComponent(xoajButton)
                                            .addGap(49, 49, 49))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(soLuongGiuongjComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, 405, Short.MAX_VALUE)
                                            .addComponent(giajFormattedTextField, javax.swing.GroupLayout.Alignment.TRAILING))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(TieudeJLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(71, 71, 71))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(TieudeJLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(soPhongJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soPhongjFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loaiPhongJLabel)
                            .addComponent(loaiPhongjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(81, 81, 81)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(soLuongGiuongjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(soLuongGiuongJLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(giajFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(giaJLabel))
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(xoajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(suajButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(canclejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jSeparator1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void soPhongjFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soPhongjFormattedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soPhongjFormattedTextFieldActionPerformed

    private void giajFormattedTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giajFormattedTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_giajFormattedTextFieldActionPerformed

    private void xoajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoajButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xoajButtonActionPerformed

    private void suajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suajButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suajButtonActionPerformed

    private void loaiPhongjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loaiPhongjComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loaiPhongjComboBoxActionPerformed

    private void soLuongGiuongjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soLuongGiuongjComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soLuongGiuongjComboBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void showTable() throws IOException, ClassNotFoundException
    {
        ThemPhongDao tpd = new ThemPhongDao();
        List<Phong> phong = tpd.readPhongFromFile();

        List<Phong> phongTrong = new ArrayList<>();
        for (Phong p : phong) {
            if (p.isDaDuocDat() == false) {
                phongTrong.add(p);
            }
        }

        // Tạo JTable
        
        DefaultTableModel model = (DefaultTableModel) phongTrongjTable.getModel();
        // Thêm sinh viên vào table
        for (Phong p : phongTrong) {
            Object[] row = new Object[4];
            row[0] = p.getSoPhong();
            row[1] = p.getLoaiPhong();
            row[2] = p.getSoLuongGiuong();
            // đoạn code này sửa lại hiển thị giá theo yêu cầu của thầy 
            DecimalFormat df = new DecimalFormat("#,##0");
            String formattedPrice = df.format(p.getGia());

            row[3] = formattedPrice+" VND";
            //row[3] = p.getGia();
            model.addRow(row);
        }
        
    }
    
    public Integer getSelectedRow() {
        int selectedRowIndex = phongTrongjTable.getSelectedRow();

        if (selectedRowIndex < 0) {
            // Không có hàng nào được chọn
            return null;
        }

        Object rowData = phongTrongjTable.getValueAt(selectedRowIndex, 0);

        if (rowData instanceof Integer) {
            return (Integer) rowData;
        } else {
            return null;
        }
    }
    
    public boolean isSelectedRow() {
        if (phongTrongjTable.getSelectedRow() == -1) {
    // Không có dòng nào được chọn trong bảng
            return false;
        } else {
            // Đã có dòng được chọn trong bảng
            return true;
        }
    }
    
    public void showModified() throws IOException, ClassNotFoundException {
        if(isSelectedRow()) {
            ThemPhongDao tp = new ThemPhongDao();
            List<Phong> dsphong = tp.readPhongFromFile();
            for(Phong p : dsphong) {
                if(p.getSoPhong()==getSelectedRow()) {
                    soPhongjFormattedTextField.setText(String.valueOf(p.getSoPhong()));
                    loaiPhongjComboBox.setSelectedItem(p.getLoaiPhong());
                    soLuongGiuongjComboBox.setSelectedItem(p.getSoLuongGiuong());
                    giajFormattedTextField.setText(String.valueOf(p.getGia()));
                }
            }
        }else {
            return;
        }
    }
    
    public void showDefault() throws IOException, ClassNotFoundException {
        
                    soPhongjFormattedTextField.setText("");
                    loaiPhongjComboBox.setSelectedItem(1);
                    soLuongGiuongjComboBox.setSelectedItem(1);
                    giajFormattedTextField.setText("");
         
    }
    
    public int getSoPhong()
    {
        return Integer.parseInt(soPhongjFormattedTextField.getText().toString());
    }
    
    public String getLoaiPhong() {
        return loaiPhongjComboBox.getSelectedItem().toString();
    }
    
    public int getSoLuongGiuong() {
        return Integer.parseInt(soLuongGiuongjComboBox.getSelectedItem().toString());
    }
    
    public double getGia() {
        return Double.parseDouble(giajFormattedTextField.getText().toString());
    }
    
    public boolean hopLeTenPhong() throws IOException, ClassNotFoundException {
        String soPhong = soPhongjFormattedTextField.getText();
        if (soPhong == null || "".equals(soPhong.trim())) {
            return false;
        }
        try {
            int phongNumber = Integer.parseInt(soPhong);
            if(phongNumber<0) return false;
        } catch (NumberFormatException e) {
        return false;
        }
        return true;
    }
    
    public boolean hopLeTenPhongXoa() throws IOException, ClassNotFoundException {
        String soPhong = soPhongjFormattedTextField.getText();
        if (soPhong == null || "".equals(soPhong.trim())) {
            return false;
        }
        try {
            int phongNumber = Integer.parseInt(soPhong);
            if(phongNumber<0) return false;
            ThemPhongDao tpd = new ThemPhongDao();
            List<Phong> phong = tpd.readPhongFromFile();
            for(Phong p : phong) {
                if(p.getSoPhong()==phongNumber) return true;
            }
        } catch (NumberFormatException e) {
        return false;
        }
        return false;
    }
    
    public boolean hopLeGia() {
    String s = giajFormattedTextField.getText();
        if (s == null || "".equals(s.trim())) {
            return false;
        }
        try {
            double gia = Double.parseDouble(s);
            if(gia<0) return false;
        } catch (NumberFormatException e) {
        return false;
        }
        return true;
} 
    
    public void addChonDongListener(ListSelectionListener listener) {
        phongTrongjTable.getSelectionModel().addListSelectionListener(listener);
    }


    public void clearTable() {
        DefaultTableModel model = (DefaultTableModel) phongTrongjTable.getModel();
        model.setRowCount(0);
    }
    
    public void addCancleListener(ActionListener listener) {
       canclejButton.addActionListener(listener);
    }
    
    public void addXoaListener(ActionListener listener) {
       xoajButton.addActionListener(listener);
    }
    
    public void addSuaListener(ActionListener listener) {
       suajButton.addActionListener(listener);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SuaXoaPhongView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaXoaPhongView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaXoaPhongView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaXoaPhongView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SuaXoaPhongView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TieudeJLabel1;
    private javax.swing.JButton canclejButton;
    private javax.swing.JLabel giaJLabel;
    private javax.swing.JFormattedTextField giajFormattedTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel loaiPhongJLabel;
    private javax.swing.JComboBox<String> loaiPhongjComboBox;
    private javax.swing.JTable phongTrongjTable;
    private javax.swing.JLabel soLuongGiuongJLabel;
    private javax.swing.JComboBox<String> soLuongGiuongjComboBox;
    private javax.swing.JLabel soPhongJLabel;
    private javax.swing.JFormattedTextField soPhongjFormattedTextField;
    private javax.swing.JButton suajButton;
    private javax.swing.JButton xoajButton;
    // End of variables declaration//GEN-END:variables
}
