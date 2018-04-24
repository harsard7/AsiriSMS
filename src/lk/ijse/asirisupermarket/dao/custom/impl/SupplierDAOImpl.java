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
import lk.ijse.asirisupermarket.core.dto.SupplierDTO;
import lk.ijse.asirisupermarket.dao.custom.SupplierDAO;
import lk.ijse.asirisupermarket.dao.db.DBConnection;


public class SupplierDAOImpl implements SupplierDAO {

    @Override
    public boolean add(SupplierDTO supplier) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO Supplier VALUES (?,?,?,?,?,?,?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1,supplier.getSID());
        pstm.setObject(2,supplier.getSupplier_Name());
        pstm.setObject(3,supplier.getSupplier_Address());
        pstm.setObject(4,supplier.getSupplier_City());
        pstm.setObject(5,supplier.getPhone_No());
        pstm.setObject(6,supplier.getFax_No());
        pstm.setObject(7,supplier.getSupplier_Email());
        pstm.setObject(8,supplier.getWebpage());
        
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0); 
    }

    @Override
    public boolean update(SupplierDTO supplier) throws Exception {
         Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE Supplier SET Supplier_Name=?, Supplier_Address=?,Supplier_City=?,Phone_No=?,Fax_No=?,Supplier_Email=?,Webpage=? WHERE SID=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
       
        pstm.setObject(1, supplier.getSupplier_Name());
        pstm.setObject(2, supplier.getSupplier_Address());
        pstm.setObject(3,supplier.getSupplier_City());
        pstm.setObject(4,supplier.getPhone_No());
        pstm.setObject(5,supplier.getFax_No());
        pstm.setObject(6,supplier.getSupplier_Email());
        pstm.setObject(7,supplier.getWebpage());
        pstm.setObject(8,supplier.getSID());
       
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0); 
    }
    /* private String SID;
    private String Supplier_Name;
    private String Supplier_Address;
    private String Supplier_City;
    private String Phone_No;
    private String Fax_No;
    private String Supplier_Email;
    private String Webpage;*/


    @Override
    public boolean delete(SupplierDTO supplier) throws Exception {
         Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM Supplier WHERE SID = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1,supplier.getSID());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public SupplierDTO search(SupplierDTO supplier) throws Exception {
       Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Supplier WHERE SID='" + supplier.getSID()+ "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        if (rst.next()) {
            return new SupplierDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8)
            );
        }

        return null;
    }

    @Override
    public ArrayList<SupplierDTO> getAll() throws Exception {
         Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Supplier";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<SupplierDTO> alSuppliers = null;

        while (rst.next()) {
            if (alSuppliers == null) {
                alSuppliers = new ArrayList<>();
            }

            alSuppliers.add(new SupplierDTO(
                     rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8)));
        }

        return alSuppliers;
    }

    @Override
    public boolean add(ArrayList<SupplierDTO> dtoList) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ArrayList<SupplierDTO> dtoList) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
       Connection connection = DBConnection.getInstance().getConnection();
        String SQL = "Delete From Supplier Where SID='" + id + "'";
        Statement stm = connection.createStatement();
        int res = stm.executeUpdate(SQL);
        return res > 0;
    }

    @Override
    public SupplierDTO search(String SID) throws Exception {
       Connection connection = DBConnection.getInstance().getConnection();
        String SQL = "Select * From Supplier Where SID='" + SID + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        if (rst.next()) {
            SupplierDTO supplier = new SupplierDTO(rst.getString("SID"), rst.getString("Supplier_Name"), rst.getString("Supplier_Address"), rst.getString("Supplier_City"), rst.getString("Phone_No"), rst.getString("Fax_No"), rst.getString("Supplier_Email"), rst.getString("Webpage"));
            return supplier;
        } else {
            return null;
        }
    }

    @Override
    public ArrayList<String> getNames() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SupplierDTO getAllByNames(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SupplierDTO getIDFromName(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SupplierDTO getNameFromID(String id) throws Exception {
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
    public SupplierDTO search(String key, String code) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SupplierDTO searchName(SupplierDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
