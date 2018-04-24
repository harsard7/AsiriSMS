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
import lk.ijse.asirisupermarket.core.dto.ProductDTO;
import lk.ijse.asirisupermarket.dao.custom.ProductDAO;
import lk.ijse.asirisupermarket.dao.db.DBConnection;


public class ProductDAOImpl implements ProductDAO {

    @Override
    public boolean add(ProductDTO product) throws Exception {
       Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO Product VALUES (?,?,?,?,?,?,?,?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
         System.out.println("prod impl");
        pstm.setObject(1, product.getCODE());
        pstm.setObject(2, product.getCATID());
        pstm.setObject(3,product.getBRNID());
        pstm.setObject(4,product.getBCHID());
        pstm.setObject(5,product.getSID());
        pstm.setObject(6,product.getDESCRIPTION());
        pstm.setObject(7,product.getUnit_Price());
        pstm.setObject(8,product.getQty_on_hand());
        pstm.setObject(9, product.getprodimage());
        
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0); 
    }

    @Override
    public boolean update(ProductDTO product) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE product SET CATID=?, BRNID=?,BCHID=?,SID=?,DESCRIPTION=?,Unit_Price=?,Qtyonhand=?,prodimage=? WHERE CODE=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
       
        pstm.setObject(1, product.getCATID());
        pstm.setObject(2, product.getBRNID());
        pstm.setObject(3,product.getBCHID());
        pstm.setObject(4,product.getSID());
        pstm.setObject(5,product.getDESCRIPTION());
        pstm.setObject(6,product.getUnit_Price());
        pstm.setObject(7,product.getQty_on_hand());
        pstm.setObject(8, product.getprodimage());
        pstm.setObject(9,product.getCODE());
       
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0); 
    }
   

    @Override
    public boolean delete(ProductDTO product) throws Exception {
       Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM product WHERE CODE = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1,product.getCODE());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public ProductDTO search(ProductDTO product) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM product WHERE CODE='" + product.getCODE()+ "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        if (rst.next()) {
            return new ProductDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getBigDecimal(7),
                    rst.getInt(8),
                    rst.getBytes(9)
            );
        }

        return null;
    }

    @Override
    public ArrayList<ProductDTO> getAll() throws Exception {
         Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Product";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<ProductDTO> alPayments = null;

        while (rst.next()) {
            if (alPayments == null) {
                alPayments = new ArrayList<>();
            }

            alPayments.add(new ProductDTO(
                     rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getBigDecimal(7),
                    rst.getInt(8),
                    rst.getBytes(9)
            ));
        }

        return alPayments;
    }

    @Override
    public boolean add(ArrayList<ProductDTO> dtoList) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ArrayList<ProductDTO> dtoList) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
           Connection connection = DBConnection.getInstance().getConnection();
           String SQL = "Delete From Product Where CODE='" + id + "'";
           Statement stm = connection.createStatement();
           int res = stm.executeUpdate(SQL);
           return res > 0;
    }

    @Override
    public ProductDTO search(String CODE) throws Exception {
         Connection connection = DBConnection.getInstance().getConnection();
        String SQL = "Select * From Product Where CODE='" + CODE + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        if (rst.next()) {
            ProductDTO product = new ProductDTO(rst.getString("CODE"), rst.getString("CATID"), rst.getString("BRNID"), rst.getString("BCHID"), rst.getString("SID"), rst.getString("DESCRIPTION"), rst.getBigDecimal("Unit_Price"), rst.getInt("Qtyonhand"),rst.getBytes("prodimage"));
            return product;
        } else {
            return null;
        }
    }

    @Override
    public ArrayList<String> getNames() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProductDTO getAllByNames(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProductDTO getIDFromName(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProductDTO getNameFromID(String id) throws Exception {
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
    public ProductDTO search(String key, String code) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean updateProduct(ProductDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProductDTO searchName(ProductDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
