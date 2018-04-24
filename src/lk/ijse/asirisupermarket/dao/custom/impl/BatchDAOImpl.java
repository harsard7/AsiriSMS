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
import lk.ijse.asirisupermarket.core.dto.BatchDTO;
import lk.ijse.asirisupermarket.dao.custom.BatchDAO;
import lk.ijse.asirisupermarket.dao.db.DBConnection;


public class BatchDAOImpl implements BatchDAO {
    

    @Override
    public boolean add(BatchDTO batch) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO Batch VALUES (?,?,?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, batch.getBID());
        pstm.setObject(2, batch.getGRNID());
        pstm.setObject(3, batch.getSID());
        pstm.setObject(4, batch.getDate());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0); 
    }

    @Override
    public boolean update(BatchDTO batch) throws Exception {
         Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE Batch SET grnid=?,SID=?, batch_date=? WHERE BCHID=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
       
        pstm.setObject(1, batch.getSID());
        pstm.setObject(2, batch.getGRNID());
        pstm.setObject(3, batch.getDate());
         pstm.setObject(4,batch.getBID());
       
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0); 
    }

    @Override
    public boolean delete(BatchDTO batch) throws Exception {
         Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM Batch WHERE BCHID = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1,batch.getBID());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public BatchDTO search(BatchDTO batch) throws Exception {
         Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Batch WHERE BCHID='" + batch.getBID()+ "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);
       
        if (rst.next()) {
            return new BatchDTO(
                    rst.getString(1),
                   rst.getString(2),
                    rst.getString(3),
                    rst.getString(4));
        }

        return null;
    }

    @Override
    public ArrayList<BatchDTO> getAll() throws Exception {
         Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Batch";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<BatchDTO> alBatchs = null;

        while (rst.next()) {
            if (alBatchs == null) {
                alBatchs = new ArrayList<>();
            }

            alBatchs.add(new BatchDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4) ));
        }

        return alBatchs;
    }

    @Override
    public boolean add(ArrayList<BatchDTO> dtoList) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ArrayList<BatchDTO> dtoList) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
           String SQL = "Delete From Batch Where BCHID='" + id + "'";
           Statement stm = connection.createStatement();
           int res = stm.executeUpdate(SQL);
           return res > 0;
    }

    @Override
    public boolean delete(String id, String code) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BatchDTO search(String BID) throws Exception {
         Connection connection = DBConnection.getInstance().getConnection();
        String SQL = "Select * From Batch Where BCHID='" + BID + "'";
        Statement stm = connection.createStatement();
      
        ResultSet rst = stm.executeQuery(SQL);
        if (rst.next()) {
            BatchDTO batch = new BatchDTO(rst.getString("BCHID"),rst.getString("grnid"), rst.getString("SID"), rst.getString("Batch_date"));
            return batch;
        } else {
            return null;
        }
    }

    @Override
    public BatchDTO search(String key, String code) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<String> getNames() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BatchDTO getAllByNames(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BatchDTO getIDFromName(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BatchDTO getNameFromID(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getIDByName(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BatchDTO searchName(BatchDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
