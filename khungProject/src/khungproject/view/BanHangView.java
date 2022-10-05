package khungproject.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import khungproject.Repo.Repo;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import khungproject.Modelx.GioHangChiTietModel;
import khungproject.Modelx.HoaDonChiTietModel;
import khungproject.Modelx.ChiTietSPModel;
import khungproject.Modelx.GioHangModel;
import khungproject.Modelx.SanPhamModel;

public class BanHangView extends javax.swing.JFrame {

    private Repo repo = new Repo();

    public BanHangView() {
        initComponents();
        loadsp();
        DefaultTableModel dtm = (DefaultTableModel) tblgiohang.getModel();
        dtm.setRowCount(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btntaohoadon = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblgiohang = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbltinhtrang = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtmahoadon = new javax.swing.JTextField();
        txtngaytao = new javax.swing.JTextField();
        txttennv = new javax.swing.JTextField();
        txttongtien = new javax.swing.JTextField();
        txttienkhachdua = new javax.swing.JTextField();
        txttienthua = new javax.swing.JTextField();
        btnthanhtoan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblsanpham = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtnice = new javax.swing.JTextField();
        btnthem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btntaohoadon.setText("tạo hóa đơn");
        btntaohoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntaohoadonActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblgiohang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "stt", "mã sp", "tên sp", "số lượng", "đơn giá", "thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblgiohang);

        jLabel7.setText("gio hang");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        tbltinhtrang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "stt", "mã hóa đơn", "ngày tạo", "tên nv", "tình trạng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbltinhtrang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbltinhtrangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbltinhtrang);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtmahoadon.setEditable(false);

        txtngaytao.setEditable(false);

        txttongtien.setEditable(false);
        txttongtien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttongtienActionPerformed(evt);
            }
        });

        txttienkhachdua.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txttienkhachduaFocusLost(evt);
            }
        });

        txttienthua.setEditable(false);

        btnthanhtoan.setText("thanh toán");
        btnthanhtoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthanhtoanActionPerformed(evt);
            }
        });

        jLabel1.setText("mã hóa đơn");

        jLabel2.setText("ngày tạo");

        jLabel3.setText("tên nv");

        jLabel4.setText("tổng tiền");

        jLabel5.setText("tiền khách đưa");

        jLabel6.setText("tiền thừa");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtmahoadon, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(txtngaytao)
                            .addComponent(txttennv)
                            .addComponent(txttongtien)
                            .addComponent(txttienkhachdua)
                            .addComponent(txttienthua)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnthanhtoan)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmahoadon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtngaytao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttennv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttongtien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttienkhachdua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttienthua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(btnthanhtoan)
                .addGap(30, 30, 30))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tblsanpham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "stt", "mã sp", "tên sp", "năm bh", "mô tả", "sl sp", "giá nhập", "giá bán"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblsanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblsanphamMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblsanpham);

        jLabel8.setText("san pham");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 971, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtnice, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(438, 438, 438))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtnice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        btnthem.setText(" them vao gio hang");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btntaohoadon)
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnthem, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btntaohoadon))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnthem)
                                .addGap(15, 15, 15)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txttongtienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttongtienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttongtienActionPerformed

    private void btntaohoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntaohoadonActionPerformed

        DefaultTableModel dtma = (DefaultTableModel) tblgiohang.getModel();
        int y = dtma.getRowCount();
        if (y == 0) {
            JOptionPane.showMessageDialog(this, "gio hang cua ban con moi cai nit");
            return;
        }
        int tongtien = 0;
        for (int i = 0; i < y; i++) {
            tongtien += Integer.parseInt(tblgiohang.getValueAt(i, 5).toString());
        }
        GioHangChiTietModel gdm = new GioHangChiTietModel();

        Calendar cld = Calendar.getInstance();
        int day = cld.get(Calendar.DAY_OF_MONTH);
        int month = cld.get(Calendar.MONTH);
        int year = cld.get(Calendar.YEAR);

        int hour = cld.get(Calendar.HOUR_OF_DAY);
        int minute = cld.get(Calendar.MINUTE);
        int second = cld.get(Calendar.SECOND);
        String date = (hour + ":" + minute + ":" + second + "-" + day + "/" + month + "/" + year);

        //gen mã hóa đơn
        String mahd = rdn();

        DefaultTableModel dtmb = (DefaultTableModel) tbltinhtrang.getModel();

        Object[] rowData = {
            dtmb.getRowCount() + 1,
            mahd,
            date,
            txttennv.getText(),
            "chờ thanh toán"
        };
        dtmb.addRow(rowData);

        HoaDonChiTietModel hdm = new HoaDonChiTietModel();

        DefaultTableModel dtm = (DefaultTableModel) tblgiohang.getModel();
        dtm.setRowCount(0);
    }//GEN-LAST:event_btntaohoadonActionPerformed

    private void btnthanhtoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthanhtoanActionPerformed


    }//GEN-LAST:event_btnthanhtoanActionPerformed

//    private void loadhoadon() {
//        DefaultTableModel dtm = (DefaultTableModel) tbltinhtrang.getModel();
//        dtm.setRowCount(0);
//        ArrayList<HoaDonChiTietModel> list = repo.dochoadon();
//        for (HoaDonChiTietModel x : list) {
//            Object[] rowData = {
//                dtm.getRowCount() + 1,
//
//            };
//            dtm.addRow(rowData);
//        }
//    }

    private String status(int i) {
        return switch (i) {
            case 0 -> "chờ thanh toán";
            case 1 -> "đã thanh toán";
            default -> "đã hủy";
        };
    }

    private void tblsanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsanphamMouseClicked

    }//GEN-LAST:event_tblsanphamMouseClicked

    private void tbltinhtrangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbltinhtrangMouseClicked

    }//GEN-LAST:event_tbltinhtrangMouseClicked

    private void txttienkhachduaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txttienkhachduaFocusLost
        if (txttienkhachdua.getText().length() > 15) {
            JOptionPane.showMessageDialog(this, "nhieu tien the???");
            return;
        } else if (Integer.parseInt(txttienkhachdua.getText()) > Integer.parseInt(txttongtien.getText())) {
            txttienthua.setText(String.valueOf(Integer.parseInt(txttienkhachdua.getText()) - Integer.parseInt(txttongtien.getText())));
        }
    }//GEN-LAST:event_txttienkhachduaFocusLost

    @SuppressWarnings("CallToPrintStackTrace")
    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        int row = tblsanpham.getSelectedRow();
        int col = tblsanpham.getSelectedColumn();
        if (row == -1) {
            return;
        }
        txtnice.setText(tblsanpham.getValueAt(row, col).toString());
        if (tblgiohang.getRowCount() != 0) {
                for (int i = 0; i < tblgiohang.getRowCount(); i++) {
                if (tblsanpham.getValueAt(row, 1).equals(tblgiohang.getValueAt(i, 1))) {
                    tblgiohang.setValueAt((Integer.parseInt(tblgiohang.getValueAt(i, 3).toString()) + 1), i, 3);
                    tblgiohang.setValueAt((Integer.parseInt(tblgiohang.getValueAt(i, 3).toString()) * Float.parseFloat(tblgiohang.getValueAt(i, 4).toString())), i, 5);
                    return;
                } else {
                }
            }
        }
        GioHangChiTietModel gio = new GioHangChiTietModel();
        ChiTietSPModel sp = new ChiTietSPModel();
        SanPhamModel spm = new SanPhamModel();
        GioHangModel gdm = new GioHangModel();
        
        //set sanphammodel
        spm.setMa(tblsanpham.getValueAt(row, 1).toString());
        spm.setTen(tblsanpham.getValueAt(row, 2).toString());
        
        sp.setGiaban(Float.parseFloat(tblsanpham.getValueAt(row, 7).toString()));
        
        sp.setSpm(spm);
        gio.setGhm(gdm);
        gio.setSp(sp);
        
        gdm.setIdkh("");
        gdm.setIdnv("");
        gdm.setMa("");

        Calendar cld = Calendar.getInstance();
        int day = cld.get(Calendar.DAY_OF_MONTH);
        int month = cld.get(Calendar.MONTH);
        int year = cld.get(Calendar.YEAR);

        int hour = cld.get(Calendar.HOUR_OF_DAY);
        int minute = cld.get(Calendar.MINUTE);
        int second = cld.get(Calendar.SECOND);
        String date = (day + "/" + month + "/" + year);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            gdm.setNgaytao(sdf.parse(date));
        } catch (ParseException ex) {
            ex.printStackTrace();
            return;
        }

        DefaultTableModel dtm = (DefaultTableModel) tblgiohang.getModel();
        Object[] rowData = {
            dtm.getRowCount() + 1,
            gio.getSp().getSpm().getMa(),
            gio.getSp().getSpm().getTen(),
            1,
            gio.getSp().getGiaban(),
            gio.getSp().getGiaban()
        };
        dtm.addRow(rowData);
    }//GEN-LAST:event_btnthemActionPerformed

    void loadsp() {
        DefaultTableModel dtm = (DefaultTableModel) tblsanpham.getModel();
        dtm.setRowCount(0);
        ArrayList<ChiTietSPModel> list = repo.getlistsp();
        for (ChiTietSPModel x : list) {
            Object[] rowData = {
                dtm.getRowCount() + 1,
                x.getSpm().getMa(),
                x.getSpm().getTen(),
                x.getNambh(),
                x.getMota(),
                x.getSoluongsp(),
                x.getGianhap(),
                x.getGiaban()
            };
            dtm.addRow(rowData);
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
            java.util.logging.Logger.getLogger(BanHangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BanHangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BanHangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BanHangView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BanHangView().setVisible(true);
            }
        });
    }

    private String rdn() {
        StringBuilder sb = new StringBuilder();
        String b = "0123456789" + "abcdefghijklmnopqrstuvxyz";
        for (int i = 0; i < 10; i++) {
            int index = (int) (b.length() * Math.random());
            sb.append(b.charAt(index));
        }
        return sb.toString();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btntaohoadon;
    private javax.swing.JButton btnthanhtoan;
    private javax.swing.JButton btnthem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblgiohang;
    private javax.swing.JTable tblsanpham;
    private javax.swing.JTable tbltinhtrang;
    private javax.swing.JTextField txtmahoadon;
    private javax.swing.JTextField txtngaytao;
    private javax.swing.JTextField txtnice;
    private javax.swing.JTextField txttennv;
    private javax.swing.JTextField txttienkhachdua;
    private javax.swing.JTextField txttienthua;
    private javax.swing.JTextField txttongtien;
    // End of variables declaration//GEN-END:variables
}