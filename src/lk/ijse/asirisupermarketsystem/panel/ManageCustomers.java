/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.asirisupermarketsystem.panel;

import java.awt.Dialog;
import java.sql.Connection;
import lk.ijse.asirisupermarket.idgenerater.IdGenerater;
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
import lk.ijse.asirisupermarket.controller.ManageCustomerController;
import lk.ijse.asirisupermarket.core.dto.CustomerDTO;
import lk.ijse.asirisupermarket.dao.db.DBConnection;
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
//import net.sf.jasperreports.engine.data.JRTableModelDataSource;

/**
 *
 * @author Hafees
 */
//@Report("lk.ijse.asirisupermarket.report")
public class ManageCustomers extends javax.swing.JPanel {
    private String Gender = null;
    public ManageCustomers() {
        
        initComponents();
        setId();
         //customerControl = (ManageCustomerController) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMER);
        /* customerControl=(ManageCustomerController) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMER);
        connection=DBConnection.getInstance().getConnection();
        try {
            txtCustomerId.setText(IdGenarator.getNewID("Customer", "CID", "C"));
        } catch (SQLException ex) {
            Logger.getLogger(ManageCustomers.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageCustomers.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        loadAllCustomers();
         tblCustomers.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                
                if (tblCustomers.getSelectedRow() == -1) return;
                
               String customerId= tblCustomers.getValueAt(tblCustomers.getSelectedRow(), 0).toString();
                String customerfName= tblCustomers.getValueAt(tblCustomers.getSelectedRow(), 1).toString();
                String customerLName= tblCustomers.getValueAt(tblCustomers.getSelectedRow(), 2).toString();
                String customerGender= tblCustomers.getValueAt(tblCustomers.getSelectedRow(), 3).toString();
                String customerAddress= tblCustomers.getValueAt(tblCustomers.getSelectedRow(), 4).toString();
                String customerCity= tblCustomers.getValueAt(tblCustomers.getSelectedRow(), 5).toString();
                String customerEmail= tblCustomers.getValueAt(tblCustomers.getSelectedRow(), 6).toString();
                String customerContactno= tblCustomers.getValueAt(tblCustomers.getSelectedRow(), 7).toString();
                
                txtCustomerId.setText(customerId);
                txtCustomerFname.setText(customerfName);
                txtCustomerLname.setText(customerLName);
                if(customerGender.equals("Male")){
                    rdbtnmale.setSelected(true);
                    rdbtnfemale.setSelected(false);
                }else{
                    rdbtnfemale.setSelected(true);
                    rdbtnmale.setSelected(false);
                }
//                txtGender.setText(customerGender);
                txtAddress.setText(customerAddress);
                txtCity.setText(customerCity);
                txtEmail.setText(customerEmail);
                txt_contactno.setText(customerContactno);
            }
        });
    }   
    
     public void setId() {
        try {
            String newId = IdGenerater.getNewId("Customer", "CID", "C", 2);
            txtCustomerId.setText(newId);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    
    
    private void loadAllCustomers() {
       try {
           
           ArrayList<CustomerDTO> allCustomers = ManageCustomerController.customerDAO.getAll();
            
            DefaultTableModel dtm = (DefaultTableModel) tblCustomers.getModel();
            
            dtm.setRowCount(0);
            
            if (allCustomers != null){
                
                for (CustomerDTO customer : allCustomers) {
                    
                    Object[] rowData = {
                        customer.getCID(),
                        customer.getCustomer_FirstName(),
                        customer.getCustomer_LastName(),
                        customer.getCustomer_Gender(),
                        customer.getCustomer_Address(),
                        customer.getCity(),
                        customer.getCustomer_Email(),
                         customer.getContactNo(),
                        //customer.getSalary().toString()
                    };
                    
                    dtm.addRow(rowData);
                    
                }
                
            }
            
        } catch (Exception ex) {
            Logger.getLogger(ManageCustomers.class.getName()).log(Level.SEVERE, null, ex);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        name_lbl = new javax.swing.JLabel();
        id_lbl = new javax.swing.JLabel();
        email_lbl = new javax.swing.JLabel();
        gender_lbl = new javax.swing.JLabel();
        mobilphn_lbl = new javax.swing.JLabel();
        address_lbl = new javax.swing.JLabel();
        txtCustomerId = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        btn_update = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnaddcustomer = new javax.swing.JButton();
        btnrefresh = new javax.swing.JButton();
        address_lbl1 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomers = new javax.swing.JTable();
        txt_contactno = new javax.swing.JTextField();
        txtCustomerFname = new javax.swing.JTextField();
        txtCustomerLname = new javax.swing.JTextField();
        name_lbl1 = new javax.swing.JLabel();
        btn_search = new javax.swing.JToggleButton();
        btnreport = new javax.swing.JToggleButton();
        btnexport = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        rdbtnmale = new javax.swing.JRadioButton();
        rdbtnfemale = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1097, 651));
        setMinimumSize(new java.awt.Dimension(1097, 651));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1097, 651));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Customer");

        name_lbl.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        name_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        name_lbl.setText("First Name :");

        id_lbl.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        id_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        id_lbl.setText("ID :");

        email_lbl.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        email_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        email_lbl.setText("Email ID :");

        gender_lbl.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        gender_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        gender_lbl.setText("Gender:");

        mobilphn_lbl.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mobilphn_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mobilphn_lbl.setText("Mobile Phone :");

        address_lbl.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        address_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        address_lbl.setText("Address :");

        txtCustomerId.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtCustomerId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        txtCustomerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerIdActionPerformed(evt);
            }
        });

        txtEmail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        txtAddress.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtAddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddressKeyReleased(evt);
            }
        });

        btn_update.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_update.setForeground(new java.awt.Color(51, 51, 51));
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(51, 51, 51));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnaddcustomer.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnaddcustomer.setForeground(new java.awt.Color(51, 51, 51));
        btnaddcustomer.setText("Add Customer");
        btnaddcustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddcustomerActionPerformed(evt);
            }
        });

        btnrefresh.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnrefresh.setForeground(new java.awt.Color(51, 51, 51));
        btnrefresh.setText("Refresh Fields");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });

        address_lbl1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        address_lbl1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        address_lbl1.setText("City");

        txtCity.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtCity.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });
        txtCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCityKeyReleased(evt);
            }
        });

        tblCustomers.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tblCustomers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cus Id", "First Name", "Last Name", "Gender", "Address", "    City", "  Email", "Mobile No"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCustomers);

        txt_contactno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_contactno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        txt_contactno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contactnoActionPerformed(evt);
            }
        });
        txt_contactno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_contactnoKeyReleased(evt);
            }
        });

        txtCustomerFname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtCustomerFname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        txtCustomerFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerFnameActionPerformed(evt);
            }
        });
        txtCustomerFname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCustomerFnameKeyReleased(evt);
            }
        });

        txtCustomerLname.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtCustomerLname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 3, true));
        txtCustomerLname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerLnameActionPerformed(evt);
            }
        });
        txtCustomerLname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCustomerLnameKeyReleased(evt);
            }
        });

        name_lbl1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        name_lbl1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        name_lbl1.setText("Last Name :");

        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        btnreport.setText("report");
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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/asirisupermarket/images/10logos.png"))); // NOI18N

        buttonGroup1.add(rdbtnmale);
        rdbtnmale.setText("Male");

        buttonGroup1.add(rdbtnfemale);
        rdbtnfemale.setText("Female");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name_lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(gender_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(btnaddcustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCustomerLname, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 277, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(address_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(70, 70, 70)
                                                .addComponent(address_lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(19, 19, 19)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(email_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(rdbtnmale)
                                .addGap(18, 18, 18)
                                .addComponent(rdbtnfemale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mobilphn_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_contactno, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(83, 83, 83)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(151, 151, 151)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(52, 52, 52)
                                    .addComponent(id_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(name_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(9, 9, 9)
                                    .addComponent(txtCustomerFname, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 146, Short.MAX_VALUE)))
                .addGap(71, 71, 71))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnrefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnreport, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnexport, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(id_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(address_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCustomerFname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(130, 130, 130)
                                        .addComponent(btnaddcustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(name_lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCustomerLname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(email_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(40, 40, 40)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(gender_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(rdbtnmale)
                                            .addComponent(rdbtnfemale))))
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(mobilphn_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_contactno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(address_lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnreport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnexport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnrefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddcustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddcustomerActionPerformed
                    //String Gender = null;
                     if (rdbtnmale.isSelected()) {
            Gender = "Male";
        } else {
            Gender = "Female";
        }  
               
        CustomerDTO customer = new CustomerDTO(txtCustomerId.getText(),
                txtCustomerFname.getText(), 
                txtCustomerLname.getText(),
                Gender, 
                txtAddress.getText(),
                txtCity.getText(),
                txtEmail.getText(),
                txt_contactno.getText());
                
                
       
         try {
            
            boolean result = ManageCustomerController.customerDAO.add(customer);
            if (result){
                JOptionPane.showMessageDialog(this, "Customer has been successfully added.");
                loadAllCustomers(); 
                 clearAllTextFileds();
                 setId();
            }else{
                JOptionPane.showMessageDialog(this, "Customer hasn't been added ");
            }
            
        } catch (Exception ex) {
            Logger.getLogger(ManageCustomers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnaddcustomerActionPerformed
        DBConnection db=new DBConnection();
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       
         if (rdbtnmale.isSelected()) {
            Gender = "Male";
        } else {
            Gender = "Female";
        }  
               
        CustomerDTO customer = new CustomerDTO(txtCustomerId.getText(),
                txtCustomerFname.getText(), 
                txtCustomerLname.getText(),
                Gender, 
                txtAddress.getText(),
                txtCity.getText(),
                txtEmail.getText(),
                txt_contactno.getText());
        try {
           
            boolean result = ManageCustomerController.customerDAO.delete(customer);
            if (result){
                JOptionPane.showMessageDialog(this, "Customer has been successfully deleted.");
                loadAllCustomers(); 
                 clearAllTextFileds();
            }else{
                JOptionPane.showMessageDialog(this, "Customer hasn't been deleted ");
            }
            
        } catch (Exception ex) {
            Logger.getLogger(ManageCustomers.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
         
         if (rdbtnmale.isSelected()) {
            Gender = "Male";
        } else {
            Gender = "Female";
        }  
               
        CustomerDTO customer = new CustomerDTO(txtCustomerId.getText(),
                txtCustomerFname.getText(), 
                txtCustomerLname.getText(),
                Gender, 
                txtAddress.getText(),
                txtCity.getText(),
                txtEmail.getText(),
                txt_contactno.getText());

        try {

            boolean result = ManageCustomerController.customerDAO.update(customer);
                //updateCustomer(customer);
            if (result) {
                JOptionPane.showMessageDialog(this, "Customer has been successfully updated");
               // btn_refreshActionPerformed(evt);
               loadAllCustomers(); 
                clearAllTextFileds();
            } else {
                JOptionPane.showMessageDialog(this, "Customer hasn't been updated");
            }

        } catch (Exception ex) {
            Logger.getLogger(ManageCustomers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void txtCustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerIdActionPerformed
       txtCustomerFname.requestFocus();
    }//GEN-LAST:event_txtCustomerIdActionPerformed

    private void txtCustomerFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerFnameActionPerformed
       txtCustomerLname.requestFocus();
    }//GEN-LAST:event_txtCustomerFnameActionPerformed

    private void txtCustomerLnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerLnameActionPerformed
        
    }//GEN-LAST:event_txtCustomerLnameActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        txtCity.requestFocus();
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        txtEmail.requestFocus();
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
         txt_contactno.requestFocus();
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txt_contactnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contactnoActionPerformed
       btnaddcustomer.requestFocus();
      // btnSave.requestFocusInWindow();
    }//GEN-LAST:event_txt_contactnoActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
         String CID = txtCustomerId.getText();
        try {
            searchCustomer(CID);
        } catch (Exception ex) {
            Logger.getLogger(ManageCustomers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        clearAllTextFileds();
        // txtCustomerId.requestFocusInWindow();
    }//GEN-LAST:event_btnrefreshActionPerformed

    private void btnreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreportActionPerformed
//         JasperUtil.init(ManageCustomers.class);
//        
//        JasperReportsContext ctx = JasperUtil.getReportContext();
//        
//        try {
//            JasperReport compiledReport = JasperUtil.
//                    getCompiledReport("Blank_A4.jasper");
//            
//            JasperFillManager fillManager = JasperFillManager.getInstance(ctx);
//            
//            HashMap<String, Object> reportParams = new HashMap<>();
//            // Connection connection = DBConnection.getInstance().getConnection();
//            TableModel model = tblCustomers.getModel();
//            
//            JasperPrint filledReport = fillManager.
//                    fill(compiledReport, reportParams, new JRTableModelDataSource(model));
//            
//            IJSEJasperViewer frmJasperViewer = new IJSEJasperViewer(filledReport);
//            frmJasperViewer.setTitle("Customer Details Report");
//            frmJasperViewer.setModalExclusionType(Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
//            frmJasperViewer.setVisible(true);
//            
//        } catch (JRException ex) {
//            Logger.getLogger(ManageCustomers.class.getName()).log(Level.SEVERE, null, ex);
//        }        
    }//GEN-LAST:event_btnreportActionPerformed

    private void btnexportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexportActionPerformed
//        JasperUtil.init(ManageCustomers.class);
//
//        JasperReportsContext ctx = JasperUtil.getReportContext();
//
//        try {
//            JasperReport compiledReport = JasperUtil.
//                    getCompiledReport("Blank_A4.jasper.jasper");
//
//            JasperFillManager fillManager = JasperFillManager.getInstance(ctx);
//
//            HashMap<String, Object> reportParams = new HashMap<>();
//
//            TableModel model = tblCustomers.getModel();
//
//            JasperPrint filledReport = fillManager.
//                    fill(compiledReport, reportParams, new JRTableModelDataSource(model));
//
//            //JasperExportManager.exportReportToHtmlFile(filledReport, "/home/ranjith-suranga/Documents/1.html");
//            JasperPrintManager.printReport(filledReport, true);
//        } catch (JRException ex) {
//            Logger.getLogger(ManageCustomers.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_btnexportActionPerformed

    private void txt_contactnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_contactnoKeyReleased
       Validation.phoneNumber(txt_contactno);
       
    }//GEN-LAST:event_txt_contactnoKeyReleased

    private void txtCustomerFnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerFnameKeyReleased
        Validation.name(txtCustomerFname);
    }//GEN-LAST:event_txtCustomerFnameKeyReleased

    private void txtCustomerLnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerLnameKeyReleased
         Validation.name(txtCustomerLname);
    }//GEN-LAST:event_txtCustomerLnameKeyReleased

    private void txtAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyReleased
        
    }//GEN-LAST:event_txtAddressKeyReleased

    private void txtCityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCityKeyReleased
       Validation.validationText(txtCity);
    }//GEN-LAST:event_txtCityKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
       Validation.EMAIL2(txtEmail);
    }//GEN-LAST:event_txtEmailKeyReleased
    
    private void clearAllTextFileds(){
        txtAddress.setText("");
        txtCustomerId.setText("");
        
        txt_contactno.setText("");
        txtAddress.setText("");
        txtCity.setText("");
        txtCustomerFname.setText("");
        txtCustomerLname.setText("");
        txtEmail.setText("");
    }
    public void searchCustomer(String CID) throws Exception {
               
       CustomerDTO customerdto = ManageCustomerController.customerDAO.search(CID);
       
       
       //CustomerDTO customerdto=ManageCustomerController.searchCustomer(customerdto);
        if (customerdto != null) {
            Gender = customerdto.getCustomer_Gender();
             if (Gender.equals("Male")) {
                    rdbtnmale.setSelected(true);
                    rdbtnfemale.setSelected(false);
                } else {
                    rdbtnmale.setSelected(false);
                    rdbtnfemale.setSelected(true);
                }
            
        txtCustomerFname.setText(customerdto.getCustomer_FirstName());
        txtCustomerLname.setText(customerdto.getCustomer_LastName());
        
        //txtGender.setText(customerdto.getCustomer_Gender());
        //genderComboBox.setSelectedItem(customerdto.getCustomer_Gender());
        txtAddress.setText(customerdto.getCustomer_Address());
        txt_contactno.setText(customerdto.getContactNo());
        txtCity.setText(customerdto.getCity());
        txtEmail.setText(customerdto.getCustomer_Email());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address_lbl;
    private javax.swing.JLabel address_lbl1;
    private javax.swing.JButton btnDelete;
    private javax.swing.JToggleButton btn_search;
    private javax.swing.JButton btn_update;
    private javax.swing.JButton btnaddcustomer;
    private javax.swing.JToggleButton btnexport;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JToggleButton btnreport;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel email_lbl;
    private javax.swing.JLabel gender_lbl;
    private javax.swing.JLabel id_lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mobilphn_lbl;
    private javax.swing.JLabel name_lbl;
    private javax.swing.JLabel name_lbl1;
    private javax.swing.JRadioButton rdbtnfemale;
    private javax.swing.JRadioButton rdbtnmale;
    private javax.swing.JTable tblCustomers;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCustomerFname;
    private javax.swing.JTextField txtCustomerId;
    private javax.swing.JTextField txtCustomerLname;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txt_contactno;
    // End of variables declaration//GEN-END:variables
    
    
}
