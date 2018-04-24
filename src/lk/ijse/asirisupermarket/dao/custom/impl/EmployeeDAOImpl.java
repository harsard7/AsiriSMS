/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.asirisupermarket.dao.custom.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.asirisupermarket.core.dto.EmployeeDTO;
import lk.ijse.asirisupermarket.dao.custom.EmployeeDAO;
import lk.ijse.asirisupermarket.dao.db.DBConnection;


public class EmployeeDAOImpl implements EmployeeDAO {
 
    
    @Override
    public boolean add(EmployeeDTO employee) throws Exception {
       Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO Employee VALUES (?,?,?,?,?,?,?,?,?,?,?,?);";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, employee.getEID());
        pstm.setObject(2, employee.getEmployee_FirstName());
        pstm.setObject(3, employee.getEmployee_LastName());
        pstm.setObject(4, employee.getEmployee_Gender());
        pstm.setObject(5, employee.getDate_Of_Birth());
        pstm.setObject(6, employee.getEmployee_Address());
        pstm.setObject(7, employee.getBasic_Salary());
        pstm.setObject(8, employee.getContact_No());
        pstm.setObject(9, employee.getEmployee_Email());
        pstm.setObject(10, employee.getPosition());
        pstm.setObject(11, employee.getEmployeeimage());
        pstm.setObject(12, employee.getempdoj());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean update(EmployeeDTO employee) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "UPDATE Employee SET Employee_FirstName=?, Employee_LastName=?, Employee_Gender=?,Date_Of_Birth=?,Employee_Address=?,Basic_Salary=?,Contact_No=?,Employee_Email=?,Position=?,empimage=?,empdoj=? WHERE EID=?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, employee.getEmployee_FirstName());
        pstm.setObject(2, employee.getEmployee_LastName());
        pstm.setObject(3, employee.getEmployee_Gender());
        pstm.setObject(4, employee.getDate_Of_Birth());
        pstm.setObject(5, employee.getEmployee_Address());
        pstm.setObject(6, employee.getBasic_Salary());
        pstm.setObject(7, employee.getContact_No());
        pstm.setObject(8, employee.getEmployee_Email());
        pstm.setObject(9, employee.getPosition());
        pstm.setObject(10, employee.getEmployeeimage());
        pstm.setObject(11, employee.getempdoj());
        pstm.setObject(12, employee.getEID()); 
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean delete(EmployeeDTO employee) throws Exception {
       Connection connection = DBConnection.getInstance().getConnection();
        String sql = "DELETE FROM employee WHERE EID = ?";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, employee.getEID());
        int affectedRows = pstm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public EmployeeDTO search(EmployeeDTO employee) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM employee WHERE EID='" + employee.getEID()+ "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        if (rst.next()) {
            return new EmployeeDTO(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getBigDecimal(7),
                    rst.getString(8),
                    rst.getString(9),
                    rst.getString(10),
                    rst.getBytes(11),
                    rst.getString(12));
        }

        return null;
    }

    @Override
    public ArrayList<EmployeeDTO> getAll() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM Employee";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(sql);

        ArrayList<EmployeeDTO> alEmployees = null;

        while (rst.next()) {
            if (alEmployees == null) {
                alEmployees = new ArrayList<>();
            }

            alEmployees.add(new EmployeeDTO(
                   rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6),
                    rst.getBigDecimal(7),
                    rst.getString(8),
                    rst.getString(9),
                    rst.getString(10),
                    rst.getBytes(11),
                    rst.getString(12)));

        }

        return alEmployees;
    
    }

    @Override
    public boolean add(ArrayList<EmployeeDTO> dtoList) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ArrayList<EmployeeDTO> dtoList) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String SQL = "Delete From Employee Where EID='" + id + "'";
        Statement stm = connection.createStatement();
        int res = stm.executeUpdate(SQL);
        return res > 0;
    }

    @Override
    public EmployeeDTO search(String EID) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        String SQL = "Select * From Employee Where EID='" + EID + "'";
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        if (rst.next()) {
            EmployeeDTO employee = new EmployeeDTO(rst.getString("EID"), rst.getString("Employee_FirstName"), rst.getString("Employee_LastName"), rst.getString("Employee_Gender"), rst.getString("Date_Of_Birth"), rst.getString("Employee_Address"), rst.getBigDecimal("Basic_Salary"), rst.getString("Contact_No"), rst.getString("Employee_Email"),rst.getString("Position"),rst.getBytes("empimage"),rst.getString("empdoj"));
            return employee;
        } else {
            return null;
        }
    }

    @Override
    public ArrayList<String> getNames() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EmployeeDTO getAllByNames(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EmployeeDTO getIDFromName(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EmployeeDTO getNameFromID(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getIDByName(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id, String code) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EmployeeDTO search(String key, String code) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EmployeeDTO searchName(EmployeeDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
