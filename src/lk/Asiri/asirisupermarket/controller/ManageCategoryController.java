/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.asirisupermarket.controller;

import java.util.ArrayList;
import lk.ijse.asirisupermarket.core.dto.CategoryDTO;
import lk.ijse.asirisupermarket.dao.DAOFactory;
import lk.ijse.asirisupermarket.dao.custom.CategoryDAO;

/**
 *
 * @author Hafees
 */
public class ManageCategoryController {
    public static CategoryDAO  categoryDAO=(CategoryDAO)DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CATEGORY);
    
    public boolean add(CategoryDTO dto) throws Exception {
        return categoryDAO.add(dto);
    }

    public boolean add(ArrayList<CategoryDTO> dtoList) throws Exception {
        return categoryDAO.add(dtoList);
    }

    public boolean update(CategoryDTO dto) throws Exception {
        return categoryDAO.update(dto);
    }

    public boolean update(ArrayList<CategoryDTO> dtoList) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean delete(CategoryDTO id) throws Exception {
        return categoryDAO.delete(id);
    }

    public CategoryDTO search(String key) throws Exception {
       return categoryDAO.search(key);
    }
    

    public ArrayList<CategoryDTO> getAll() throws Exception {
        return categoryDAO.getAll();
    }

    public ArrayList<String> getNames() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public CategoryDTO getAllByNames(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public CategoryDTO getIDFromName(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public CategoryDTO getNameFromID(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getIDByName(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean delete(String id) throws Exception {
        return categoryDAO.delete(id);
    }
}
