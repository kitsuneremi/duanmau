package khungproject.view;


import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import khungproject.Modelx.ChiTietSPModel;
import khungproject.Modelx.SanPhamModel;
import khungproject.Repo.ChiTietSPRepo;

public class ChiTietSpView extends javax.swing.JFrame {

    private ChiTietSPRepo repo = new ChiTietSPRepo();

    public ChiTietSpView() {
        initComponents();
        loadsp();
        loadcbbdongsp();
        loadcbbmausac();
        loadcbbnsx();
    }

    public void loadsp(){
        ArrayList<ChiTietSPModel> list = repo.getlistsp();
        DefaultTableModel dtm = (DefaultTableModel) tblsp.getModel();
        dtm.setRowCount(0);
        for (ChiTietSPModel x : list) {
            Object[] rowData = {
                x.getSpm().getMa(),
                x.getSpm().getTen(),
                repo.tratennsx(x.getIdnsx()),
                repo.tratenmau(x.getIdmausac()),
                repo.tratendongsp(x.getIddongsp()),
                x.getNambh(),
                x.getMota(),
                x.getSoluongsp(),
                x.getGianhap(),
                x.getGiaban()
            };
            dtm.addRow(rowData);
        }
    }
    
    public ChiTietSPModel x(){
        try{
            ChiTietSPModel spm = new ChiTietSPModel();
            SanPhamModel s = new SanPhamModel();
            s.setMa(txtmasp.getText());
            s.setTen(txttensp.getText());
            spm.setSpm(s);
            spm.setIdnsx(repo.traidnsx(cbbnsx.getSelectedItem().toString()));
            spm.setIdmausac(repo.traidmau(cbbmau.getSelectedItem().toString()));
            spm.setIddongsp(repo.traiddongsp(cbbdongsp.getSelectedItem().toString()));
            spm.setNambh(Integer.parseInt(txtnambh.getText()));
            spm.setMota(txtmota.getText());
            spm.setSoluongsp(Integer.parseInt(txtslsp.getText()));
            spm.setGianhap(Float.parseFloat(txtgianhap.getText()));
            spm.setGiaban(Float.parseFloat(txtgiaban.getText()));
            return spm;
        }catch(Exception ex){
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

        txtnambh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnambhActionPerformed(evt);
            }
        });

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

        jLabel6.setText("slsp");

        jLabel7.setText("giá nhập");

        jLabel8.setText("giá bán");

        tblsp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "mã sp", "ten sp", "teen nsx ", "mau", "dong sp ", "nam bh", "mota", "slsp", "gianhap", "giaban"
            }
        ));
        tblsp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblspMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblsp);

        jLabel4.setText("mã sp");

        jLabel9.setText("nsx");

        jLabel10.setText("dòng sp");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttensp, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(txtmasp))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbbnsx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbbmau, 0, 124, Short.MAX_VALUE)
                            .addComponent(cbbdongsp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtmota, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtslsp, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtgianhap, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnambh, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnxoa)
                            .addComponent(btnthem)
                            .addComponent(btnsua)))
                    .addComponent(txtgiaban, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(btnthem))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtnambh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(23, 23, 23)
                        .addComponent(btnsua))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtmasp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttensp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbbnsx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtslsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnxoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbmau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtgianhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtgiaban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbbdongsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnambhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnambhActionPerformed

    }//GEN-LAST:event_txtnambhActionPerformed

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        ChiTietSPModel spm = x();
        repo.themsp(spm);
        loadsp();
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        ChiTietSPModel spm = x();
        int row = tblsp.getSelectedRow();
        if(row == -1){
            return ;
        }
        repo.updatesp(spm,repo.traidsp(tblsp.getValueAt(row, 1).toString()));
        loadsp();
    }//GEN-LAST:event_btnsuaActionPerformed

    public ChiTietSPModel y(){
        int row = tblsp.getSelectedRow();
        ChiTietSPModel spm = new ChiTietSPModel();
        SanPhamModel s = new SanPhamModel();
        
        s.setId(repo.traidsp(tblsp.getValueAt(row, 1).toString()));
        s.setMa(tblsp.getValueAt(row, 0).toString());
        s.setTen(tblsp.getValueAt(row, 1).toString());
        
        spm.setSpm(s);
        spm.setIdnsx(repo.traidnsx(tblsp.getValueAt(row, 2).toString()));
        spm.setIdmausac(repo.traidnsx(tblsp.getValueAt(row, 3).toString()));
        spm.setIddongsp(repo.traidnsx(tblsp.getValueAt(row, 4).toString()));
        spm.setNambh(Integer.parseInt(tblsp.getValueAt(row, 5).toString()));
        spm.setMota(tblsp.getValueAt(row, 6).toString());
        spm.setSoluongsp(Integer.parseInt(tblsp.getValueAt(row, 7).toString()));
        spm.setGianhap(Float.parseFloat(tblsp.getValueAt(row, 8).toString()));
        spm.setGiaban(Float.parseFloat(tblsp.getValueAt(row, 9).toString()));
        return spm;
    }
    
    private void tblspMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblspMouseClicked
        int row = tblsp.getSelectedRow();
        txttensp.setText(tblsp.getValueAt(row, 1).toString());
        txtmasp.setText(tblsp.getValueAt(row, 0).toString());
        cbbnsx.setSelectedItem(tblsp.getValueAt(row, 2).toString());
        cbbmau.setSelectedItem(tblsp.getValueAt(row, 3).toString());
        cbbdongsp.setSelectedItem(tblsp.getValueAt(row, 4).toString());
        txtnambh.setText(tblsp.getValueAt(row, 5).toString());
        txtmota.setText(tblsp.getValueAt(row, 6).toString());
        txtslsp.setText(tblsp.getValueAt(row, 7).toString());
        txtgianhap.setText(tblsp.getValueAt(row, 8).toString());
        txtgiaban.setText(tblsp.getValueAt(row, 9).toString());
    }//GEN-LAST:event_tblspMouseClicked

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        int row = tblsp.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(this, "chua chon hang nao");
            return ;
        }
        repo.deletesp(repo.traidsp(tblsp.getValueAt(row, 1).toString()));
        loadsp();
    }//GEN-LAST:event_btnxoaActionPerformed

    void loadcbbnsx(){
        ArrayList<String> list = repo.getcbbnsx();
        DefaultComboBoxModel dcm = (DefaultComboBoxModel) cbbnsx.getModel();
        dcm.removeAllElements();
        for (String s : list) {
            dcm.addElement(s);
        }
    }
    
    void loadcbbmausac(){
        ArrayList<String> list = repo.getcbbmau();
        DefaultComboBoxModel dcm = (DefaultComboBoxModel) cbbmau.getModel();
        dcm.removeAllElements();
        for (String s : list) {
            dcm.addElement(s);
        }
    }
    
    void loadcbbdongsp(){
        ArrayList<String> list = repo.getcbbdongsp();
        DefaultComboBoxModel dcm = (DefaultComboBoxModel) cbbdongsp.getModel();
        dcm.removeAllElements();
        for (String s : list) {
            dcm.addElement(s);
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
