/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.asirisupermarket.dao;


import lk.ijse.asirisupermarket.dao.custom.impl.BatchDAOImpl;
import lk.ijse.asirisupermarket.dao.custom.impl.BrandDAOImpl;
import lk.ijse.asirisupermarket.dao.custom.impl.CategoryDAOImpl;
import lk.ijse.asirisupermarket.dao.custom.impl.CustomerDAOImpl;
import lk.ijse.asirisupermarket.dao.custom.impl.EmployeeDAOImpl;
import lk.ijse.asirisupermarket.dao.custom.impl.GrnDAOImpl;
import lk.ijse.asirisupermarket.dao.custom.impl.OrderDetailDAOImpl;
import lk.ijse.asirisupermarket.dao.custom.impl.OrdersDAOImpl;
import lk.ijse.asirisupermarket.dao.custom.impl.PaymentDAOImpl;
import lk.ijse.asirisupermarket.dao.custom.impl.ProductDAOImpl;
import lk.ijse.asirisupermarket.dao.custom.impl.QueryDAOImpl;
import lk.ijse.asirisupermarket.dao.custom.impl.SupplierDAOImpl;

/**
 *
 * @author Hafees
 */
public class DAOFactory {
    public enum DAOTypes{
        CUSTOMER,BATCH,BRAND,CATEGORY,EMPLOYEE,GRN,ORDERDETAIL,ORDERS,PAYMENT,PRODUCT,SUPPLIER,QUERY
    }
    private static DAOFactory daoFactory;

    private DAOFactory() {
    }
    public static DAOFactory  getInstance(){
        if(daoFactory==null){
            daoFactory=new DAOFactory();
        }
        return daoFactory;
    }
    public SuperDAO getDAO(DAOTypes daoType){
       switch(daoType){
            case CUSTOMER:
                return new CustomerDAOImpl();
            case PRODUCT:
                return new ProductDAOImpl();
            case SUPPLIER:
                return new SupplierDAOImpl();
            case BATCH:
                return new BatchDAOImpl();
            case PAYMENT:
                return new PaymentDAOImpl();
             case BRAND:
                return new BrandDAOImpl();
            case EMPLOYEE:
                return new EmployeeDAOImpl();
            case GRN:
                return new GrnDAOImpl();
            case ORDERDETAIL:
                return new OrderDetailDAOImpl();
            case ORDERS:
                return new OrdersDAOImpl();
            case CATEGORY:
                return new CategoryDAOImpl();
            case QUERY:
                return new QueryDAOImpl();
            default:
                return null;
                 
              
              
        }
    }
}
