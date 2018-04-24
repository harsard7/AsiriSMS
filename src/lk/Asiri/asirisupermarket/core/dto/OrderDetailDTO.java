/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.asirisupermarket.core.dto;

import java.math.BigDecimal;

/**
 *
 * @author Hafees
 */
public class OrderDetailDTO extends SuperDTO{
    private String OID;
    private String CODE;
    private int Order_Qty;
    private double Unit_Price;

    /**
     * @return the ODID
     */
    
    public OrderDetailDTO() {
    }

    public OrderDetailDTO(String OID, String CODE, int Order_Qty, double Unit_Price) {
        this.OID = OID;
        this.CODE = CODE;
        this.Order_Qty = Order_Qty;
        this.Unit_Price = Unit_Price;
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
     * @return the CODE
     */
    public String getCODE() {
        return CODE;
    }

    /**
     * @param CODE the CODE to set
     */
    public void setCODE(String CODE) {
        this.CODE = CODE;
    }

    /**
     * @return the Order_Qty
     */
    public int getOrder_Qty() {
        return Order_Qty;
    }

    /**
     * @param Order_Qty the Order_Qty to set
     */
    public void setOrder_Qty(int Order_Qty) {
        this.Order_Qty = Order_Qty;
    }

    /**
     * @return the Unit_Price
     */
    public double getUnit_Price() {
        return Unit_Price;
    }

    /**
     * @param Unit_Price the Unit_Price to set
     */
    public void setUnit_Price(double Unit_Price) {
        this.Unit_Price = Unit_Price;
    }

    
}
