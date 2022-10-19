package khungproject.view;

import java.util.ArrayList;
import javax.security.auth.callback.ConfirmationCallback;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import khungproject.DomainModels.ChiTietSPModel;
import khungproject.ViewModel.ChiTietSPViewModel;
import khungproject.DomainModels.DongSPModel;
import khungproject.DomainModels.MauSacModel;
import khungproject.DomainModels.NSXModel;
import khungproject.DomainModels.SanPhamModel;
import khungproject.Repository.ChiTietSPRepo;
import khungproject.service.impl.ChiTietSPService;

public class ChiTietSpView extends javax.swing.JFrame {

    private ChiTietSPService ser = new ChiTietSPService();

    public ChiTietSpView() {
        initComponents();
        loadsp();
        ArrayList<NSXModel> list1 = ser.getcbbnsx();
        DefaultComboBoxModel dcm1 = (DefaultComboBoxModel) cbbnsx.getModel();
        dcm1.removeAllElements();
        ArrayList<MauSacModel> list2 = ser.getcbbmau();
        DefaultComboBoxModel dcm2 = (DefaultComboBoxModel) cbbmau.getModel();
        dcm2.removeAllElements();
        ArrayList<DongSPModel> list3 = ser.getcbbdongsp();
        DefaultComboBoxModel dcm3 = (DefaultComboBoxModel) cbbdongsp.getModel();
        dcm3.removeAllElements();
        for (NSXModel x : list1) {
            dcm1.addElement(x.toString());
        }
        for (MauSacModel x : list2) {
            dcm2.addElement(x.toString());
        }
        for (DongSPModel x : list3) {
            dcm3.addElement(x.toString());
        }
    }

    public void loadsp() {
        ArrayList<ChiTietSPViewModel> list = ser.getlistsp();
        DefaultTableModel dtm = (DefaultTableModel) tblsp.getModel();
        dtm.setRowCount(0);
        for (ChiTietSPViewModel x : list) {
            Object[] rowData = {
                x.getSpm().getMa(),
                x.getSpm().getTen(),
                ser.traten("nsx",x.getIdnsx()),
                ser.traten("mausac",x.getIdmausac()),
                ser.traten("dongsp",x.getIddongsp()),
                x.getNambh(),
                x.getMota(),
                x.getSoluongsp(),
                x.getGianhap(),
                x.getGiaban()
            };
            dtm.addRow(rowData);
        }
    }

    public ChiTietSPModel getformdata(String b) {
        try {
            ChiTietSPModel ctspm = new ChiTietSPModel();
            SanPhamModel s = new SanPhamModel();
            if ("insert".equals(b)) {
                s.setMa(rdn());
            } else {
                s.setMa(txtmasp.getText());
            }
            s.setTen(txttensp.getText());
            ctspm.setSpm(s);
            NSXModel nsxm = new NSXModel(ser.g(cbbnsx.getSelectedItem().toString()).get(0), ser.g(cbbnsx.getSelectedItem().toString()).get(1), ser.g(cbbnsx.getSelectedItem().toString()).get(2));
            MauSacModel msm = new MauSacModel(ser.g(cbbmau.getSelectedItem().toString()).get(0), ser.g(cbbmau.getSelectedItem().toString()).get(1), ser.g(cbbmau.getSelectedItem().toString()).get(2));
            DongSPModel dspm = new DongSPModel(ser.g(cbbdongsp.getSelectedItem().toString()).get(0), ser.g(cbbdongsp.getSelectedItem().toString()).get(1), ser.g(cbbdongsp.getSelectedItem().toString()).get(2));

            ctspm.setIdnsx(nsxm.getId());
            ctspm.setIdmausac(msm.getId());
            ctspm.setIddongsp(dspm.getId());
            ctspm.setNambh(Integer.parseInt(txtnambh.getText()));
            ctspm.setMota(txtmota.getText());
            ctspm.setSoluongsp(Integer.parseInt(txtslsp.getText()));
            ctspm.setGianhap(Float.parseFloat(txtgianhap.getText()));
            ctspm.setGiaban(Float.parseFloat(txtgiaban.getText()));
            return ctspm;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtnambh = new javax.swing.JTextField();
        cbbmau = new javax.swing.JComboBox<>();
        txtmota = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        txtslsp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtgianhap = new javax.swing.JTextField();
        txtgiaban = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblsp = new javax.swing.JTable();
        txttensp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtmasp = new javax.swing.JTextField();
        cbbnsx = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cbbdongsp = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtnambh.setText("20");
        txtnambh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnambhActionPerformed(evt);
            }
        });

        txtmota.setText("abc");

        jLabel1.setText("tên sp");

        jLabel2.setText("màu");

        jLabel3.setText("năm bh");

        jLabel5.setText("mô tả");

        btnthem.setText("thêm ");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnsua.setText("sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnxoa.setText("xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        txtslsp.setText("1000");

        jLabel6.setText("slsp");

        txtgianhap.setText("20000");

        txtgiaban.setText("2000");

        jLabel7.setText("giá nhập");

        jLabel8.setText("giá bán");

        tblsp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "mã sp", "ten sp", "tên nsx", "màu", "dòng sp", "năm bh", "mô tả", "slsp", "giá nhập", "giá bán"
            }
        ));
        tblsp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblspMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblsp);

        txttensp.setText("aaaaaa");

        jLabel4.setText("mã sp");

        txtmasp.setEditable(false);

        jLabel9.setText("nsx");

        jLabel10.setText("dòng sp");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)))
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbbmau, 0, 523, Short.MAX_VALUE)
                            .addComponent(cbbdongsp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbbnsx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtmota, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txttensp, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtmasp, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(49, 49, 49)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel3)
                                                .addComponent(jLabel6))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(175, 175, 175)
                                        .addComponent(jLabel7)))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtgianhap, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtnambh, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtslsp, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtgiaban, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(67, 67, 67)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnxoa)
                                            .addComponent(btnsua)
                                            .addComponent(btnthem))))))
                        .addGap(48, 194, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnthem)
                                    .addComponent(txtmasp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtnambh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txttensp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(btnsua)
                                    .addComponent(txtslsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnxoa)
                            .addComponent(txtmota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(txtgiaban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtgianhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cbbnsx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(cbbmau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbdongsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnambhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnambhActionPerformed

    }//GEN-LAST:event_txtnambhActionPerformed

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        ChiTietSPModel ctspm = getformdata("insert");
        ser.themsp(ctspm);
        loadsp();
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        int row = tblsp.getSelectedRow();
        if (row == -1) {
            return;
        }
        ChiTietSPModel ctspm = getformdata("update");
        ctspm.getSpm().setId(ser.traten("idsp",tblsp.getValueAt(row, 1).toString()));
        ser.updatesp(ctspm);
        loadsp();
    }//GEN-LAST:event_btnsuaActionPerformed


    private void tblspMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblspMouseClicked
        int row = tblsp.getSelectedRow();
        txttensp.setText(tblsp.getValueAt(row, 1).toString());
        txtmasp.setText(tblsp.getValueAt(row, 0).toString());

        DefaultComboBoxModel dcm1 = (DefaultComboBoxModel) cbbnsx.getModel();
        for (int i = 0; i < dcm1.getSize(); i++) {
            if (tblsp.getValueAt(row, 2).equals(ser.g(cbbmau.getItemAt(i)).get(1))) {
                cbbnsx.setSelectedIndex(i);
            }
        }

        DefaultComboBoxModel dcm2 = (DefaultComboBoxModel) cbbmau.getModel();
        for (int i = 0; i < dcm2.getSize(); i++) {
            if (tblsp.getValueAt(row, 3).equals(ser.g(cbbnsx.getItemAt(i)).get(0))) {
                cbbmau.setSelectedIndex(i);
            }
        }
        DefaultComboBoxModel dcm3 = (DefaultComboBoxModel) cbbdongsp.getModel();
        for (int i = 0; i < dcm3.getSize(); i++) {
            if (tblsp.getValueAt(row, 4).equals(ser.g(cbbdongsp.getItemAt(i)).get(2))) {
                cbbdongsp.setSelectedIndex(i);
            }
        }

        txtnambh.setText(tblsp.getValueAt(row, 5).toString());
        txtmota.setText(tblsp.getValueAt(row, 6).toString());
        txtslsp.setText(tblsp.getValueAt(row, 7).toString());
        txtgianhap.setText(tblsp.getValueAt(row, 8).toString());
        txtgiaban.setText(tblsp.getValueAt(row, 9).toString());
    }//GEN-LAST:event_tblspMouseClicked

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        int row = tblsp.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "chua chon hang nao");
            return;
        }
        boolean b = ser.deletesp(ser.traten("idsp",tblsp.getValueAt(row, 1).toString()));
        if(b == false){
            int a = JOptionPane.showConfirmDialog(this, "san pham nay dang nam trong 1 hoac nhieu hoa don, ban co muon xoa cac hoa don nay khong???" ,"co van de", JOptionPane.YES_NO_OPTION);
            if(a == JOptionPane.YES_OPTION){
                String masp = tblsp.getValueAt(row, 0).toString();
                String idsp = ser.traidsp1(masp).getId();
                ser.deleteall(idsp,ser.traten("idctsp",idsp));
            }else{
                return ;
            }
        }
        loadsp();
    }//GEN-LAST:event_btnxoaActionPerformed

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
            java.util.logging.Logger.getLogger(ChiTietSpView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChiTietSpView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChiTietSpView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChiTietSpView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChiTietSpView().setVisible(true);
            }
        });
    }

    private static String rdn() {
        StringBuilder sb = new StringBuilder();
        String b = "0123456789" + "abcdefghijklmnopqrstuvxyz";
        for (int i = 0; i < 10; i++) {
            int index = (int) (b.length() * Math.random());
            sb.append(b.charAt(index));
        }
        return sb.toString();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnxoa;
    private javax.swing.JComboBox<String> cbbdongsp;
    private javax.swing.JComboBox<String> cbbmau;
    private javax.swing.JComboBox<String> cbbnsx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblsp;
    private javax.swing.JTextField txtgiaban;
    private javax.swing.JTextField txtgianhap;
    private javax.swing.JTextField txtmasp;
    private javax.swing.JTextField txtmota;
    private javax.swing.JTextField txtnambh;
    private javax.swing.JTextField txtslsp;
    private javax.swing.JTextField txttensp;
    // End of variables declaration//GEN-END:variables
}
