/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qlks.view;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import qlks.dao.DatPhongDao;
import qlks.dao.HoaDonDao;
import qlks.dao.ThemPhongDao;
import qlks.entity.Datphong;
import qlks.entity.Hoadon;
import qlks.entity.Phong;

/**
 *
 * @author CNG;
 */
public class SearchView extends javax.swing.JFrame {

    /**
     * Creates new form SearchView
     */
    public SearchView() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        searchjTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        searchjButton = new javax.swing.JButton();
        tenKHjRadioButton = new javax.swing.JRadioButton();
        maHDjRadioButton = new javax.swing.JRadioButton();
        maDatPhongjRadioButton = new javax.swing.JRadioButton();
        tenPhongjRadioButton = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        canclejButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 635;
        gridBagConstraints.ipady = 29;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 135, 0, 0);
        jPanel1.add(searchjTextField, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Loại thông tin tìm kiếm:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(48, 6, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        searchjButton.setBackground(new java.awt.Color(51, 255, 51));
        searchjButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        searchjButton.setText("Search");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 12, 0, 39);
        jPanel1.add(searchjButton, gridBagConstraints);

        buttonGroup1.add(tenKHjRadioButton);
        tenKHjRadioButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tenKHjRadioButton.setText("Tìm tên khách hàng");
        tenKHjRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenKHjRadioButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(49, 57, 32, 0);
        jPanel1.add(tenKHjRadioButton, gridBagConstraints);

        buttonGroup1.add(maHDjRadioButton);
        maHDjRadioButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        maHDjRadioButton.setText("Tìm mã hóa đơn");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(49, 28, 32, 0);
        jPanel1.add(maHDjRadioButton, gridBagConstraints);

        buttonGroup1.add(maDatPhongjRadioButton);
        maDatPhongjRadioButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        maDatPhongjRadioButton.setText("Tìm mã đơn đặt phòng");
        maDatPhongjRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maDatPhongjRadioButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(49, 46, 32, 0);
        jPanel1.add(maDatPhongjRadioButton, gridBagConstraints);

        buttonGroup1.add(tenPhongjRadioButton);
        tenPhongjRadioButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        tenPhongjRadioButton.setText("Tìm phòng");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(49, 42, 32, 0);
        jPanel1.add(tenPhongjRadioButton, gridBagConstraints);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jTable1.setBackground(new java.awt.Color(204, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 888;
        gridBagConstraints.ipady = 281;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(15, 32, 0, 45);
        jPanel2.add(jScrollPane1, gridBagConstraints);

        canclejButton.setText("Cancle");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 437, 36, 0);
        jPanel2.add(canclejButton, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tenKHjRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenKHjRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tenKHjRadioButtonActionPerformed

    private void maDatPhongjRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maDatPhongjRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maDatPhongjRadioButtonActionPerformed

    public void addCancleListener(ActionListener listener) {
        canclejButton.addActionListener(listener);
    }
    
    public void addSearchListener(ActionListener listener) {
        searchjButton.addActionListener(listener);
    }
    public void setDefaultSelected() {
        tenKHjRadioButton.setSelected(true);
    }
    public boolean tenPhongisSelected() {
        return tenPhongjRadioButton.isSelected();
    }
    
    public boolean tenKHisSelected() {
        return tenKHjRadioButton.isSelected();
    }
    public boolean maHDisSelected() {
        return maHDjRadioButton.isSelected();
    }
    public boolean maDPisSelected() {
        return maDatPhongjRadioButton.isSelected();
    }
    public String getTextSearch() {
        return searchjTextField.getText();
    }
    
    public void showDefaultTable() {
        String[] newColumnTitles = {"", "", "", ""};
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setColumnIdentifiers(newColumnTitles);
    }
    
    public void showSearchKH(String tenKH) throws IOException, ClassNotFoundException {
        DatPhongDao dpd = new DatPhongDao();
        HoaDonDao hdd = new HoaDonDao();
        List<Hoadon> hd = hdd.readHoaDonFromFile();
        List<Datphong> ds = dpd.readDatPhongFromFile();
        String[] newColumnTitles = {"Họ tên KH", "Địa chỉ", "Số điện thoại", "Mã đặt phòng"};
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setColumnIdentifiers(newColumnTitles);
        model.setRowCount(0);
        for(Datphong d : ds) {
            if(d.getKH().getHoten().equals(tenKH)) {
                Object[] row = new Object[4];
                row[0] = d.getKH().getHoten();
                row[1] = d.getKH().getAddress();
                row[2] = "0"+d.getKH().getSdt();
                row[3] = d.getIdDatPhong();
                model.addRow(row);
            }
        }

        for(Hoadon d : hd) {
            if(d.getDatphong().getKH().getHoten().equals(tenKH)) {
                Object[] row = new Object[4];
                row[0] = d.getDatphong().getKH().getHoten();
                row[1] = d.getDatphong().getKH().getAddress();
                row[2] = "0"+d.getDatphong().getKH().getSdt();
                List<Integer> sp = new ArrayList<>();
                row[3] = d.getDatphong().getIdDatPhong();
                model.addRow(row);
            }
        }
    }
    
    public void showSearchMaDP(String maDP) throws IOException, ClassNotFoundException {
        DatPhongDao dpd = new DatPhongDao();
        HoaDonDao hdd = new HoaDonDao();
        List<Hoadon> hd = hdd.readHoaDonFromFile();
        List<Datphong> ds = dpd.readDatPhongFromFile();
        String[] newColumnTitles = {"Mã đặt phòng", "Tên khách hàng", "Ngày đặt phòng", "Phòng đã đặt","Có hóa đơn"};
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setColumnIdentifiers(newColumnTitles);
        model.setRowCount(0);
        for(Datphong d : ds) {
            if(d.getIdDatPhong().equals(maDP)) {
                Object[] row = new Object[5];
                row[0] = d.getIdDatPhong();
                row[1] = d.getKH().getHoten();
                row[2] = String.valueOf(d.getThoiGianDatPhong());
                List<Integer> sp = new ArrayList<>();
                for(Phong p : d.getPh()) {
                    sp.add(p.getSoPhong());
                }
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < sp.size(); i++) {
                    sb.append(sp.get(i));
                    if (i < sp.size() - 1) {
                        sb.append(",");
                    }
                }
                String result = sb.toString();
                row[3] = result;
                row[4] = "Chưa có";
                model.addRow(row);
            }
        }
        
        for(Hoadon d : hd) {
            if(d.getDatphong().getIdDatPhong().equals(maDP)) {
                Object[] row = new Object[5];
                row[0] = d.getDatphong().getIdDatPhong();
                row[1] = d.getDatphong().getKH().getHoten();
                row[2] = String.valueOf(d.getDatphong().getThoiGianDatPhong());
                List<Integer> sp = new ArrayList<>();
                for(Phong p : d.getDatphong().getPh()) {
                    sp.add(p.getSoPhong());
                }
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < sp.size(); i++) {
                    sb.append(sp.get(i));
                    if (i < sp.size() - 1) {
                        sb.append(",");
                    }
                }
                String result = sb.toString();
                row[3] = result;
                row[4] = d.getMshd();
                model.addRow(row);
            }
        }
    }
    
    
    public void showSearchMaHD(String maHD) throws IOException, ClassNotFoundException {
        HoaDonDao hdd = new HoaDonDao();
        List<Hoadon> hd = hdd.readHoaDonFromFile();
        String[] newColumnTitles = {"Mã hóa đơn", "Tên khách hàng", "Ngày trả phòng", "Số tiền trả"};
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setColumnIdentifiers(newColumnTitles);
        model.setRowCount(0);
        for(Hoadon d : hd) {
            if(d.getMshd().equals(maHD)) {
                Object[] row = new Object[4];
                row[0] = d.getMshd();
                row[1] = d.getDatphong().getKH().getHoten();
                row[2] = String.valueOf(d.getNgay());
                row[3] = d.getTongTien();
                model.addRow(row);
            }
        }
    }
    
    public void showSearchPhong(String tenPhong) throws IOException, ClassNotFoundException {
        ThemPhongDao tpd = new ThemPhongDao();
        List<Phong> dsp = tpd.readPhongFromFile();
        String[] newColumnTitles = {"Tên phòng", "Loại phòng", "Số lượng giường", "Giá(/h)", "Trạng thái"};
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setColumnIdentifiers(newColumnTitles);
        model.setRowCount(0);
        for(Phong p : dsp) {
            String tp = String.valueOf(p.getSoPhong());
            if(tp.equals(tenPhong)) {
                Object[] row = new Object[5];
                row[0] = p.getSoPhong();
                row[1] = p.getLoaiPhong();
                row[2] = p.getSoLuongGiuong();
                row[3] = p.getGia();
                if(p.isDaDuocDat()){
                    row[4] ="Đã được đặt";
                }else {
                    row[4] = "Chưa được đặt";
                }
                model.addRow(row);
            }
        }
    }

   
    
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
            java.util.logging.Logger.getLogger(SearchView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton canclejButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton maDatPhongjRadioButton;
    private javax.swing.JRadioButton maHDjRadioButton;
    private javax.swing.JButton searchjButton;
    private javax.swing.JTextField searchjTextField;
    private javax.swing.JRadioButton tenKHjRadioButton;
    private javax.swing.JRadioButton tenPhongjRadioButton;
    // End of variables declaration//GEN-END:variables
}