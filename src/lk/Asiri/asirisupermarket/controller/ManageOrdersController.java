/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.asirisupermarket.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import static lk.ijse.asirisupermarket.controller.ManagePaymentController.ordersDAO;
import lk.ijse.asirisupermarket.core.dto.OrderDetailDTO;
import lk.ijse.asirisupermarket.core.dto.OrdersDTO;
import lk.ijse.asirisupermarket.core.dto.ProductDTO;
import lk.ijse.asirisupermarket.dao.DAOFactory;
import lk.ijse.asirisupermarket.dao.custom.OrderDetailDAO;
import lk.ijse.asirisupermarket.dao.custom.OrdersDAO;
import lk.ijse.asirisupermarket.dao.custom.ProductDAO;
import lk.ijse.asirisupermarket.dao.db.DBConnection;

/**
 *
 * @author Hafees
 */
public class ManageOrdersController {
   
     public  static OrdersDAO  ordersDAO=(OrdersDAO)DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ORDERS);
    
 
   public static boolean ManageOrdersController(OrdersDTO order,
            ArrayList<OrderDetailDTO> alOrderDetails) throws Exception {

        Connection connection = DBConnection.getInstance().getConnection();

        try {
            connection.setAutoCommit(false);
             
            // OrdersDAO  ordersDAO=(OrdersDAO)DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ORDERS);
            boolean result = ordersDAO.add(order);

            if (!result) {
                connection.rollback();
                return false;
            }

            OrderDetailDAO orderDetailDAO = (OrderDetailDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ORDERDETAIL);
            ProductDAO productDAO = (ProductDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PRODUCT);
           
            for (OrderDetailDTO orderDetail : alOrderDetails) {
                result = orderDetailDAO.add(orderDetail);

                if (!result) {
                    connection.rollback();
                    return false;
                }

                String productCode = orderDetail.getCODE();
                ProductDTO product = new ProductDTO();
                product.setCODE(productCode);
                ProductDTO searchedItem = productDAO.search(product);
                int qtyOnHand = searchedItem.getQty_on_hand();
                qtyOnHand -= orderDetail.getOrder_Qty();
                searchedItem.setQty_on_hand(qtyOnHand);
                result = productDAO.update(searchedItem);

                if (!result) {
                    connection.rollback();
                    return false;
                }
//                 PaymentDAO paymentDAO=(PaymentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.PAYMENT);
//                 
//                 result = paymentDAO.add(payment);
//
//            if (!result) {
//                connection.rollback();
//                return false;
//            }

            }

            connection.commit();
            return true;

        } catch (SQLException ex) {
            connection.rollback();
            ex.printStackTrace();
            return false;
        } finally {
            connection.setAutoCommit(true);
        }
    }
    //public static CustomerDAO  customerDAO=(CustomerDAO)DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.CUSTOMER);
  //  public  static EmployeeDAO employeeDAO=(EmployeeDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.EMPLOYEE);
    
    
        
    /*public static boolean  add(EmployeeDTO employee,CustomerDTO customer,OrdersDTO order) throws Exception {
        
        
        
        
        
        Connection  connection=DBConnection.getInstance().getConnection();
        try{
            
        connection.setAutoCommit(false);
        
         boolean isAddedEmployee=employeeDAO.add(employee);
            if(isAddedEmployee){
                 boolean isAddedCustomer=customerDAO.add(customer);
                    if (isAddedCustomer){
                         boolean isAddedOrder=ordersDAO.add(order);
                    if (isAddedOrder){
                    connection.commit();
                    return true;
                 }
                 connection.rollback();
        return false;   
            }
            connection.rollback();
        return false;
          }
            connection.rollback();
        return false;
    }finally{
        connection.setAutoCommit(true);
        }
    }*/

   

    public  static boolean update(OrdersDTO dto) throws Exception {
        return ordersDAO.update(dto);
    }

    public static boolean update(ArrayList<OrdersDTO> dtoList) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static boolean delete(OrdersDTO id) throws Exception {
        return ordersDAO.delete(id);
    }

    public  OrdersDTO search(String key) throws Exception {
       return ordersDAO.search(key);
    }

    public  static  ArrayList<OrdersDTO> getAll() throws Exception {
        return ordersDAO.getAll();
    }

    public static  ArrayList<String> getNames() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static OrdersDTO getAllByNames(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static OrdersDTO getIDFromName(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static OrdersDTO getNameFromID(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static String getIDByName(String name) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static boolean delete(String id) throws Exception {
        return ordersDAO.delete(id);
    }
    
}
