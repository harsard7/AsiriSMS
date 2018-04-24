/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.asirisupermarket.subpanels;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import lk.ijse.asirisupermarket.controller.ManageCategoryController;
import lk.ijse.asirisupermarket.core.dto.CategoryDTO;
import lk.ijse.asirisupermarket.idgenerater.IdGenerater;

/**
 *
 * @author Hafees
 */
public class ManageCategory extends javax.swing.JPanel {

    /**
     * Creates new form ManagerCategory
     */
    public ManageCategory() {
        initComponents();
        loadAllCategorys();
        setId();
        
         tblcategory.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                
                if (tblcategory.getSelectedRow() == -1) return;
                
			String categoryId= tblcategory.getValueAt(tblcategory.getSelectedRow(), 0).toString();
                        String categoryfName= tblcategory.getValueAt(tblcategory.getSelectedRow(), 1).toString();
                
                
                txtcatId.setText(categoryId);
                txtcatName.setText(categoryfName);
               
            }
        });
    }
     public void setId() {
        try {
            String newId = IdGenerater.getNewId("category", "catid", "CT", 2);
            txtcatId.setText(newId);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcategory = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtcatName = new javax.swing.JTextField();
        txtcatId = new javax.swing.JTextField();
        btnsearch = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        addnew_btn = new javax.swing.JToggleButton();
        remove_btn = new javax.swing.JToggleButton();
        update_btn = new javax.swing.JToggleButton();
        save_btn = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Manage Category");

        tblcategory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Brand name", "Brand Id"
            }
        ));
        jScrollPane1.setViewportView(tblcategory);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Category Name");

        txtcatName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcatNameActionPerformed(evt);
            }
        });

        btnsearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Category ID");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtcatId, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnsearch))
                    .addComponent(txtcatName, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcatId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsearch))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcatName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        addnew_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addnew_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/asirisupermarket/images/add2-64.png"))); // NOI18N
        addnew_btn.setText("Add ");
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

        update_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        update_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/asirisupermarket/images/Save-icon.png"))); // NOI18N
        update_btn.setText("Update");
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });

        save_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        save_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/asirisupermarket/images/Save-icon.png"))); // NOI18N
        save_btn.setText("Save");
        save_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_btnActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/asirisupermarket/images/10logos.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addnew_btn)
                        .addGap(77, 77, 77)
                        .addComponent(remove_btn)
                        .addGap(90, 90, 90)
                        .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(648, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addnew_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(remove_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(save_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
       CategoryDTO category=new CategoryDTO(
         txtcatId.getText(),
         txtcatName.getText());
        try {

            boolean result = ManageCategoryController.categoryDAO.update(category);
                //updateCategory(category);
            if (result) {
                JOptionPane.showMessageDialog(this, "Category has been successfully updated");
               // btn_refreshActionPerformed(evt);
               loadAllCategorys(); 
                clearAllTextFileds();
            } else {
                JOptionPane.showMessageDialog(this, "Category hasn't been updated");
            }

        } catch (Exception ex) {
            Logger.getLogger(ManageCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_update_btnActionPerformed

    private void save_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_save_btnActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
          String CID = txtcatId.getText();
        try {
            searchCategory(CID);
        } catch (Exception ex) {
            Logger.getLogger(ManageCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnsearchActionPerformed

    private void txtcatNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcatNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcatNameActionPerformed

    private void addnew_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addnew_btnActionPerformed
                                                 
	CategoryDTO category = new CategoryDTO(
                txtcatId.getText(), 
                txtcatName.getText());
         try {
             
               
            boolean result = ManageCategoryController.categoryDAO.add(category);
            if (result){
                JOptionPane.showMessageDialog(this, "Category has been successfully added.");
                loadAllCategorys(); 
                 clearAllTextFileds();
            }else{
                JOptionPane.showMessageDialog(this, "Category hasn't been added ");
            }
            
        } catch (Exception ex) {
            Logger.getLogger(ManageCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }//GEN-LAST:event_addnew_btnActionPerformed

    private void remove_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_btnActionPerformed
       CategoryDTO category = new CategoryDTO(
               txtcatId.getText(), 
                txtcatName.getText());
       
        try {
           
            boolean result = ManageCategoryController.categoryDAO.delete(category);
            if (result){
                JOptionPane.showMessageDialog(this, "Category has been successfully deleted.");
                loadAllCategorys(); 
                 clearAllTextFileds();
            }else{
                JOptionPane.showMessageDialog(this, "Category hasn't been deleted ");
            }
            
        } catch (Exception ex) {
            Logger.getLogger(ManageCategory.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_remove_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton addnew_btn;
    private javax.swing.JToggleButton btnsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton remove_btn;
    private javax.swing.JToggleButton save_btn;
    private javax.swing.JTable tblcategory;
    private javax.swing.JTextField txtcatId;
    private javax.swing.JTextField txtcatName;
    private javax.swing.JToggleButton update_btn;
    // End of variables declaration//GEN-END:variables

    private void loadAllCategorys() {
        
        try {
            ArrayList<CategoryDTO> allCategorys = ManageCategoryController.categoryDAO.getAll();
            
            DefaultTableModel dtm = (DefaultTableModel) tblcategory.getModel();
            
            dtm.setRowCount(0);
            
            if (allCategorys != null){
                
                for (CategoryDTO category : allCategorys) {
                    
                    Object[] rowData = {
                        category.getCATID(),
                        category.getCAT_NAME(),
                       
                    };
                    
                    dtm.addRow(rowData);
                    
                }
                
            }
        } catch (Exception ex) {
            Logger.getLogger(ManageCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void clearAllTextFileds() {
         txtcatId.setText("");
        txtcatName.setText("");
    }

    private void searchCategory(String CID) {
        try {
            CategoryDTO categorydto = ManageCategoryController.categoryDAO.search(CID);
            if (categorydto != null) {
                
                txtcatName.setText(categorydto.getCAT_NAME());
            }
        } catch (Exception ex) {
            Logger.getLogger(ManageCategory.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
