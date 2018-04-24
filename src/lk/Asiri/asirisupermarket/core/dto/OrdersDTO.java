/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.asirisupermarket.core.dto;

import java.util.Date;

/**
 *
 * @author Hafees
 */
public class OrdersDTO extends SuperDTO{
    private String OID;
    private String CID;
    private String EID;
    private String order_Date;

    public OrdersDTO() {
    }

    public OrdersDTO(String OID, String CID, String EID, String order_Date) {
        this.OID = OID;
        this.CID = CID;
        this.EID = EID;
        this.order_Date = order_Date;
    }

    public OrdersDTO(String text, Date parseDate, String toString) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the OID
     */
    public String getOID() {
        return OID;
    }

    /**
     * @param OID the OID to set
     */
    public void setOID(String OID) {
        this.OID = OID;
    }

    /**
     * @return the CID
     */
    public String getCID() {
        return CID;
    }

    /**
     * @param CID the CID to set
     */
    public void setCID(String CID) {
        this.CID = CID;
    }

    /**
     * @return the EID
     */
    public String getEID() {
        return EID;
    }

    /**
     * @param EID the EID to set
     */
    public void setEID(String EID) {
        this.EID = EID;
    }

    /**
     * @return the order_Date
     */
    public String getOrder_Date() {
        return order_Date;
    }

    /**
     * @param order_Date the order_Date to set
     */
    public void setOrder_Date(String order_Date) {
        this.order_Date = order_Date;
    }

   

    
    
}
