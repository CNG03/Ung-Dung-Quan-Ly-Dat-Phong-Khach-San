/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qlks.view;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import qlks.dao.DatPhongDao;
import qlks.dao.ReadIndex;
import qlks.dao.ThemPhongDao;
import qlks.dao.UserDao;
import qlks.entity.Datphong;
import qlks.entity.Khachhang;
import qlks.entity.Phong;

/**
 *
 * @author CNG;
 */
public class DatPhongView extends javax.swing.JFrame {

    /**
     * Creates new form DatPhongView
     */
    public DatPhongView() {
        initComponents();
        //this.setResizable(false);
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

        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        addressjTextField = new javax.swing.JTextField();
        phonejTextField = new javax.swing.JTextField();
        emailjTextField = new javax.swing.JTextField();
        tenKhachHangjTextField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        CanclejButton = new javax.swing.JButton();
        OkejButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        thoiGianDatPhongjSpinner = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        phongTrongjTable = new javax.swing.JTable();
        chonPhongjButton = new javax.swing.JButton();
        chonPhongjLabel = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đặt Phòng");

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Nhập thông tin đặt phòng");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(492, 492, 492)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Tên khách hàng:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Địa chỉ khách hàng:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Phone:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Email:");

        addressjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressjTextFieldActionPerformed(evt);
            }
        });

        emailjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailjTextFieldActionPerformed(evt);
            }
        });

        CanclejButton.setBackground(new java.awt.Color(51, 255, 51));
        CanclejButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CanclejButton.setText("Cancle");
        CanclejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CanclejButtonActionPerformed(evt);
            }
        });

        OkejButton.setBackground(new java.awt.Color(51, 255, 51));
        OkejButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        OkejButton.setText("Oke");
        OkejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkejButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Thời gian đặt phòng:");

        thoiGianDatPhongjSpinner.setModel(new javax.swing.SpinnerDateModel());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(CanclejButton)
                .addGap(54, 54, 54)
                .addComponent(OkejButton)
                .addGap(133, 133, 133))
            .addComponent(jSeparator1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addressjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tenKhachHangjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phonejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 37, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(thoiGianDatPhongjSpinner)
                .addGap(59, 59, 59))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tenKhachHangjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(addressjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(phonejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(thoiGianDatPhongjSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OkejButton)
                    .addComponent(CanclejButton))
                .addGap(15, 15, 15))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Danh sách phòng còn trống");

        phongTrongjTable.setAutoCreateRowSorter(true);
        phongTrongjTable.setBackground(new java.awt.Color(204, 255, 255));
        phongTrongjTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        phongTrongjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Số phòng", "Loại phòng", "Số lượng giường", "Giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
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
        phongTrongjTable.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        phongTrongjTable.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(phongTrongjTable);

        chonPhongjButton.setBackground(new java.awt.Color(51, 255, 51));
        chonPhongjButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chonPhongjButton.setText("Chọn Phòng");

        chonPhongjLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chonPhongjLabel.setText("Những phòng chọn là: ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(jLabel9))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(chonPhongjButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(chonPhongjLabel))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 142, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chonPhongjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chonPhongjLabel)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OkejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkejButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OkejButtonActionPerformed

    private void CanclejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CanclejButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CanclejButtonActionPerformed

    private void emailjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailjTextFieldActionPerformed

    private void addressjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressjTextFieldActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(DatPhongView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatPhongView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatPhongView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatPhongView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatPhongView().setVisible(true);
            }
        });
    }
    
    
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
    
    
    public void laySoPhongDuocchon() throws IOException, ClassNotFoundException
    {
        int[] selectedRows = phongTrongjTable.getSelectedRows();
        // Duyệt danh sách các dòng đang được chọn và in ra các giá trị của các dòng đó
        for (int i : selectedRows) {
            int soPhong = Integer.parseInt(phongTrongjTable.getValueAt(i, 0).toString()); // giá trị ở cột thứ nhất của dòng đang được chọn
            System.out.println("Selected row: " + soPhong);
        }
    }
    
    public void addCancleListener(ActionListener listener) {
       CanclejButton.addActionListener(listener);
    }
    public void addChonPhongListener(ActionListener listener) {
       chonPhongjButton.addActionListener(listener);
    }
    
    public void addOkeListener(ActionListener listener) {
       OkejButton.addActionListener(listener);
    }
    
    public List<Integer> getSelectedRows() {
        int[] selectedRows = phongTrongjTable.getSelectedRows();
        List<Integer> rows = new ArrayList<>();
        for (int row : selectedRows) {
            Object rowData = phongTrongjTable.getValueAt(row, 0);
            if (rowData instanceof Integer) {
                rows.add((Integer) rowData);
            }
        }
        return rows;
    }

    
    public void setLabelValue(String text) {
        chonPhongjLabel.setText("Những phòng chọn là: "+text);
    }
    
    public void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
        this.setVisible(true);
    }
    
    public boolean hopLeTenKH() {
        String name = tenKhachHangjTextField.getText().trim(); // Xóa khoảng trắng ở đầu và cuối chuỗi
        if (name.isEmpty()) { // Sử dụng isEmpty() thay vì so sánh với "".
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (!Character.isLetter(name.charAt(i)) && name.charAt(i) != ' ') { // Cho phép chữ cái và khoảng trắng.
                return false;
            }
        }
        return true;
    }

    
    private boolean validTenKH() {
        String name = tenKhachHangjTextField.getText();
        if (name == null || "".equals(name.trim())) {
            tenKhachHangjTextField.requestFocus();
            showMessage("Tên không được trống.");
            return false;
        }
        return true;
    }
    
    public boolean hopLeAddress() {
        String address = addressjTextField.getText();
        if (address == null || "".equals(address.trim())) {
            return false;
        }
        return true;
    }
    
    private boolean validateAddress() {
        String address = addressjTextField.getText();
        if (address == null || "".equals(address.trim())) {
            addressjTextField.requestFocus();
            showMessage("Địa chỉ không được trống.");
            return false;
        }
        return true;
    }
    
    public boolean hopLeEmail() {
        String email = emailjTextField.getText();
        if (email == null || "".equals(email.trim())) {
            return false;
        }
        return true;
    }
    
    
    private boolean validEmail() {
        String email = emailjTextField.getText();
        if (email == null || "".equals(email.trim())) {
            emailjTextField.requestFocus();
            showMessage("Địa chỉ không được trống.");
            return false;
        }
        return true;
    }
    
    private boolean validatePhone() {
        String phone = phonejTextField.getText();
        if (phone == null || "".equals(phone.trim())) {
            phonejTextField.requestFocus();
            showMessage("Số điện thoại không được trống.");
            return false;
        }
        try {
            int phoneNumber = Integer.parseInt(phone);
        } catch (NumberFormatException e) {
            phonejTextField.requestFocus();
            showMessage("Số điện thoại phải là số nguyên.");
        return false;
        }
        return true;
    }
    
    public boolean hopLePhone() {
        String phone = phonejTextField.getText();
        if (phone == null || "".equals(phone.trim())) {
            return false;
        }
        try {
            int phoneNumber = Integer.parseInt(phone);
        } catch (NumberFormatException e) {
        return false;
        }
        return true;
    }
    
    
    public Khachhang getKhachHangInfo() {
        // validate student
//        if (!validTenKH() || !validateAddress() || !validEmail() || !validatePhone()) {
//            return null;
//        }
        try {
            Khachhang kh = new Khachhang();
            kh.setHoten(tenKhachHangjTextField.getText().trim());
            kh.setEmail(emailjTextField.getText().trim());
            kh.setAddress(addressjTextField.getText().trim());
            kh.setSdt(Integer.parseInt(phonejTextField.getText().toString().trim()));
            return kh;
        } catch (Exception e) {
            showMessage(e.getMessage());
        }
        return null;
    }
    
    public List<Phong> getKHPhong() throws IOException, ClassNotFoundException {
        List<Integer> soPhong= getSelectedRows();
        ThemPhongDao dpd = new ThemPhongDao();
        List<Phong> dsp = dpd.readPhongFromFile();
        List<Phong> phongKhachChon = new ArrayList<>();
        for(Phong s : dsp) {
            for(int a : soPhong) {
                if(s.getSoPhong()==a) {
                    phongKhachChon.add(s);
                    s.setDaDuocDat(true);
                }
            }
        }
        dpd.saveDanhSachPhong(dsp);
        return phongKhachChon;
    }
    
    public List<Phong> getPhong() throws IOException, ClassNotFoundException {
        List<Integer> soPhong= getSelectedRows();
        ThemPhongDao dpd = new ThemPhongDao();
        List<Phong> dsp = dpd.readPhongFromFile();
        List<Phong> phongKhachChon = new ArrayList<>();
        for(Phong s : dsp) {
            for(int a : soPhong) {
                if(s.getSoPhong()==a) {
                    phongKhachChon.add(s);
                    //s.setDaDuocDat(true);
                }
            }
        }
        dpd.saveDanhSachPhong(dsp);
        return phongKhachChon;
    }
    
    public boolean isNullPhong() throws IOException, ClassNotFoundException {
        List<Phong> phong = getPhong();
        if (phong.isEmpty()) {
            System.out.println("Danh sách trống");
            return true;
        } else {
            System.out.println("Danh sách không trống");
            return false;
        }
    }
    
    public Datphong getDatPhongInfo() {
        try {
            int index = ReadIndex.readIntFromFile();
            index++;
            ReadIndex.writeIntToFile(index);
            Datphong dp = new Datphong();
            dp.setKH(getKhachHangInfo());
            dp.setPh(getKHPhong());
            dp.setIdDatPhong(index);
            dp.setThoiGianDatPhong(getDateFromSpinner());
            return dp;
        } catch (Exception e) {
            showMessage(e.getMessage());
        }
        return null;
    }
    
    public boolean hopLyNgayDatPhong() {
        Date selectedDate = (Date) thoiGianDatPhongjSpinner.getValue();
        Date currentDate = new Date();
        if (selectedDate.before(currentDate)) {
    // Biến dateVariable nhỏ hơn ngày hiện tại
            return false;
        } else {
            // Biến dateVariable lớn hơn hoặc bằng ngày hiện tại
            return true;
        }
    }
    
        public Date getDateFromSpinner() {
        // Lấy giá trị từ JSpinner
        Object value = thoiGianDatPhongjSpinner.getValue();
        // Kiểm tra xem giá trị có phải kiểu dữ liệu Date hay không
        if (value instanceof Date) {
            // Nếu giá trị là kiểu dữ liệu Date, trả về giá trị đó
            return (Date) value;
        } else {
            // Nếu giá trị không phải kiểu dữ liệu Date, trả về null hoặc bắt lỗi tương ứng
            return null;
        }
    }

    
    
    
    // nhung ham setter va getter don gian 
//    public void getTenKH() {
//        String name = tenKhachHangjTextField.getText();
//        if (name == null || "".equals(name.trim())) {
//            tenKhachHangjTextField.requestFocus();
//            showMessage("Tên không được trống.");
//            return false;
//        }
//        return true;
//    }



    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CanclejButton;
    private javax.swing.JButton OkejButton;
    private javax.swing.JTextField addressjTextField;
    private javax.swing.JButton chonPhongjButton;
    private javax.swing.JLabel chonPhongjLabel;
    private javax.swing.JTextField emailjTextField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField phonejTextField;
    private javax.swing.JTable phongTrongjTable;
    private javax.swing.JTextField tenKhachHangjTextField;
    private javax.swing.JSpinner thoiGianDatPhongjSpinner;
    // End of variables declaration//GEN-END:variables
}
