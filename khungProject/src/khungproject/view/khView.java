package khungproject.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import khungproject.DomainModels.KhachHangModelx;
import khungproject.Repository.KhachHangRepo;
import khungproject.ViewModel.KhachHangViewModel;

public class khView extends javax.swing.JFrame {

    KhachHangRepo repo = new KhachHangRepo();
    public khView() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtten = new javax.swing.JTextField();
        txtma = new javax.swing.JTextField();
        txtdiachi = new javax.swing.JTextField();
        txttendem = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblkh = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        txtho = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        lblma = new javax.swing.JLabel();
        lbldiachi = new javax.swing.JLabel();
        lblten = new javax.swing.JLabel();
        lbltendem = new javax.swing.JLabel();
        lblho = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtma.setEditable(false);

        jButton1.setText("delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tblkh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ma", "full name", "diachi"
            }
        ));
        tblkh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblkhMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblkh);

        jButton2.setText("add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("show");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        lblma.setText("ma");

        lbldiachi.setText("diachi");

        lblten.setText("ten");

        lbltendem.setText("tendem");

        lblho.setText("ho");

        jButton4.setText("search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jButton2)
                        .addGap(47, 47, 47)
                        .addComponent(jButton1)
                        .addGap(58, 58, 58)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblho)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblma)
                                    .addComponent(lbldiachi))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbltendem))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblten)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton4)))))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtho, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttendem, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtten, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblten))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttendem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltendem))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblho)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblma))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbldiachi))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        KhachHangModelx khmd = new KhachHangModelx();
        if(txtten.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "chua nhap ten");
            return ;
        }
        if(txttendem.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "chua nhap tendem");
            return ;
        }
        if(txtho.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "chua nhap ho");
            return ;
        }
        if(txtdiachi.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "chua nhap diachi");
            return ;
        }
        khmd.setMa(rdn());
        khmd.setTen(txtten.getText());
        khmd.setTendem(txttendem.getText());
        khmd.setHo(txtho.getText());
        khmd.setDiachi(txtdiachi.getText());
        repo.insert(khmd);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int row = tblkh.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(this, "chua chon hang  nao");
            return ;
        }
        KhachHangModelx khmd = new KhachHangModelx();
        khmd.setMa(txtma.getText());
        repo.delete(khmd);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblkhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblkhMouseClicked
        int row = tblkh.getSelectedRow();
        txtma.setText(tblkh.getValueAt(row, 0).toString());
        
        ArrayList<String> list = tach(tblkh.getValueAt(row, 1).toString());
        txtten.setText(list.get(2));
        txttendem.setText(list.get(1));
        txtho.setText(list.get(0));
        txtdiachi.setText(tblkh.getValueAt(row, 2).toString());
    }//GEN-LAST:event_tblkhMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        loadkh();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        ArrayList<KhachHangViewModel> list = new ArrayList<>();
        DefaultTableModel dtm = (DefaultTableModel) tblkh.getModel();
        for(int i = 0; i< dtm.getRowCount();i++){
            KhachHangViewModel khvm = new KhachHangViewModel();
            khvm.setMa(tblkh.getValueAt(i, 0).toString());
            ArrayList<String> x = tach(tblkh.getValueAt(i, 1).toString());
            khvm.setHo(x.get(0));
            khvm.setTendem(x.get(1));
            khvm.setTen(x.get(2));
            khvm.setDiachi(tblkh.getValueAt(i, 2).toString());
            list.add(khvm);
        }
        
        String diachi = txtsearch.getText();
        if(diachi.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(this, "chua nhap du lieu");
            return ;
        }
        
        ArrayList<KhachHangViewModel> list_final = new ArrayList<>();
        for (KhachHangViewModel k : list) {
            if(k.getDiachi().equals(diachi)){
                list_final.add(k);
            }
        }
        dtm.setRowCount(0);
        int count = list_final.size();
        if(count == 0){
            loadkh();
        }
        
        for (KhachHangViewModel k : list_final) {
            Object[] rowData = {
                k.getMa(),
                k.getHo() + " " + k.getTendem() + " " + k.getTen(),
                k.getDiachi()
            };
            dtm.addRow(rowData);
        }
        JOptionPane.showMessageDialog(this, "tim thay " + count + "kh");
    }//GEN-LAST:event_jButton4ActionPerformed
    
    public ArrayList<String> tach(String fullname){
        ArrayList<String> list = new ArrayList<>();
        int length = fullname.length();
        int a = 0,b = 0;
        String ho = "";
        String tendem = "";
        String ten = "";
        for(int i = 0;i < length;i++){
            if(fullname.substring(i, i+1).equals(" ")){
                ho = fullname.substring(0,i);
                a = i + 1;
                break;
            }
        }
        for(int i = length;i > 0;i--){
            if(fullname.substring(i-1, i).equals(" ")){
                ten = fullname.substring(i,length);
                b = i-1;
                break;
            }
        }
        tendem = fullname.substring(a,b);
        list.add(ho);
        list.add(tendem);
        list.add(ten);
        return list;
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
            java.util.logging.Logger.getLogger(khView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(khView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(khView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(khView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new khView().setVisible(true);
            }
        });
    }
    public void loadkh(){
        ArrayList<KhachHangViewModel> khvm = repo.getlistkh();
        DefaultTableModel dtm = (DefaultTableModel) tblkh.getModel();
        dtm.setRowCount(0);
        for (KhachHangViewModel k : khvm) {
            Object[] rowData = {
                k.getMa(),
                k.getHo() + " " + k.getTendem() + " " + k.getTen(),
                k.getDiachi()
            };
            dtm.addRow(rowData);
        }
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbldiachi;
    private javax.swing.JLabel lblho;
    private javax.swing.JLabel lblma;
    private javax.swing.JLabel lblten;
    private javax.swing.JLabel lbltendem;
    private javax.swing.JTable tblkh;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txtho;
    private javax.swing.JTextField txtma;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtten;
    private javax.swing.JTextField txttendem;
    // End of variables declaration//GEN-END:variables
}
