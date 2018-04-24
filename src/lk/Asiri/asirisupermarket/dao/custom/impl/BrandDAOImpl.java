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
import lk.ijse.asirisupermarket.core.dto.BrandDTO;
import lk.ijse.asirisupermarket.dao.custom.BrandDAO;
import lk.ijse.asirisupermarket.dao.db.DBConnection;


public class BrandDAOImpl implements BrandDAO {

    @Override
    public boolean add(BrandDTO brand) throws Exception {
         Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO Brand VALUES (?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, brand.getBRNID());
        pstm.setObject(2, brand.getBRN_NAME());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean update(BrandDTO brand) throws Exception {
       Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE Brand SET BRAN_NAME=? WHERE BRNID=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
       
        pstm.setObject(1, brand.getBRN_NAME());
        pstm.setObject(2, brand.getBRNID());
         
       
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0); 
    }

    @Override
    public boolean delete(BrandDTO brand) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM Brand WHERE BRNID = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1,brand.getBRNID());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public BrandDTO search(BrandDTO brand) throws Exception {
         Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Brand WHERE BRAN_NAME='" + brand.getBRN_NAME()+ "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        if (rst.next()) {
            return new BrandDTO(
                    rst.getString(1),
                    rst.getString(2));
                    
        }

        return null;
    }

    @Override
    public ArrayList<BrandDTO> getAll() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Brand";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<BrandDTO> alBrands = null;

        while (rst.next()) {
            if (alBrands == null) {
                alBrands = new ArrayList<>();
            }

            alBrands.add(new BrandDTO(
                    rst.getString(1),
                    rst.getString(2)));
        }

        return alBrands;
    
    }

    @Override
    public boolean add(ArrayList<BrandDTO> dtoList) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ArrayList<BrandDTO> dtoList) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
           String SQL = "Delete From Brand Where BRNID='" + id + "'";
           Statement stm = connection.createStatement();
           int res = stm.executeUpdate(SQL);
           return res > 0;
    
    }

    @Override
    public BrandDTO search(String BRNID) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String SQL = "Select * From Brand Where BRNID='" + BRNID + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        if (rst.next()) {
            BrandDTO brand = new BrandDTO(rst.getString("BRNID"), rst.getString("BRAN_NAME"));
            return brand;
        } else {
            return null;
        }
    }

    @Override
    public ArrayList<String> getNames() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BrandDTO getAllByNames(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BrandDTO getIDFromName(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BrandDTO getNameFromID(String id) throws Exception {
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
    public BrandDTO search(String key, String code) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BrandDTO searchName(BrandDTO brand) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Brand WHERE BRNID='" + brand.getBRNID()+ "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        if (rst.next()) {
            return new BrandDTO(
                    rst.getString(1),
                    rst.getString(2));
                    
        }

        return null;
    }
    
}
