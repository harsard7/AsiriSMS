/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.asirisupermarket.controller;

import java.sql.Connection;
import java.util.ArrayList;
import lk.ijse.asirisupermarket.core.dto.BatchDTO;
import lk.ijse.asirisupermarket.core.dto.GrnDTO;
import lk.ijse.asirisupermarket.core.dto.SupplierDTO;
import lk.ijse.asirisupermarket.dao.DAOFactory;
import lk.ijse.asirisupermarket.dao.custom.BatchDAO;
import lk.ijse.asirisupermarket.dao.custom.GrnDAO;
import lk.ijse.asirisupermarket.dao.custom.SupplierDAO;
import lk.ijse.asirisupermarket.dao.db.DBConnection;

/**
 *
 * @author Hafees
 */
public class ManageBatchController {
    
   //Connection  connection=DBConnection.getInstance().getConnection();
public static BatchDAO  batchDAO=(BatchDAO)DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.BATCH);
public  static SupplierDAO supplierDAO=(SupplierDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SUPPLIER);
public static  GrnDAO grnDAO=(GrnDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.GRN);
   
 
    public static boolean add(SupplierDTO supplier,GrnDTO grn,BatchDTO batch) throws Exception {
         Connection  connection=DBConnection.getInstance().getConnection();
        try{
         connection.setAutoCommit(false);
        
         boolean isAddedSupplier=supplierDAO.add(supplier);
            if(isAddedSupplier){
                 boolean isAddedgrn=grnDAO.add(grn);
            if(isAddedgrn){
                 boolean isAddedBatch=batchDAO.add(batch);
                    if (isAddedBatch){
                    connection.commit();
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
    }finally{
        connection.setAutoCommit(true);
        }
}
    public static boolean add(ArrayList<BatchDTO> dtoList) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public  static boolean update(BatchDTO dto) throws Exception {
        return batchDAO.update(dto);
    }

    public   static  boolean update(ArrayList<BatchDTO> dtoList) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static boolean delete(BatchDTO id) throws Exception {
        return batchDAO.delete(id);
    }

    public static BatchDTO search(String key) throws Exception {
       return batchDAO.search(key);
    }

    public static ArrayList<BatchDTO> getAll() throws Exception {
        return batchDAO.getAll();
    }

    public static ArrayList<String> getNames() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static BatchDTO getAllByNames(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static BatchDTO getIDFromName(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static BatchDTO getNameFromID(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static String getIDByName(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static boolean delete(String id) throws Exception {
        return batchDAO.delete(id);
    }
    
}
