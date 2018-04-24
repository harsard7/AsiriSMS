/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.asirisupermarket.controller;

import java.util.ArrayList;
import lk.ijse.asirisupermarket.core.dto.SupplierDTO;
import lk.ijse.asirisupermarket.dao.DAOFactory;
import lk.ijse.asirisupermarket.dao.custom.SupplierDAO;

/**
 *
 * @author Hafees
 */
public class ManageSupplierController {
    public static SupplierDAO  supplierDAO=(SupplierDAO)DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.SUPPLIER);
    
    public static boolean addSupplier(SupplierDTO supplier) throws  Exception  {
        boolean result = supplierDAO.add(supplier);
        return result;
    }
    public static boolean deleteSupplier(SupplierDTO supplier)throws Exception{
        boolean result = supplierDAO.delete(supplier);
        return result;
    }
    
    public static boolean updateSupplier(SupplierDTO supplier)throws Exception{
        boolean result = supplierDAO.update(supplier);
        return result;
    }
    
    public static SupplierDTO searchSupplier(SupplierDTO supplier) throws Exception{
        SupplierDTO searchedSupplier = supplierDAO.search(supplier);
        return searchedSupplier;
    }
    
    public static ArrayList<SupplierDTO> getAllSuppliers()throws Exception{
        return supplierDAO.getAll();
    }
    
}
