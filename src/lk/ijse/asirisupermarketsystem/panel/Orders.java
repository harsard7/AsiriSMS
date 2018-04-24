/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.asirisupermarketsystem.panel;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.asirisupermarket.controller.ManageOrdersController;
import lk.ijse.asirisupermarket.core.dto.OrdersDTO;
import lk.ijse.asirisupermarket.idgenerater.IdGenerater;

/**
 *
 * @author Hafees
 */
public class Orders extends javax.swing.JPanel {

    /**
     * Creates new form ManageInvoice
     */
    public Orders() {
        initComponents();
        setInvId();
        loadallOrderIds();
        loadSystemDate();
       
    }
     public void setInvId() {
        try {
            String newId = IdGenerater.getNewId("Payment", "PID", "INV", 3);
            invoiceid_txt.setText(newId);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtorderdate = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtempid = new javax.swing.JTextField();
        txtcusid = new javax.swing.JTextField();
        combo_Oid = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        btnnext = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        invoiceid_txt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtinvdate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblallorders = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        totalitem_txt = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        discount_txt = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        totalamount_txt = new javax.swing.JTextField();
        addnew_btn = new javax.swing.JToggleButton();
        save_btn = new javax.swing.JToggleButton();
        print_btn = new javax.swing.JToggleButton();
        remove_btn = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1097, 629));
        setMinimumSize(new java.awt.Dimension(1097, 629));

        panel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Product detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 204))); // NOI18N

        txtorderdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtorderdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2));
        txtorderdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtorderdateActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("Date");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setText("Employee ID");

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel15.setText("Customer Id");

        txtempid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtempid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2));
        txtempid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtempidActionPerformed(evt);
            }
        });

        combo_Oid.setEditable(true);
        combo_Oid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_OidItemStateChanged(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel17.setText("OrderId");

        btnnext.setText("Next");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel18))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtempid, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcusid, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_Oid, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtorderdate, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnnext, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combo_Oid, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcusid, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtempid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtorderdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnext, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customer detail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 255))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("Invoice no");

        invoiceid_txt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        invoiceid_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2));
        invoiceid_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceid_txtActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setText("New Customer");

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel11.setText("Search Customer");

        jLabel22.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Date");

        txtinvdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtinvdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 2));
        txtinvdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtinvdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addGap(35, 35, 35)
                        .addComponent(invoiceid_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel22)
                        .addGap(29, 29, 29)
                        .addComponent(txtinvdate)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invoiceid_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtinvdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        tblallorders.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        tblallorders.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tblallorders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "       OrderId", "      CustomerId", "      Employee ID", "       Order Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblallorders.setGridColor(new java.awt.Color(255, 255, 255));
        tblallorders.setOpaque(false);
        tblallorders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblallordersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblallorders);

        jLabel19.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Total Items");

        totalitem_txt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        totalitem_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 2));
        totalitem_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalitem_txtActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Discount");

        discount_txt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        discount_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 2));
        discount_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discount_txtActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Total Amount");

        totalamount_txt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        totalamount_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 2));
        totalamount_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalamount_txtActionPerformed(evt);
            }
        });

        addnew_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addnew_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/asirisupermarket/images/add2-64.png"))); // NOI18N
        addnew_btn.setText("Add ");

        save_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        save_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/asirisupermarket/images/Save-icon.png"))); // NOI18N
        save_btn.setText("Save");
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });

        print_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        print_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/asirisupermarket/images/Printer-icon.png"))); // NOI18N
        print_btn.setText("Print Invoice");

        remove_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        remove_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/asirisupermarket/images/Cancel_48px_1.png"))); // NOI18N
        remove_btn.setText("Remove");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/asirisupermarket/images/10logos.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 204));
        jLabel13.setText("Payment");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(325, 325, 325)
                                .addComponent(jLabel19)
                                .addGap(27, 27, 27)
                                .addComponent(totalitem_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(355, 355, 355)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(discount_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(315, 315, 315)
                                .addComponent(jLabel21)
                                .addGap(18, 18, 18)
                                .addComponent(totalamount_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addComponent(addnew_btn)
                                .addGap(18, 18, 18)
                                .addComponent(remove_btn)
                                .addGap(18, 18, 18)
                                .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(print_btn))))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(524, 524, 524)
                        .addComponent(jLabel5))))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(13, 13, 13)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(totalitem_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(discount_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(totalamount_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addnew_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(remove_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(print_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void invoiceid_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceid_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invoiceid_txtActionPerformed

    private void txtempidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtempidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtempidActionPerformed

    private void totalitem_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalitem_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalitem_txtActionPerformed

    private void discount_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discount_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discount_txtActionPerformed

    private void totalamount_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalamount_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalamount_txtActionPerformed

    private void save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_save_btnActionPerformed

    private void combo_OidItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_OidItemStateChanged
        try {
            if(combo_Oid.getSelectedIndex()==-1){
                return;
            }
            OrdersDTO order = ManageOrdersController.ordersDAO.search(new OrdersDTO(combo_Oid.getSelectedItem().toString(), null, null, null));
            if (order == null) {
                return;
            }

            txtcusid.setText(order.getCID());
            txtempid.setText(order.getEID());
            txtorderdate.setText(order.getOrder_Date());
        } catch (Exception ex) {
            Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }//GEN-LAST:event_combo_OidItemStateChanged

    private void txtorderdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtorderdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtorderdateActionPerformed

    private void txtinvdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtinvdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtinvdateActionPerformed

    private void tblallordersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblallordersMouseClicked
       
        if (tblallorders.getSelectedRow()==-1)return;
        
        String oid=tblallorders.getValueAt(tblallorders.getSelectedRow(), 0).toString();
        String cid=tblallorders.getValueAt(tblallorders.getSelectedRow(), 1).toString();
        String eid=tblallorders.getValueAt(tblallorders.getSelectedRow(), 2).toString();
        String date=tblallorders.getValueAt(tblallorders.getSelectedRow(),3).toString();
        
        combo_Oid.setSelectedItem(oid);
        txtcusid.setText(cid);
        txtempid.setText(eid);
        txtorderdate.setText(date);
    }//GEN-LAST:event_tblallordersMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton addnew_btn;
    private javax.swing.JButton btnnext;
    private javax.swing.JComboBox<String> combo_Oid;
    private javax.swing.JTextField discount_txt;
    private javax.swing.JTextField invoiceid_txt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel1;
    private javax.swing.JToggleButton print_btn;
    private javax.swing.JToggleButton remove_btn;
    private javax.swing.JToggleButton save_btn;
    private javax.swing.JTable tblallorders;
    private javax.swing.JTextField totalamount_txt;
    private javax.swing.JTextField totalitem_txt;
    private javax.swing.JTextField txtcusid;
    private javax.swing.JTextField txtempid;
    private javax.swing.JTextField txtinvdate;
    private javax.swing.JTextField txtorderdate;
    // End of variables declaration//GEN-END:variables

    private void loadallOrderIds() {
       try {
            ArrayList<OrdersDTO> allorderid = ManageOrdersController.ordersDAO.getAll();
           DefaultTableModel dtm=(DefaultTableModel) tblallorders.getModel();
            combo_Oid.removeAllItems();
            if (allorderid == null) {
                return;
            }

            for (OrdersDTO order : allorderid) {
                combo_Oid.addItem(order.getOID());
            }
            dtm.setRowCount(0);
            if (allorderid !=null){
            for(OrdersDTO order :allorderid){
            Object[] rowData={
            order.getOID(),
            order.getCID(),
            order.getEID(),
            order.getOrder_Date()
                
            };
            dtm.addRow(rowData);
         }
            }
        } catch (Exception ex) {
            Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     private void loadSystemDate() {
        Date d1 = new Date(); //Current System date
        SimpleDateFormat df = new SimpleDateFormat("YYYY-MM-dd");
        String formatDate = df.format(d1);
        txtinvdate.setText(formatDate);

    }

   
    
      
}