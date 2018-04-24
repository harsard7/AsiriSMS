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
import lk.ijse.asirisupermarket.core.dto.GrnDTO;
import lk.ijse.asirisupermarket.dao.custom.GrnDAO;
import lk.ijse.asirisupermarket.dao.db.DBConnection;


public class GrnDAOImpl implements GrnDAO {
  /*
    private String GRNID;
     private Date  GRN_Date;
     private String SID;
     private BigDecimal totalAmount;
    */
    @Override
    public boolean add(GrnDTO grn) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO GRN VALUES (?,?,?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, grn.getGRNID());
        pstm.setObject(2, grn.getGRN_Date());
        pstm.setObject(3, grn.getSID());
        pstm.setObject(4, grn.getTotalAmount());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0); 
    }

    @Override
    public boolean update(GrnDTO grn) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE GRN SET GRN_Date=?, SID=?,totalAmount=? WHERE GRNID=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
       
        pstm.setObject(1, grn.getGRN_Date());
        pstm.setObject(2, grn.getSID());
        pstm.setObject(3,grn.getTotalAmount());
        pstm.setObject(4,grn.getGRNID());
       
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0); 
    }

    @Override
    public boolean delete(GrnDTO grn) throws Exception {
         Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM GRN WHERE GRNID = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1,grn.getGRNID());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public GrnDTO search(GrnDTO grn) throws Exception {
         Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM GRN WHERE GRNID='" + grn.getGRNID()+ "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        if (rst.next()) {
            return new GrnDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getBigDecimal(4)
            );
        }

        return null;
    }

    @Override
    public ArrayList<GrnDTO> getAll() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM GRN";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<GrnDTO> alGrns = null;

        while (rst.next()) {
            if (alGrns == null) {
                alGrns = new ArrayList<>();
            }

            alGrns.add(new GrnDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getBigDecimal(4)));
        }

        return alGrns;
    
    }

    @Override
    public boolean add(ArrayList<GrnDTO> dtoList) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ArrayList<GrnDTO> dtoList) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
           String SQL = "Delete From Grn Where GRNID='" + id + "'";
           Statement stm = connection.createStatement();
           int res = stm.executeUpdate(SQL);
           return res > 0;
    
    }

    @Override
    public GrnDTO search(String GRNID) throws Exception {
       Connection connection = DBConnection.getInstance().getConnection();
        String SQL = "Select * From Grn Where GRNID='" + GRNID + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        if (rst.next()) {
            GrnDTO grn = new GrnDTO(rst.getString("GRNID"), rst.getString("GRN_Date"), rst.getString("SID"), rst.getBigDecimal("totalAmount"));
            return grn;
        } else {
            return null;
        }
    }

    @Override
    public ArrayList<String> getNames() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GrnDTO getAllByNames(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GrnDTO getIDFromName(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GrnDTO getNameFromID(String id) throws Exception {
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
    public GrnDTO search(String key, String code) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GrnDTO searchName(GrnDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
