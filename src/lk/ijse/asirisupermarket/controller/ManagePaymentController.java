/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.asirisupermarket.controller;

import java.sql.Connection;
import java.util.ArrayList;
import lk.ijse.asirisupermarket.core.dto.CustomerDTO;
import lk.ijse.asirisupermarket.core.dto.EmployeeDTO;
import lk.ijse.asirisupermarket.core.dto.OrdersDTO;
import lk.ijse.asirisupermarket.core.dto.PaymentDTO;
import lk.ijse.asirisupermarket.dao.DAOFactory;
import lk.ijse.asirisupermarket.dao.custom.CustomerDAO;
import lk.ijse.asirisupermarket.dao.custom.EmployeeDAO;
import lk.ijse.asirisupermarket.dao.custom.OrdersDAO;
import lk.ijse.asirisupermarket.dao.custom.PaymentDAO;
import lk.ijse.asirisupermarket.dao.db.DBConnection;

/**
 *
 * @author Hafees
 */
public class ManagePaymentController {

    public static PaymentDAO paymentDAO = (PaymentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PAYMENT);
    public static EmployeeDAO employeeDAO = (EmployeeDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.EMPLOYEE);
    public static CustomerDAO customerDAO = (CustomerDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMER);
    public static OrdersDAO ordersDAO = (OrdersDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ORDERS);
     
        
    public static boolean add( EmployeeDTO employee,CustomerDTO customer,OrdersDTO order,PaymentDTO payment) throws Exception {
        
       Connection connection =DBConnection.getInstance().getConnection();
       try{
        connection.setAutoCommit(false);
        
            boolean isAddedemployee = employeeDAO.add(employee);
            if (isAddedemployee) {
                System.out.println("1");
                boolean isAddedcustomer = customerDAO.add(customer);
                if (isAddedcustomer) {
                    System.out.println("2");
                    boolean isAddedorder = ordersDAO.add(order);
                    if (isAddedorder) {
                        System.out.println("3");
                        boolean isAddedpayment = paymentDAO.add(payment);
                        if (isAddedpayment) {
                            System.out.println("4");
                            connection.commit();
                            return true;
                        }

                    }

                }

            }
            connection.rollback();
            return false;
        } finally {

            connection.setAutoCommit(true);

        }
    }

    public static boolean add(ArrayList<PaymentDTO> dtoList) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static boolean update(PaymentDTO dto) throws Exception {
        return paymentDAO.update(dto);
    }

    public static boolean update(ArrayList<PaymentDTO> dtoList) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static boolean delete(PaymentDTO id) throws Exception {
        return paymentDAO.delete(id);
    }

    public PaymentDTO search(String key) throws Exception {
        return paymentDAO.search(key);
    }

    public static ArrayList<PaymentDTO> getAll() throws Exception {
        return paymentDAO.getAll();
    }

    public ArrayList<String> getNames() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public PaymentDTO getAllByNames(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public PaymentDTO getIDFromName(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public PaymentDTO getNameFromID(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getIDByName(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean delete(String id) throws Exception {
        return paymentDAO.delete(id);
    }
}
