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
public class GrnDTO extends SuperDTO{
     private String GRNID;
     private String  GRN_Date;
     private String SID;
     private BigDecimal totalAmount;

    public GrnDTO() {
    }

    public GrnDTO(String GRNID, String GRN_Date, String SID, BigDecimal totalAmount) {
        this.GRNID = GRNID;
        this.GRN_Date = GRN_Date;
        this.SID = SID;
        this.totalAmount = totalAmount;
    }

    /**
     * @return the GRNID
     */
    public String getGRNID() {
        return GRNID;
    }

    /**
     * @param GRNID the GRNID to set
     */
    public void setGRNID(String GRNID) {
        this.GRNID = GRNID;
    }

    /**
     * @return the GRN_Date
     */
    public String getGRN_Date() {
        return GRN_Date;
    }

    /**
     * @param GRN_Date the GRN_Date to set
     */
    public void setGRN_Date(String GRN_Date) {
        this.GRN_Date = GRN_Date;
    }

    /**
     * @return the SID
     */
    public String getSID() {
        return SID;
    }

    /**
     * @param SID the SID to set
     */
    public void setSID(String SID) {
        this.SID = SID;
    }

    /**
     * @return the totalAmount
     */
    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    /**
     * @param totalAmount the totalAmount to set
     */
    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

   
}