        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.asirisupermarket.controller;

import java.util.ArrayList;
import lk.ijse.asirisupermarket.core.dto.CustomerDTO;
import lk.ijse.asirisupermarket.dao.DAOFactory;
import lk.ijse.asirisupermarket.dao.custom.CustomerDAO;

/**
 *
 * @author Hafees
 */
public class ManageCustomerController {
    public static CustomerDAO  customerDAO=(CustomerDAO)DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMER);
    
    public boolean add(CustomerDTO dto) throws Exception {
        return customerDAO.add(dto);
    }

    public boolean add(ArrayList<CustomerDTO> dtoList) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean update(CustomerDTO dto) throws Exception {
        return customerDAO.update(dto);
    }

    public boolean update(ArrayList<CustomerDTO> dtoList) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean delete(CustomerDTO id) throws Exception {
        return customerDAO.delete(id);
    }

    public CustomerDTO search(String key) throws Exception {
       return customerDAO.search(key);
    }

    public ArrayList<CustomerDTO> getAll() throws Exception {
        return customerDAO.getAll();
    }

    public ArrayList<String> getNames() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public CustomerDTO getAllByNames(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public CustomerDTO getIDFromName(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public CustomerDTO getNameFromID(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getIDByName(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean delete(String id) throws Exception {
        return customerDAO.delete(id);
    }
    
}
