package khungproject.view;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import khungproject.DomainModels.ChiTietSPModel;
import khungproject.DomainModels.DongSPModel;
import khungproject.DomainModels.MauSacModel;
import khungproject.DomainModels.NSXModel;
import khungproject.DomainModels.SanPhamModel;
import khungproject.ViewModel.ChiTietSPViewModel;
import khungproject.service.impl.ChiTietSPService;

public class de_thi_thu extends javax.swing.JFrame {

    public de_thi_thu() {
        initComponents();
        loadsp();
        setcbb();
    }
    private ChiTietSPService ser = new ChiTietSPService();

    private ArrayList<ChiTietSPViewModel> loadsp() {
        ArrayList<ChiTietSPViewModel> list = new ArrayList();
        list = ser.getlistsp();
        DefaultTableModel dtm = (DefaultTableModel) tblsp.getModel();
        dtm.setRowCount(0);
        for (ChiTietSPViewModel ctsp : list) {
            Object[] rowData = {
                ctsp.getSpm().getId(),
                ctsp.getNambh(),
                ctsp.getMota(),
                ctsp.getSoluongsp(),
                ctsp.getGianhap(),
                ctsp.getSoluongsp() > 900 ? "nhieu sp" : "it sp"
            };
            dtm.addRow(rowData);
        }
        return list;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnambh = new javax.swing.JTextField();
        txtgianhap = new javax.swing.JTextField();
        txtslton = new javax.swing.JTextField();
        txtmota = new javax.swing.JTextField();
        cbbsearch = new javax.swing.JComboBox<>();
        btnsearch = new javax.swing.JButton();
        btninsert = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblsp = new javax.swing.JTable();
        btndelete = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("jMenu3");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("quản lý sp");

        jLabel2.setText("search");

        jLabel3.setText("năm bh");

        jLabel4.setText("giá nhập");

        jLabel5.setText("sl tồn");

        jLabel6.setText("mô tả");

        cbbsearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnsearch.setText("search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        btninsert.setText("insert");
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });

        btnupdate.setText("update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        tblsp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "năm bh", "mô tả", "số lượng tồn", "giá nhập", "tình trạng"
            }
        ));
        tblsp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblspMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblsp);

        btndelete.setText("delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbbsearch, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtnambh, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btninsert)
                                            .addComponent(txtgianhap))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtslton)
                                            .addComponent(txtmota, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                            .addComponent(btnsearch)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(btnupdate)
                                        .addGap(50, 50, 50)
                                        .addComponent(btndelete)))))))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbbsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnsearch)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(txtnambh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtslton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(txtgianhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btninsert)
                    .addComponent(btnupdate)
                    .addComponent(btndelete))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
        ChiTietSPModel ctspm = new ChiTietSPModel();
        try {
            ctspm.setNambh(Integer.parseInt(txtnambh.getText()));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "sai dinh dang nambh");
            return;
        }
        try {
            ctspm.setGianhap(Float.parseFloat(txtgianhap.getText()));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "sai dinh dang gia nhap");
            return;
        }
        try {
            ctspm.setSoluongsp(Integer.parseInt(txtslton.getText()));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "sai dinh dang slsp");
            return;
        }

        ctspm.setMota(txtmota.getText());
        ctspm.setGiaban(Float.parseFloat(String.valueOf(0)));
        ctspm.setDongsp(new DongSPModel("572CF416-32C6-4B6A-BF5B-66745EC76E09", "", ""));
        ctspm.setMausac(new MauSacModel("B9A5E41A-183F-4535-BB0C-A0FC8D501740", "", ""));
        ctspm.setNsx(new NSXModel("76208129-3A15-46D1-A779-5FE4BD0F2FC5", "", ""));

        SanPhamModel spm = new SanPhamModel();
        spm.setMa(rdn());
        spm.setTen(rdn());
        ctspm.setSpm(spm);
        ser.themsp(ctspm);
        loadsp();
    }//GEN-LAST:event_btninsertActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        int row = tblsp.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "chua chon hang nao");
            return;
        }
        ChiTietSPModel ctspm = new ChiTietSPModel();
        SanPhamModel spm = new SanPhamModel();
        spm.setId(tblsp.getValueAt(row, 0).toString());
        spm.setTen(rdn());

        try {
            ctspm.setNambh(Integer.parseInt(txtnambh.getText()));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "nhieu so the");
            return;
        }

        ctspm.setMota(txtmota.getText());
        if (txtgianhap.getText().length() > 12) {
            JOptionPane.showMessageDialog(this, "nhieu so the");
            return;
        }

        ctspm.setGianhap(Float.parseFloat(txtgianhap.getText()));
        ctspm.setGiaban(Float.parseFloat(String.valueOf(0)));
        ctspm.setDongsp(new DongSPModel("572CF416-32C6-4B6A-BF5B-66745EC76E09", "", ""));
        ctspm.setMausac(new MauSacModel("B9A5E41A-183F-4535-BB0C-A0FC8D501740", "", ""));
        ctspm.setNsx(new NSXModel("76208129-3A15-46D1-A779-5FE4BD0F2FC5", "", ""));
        try {
            ctspm.setSoluongsp(Integer.parseInt(txtslton.getText()));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "nhieu so the");
            return;
        }
        ctspm.setSpm(spm);
        ser.updatesp(ctspm);
        loadsp();
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        ArrayList<ChiTietSPViewModel> list = loadsp();
        ArrayList<ChiTietSPViewModel> list_final = new ArrayList<>();
        int nam = Integer.parseInt(cbbsearch.getSelectedItem().toString());
        for (int i = 0; i < list.size(); i++) {
            if (nam == list.get(i).getNambh()) {
                list_final.add(list.get(i));
            }
        }
        DefaultTableModel dtm = (DefaultTableModel) tblsp.getModel();
        dtm.setRowCount(0);
        for (ChiTietSPViewModel c : list_final) {
            Object[] rowData = {
                c.getSpm().getId(),
                c.getNambh(),
                c.getMota(),
                c.getSoluongsp(),
                c.getGianhap(),
                c.getSoluongsp() > 900 ? "con nhieu" : "con it"
            };
            dtm.addRow(rowData);
        }
    }//GEN-LAST:event_btnsearchActionPerformed

    private void tblspMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblspMouseClicked
        int row = tblsp.getSelectedRow();
        txtnambh.setText(tblsp.getValueAt(row, 1).toString());
        txtmota.setText(tblsp.getValueAt(row, 2).toString());
        txtgianhap.setText(tblsp.getValueAt(row, 4).toString());
        txtslton.setText(tblsp.getValueAt(row, 3).toString());
    }//GEN-LAST:event_tblspMouseClicked

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        int row = tblsp.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "bạn chưa chọn hàng nào");
            return;
        }
        String idsp = tblsp.getValueAt(row, 0).toString();
        try {
            ser.deletesp(idsp);
            loadsp();
        } catch (Exception ex) {
            ex.printStackTrace();
            int slt = JOptionPane.showConfirmDialog(this, "Error", "ban co muon xoa hoa don ko", JOptionPane.YES_NO_OPTION);
            if (slt == JOptionPane.YES_OPTION) {
                ser.deleteall(idsp, ser.traten(idsp, "idctsp"));
                loadsp();
            } else {
                JOptionPane.showMessageDialog(this, "cancel");
                return;
            }
        }

    }//GEN-LAST:event_btndeleteActionPerformed

    private static String rdn() {
        StringBuilder sb = new StringBuilder();
        String b = "0123456789" + "abcdefghijklmnopqrstuvxyz";
        for (int i = 0; i < 10; i++) {
            int index = (int) (b.length() * Math.random());
            sb.append(b.charAt(index));
        }
        return sb.toString();
    }

    public void setcbb() {
        DefaultComboBoxModel dcm = (DefaultComboBoxModel) cbbsearch.getModel();
        dcm.removeAllElements();
        for (int i = 1990; i <= 2000; i++) {
            dcm.addElement(i);
        }
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
            java.util.logging.Logger.getLogger(de_thi_thu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(de_thi_thu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(de_thi_thu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(de_thi_thu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new de_thi_thu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> cbbsearch;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblsp;
    private javax.swing.JTextField txtgianhap;
    private javax.swing.JTextField txtmota;
    private javax.swing.JTextField txtnambh;
    private javax.swing.JTextField txtslton;
    // End of variables declaration//GEN-END:variables
}
