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
import lk.ijse.asirisupermarket.core.dto.PaymentDTO;
import lk.ijse.asirisupermarket.dao.custom.PaymentDAO;
import lk.ijse.asirisupermarket.dao.db.DBConnection;


public class PaymentDAOImpl implements PaymentDAO {

    @Override
    public boolean add(PaymentDTO payment) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO Payment VALUES (?,?,?,?,?,?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1,payment.getPID());
        pstm.setObject(2,payment.getOID());
        pstm.setObject(3,payment.getCID());
        pstm.setObject(4,payment.getEID());
        pstm.setObject(5,payment.getPayment_DATE());
        pstm.setObject(6,payment.getDiscount());
        pstm.setObject(7,payment.getTotal_Amount());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0); 
    }

    @Override
    public boolean update(PaymentDTO payment) throws Exception {
         Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE Payment SET OID=?,CID=?,EID=?,Payment_DATE=?,Discount=?,totalamount=? WHERE PID=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
       
        pstm.setObject(1, payment.getPID());
        pstm.setObject(2, payment.getOID());
        pstm.setObject(3,payment.getCID());
        pstm.setObject(4,payment.getEID());
        pstm.setObject(5,payment.getPayment_DATE());
        pstm.setObject(6,payment.getDiscount());
        pstm.setObject(7,payment.getTotal_Amount());
       
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0); 
    }
    /* private String PID;
    private String OID;
    private String CID;
    private String EID ;
    private Date Payment_DATE;
    private BigDecimal Discount;
    private BigDecimal Paid_Amount;*/

    @Override
    public boolean delete(PaymentDTO payment) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM Payment WHERE PID = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1,payment.getPID());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public PaymentDTO search(PaymentDTO payment) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Payment WHERE PID='" + payment.getPID()+ "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        if (rst.next()) {
            return new PaymentDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getDouble(6),
                    rst.getDouble(7)
            );
        }

        return null;
    }

    @Override
    public ArrayList<PaymentDTO> getAll() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Payment";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<PaymentDTO> alPayments = null;

        while (rst.next()) {
            if (alPayments == null) {
                alPayments = new ArrayList<>();
            }

            alPayments.add(new PaymentDTO(
                     rst.getString(1),
                     rst.getString(2),
                     rst.getString(3),
                     rst.getString(4),
                     rst.getString(5),
                    rst.getDouble(6),
                    rst.getDouble(7)));
        }

        return alPayments;
    }

    @Override
    public boolean add(ArrayList<PaymentDTO> dtoList) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ArrayList<PaymentDTO> dtoList) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
           Connection connection = DBConnection.getInstance().getConnection();
           String SQL = "Delete From Payment Where PID='" + id + "'";
           Statement stm = connection.createStatement();
           int res = stm.executeUpdate(SQL);
           return res > 0;
    }

    @Override
    public PaymentDTO search(String PID) throws Exception {
       Connection connection = DBConnection.getInstance().getConnection();
        String SQL = "Select * From Payment  Where PID='" + PID + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        if (rst.next()) {
            PaymentDTO payment = new PaymentDTO(rst.getString("PID"), rst.getString("OID"), rst.getString("CID"), rst.getString("EID"), rst.getString("Payment_DATE"), rst.getDouble("Discount"), rst.getDouble("totalAmount"));
            return payment;
        } else {
            return null;
        }
    }

    @Override
    public ArrayList<String> getNames() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PaymentDTO getAllByNames(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PaymentDTO getIDFromName(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PaymentDTO getNameFromID(String id) throws Exception {
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
    public PaymentDTO search(String key, String code) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PaymentDTO searchName(PaymentDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
