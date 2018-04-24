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
import lk.ijse.asirisupermarket.core.dto.OrdersDTO;
import lk.ijse.asirisupermarket.dao.custom.OrdersDAO;
import lk.ijse.asirisupermarket.dao.db.DBConnection;


public class OrdersDAOImpl implements OrdersDAO {

    @Override
    public boolean add(OrdersDTO orders) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO Orders VALUES (?,?,?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, orders.getOID());
        pstm.setObject(2, orders.getCID());
        pstm.setObject(3,orders.getEID());
        pstm.setObject(4,orders.getOrder_Date());
        
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0); 
    }

    @Override
    public boolean update(OrdersDTO orders) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE Orders SET CID=?, EID=?,order_Date=? WHERE OID=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
       
        pstm.setObject(1, orders.getCID());
        pstm.setObject(2, orders.getEID());
        pstm.setObject(3,orders.getOrder_Date());
        pstm.setObject(4,orders.getOID());
       
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0); 
    }
    /*  private String OID;
    private String CID;
    private String EID;
    private Date order_Date;*/

    @Override
    public boolean delete(OrdersDTO orders) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM Orders WHERE OID = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1,orders.getOID());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public OrdersDTO search(OrdersDTO orders) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Orders WHERE OID='" + orders.getOID()+ "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        if (rst.next()) {
            return new OrdersDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4)
            );
        }

        return null;
    }

    @Override
    public ArrayList<OrdersDTO> getAll() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Orders";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<OrdersDTO> alOrders = null;

        while (rst.next()) {
            if (alOrders == null) {
                alOrders = new ArrayList<>();
            }

            alOrders.add(new OrdersDTO(
                     rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4)));
        }

        return alOrders;
    
    }

    @Override
    public boolean add(ArrayList<OrdersDTO> dtoList) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ArrayList<OrdersDTO> dtoList) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
           String SQL = "Delete From Orders Where OID='" + id + "'";
           Statement stm = connection.createStatement();
           int res = stm.executeUpdate(SQL);
           return res > 0;
    }

    @Override
    public OrdersDTO search(String OID) throws Exception {
       Connection connection = DBConnection.getInstance().getConnection();
        String SQL = "Select * From Orders Where OID='" + OID + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        if (rst.next()) {
      OrdersDTO orders = new OrdersDTO(rst.getString("OID"), rst.getString("CID"), rst.getString("EID"), rst.getString("order_Date"));
            return orders;
        } else {
            return null;
        }
    }

    @Override
    public ArrayList<String> getNames() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OrdersDTO getAllByNames(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OrdersDTO getIDFromName(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OrdersDTO getNameFromID(String id) throws Exception {
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
    public OrdersDTO search(String key, String code) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public OrdersDTO searchName(OrdersDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
