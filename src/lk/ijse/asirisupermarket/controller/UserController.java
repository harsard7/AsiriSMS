/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.asirisupermarket.controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import lk.ijse.asirisupermarket.core.dto.UserDTO;
import lk.ijse.asirisupermarket.dao.db.DBConnection;

/**
 *
 * @author Hafees
 */
public class UserController {
    public static int addUser(UserDTO user) throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO User VALUES(?, password(?))";
        
    //PreparedStatement stm = DBConnection.getDBConnection().getConnection().prepareStatement(query);
    PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement(query);
        stm.setObject(1, user.getUsername());
        stm.setObject(2, user.getPassword());
        return stm.executeUpdate();
    }
    
    public static boolean login(UserDTO user) throws SQLException, ClassNotFoundException {
        String query = "SELECT * FROM User WHERE username = ? AND password = password(?)";
         PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement(query);
        //PreparedStatement stm = DBConnection.getDBConnection().getConnection().prepareStatement(query);
        stm.setObject(1, user.getUsername());
        stm.setObject(2, user.getPassword());
        ResultSet rst = stm.executeQuery();
        return rst.next();
    }
}
