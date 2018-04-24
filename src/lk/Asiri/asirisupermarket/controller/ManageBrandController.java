/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.asirisupermarket.controller;

import java.util.ArrayList;
import lk.ijse.asirisupermarket.core.dto.BrandDTO;
import lk.ijse.asirisupermarket.dao.DAOFactory;
import lk.ijse.asirisupermarket.dao.custom.BrandDAO;

/**
 *
 * @author Hafees
 */
public class ManageBrandController {
    public static BrandDAO  brandDAO=(BrandDAO)DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.BRAND);
    
    public boolean add(BrandDTO dto) throws Exception {
        return brandDAO.add(dto);
    }

    public boolean add(ArrayList<BrandDTO> dtoList) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean update(BrandDTO dto) throws Exception {
        return brandDAO.update(dto);
    }

    public boolean update(ArrayList<BrandDTO> dtoList) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean delete(BrandDTO id) throws Exception {
        return brandDAO.delete(id);
    }

    public BrandDTO search(String key) throws Exception {
       return brandDAO.search(key);
    }

    public ArrayList<BrandDTO> getAll() throws Exception {
        return brandDAO.getAll();
    }

    public ArrayList<String> getNames() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public BrandDTO getAllByNames(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public BrandDTO getIDFromName(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public BrandDTO getNameFromID(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getIDByName(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean delete(String id) throws Exception {
        return brandDAO.delete(id);
    }
    
}
