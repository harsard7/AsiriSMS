/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.asirisupermarket.controller;

import java.util.ArrayList;
import lk.ijse.asirisupermarket.core.dto.OrderDetailDTO;
import lk.ijse.asirisupermarket.dao.DAOFactory;
import lk.ijse.asirisupermarket.dao.custom.OrderDetailDAO;

/**
 *
 * @author Hafees
 */
public class ManageOrderDetailController {
    public static OrderDetailDAO  orderDetailDAO=(OrderDetailDAO)DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ORDERDETAIL);
    
    public static boolean add(OrderDetailDTO dto) throws Exception {
        return orderDetailDAO.add(dto);
    }

    public static boolean add(ArrayList<OrderDetailDTO> dtoList) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static boolean update(OrderDetailDTO dto) throws Exception {
        return orderDetailDAO.update(dto);
    }

    public static boolean update(ArrayList<OrderDetailDTO> dtoList) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static boolean delete(OrderDetailDTO id) throws Exception {
        return orderDetailDAO.delete(id);
    }

    public OrderDetailDTO search(String key ,String code) throws Exception {
       return orderDetailDAO.search(key);
    }
    public OrderDetailDTO search(String key ) throws Exception {
       return orderDetailDAO.search(key);
    }

    public ArrayList<OrderDetailDTO> getAll() throws Exception {
        return orderDetailDAO.getAll();
    }

    public ArrayList<String> getNames() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public OrderDetailDTO getAllByNames(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public OrderDetailDTO getIDFromName(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public OrderDetailDTO getNameFromID(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getIDByName(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean delete(String id) throws Exception {
        return orderDetailDAO.delete(id);
    }
     public boolean delete(String id,String code) throws Exception {
        return orderDetailDAO.delete(id);
    }
}