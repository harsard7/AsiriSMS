/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.asirisupermarketsystem.panel;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import lk.ijse.asirisupermarket.controller.ManageBatchController;
import lk.ijse.asirisupermarket.controller.ManageBrandController;
import lk.ijse.asirisupermarket.controller.ManageCategoryController;
import lk.ijse.asirisupermarket.controller.ManageProductController;
import lk.ijse.asirisupermarket.core.dto.BatchDTO;
import lk.ijse.asirisupermarket.core.dto.BrandDTO;
import lk.ijse.asirisupermarket.core.dto.CategoryDTO;
import lk.ijse.asirisupermarket.core.dto.ProductDTO;
import lk.ijse.asirisupermarket.idgenerater.IdGenerater;
import net.coobird.thumbnailator.Thumbnails;

/**
 *
 * @author Hafees
 */
public class ManageProducts extends javax.swing.JPanel {

   
    
    public ManageProducts() {
        initComponents();
        loadAllProducts();
        loadCategoryid();
        loadBrandIds();
        loadBatchIds();
        clearAllTextFileds();
        setId();
        
       
    }
     public void setId() {
        try {
            String newId = IdGenerater.getNewId("product", "code", "P", 3);
            txtcode.setText(newId);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    public  void setTitle(){
    ManageProducts mangeprod=new ManageProducts();
    String title="Manage Customer";
    Border boarder=BorderFactory.createTitledBorder(title);
    mangeprod.setBorder(boarder);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        name_lbl = new javax.swing.JLabel();
        id_lbl = new javax.swing.JLabel();
        gender_lbl = new javax.swing.JLabel();
        mobilphn_lbl = new javax.swing.JLabel();
        txtcode = new javax.swing.JTextField();
        txtqty = new javax.swing.JTextField();
        txtunitprice = new javax.swing.JTextField();
        txtcategoryid = new javax.swing.JTextField();
        name_lbl1 = new javax.swing.JLabel();
        txtsupid = new javax.swing.JTextField();
        id_lbl1 = new javax.swing.JLabel();
        mobilphn_lbl4 = new javax.swing.JLabel();
        btnsearch = new javax.swing.JToggleButton();
        txtbrandid = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        addnew_btn = new javax.swing.JToggleButton();
        remove_btn = new javax.swing.JToggleButton();
        btnupdate = new javax.swing.JToggleButton();
        print_btn = new javax.swing.JToggleButton();
        btnsave = new javax.swing.JToggleButton();
        mobilphn_lbl2 = new javax.swing.JLabel();
        combocatname = new javax.swing.JComboBox<>();
        combobchid = new javax.swing.JComboBox<>();
        combobrname = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        lblimage = new javax.swing.JLabel();
        txtdescription = new javax.swing.JTextField();
        txtimagepath = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnupload = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name_lbl.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        name_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        name_lbl.setText("Category Name");
        add(name_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 140, -1));

        id_lbl.setBackground(new java.awt.Color(255, 255, 255));
        id_lbl.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        id_lbl.setForeground(new java.awt.Color(0, 0, 153));
        id_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        id_lbl.setText("Add Products");
        add(id_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 235, 46));

        gender_lbl.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        gender_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        gender_lbl.setText("Batch ID");
        add(gender_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        mobilphn_lbl.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mobilphn_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mobilphn_lbl.setText("Unit price");
        add(mobilphn_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 90, 20));

        txtcode.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtcode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 62, 76, -1));

        txtqty.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtqty.setBorder(null);
        add(txtqty, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 90, 20));

        txtunitprice.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtunitprice.setBorder(null);
        add(txtunitprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 155, 20));

        txtcategoryid.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtcategoryid.setBorder(null);
        txtcategoryid.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtcategoryidCaretUpdate(evt);
            }
        });
        txtcategoryid.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtcategoryidPropertyChange(evt);
            }
        });
        add(txtcategoryid, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 76, -1));

        name_lbl1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        name_lbl1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        name_lbl1.setText("Brand Name");
        add(name_lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 127, 110, -1));

        txtsupid.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtsupid.setBorder(null);
        add(txtsupid, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 76, -1));

        id_lbl1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        id_lbl1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        id_lbl1.setText("Product Code ");
        add(id_lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 140, -1));

        mobilphn_lbl4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mobilphn_lbl4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mobilphn_lbl4.setText("Description");
        add(mobilphn_lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 120, 30));

        btnsearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsearch.setForeground(new java.awt.Color(0, 0, 255));
        btnsearch.setText("Search");
        btnsearch.setBorderPainted(false);
        btnsearch.setContentAreaFilled(false);
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 102, -1));

        txtbrandid.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtbrandid.setBorder(null);
        txtbrandid.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtbrandidCaretUpdate(evt);
            }
        });
        txtbrandid.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtbrandidPropertyChange(evt);
            }
        });
        add(txtbrandid, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, 76, -1));

        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "   Code", "   Category Id", "     Brand Id", "    Batch Id", "      Supplier Id", "   Description", "  Unit Price", "  Stock On Hand", "     Image"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProducts.setName("tblProducts"); // NOI18N
        tblProducts.setRowHeight(20);
        tblProducts.setRowMargin(2);
        tblProducts.setSelectionBackground(new java.awt.Color(51, 0, 255));
        tblProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductsMouseClicked(evt);
            }
        });
        tblProducts.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblProductsKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblProducts);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 1070, 170));

        jPanel1.setBackground(new java.awt.Color(0, 0, 255));

        addnew_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addnew_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/asirisupermarket/images/add2-64.png"))); // NOI18N
        addnew_btn.setText("Add  New");
        addnew_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addnew_btnActionPerformed(evt);
            }
        });

        remove_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        remove_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/asirisupermarket/images/Cancel_48px_1.png"))); // NOI18N
        remove_btn.setText("Remove");
        remove_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_btnActionPerformed(evt);
            }
        });

        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/asirisupermarket/images/Modify.png"))); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        print_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        print_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/asirisupermarket/images/Printer-icon.png"))); // NOI18N
        print_btn.setText("Print ");

        btnsave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/asirisupermarket/images/Save-icon.png"))); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addnew_btn)
                .addGap(55, 55, 55)
                .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(remove_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(print_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addnew_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(remove_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(print_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, 90));

        mobilphn_lbl2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mobilphn_lbl2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mobilphn_lbl2.setText("Qty ");
        add(mobilphn_lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 60, 20));

        combocatname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        combocatname.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combocatnameItemStateChanged(evt);
            }
        });
        combocatname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combocatnameActionPerformed(evt);
            }
        });
        add(combocatname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 190, -1));

        combobchid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        combobchid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combobchidItemStateChanged(evt);
            }
        });
        add(combobchid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 190, -1));

        combobrname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        combobrname.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combobrnameItemStateChanged(evt);
            }
        });
        add(combobrname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 190, -1));

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 204));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblimage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jDesktopPane1.setLayer(lblimage, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblimage, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblimage, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtdescription.setBackground(new java.awt.Color(0, 0, 0));
        txtdescription.setFont(new java.awt.Font("Cambria Math", 1, 18)); // NOI18N
        txtdescription.setForeground(new java.awt.Color(0, 255, 0));
        txtdescription.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdescription.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPane1)
                    .addComponent(txtdescription))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtdescription, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, 240));
        add(txtimagepath, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, 140, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Image Path");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 50, -1, 20));

        btnupload.setText("Upload");
        btnupload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuploadActionPerformed(evt);
            }
        });
        add(btnupload, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 140, 82, 33));
    }// </editor-fold>//GEN-END:initComponents

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
       ProductDTO products = new ProductDTO(txtcode.getText(),
		  txtcategoryid.getText(),
                txtbrandid.getText(),
                combobchid.getSelectedItem().toString(), 
                txtsupid.getText(),
                txtdescription.getText(),
                new BigDecimal(txtunitprice.getText()),	
               Integer.parseInt(txtqty.getText()),
               prodimage);
       
        try {

            boolean result = ManageProductController.productDAO.update(products);
                //updateProducts(products);
            if (result) {
                JOptionPane.showMessageDialog(this, "Products has been successfully updated");
               // btn_refreshActionPerformed(evt);
                clearAllTextFileds();
                setId();
                 loadAllProducts(); 
            } else {
                JOptionPane.showMessageDialog(this, "Products hasn't been updated");
            }

        } catch (Exception ex) {
            Logger.getLogger(ManageProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
         String pid = txtcode.getText();
        try {
            searchProducts(pid);
        } catch (Exception ex) {
            Logger.getLogger(ManageProducts.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_btnsearchActionPerformed

    private void addnew_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnew_btnActionPerformed
        ProductDTO products = new ProductDTO(txtcode.getText(),
                //combocatid.getSelectedItem().toString(),
                txtcategoryid.getText(),
                txtbrandid.getText(),
                //combobrid.getSelectedItem().toString(),
                combobchid.getSelectedItem().toString(), 
                txtsupid.getText(),
                txtdescription.getText(),
                new BigDecimal(txtunitprice.getText()),	
               Integer.parseInt(txtqty.getText()),
               prodimage);
         try {
            
            boolean result = ManageProductController.productDAO.add(products);
            if (result){
                JOptionPane.showMessageDialog(this, "Products has been successfully added.");
                clearAllTextFileds();
                loadAllProducts(); 
                  setId();
            }else{
                JOptionPane.showMessageDialog(this, "Products hasn't been added ");
            }
            
        } catch (Exception ex) {
            Logger.getLogger(ManageProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addnew_btnActionPerformed

    private void remove_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_btnActionPerformed
       ProductDTO products = new ProductDTO(
                txtcode.getText(),
		txtcategoryid.getText(),
                txtbrandid.getText(),
                combobchid.getSelectedItem().toString(), 
                txtsupid.getText(),
                txtdescription.getText(),
                new BigDecimal(txtunitprice.getText()),	
               Integer.parseInt(txtqty.getText()),
                prodimage);			
               
        try {
           
            boolean result = ManageProductController.productDAO.delete(products);
            if (result){
                JOptionPane.showMessageDialog(this, "Products has been successfully deleted.");
                 clearAllTextFileds();
                loadAllProducts(); 
                setId();
                
            }else{
                JOptionPane.showMessageDialog(this, "Products hasn't been deleted ");
            }
            
        } catch (Exception ex) {
            Logger.getLogger(ManageProducts.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_remove_btnActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
         ProductDTO products = new ProductDTO(txtcode.getText(),
                //combocatid.getSelectedItem().toString(),
                txtcategoryid.getText(),
                txtbrandid.getText(),
                //combobrid.getSelectedItem().toString(),
                combobchid.getSelectedItem().toString(), 
                txtsupid.getText(),
                txtdescription.getText(),
                new BigDecimal(txtunitprice.getText()),	
               Integer.parseInt(txtqty.getText()),
               prodimage);
         try {
            
            boolean result = ManageProductController.productDAO.add(products);
            if (result){
                JOptionPane.showMessageDialog(this, "Products has been successfully added.");
                clearAllTextFileds();
                loadAllProducts(); 
                  setId();
            }else{
                JOptionPane.showMessageDialog(this, "Products hasn't been added ");
            }
            
        } catch (Exception ex) {
            Logger.getLogger(ManageProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void tblProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductsMouseClicked
         combocatname.setSelectedItem(null);
         combobrname.setSelectedItem(null);
         
        if(tblProducts.getSelectedRow()==-1) return;
                 String productsId= tblProducts.getValueAt(tblProducts.getSelectedRow(), 0).toString();
                String categoryid= tblProducts.getValueAt(tblProducts.getSelectedRow(), 1).toString();
                String brandid= tblProducts.getValueAt(tblProducts.getSelectedRow(), 2).toString();
                String batchid= tblProducts.getValueAt(tblProducts.getSelectedRow(), 3).toString();
                String suplierid= tblProducts.getValueAt(tblProducts.getSelectedRow(), 4).toString();
                String description= tblProducts.getValueAt(tblProducts.getSelectedRow(), 5).toString();
                String unitprice= tblProducts.getValueAt(tblProducts.getSelectedRow(), 6).toString();
                String qty= tblProducts.getValueAt(tblProducts.getSelectedRow(), 7).toString();
                byte[] prodimage=(byte[]) tblProducts.getValueAt(tblProducts.getSelectedRow(), 8);
                
                txtcode.setText(productsId);
                txtcategoryid.setText(categoryid);
                txtbrandid.setText(brandid);
                combobchid.setSelectedItem(batchid);
                txtsupid.setText(suplierid);
                txtdescription.setText(description);
                txtunitprice.setText(unitprice);
                txtqty.setText(qty);
               formate= new ImageIcon(prodimage);
                lblimage.setIcon(formate);
    }//GEN-LAST:event_tblProductsMouseClicked

    private void combocatnameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combocatnameItemStateChanged
         try {
            if(combocatname.getSelectedIndex()==-1){return;}
            CategoryDTO category=ManageCategoryController.categoryDAO.search(new CategoryDTO(null, combocatname.getSelectedItem().toString()));
            if(category==null){return;}
            txtcategoryid.setText(category.getCATID());
        } catch (Exception ex) {
            Logger.getLogger(ManageProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_combocatnameItemStateChanged

    private void combobrnameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combobrnameItemStateChanged
        try {
            if(combobrname.getSelectedIndex()==-1){return;}
            BrandDTO brand=ManageBrandController.brandDAO.search(new BrandDTO(null,combobrname.getSelectedItem().toString()));
            if(brand==null){return;}
            txtbrandid.setText(brand.getBRNID());
        } catch (Exception ex) {
            Logger.getLogger(ManageProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_combobrnameItemStateChanged

    private void combobchidItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combobchidItemStateChanged
        try {
            if(combobchid.getSelectedIndex()==-1){return;}
            BatchDTO batch= ManageBatchController.batchDAO.search(new BatchDTO(combobchid.getSelectedItem().toString(), null, null, null));
            
            if(batch==null){return;}
            
            txtsupid.setText(batch.getSID());
        } catch (Exception ex) {
            Logger.getLogger(ManageProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_combobchidItemStateChanged

    private void btnuploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuploadActionPerformed
         JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename=f.getAbsolutePath();
        txtimagepath.setText(filename);
        
        try {
            
            File image =new File(filename);
            
            BufferedImage thumbanail = Thumbnails.of(image).size(lblimage.getWidth(), lblimage.getHeight()).asBufferedImage();
            
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            
            ImageIO.write(thumbanail, "jpeg", os);
            
            InputStream is = new ByteArrayInputStream(os.toByteArray());
            
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            
            byte[] buf = new byte[1024];  // 1 MB
            
            for(int readNum;(readNum = is.read(buf))!=-1;){
            
            bos.write(buf,0,readNum);
            }
            viewimage=new ImageIcon(thumbanail);
            lblimage.setIcon(viewimage);
            prodimage=bos.toByteArray();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnuploadActionPerformed

    private void tblProductsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblProductsKeyPressed
       
    }//GEN-LAST:event_tblProductsKeyPressed

    private void txtcategoryidCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtcategoryidCaretUpdate
//        try {
//            if(txtcategoryid.getText()==""){return;}
//      
//            CategoryDTO category =ManageCategoryController.categoryDAO.searchName(new CategoryDTO(txtcategoryid.getText(), null));
//            System.out.println("catg  "+category);
//       if(category==null){return;}
//       combocatname.setSelectedItem(category.getCAT_NAME());
//        } catch (Exception ex) {
//            Logger.getLogger(ManageProducts.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_txtcategoryidCaretUpdate

    private void combocatnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combocatnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combocatnameActionPerformed

    private void txtbrandidCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtbrandidCaretUpdate
//         try {
//           if(txtbrandid.getText()==""){return;}
//     
//           BrandDTO brand =ManageBrandController.brandDAO.searchName(new BrandDTO(txtbrandid.getText(), null));
//          
//      if(brand==null){return;}
//       combobrname.setSelectedItem(brand.getBRN_NAME());
//       } catch (Exception ex) {
//           Logger.getLogger(ManageProducts.class.getName()).log(Level.SEVERE, null, ex);
//       }
    }//GEN-LAST:event_txtbrandidCaretUpdate

    private void txtcategoryidPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtcategoryidPropertyChange
        try {
            if(txtbrandid.getText()==""){return;}
      
            BrandDTO brand =ManageBrandController.brandDAO.searchName(new BrandDTO(txtbrandid.getText(), null));
          
       if(brand==null){return;}
       combobrname.setSelectedItem(brand.getBRN_NAME());
        } catch (Exception ex) {
            Logger.getLogger(ManageProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtcategoryidPropertyChange

    private void txtbrandidPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtbrandidPropertyChange
        try {
           if(txtbrandid.getText()==""){return;}
     
           BrandDTO brand =ManageBrandController.brandDAO.searchName(new BrandDTO(txtbrandid.getText(), null));
          
      if(brand==null){return;}
       combobrname.setSelectedItem(brand.getBRN_NAME());
       } catch (Exception ex) {
           Logger.getLogger(ManageProducts.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_txtbrandidPropertyChange
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton addnew_btn;
    private javax.swing.JToggleButton btnsave;
    private javax.swing.JToggleButton btnsearch;
    private javax.swing.JToggleButton btnupdate;
    private javax.swing.JButton btnupload;
    private javax.swing.JComboBox<String> combobchid;
    private javax.swing.JComboBox<String> combobrname;
    private javax.swing.JComboBox<String> combocatname;
    private javax.swing.JLabel gender_lbl;
    private javax.swing.JLabel id_lbl;
    private javax.swing.JLabel id_lbl1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblimage;
    private javax.swing.JLabel mobilphn_lbl;
    private javax.swing.JLabel mobilphn_lbl2;
    private javax.swing.JLabel mobilphn_lbl4;
    private javax.swing.JLabel name_lbl;
    private javax.swing.JLabel name_lbl1;
    private javax.swing.JToggleButton print_btn;
    private javax.swing.JToggleButton remove_btn;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextField txtbrandid;
    private javax.swing.JTextField txtcategoryid;
    private javax.swing.JTextField txtcode;
    private javax.swing.JTextField txtdescription;
    private javax.swing.JTextField txtimagepath;
    private javax.swing.JTextField txtqty;
    private javax.swing.JTextField txtsupid;
    private javax.swing.JTextField txtunitprice;
    // End of variables declaration//GEN-END:variables

        private void loadAllProducts() {
            try {

               ArrayList<ProductDTO> allProducts = ManageProductController.productDAO.getAll();

                DefaultTableModel dtm = (DefaultTableModel) tblProducts.getModel();

                dtm.setRowCount(0);

                if (allProducts != null){

                    for (ProductDTO products : allProducts  ) {

                        Object[] rowData = {
                            products.getCODE(),
                            products.getCATID(),
                            products.getBRNID(),
                            products.getBCHID(),
                            products.getSID(),
                            products.getDESCRIPTION(),
                            products.getUnit_Price(),
                            products.getQty_on_hand(),
                            products.getprodimage()
                            
                        };

                        dtm.addRow(rowData);

                    }

                }

            } catch (Exception ex) {
                Logger.getLogger(ManageProducts.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
      public void searchProducts(String PID) throws Exception {
          
       ProductDTO products = ManageProductController.productDAO.search(PID);
       
      
        if (products != null) {
           
         txtcategoryid.setText(products.getCATID());
        }
        txtbrandid.setText(products.getBRNID());
        combobchid.setSelectedItem(products.getBCHID());
        //genderComboBox.setSelectedItem(productsdto.getProducts_Gender());
        txtsupid.setText(products.getSID());
        txtdescription.setText(products.getDESCRIPTION());
        txtunitprice.setText(products.getUnit_Price().toPlainString());
        txtqty.setText(""+products.getQty_on_hand());
        formate=new ImageIcon(products.getprodimage());
        lblimage.setIcon(formate);

    }
    private void clearAllTextFileds() {
                 txtcode.setText("");
                combocatname.setSelectedIndex(-1);
                combobrname.setSelectedIndex(-1);
                combobchid.setSelectedIndex(-1);
                txtsupid.setText("");
                txtbrandid.setText("");
                txtcategoryid.setText("");
                txtdescription.setText("");
                txtunitprice.setText("");
                txtqty.setText("");
                txtimagepath.setText("");
                lblimage.setIcon(null);
    }
    private void loadCategoryid(){
        try {
            ArrayList<CategoryDTO> alcatid=ManageCategoryController.categoryDAO.getAll();
            
            combocatname.removeAllItems();
            if(alcatid==null){return;}
            
            for(CategoryDTO category:alcatid){
                combocatname.addItem(category.getCAT_NAME());
            }   } catch (Exception ex) {
            Logger.getLogger(ManageProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadBrandIds() {
        try {
            ArrayList<BrandDTO>allbrandid=ManageBrandController.brandDAO.getAll();
            combobrname.removeAllItems();
            if(allbrandid==null){return;}
            for (BrandDTO brandid:allbrandid){
                combobrname.addItem(brandid.getBRN_NAME());
            }} catch (Exception ex) {
            Logger.getLogger(ManageProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    private void loadBatchIds() {
        
        try {
            ArrayList<BatchDTO> albatchids=ManageBatchController.batchDAO.getAll();
            combobchid.removeAllItems();
            if(albatchids==null){return;}
            for(BatchDTO batchid:albatchids){
                combobchid.addItem(batchid.getBID());
            }
        } catch (Exception ex) {
            Logger.getLogger(ManageProducts.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

//    private void loadSuppIds() {
//        try {
//            ArrayList<SupplierDTO>alsupids=ManageSupplierController.supplierDAO.getAll();
//            combosupid.removeAllItems();
//            if(alsupids==null){return;}
//            for(SupplierDTO suppid:alsupids){
//                combosupid.addItem(suppid.getSID());
//            }
//        } catch (Exception ex) {
//            Logger.getLogger(ManageProducts.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//    }
    String filename = null;
      private ImageIcon viewimage=null;
      private ImageIcon formate=null;
      byte[] prodimage=null; 
    
}
