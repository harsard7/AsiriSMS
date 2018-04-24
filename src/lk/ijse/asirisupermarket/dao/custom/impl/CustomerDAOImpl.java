    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.asirisupermarket.dao.custom.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.asirisupermarket.core.dto.CustomerDTO;
import lk.ijse.asirisupermarket.dao.custom.CustomerDAO;
import lk.ijse.asirisupermarket.dao.db.DBConnection;



/**
 *
 * @author Hafees
 */
public class CustomerDAOImpl implements CustomerDAO {

    @Override
    public boolean add(CustomerDTO customer) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO Customer VALUES (?,?,?,?,?,?,?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, customer.getCID());
        pstm.setObject(2, customer.getCustomer_FirstName());
        pstm.setObject(3, customer.getCustomer_LastName());
        pstm.setObject(4, customer.getCustomer_Gender());
        pstm.setObject(5, customer.getCustomer_Address());
        pstm.setObject(6, customer.getCity());
        pstm.setObject(7, customer.getCustomer_Email());
        pstm.setObject(8, customer.getContactNo());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean update(CustomerDTO customer) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE Customer SET Customer_FirstName=?, Customer_LastName=?, Customer_Gender=?,Customer_Address=?,City=?,Customer_Email=?,ContactNo=? WHERE CID=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
       
        pstm.setObject(1, customer.getCustomer_FirstName());
        pstm.setObject(2, customer.getCustomer_LastName());
        pstm.setObject(3, customer.getCustomer_Gender());
        pstm.setObject(4, customer.getCustomer_Address());
        pstm.setObject(5, customer.getCity());
        pstm.setObject(6, customer.getCustomer_Email());
        pstm.setObject(7, customer.getContactNo());
        pstm.setObject(8, customer.getCID());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean delete(CustomerDTO customer) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM Customer WHERE cid = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, customer.getCID());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public CustomerDTO search(CustomerDTO customer) throws Exception {
         Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Customer WHERE cid='" + customer.getCID()+ "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        if (rst.next()) {
            return new CustomerDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8));
        }

        return null;
    }

    @Override
    public ArrayList<CustomerDTO> getAll() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Customer";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<CustomerDTO> alCustomers = null;

        while (rst.next()) {
            if (alCustomers == null) {
                alCustomers = new ArrayList<>();
            }

            alCustomers.add(new CustomerDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8)));
            

        }

        return alCustomers;
    
    }

    @Override
    public boolean add(ArrayList<CustomerDTO> dtoList) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ArrayList<CustomerDTO> dtoList) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
            Connection connection = DBConnection.getInstance().getConnection();
           String SQL = "Delete From Customer Where CID='" + id + "'";
           Statement stm = connection.createStatement();
           int res = stm.executeUpdate(SQL);
           return res > 0;
    
    }

    @Override
    public CustomerDTO search(String CID) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String SQL = "Select * From Customer Where CID='" + CID + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        if (rst.next()) {
            CustomerDTO customer = new CustomerDTO(rst.getString("CID"), rst.getString("Customer_FirstName"), rst.getString("Customer_LastName"), rst.getString("Customer_Gender"), rst.getString("Customer_Address"), rst.getString("City"), rst.getString("Customer_Email"), rst.getString("ContactNo"));
            return customer;
        } else {
            return null;
        }
    }

    @Override
    public ArrayList<String> getNames() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomerDTO getAllByNames(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomerDTO getIDFromName(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomerDTO getNameFromID(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getIDByName(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id, String code) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomerDTO search(String key, String code) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomerDTO searchName(CustomerDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
