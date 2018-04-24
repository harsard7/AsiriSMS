/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.asirisupermarket.controller;

import java.util.ArrayList;
import lk.ijse.asirisupermarket.core.dto.GrnDTO;
import lk.ijse.asirisupermarket.dao.DAOFactory;
import lk.ijse.asirisupermarket.dao.custom.GrnDAO;

/**
 *
 * @author Hafees
 */
public class ManageGRNController {
    public static GrnDAO  grnDAO=(GrnDAO)DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.GRN);
    
    public boolean add(GrnDTO dto) throws Exception {
        return grnDAO.add(dto);
    }

    public boolean add(ArrayList<GrnDTO> dtoList) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean update(GrnDTO dto) throws Exception {
        return grnDAO.update(dto);
    }

    public boolean update(ArrayList<GrnDTO> dtoList) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean delete(GrnDTO id) throws Exception {
        return grnDAO.delete(id);
    }

    public GrnDTO search(String key) throws Exception {
       return grnDAO.search(key);
    }

    public ArrayList<GrnDTO> getAll() throws Exception {
        return grnDAO.getAll();
    }

    public ArrayList<String> getNames() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public GrnDTO getAllByNames(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public GrnDTO getIDFromName(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public GrnDTO getNameFromID(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getIDByName(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean delete(String id) throws Exception {
        return grnDAO.delete(id);
    }
}
