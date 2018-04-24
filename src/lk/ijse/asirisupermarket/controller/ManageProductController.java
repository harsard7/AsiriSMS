/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.asirisupermarket.controller;

import java.sql.Connection;
import java.util.ArrayList;
import static lk.ijse.asirisupermarket.controller.ManageProductController.categoryDAO;
import lk.ijse.asirisupermarket.core.dto.BatchDTO;
import lk.ijse.asirisupermarket.core.dto.BrandDTO;
import lk.ijse.asirisupermarket.core.dto.CategoryDTO;
import lk.ijse.asirisupermarket.core.dto.ProductDTO;
import lk.ijse.asirisupermarket.core.dto.SupplierDTO;
import lk.ijse.asirisupermarket.dao.DAOFactory;
import lk.ijse.asirisupermarket.dao.custom.BatchDAO;
import lk.ijse.asirisupermarket.dao.custom.BrandDAO;
import lk.ijse.asirisupermarket.dao.custom.CategoryDAO;
import lk.ijse.asirisupermarket.dao.custom.ProductDAO;
import lk.ijse.asirisupermarket.dao.custom.SupplierDAO;
import lk.ijse.asirisupermarket.dao.db.DBConnection;

/**
 *
 * @author Hafees
 */
public class ManageProductController {
    //Connection  connection=DBConnection.getInstance().getConnection();
    
    public static CategoryDAO  categoryDAO=(CategoryDAO)DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CATEGORY);
    public static BrandDAO  brandDAO=(BrandDAO)DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.BRAND);
    public  static BatchDAO batchDAO=(BatchDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.BATCH);
    public  static SupplierDAO supplierDAO=(SupplierDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SUPPLIER);
    public static ProductDAO  productDAO=(ProductDAO )DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PRODUCT);
    
    public static boolean add(CategoryDTO category,BrandDTO brand, BatchDTO batch, SupplierDTO supplier,ProductDTO product) throws Exception {
       //Connection connection=null;
        Connection  connection=DBConnection.getInstance().getConnection();
        try{
        connection.setAutoCommit(false);
            System.out.println("prod tran");
         boolean isAddedcategory=categoryDAO.add(category);
            if(isAddedcategory){
                 boolean isAddedbrand=brandDAO.add(brand);
                    if (isAddedbrand){
                         boolean isAddedbatch=batchDAO.add(batch);
                             if (isAddedbatch){
                                 boolean isAddedsupplier=supplierDAO.add(supplier);
                                    if (isAddedsupplier){
                                        boolean isAddedproduct=productDAO.add(product);
                                             if (isAddedproduct){
                                                 connection.commit();
                                                 // connection.rollback();
                                                     return true;
                                                }
                                     connection.rollback();
                                        return false;
                                    }
                                    connection.rollback();
                                     return false;
                               }
                             connection.rollback();
                            return false;
                        }
                     connection.rollback();
                     return false;
            }
            connection.rollback();
             return false;
    }finally{
    connection.setAutoCommit(true);
     return true;
    }
    }
    public boolean add(ArrayList<ProductDTO> dtoList) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean update(ProductDTO dto) throws Exception {
        return productDAO.update(dto);
    }

    public boolean update(ArrayList<ProductDTO> dtoList) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean delete(ProductDTO id) throws Exception {
        return productDAO.delete(id);
    }

    public ProductDTO search(String key) throws Exception {
       return productDAO.search(key);
    }

    public ArrayList<ProductDTO> getAll() throws Exception {
        return productDAO.getAll();
    }

    public ArrayList<String> getNames() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ProductDTO getAllByNames(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ProductDTO getIDFromName(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ProductDTO getNameFromID(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getIDByName(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean delete(String id) throws Exception {
        return productDAO.delete(id);
    }
    
}
