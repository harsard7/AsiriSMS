/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.asirisupermarket.dao;

import java.util.ArrayList;
import lk.ijse.asirisupermarket.core.dto.SuperDTO;

/**
 *
 * @author Hafees
 */
public interface SuperDAO <T extends SuperDTO> {
    public boolean add(T dto)throws Exception;
    public boolean update(T dto)throws Exception;
    public boolean delete(T dto)throws Exception;
    public T search(T dto)throws Exception;
    public ArrayList<T> getAll()throws Exception; 
    public boolean add(ArrayList<T> dtoList)throws Exception;
    public boolean update(ArrayList<T> dtoList)throws Exception;
    public boolean delete(String id)throws Exception;
    public boolean delete(String id,String code)throws Exception;
    public T search(String key)throws Exception;
    public T searchName(T dto)throws Exception;
     public T search(String key,String code)throws Exception;
    public ArrayList<String> getNames()throws Exception;
    public T getAllByNames(String name)throws Exception;
    public T getIDFromName(String name)throws Exception;
    public T getNameFromID(String id)throws Exception;
    public String getIDByName(String name)throws Exception;
}
