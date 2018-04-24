/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.asirisupermarketsystem.panel;

import java.awt.Dialog;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import lk.ijse.asirisupermarket.controller.ManageSupplierController;
import lk.ijse.asirisupermarket.core.dto.SupplierDTO;
import lk.ijse.asirisupermarket.dao.db.DBConnection;
import lk.ijse.asirisupermarket.idgenerater.IdGenerater;
import lk.ijse.asirisupermarket.util.Validation;
//import lk.ijse.jasper.IJSEJasperViewer;
//import lk.ijse.jasper.JasperUtil;
//import lk.ijse.jasper.Report;
//import net.sf.jasperreports.engine.JRException;
//import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.JasperPrint;
//import net.sf.jasperreports.engine.JasperPrintManager;
//import net.sf.jasperreports.engine.JasperReport;
//import net.sf.jasperreports.engine.JasperReportsContext;

/**
 *
 * @author Hafees
 */
//@Report("lk.ijse.asirisupermarket.report")
public class ManageSupplier extends javax.swing.JPanel {

    /**
     * Creates new form AddUser
     */
    public ManageSupplier() {
        initComponents();
         loadAllSuppliers();
         setId();
        
        tblSuppliers.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                
                if (tblSuppliers.getSelectedRow() == -1) return;
                
               String customerId= tblSuppliers.getValueAt(tblSuppliers.getSelectedRow(), 0).toString();
                String customerfName= tblSuppliers.getValueAt(tblSuppliers.getSelectedRow(), 1).toString();
                String customerLName= tblSuppliers.getValueAt(tblSuppliers.getSelectedRow(), 2).toString();
                String customerGender= tblSuppliers.getValueAt(tblSuppliers.getSelectedRow(), 3).toString();
                String customerAddress= tblSuppliers.getValueAt(tblSuppliers.getSelectedRow(), 4).toString();
                String customerCity= tblSuppliers.getValueAt(tblSuppliers.getSelectedRow(), 5).toString();
                String customerEmail= tblSuppliers.getValueAt(tblSuppliers.getSelectedRow(), 6).toString();
                String customerContactno= tblSuppliers.getValueAt(tblSuppliers.getSelectedRow(), 7).toString();
                
                txt_supplierId.setText(customerId);
                txtsuppliername.setText(customerfName);
                txtsupplierAddress.setText(customerLName);
                txtsupplierCity.setText(customerGender);
                txtsuppliercontact.setText(customerAddress);
                txtsupplierfax.setText(customerCity);
                txtsupplierEmail.setText(customerEmail);
                txtsupplierWebpage.setText(customerContactno);
            }
        });
    }
     public void setId() {
        try {
            String newId = IdGenerater.getNewId("supplier", "SID", "S", 2);
            txt_supplierId.setText(newId);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
     private void loadAllSuppliers() {
       try {
           
           ArrayList<SupplierDTO> allsuplliers = ManageSupplierController.supplierDAO.getAll();
            
            DefaultTableModel dtm = (DefaultTableModel) tblSuppliers.getModel();
            
            dtm.setRowCount(0);
            
            if (allsuplliers != null){
                
                for (SupplierDTO suppliers : allsuplliers) {
                    
                    Object[] rowData = {
                        suppliers.getSID(),
                        suppliers.getSupplier_Name(),
                        suppliers.getSupplier_Address(),
                        suppliers.getSupplier_City(),
                        suppliers.getPhone_No(),
                        suppliers.getFax_No(),
                        suppliers.getSupplier_Email(),
                         suppliers.getWebpage(),
                        //customer.getSalary().toString()
                    };
                    
                    dtm.addRow(rowData);
                    
                }
                
            }
            
        } catch (Exception ex) {
            Logger.getLogger(ManageSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        name_lbl = new javax.swing.JLabel();
        id_lbl = new javax.swing.JLabel();
        email_lbl = new javax.swing.JLabel();
        address_lbl = new javax.swing.JLabel();
        txt_supplierId = new javax.swing.JTextField();
        txtsupplierfax = new javax.swing.JTextField();
        txtsuppliercontact = new javax.swing.JTextField();
        txtsuppliername = new javax.swing.JTextField();
        txtsupplierEmail = new javax.swing.JTextField();
        txtsupplierAddress = new javax.swing.JTextField();
        btn_Update = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();
        btn_addsupplier = new javax.swing.JButton();
        address_lbl1 = new javax.swing.JLabel();
        txtsupplierWebpage = new javax.swing.JTextField();
        address_lbl2 = new javax.swing.JLabel();
        txtsupplierCity = new javax.swing.JTextField();
        email_lbl1 = new javax.swing.JLabel();
        email_txt2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSuppliers = new javax.swing.JTable();
        mobilphn_lbl1 = new javax.swing.JLabel();
        mobilphn_lbl2 = new javax.swing.JLabel();
        btn_Search = new javax.swing.JToggleButton();
        btn_refresh = new javax.swing.JToggleButton();
        btnreport = new javax.swing.JToggleButton();
        btnexport = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1000, 700));
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setPreferredSize(new java.awt.Dimension(1000, 700));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Supplier");

        name_lbl.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        name_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        name_lbl.setText("Name :");

        id_lbl.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        id_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        id_lbl.setText("ID :");

        email_lbl.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        email_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        email_lbl.setText("Email ID :");

        address_lbl.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        address_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        address_lbl.setText("Address :");

        txt_supplierId.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_supplierId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 3, true));

        txtsupplierfax.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtsupplierfax.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));

        txtsuppliercontact.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtsuppliercontact.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        txtsuppliercontact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsuppliercontactKeyReleased(evt);
            }
        });

        txtsuppliername.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtsuppliername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 3, true));

        txtsupplierEmail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtsupplierEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));

        txtsupplierAddress.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtsupplierAddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));

        btn_Update.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_Update.setForeground(new java.awt.Color(51, 51, 51));
        btn_Update.setText("Update");
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });

        delete_btn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        delete_btn.setForeground(new java.awt.Color(51, 51, 51));
        delete_btn.setText("Delete");
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        btn_addsupplier.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_addsupplier.setForeground(new java.awt.Color(51, 51, 51));
        btn_addsupplier.setText("Add suplier");
        btn_addsupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addsupplierActionPerformed(evt);
            }
        });

        address_lbl1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        address_lbl1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        address_lbl1.setText("City :");

        txtsupplierWebpage.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtsupplierWebpage.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));

        address_lbl2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        address_lbl2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        address_lbl2.setText("Web Page");

        txtsupplierCity.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtsupplierCity.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));

        email_lbl1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        email_lbl1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        email_lbl1.setText("Province");

        email_txt2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        email_txt2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));

        tblSuppliers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "      ID", "      Name", "Address", "city", "Mobile", "Fax", "Email", "Webpage"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSuppliers);

        mobilphn_lbl1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mobilphn_lbl1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mobilphn_lbl1.setText("Fax");

        mobilphn_lbl2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mobilphn_lbl2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mobilphn_lbl2.setText("Mobile Phone :");

        btn_Search.setText("Search");
        btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchActionPerformed(evt);
            }
        });

        btn_refresh.setText("Refresh");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });

        btnreport.setText("Report");
        btnreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreportActionPerformed(evt);
            }
        });

        btnexport.setText("Export");
        btnexport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexportActionPerformed(evt);
            }
        });

        jToggleButton1.setText("jToggleButton1");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_supplierId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(btn_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtsuppliername, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(230, 230, 230)
                                .addComponent(email_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addComponent(txtsupplierEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(address_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(address_lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtsupplierAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(txtsupplierWebpage, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(address_lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(txtsupplierCity, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(jToggleButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(mobilphn_lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtsuppliercontact, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(mobilphn_lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtsupplierfax, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(btn_addsupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(btn_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32020, 32020, 32020)
                        .addComponent(email_lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1261, 1261, 1261)
                        .addComponent(email_txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(btnreport, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(btnexport, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33859, 33859, 33859))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(id_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(name_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_supplierId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btn_Search))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(txtsuppliername, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(email_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(txtsupplierEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(address_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(address_lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtsupplierAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtsupplierWebpage, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(address_lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsupplierCity, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton1))))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mobilphn_lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(txtsuppliercontact, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(mobilphn_lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txtsupplierfax, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_addsupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btn_refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(email_lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email_txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnreport, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnexport, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addsupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addsupplierActionPerformed
    SupplierDTO supplier = new SupplierDTO(txt_supplierId.getText(),
                txtsuppliername.getText(),
                txtsupplierAddress.getText(),
                txtsupplierCity	.getText(),			
                txtsuppliercontact.getText(),			
                txtsupplierfax	.getText(),			
                txtsupplierEmail.getText(),			
                txtsupplierWebpage.getText());
         
            try {
                
            boolean result = ManageSupplierController.supplierDAO.add(supplier);
                   
            if (result){
                JOptionPane.showMessageDialog(this, "Supplier has been successfully added.");
                loadAllSuppliers(); 
                 clearAllTextFileds();
                  setId();
            }else{
                JOptionPane.showMessageDialog(this, "Supplier hasn't been added ");
            }
            
        } catch (Exception ex) {
            Logger.getLogger(ManageSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_addsupplierActionPerformed
     private void clearAllTextFileds(){
       
                txt_supplierId . setText(""); 			
                txtsuppliername.setText("");  			
                txtsupplierAddress.setText("");			
                txtsupplierCity	.setText("");			
                txtsuppliercontact.setText("");			
                txtsupplierfax.setText("");				
                txtsupplierEmail.setText("");			
                txtsupplierWebpage.setText("");
    }
    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
                                                
        SupplierDTO supplier = new SupplierDTO(txt_supplierId.getText(),
                txtsuppliername .getText(),  			
                txtsupplierAddress.getText(), 			
                txtsupplierCity	.getText(), 			
                txtsuppliercontact.getText(), 			
                txtsupplierfax.getText(), 				
                txtsupplierEmail.getText(), 			
                txtsupplierWebpage.getText());
        try {
           
            boolean result = ManageSupplierController.supplierDAO.delete(supplier);
            if (result){
                JOptionPane.showMessageDialog(this, "Supplier has been successfully deleted.");
                loadAllSuppliers(); 
                 clearAllTextFileds();
            }else{
                JOptionPane.showMessageDialog(this, "Supplier hasn't been deleted ");
            }
            
        } catch (Exception ex) {
            Logger.getLogger(ManageSupplier.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
                    
    }//GEN-LAST:event_delete_btnActionPerformed

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
         SupplierDTO supplier = new SupplierDTO(txt_supplierId.getText(),
                txtsuppliername .getText(),  			
                txtsupplierAddress.getText(), 			
                txtsupplierCity	.getText(), 			
                txtsuppliercontact.getText(), 			
                txtsupplierfax.getText(), 				
                txtsupplierEmail.getText(), 			
                txtsupplierWebpage.getText());
        //String supplier_Gender = (String) genderComboBox.getSelectedItem();
        try {

            boolean result = ManageSupplierController.supplierDAO.update(supplier);
                //updateSupplier(supplier);
            if (result) {
                JOptionPane.showMessageDialog(this, "Supplier has been successfully updated");
               // btn_refreshActionPerformed(evt);
               loadAllSuppliers(); 
                clearAllTextFileds();
            } else {
                JOptionPane.showMessageDialog(this, "Supplier hasn't been updated");
            }

        } catch (Exception ex) {
            Logger.getLogger(ManageSupplierController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchActionPerformed
       String SID = txt_supplierId.getText();
        try {
            searchSupplier(SID);
            
        } catch (Exception ex) {
            Logger.getLogger(ManageSupplier.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btn_SearchActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
         clearAllTextFileds();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void btnexportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexportActionPerformed
//        JasperUtil.init(ManageSupplier.class);
//        
//        JasperReportsContext ctx = JasperUtil.getReportContext();
//        
//        try {
//            JasperReport compiledReport = JasperUtil.
//                    getCompiledReport("supp.jasper");
//            
//            JasperFillManager fillManager = JasperFillManager.getInstance(ctx);
//            
//            HashMap<String, Object> reportParams = new HashMap<>();
//            
//            TableModel model = tblSuppliers.getModel();
//             Connection connection = DBConnection.getInstance().getConnection();
//            
//            JasperPrint filledReport = fillManager.
//                    fill(compiledReport, reportParams,connection );
//            
//            IJSEJasperViewer frmJasperViewer = new IJSEJasperViewer(filledReport);
//            frmJasperViewer.setTitle("Supplier Details Report");
//            frmJasperViewer.setModalExclusionType(Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
//            frmJasperViewer.setVisible(true);
//            
//        } catch (JRException ex) {
//            Logger.getLogger(ManageSupplier.class.getName()).log(Level.SEVERE, null, ex);
//        }        
//                                           

    
    }//GEN-LAST:event_btnexportActionPerformed

    private void btnreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreportActionPerformed
//        JasperUtil.init(ManageSupplier.class);
//
//        JasperReportsContext ctx = JasperUtil.getReportContext();
//
//        try {
//            JasperReport compiledReport = JasperUtil.
//                    getCompiledReport("supp.jasper");
//
//            JasperFillManager fillManager = JasperFillManager.getInstance(ctx);
//
//            HashMap<String, Object> reportParams = new HashMap<>();
//
//            TableModel model = tblSuppliers.getModel();
//             Connection connection = DBConnection.getInstance().getConnection();
//
//            JasperPrint filledReport = fillManager.
//                    fill(compiledReport, reportParams,connection );
//
//        
//            JasperPrintManager.printReport(filledReport, true);
//        } catch (JRException ex) {
//            Logger.getLogger(ManageSupplier.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_btnreportActionPerformed

    private void txtsuppliercontactKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsuppliercontactKeyReleased
       Validation.phoneNumber(txtsuppliercontact);
    }//GEN-LAST:event_txtsuppliercontactKeyReleased

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
     
       
    }//GEN-LAST:event_jToggleButton1ActionPerformed
    public void searchSupplier(String CID) throws Exception {
       SupplierDTO supplierdto = ManageSupplierController.supplierDAO.search(CID);
       
       //SupplierDTO supplierdto=ManageSupplierController.searchSupplier(supplierdto);
        if (supplierdto != null) {
            //txtSupplierFname.setText(supplierdto.getSupplier_FirstName());
            txtsuppliername.setText(supplierdto.getSupplier_Name());
        
        txtsupplierAddress.setText(supplierdto.getSupplier_Address());
        txtsupplierCity.setText(supplierdto.getSupplier_City());
        //genderComboBox.setSelectedItem(supplierdto.getSupplier_Gender());
        txtsuppliercontact.setText(supplierdto.getPhone_No());
        txtsupplierfax.setText(supplierdto.getFax_No());
        txtsupplierEmail.setText(supplierdto.getSupplier_Email());
        txtsupplierWebpage.setText(supplierdto.getWebpage());
        }
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address_lbl;
    private javax.swing.JLabel address_lbl1;
    private javax.swing.JLabel address_lbl2;
    private javax.swing.JToggleButton btn_Search;
    private javax.swing.JButton btn_Update;
    private javax.swing.JButton btn_addsupplier;
    private javax.swing.JToggleButton btn_refresh;
    private javax.swing.JToggleButton btnexport;
    private javax.swing.JToggleButton btnreport;
    private javax.swing.JButton delete_btn;
    private javax.swing.JLabel email_lbl;
    private javax.swing.JLabel email_lbl1;
    private javax.swing.JTextField email_txt2;
    private javax.swing.JLabel id_lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel mobilphn_lbl1;
    private javax.swing.JLabel mobilphn_lbl2;
    private javax.swing.JLabel name_lbl;
    private javax.swing.JTable tblSuppliers;
    private javax.swing.JTextField txt_supplierId;
    private javax.swing.JTextField txtsupplierAddress;
    private javax.swing.JTextField txtsupplierCity;
    private javax.swing.JTextField txtsupplierEmail;
    private javax.swing.JTextField txtsupplierWebpage;
    private javax.swing.JTextField txtsuppliercontact;
    private javax.swing.JTextField txtsupplierfax;
    private javax.swing.JTextField txtsuppliername;
    // End of variables declaration//GEN-END:variables
}
