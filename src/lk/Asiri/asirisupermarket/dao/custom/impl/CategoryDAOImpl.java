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
import lk.ijse.asirisupermarket.core.dto.CategoryDTO;
import lk.ijse.asirisupermarket.dao.custom.CategoryDAO;
import lk.ijse.asirisupermarket.dao.db.DBConnection;


public class CategoryDAOImpl implements CategoryDAO {
//CATID   CAT_NAME
    @Override
    public boolean add(CategoryDTO category) throws Exception {
       Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO Category VALUES (?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, category.getCATID());
        pstm.setObject(2, category.getCAT_NAME());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean update(CategoryDTO category) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE Category SET CAT_NAME=? WHERE CATID=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
       
        pstm.setObject(1, category.getCAT_NAME());
        pstm.setObject(2, category.getCATID());
         
       
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0); 
    }

    @Override
    public boolean delete(CategoryDTO category) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM Category WHERE CATID = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1,category.getCATID());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public CategoryDTO search(CategoryDTO category) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Category WHERE cat_name='" + category.getCAT_NAME()+ "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        if (rst.next()) {
            return new CategoryDTO(
                    rst.getString(1),
                    rst.getString(2));
                    
        }

        return null;
    }
    

    @Override
    public ArrayList<CategoryDTO> getAll() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Category";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<CategoryDTO> alCategory = null;

        while (rst.next()) {
            if (alCategory == null) {
                alCategory = new ArrayList<>();
            }

            alCategory.add(new CategoryDTO(
                    rst.getString(1),
                    rst.getString(2)));
        }

        return alCategory;
    
    }

    @Override
    public boolean add(ArrayList<CategoryDTO> dtoList) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ArrayList<CategoryDTO> dtoList) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
       Connection connection = DBConnection.getInstance().getConnection();
           String SQL = "Delete From Category Where CATID='" + id + "'";
           Statement stm = connection.createStatement();
           int res = stm.executeUpdate(SQL);
           return res > 0;
    
    }

    @Override
    public CategoryDTO search(String CATID) throws Exception {
      Connection connection = DBConnection.getInstance().getConnection();
        String SQL = "Select * From Category Where CATID='" + CATID + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        if (rst.next()) {
            CategoryDTO category = new CategoryDTO(rst.getString("CATID"), rst.getString("CAT_NAME")); 
            return category;
        } else {
            return null;
        }
    }

    @Override
    public ArrayList<String> getNames() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CategoryDTO getAllByNames(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CategoryDTO getIDFromName(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CategoryDTO getNameFromID(String id) throws Exception {
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
    public CategoryDTO search(String key, String code) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CategoryDTO searchName(CategoryDTO category) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Category WHERE CATID='" + category.getCATID()+ "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        if (rst.next()) {
            return new CategoryDTO(
                    rst.getString(1),
                    rst.getString(2));
                    
        }

        return null;
    }
    
}
