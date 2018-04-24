/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.asirisupermarket.controller;

import java.util.ArrayList;
import lk.ijse.asirisupermarket.core.dto.EmployeeDTO;
import lk.ijse.asirisupermarket.dao.DAOFactory;
import lk.ijse.asirisupermarket.dao.custom.EmployeeDAO;

/**
 *
 * @author Hafees
 */
public class ManageEmployeeController {
    public static EmployeeDAO  employeeDAO=(EmployeeDAO)DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.EMPLOYEE);
    
    public boolean add(EmployeeDTO dto) throws Exception {
        return employeeDAO.add(dto);
    }

    public boolean add(ArrayList<EmployeeDTO> dtoList) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean update(EmployeeDTO dto) throws Exception {
        return employeeDAO.update(dto);
    }

    public boolean update(ArrayList<EmployeeDTO> dtoList) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean delete(EmployeeDTO id) throws Exception {
        return employeeDAO.delete(id);
    }

    public EmployeeDTO search(String key) throws Exception {
       return employeeDAO.search(key);
    }

    public ArrayList<EmployeeDTO> getAll() throws Exception {
        return employeeDAO.getAll();
    }

    public ArrayList<String> getNames() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public EmployeeDTO getAllByNames(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public EmployeeDTO getIDFromName(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public EmployeeDTO getNameFromID(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getIDByName(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean delete(String id) throws Exception {
        return employeeDAO.delete(id);
    }
}
