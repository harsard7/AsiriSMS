/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.asirisupermarket.core.dto;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Hafees
 */
public class PaymentDTO extends SuperDTO{

    

    /**
     * @return the orders
     */
   
    private String PID;
    private String OID;
    private String CID;
    private String EID ;
    private String Payment_DATE;
    private double Discount;
    private double total_Amount;

    public PaymentDTO(String PID, String OID, String CID, String EID, String Payment_DATE, double Discount, double total_Amount) {
        this.PID = PID;
        this.OID = OID;
        this.CID = CID;
        this.EID = EID;
        this.Payment_DATE = Payment_DATE;
        this.Discount = Discount;
        this.total_Amount = total_Amount;
    }

   

    public PaymentDTO() {
    }

    /**
     * @return the PID
     */
    public String getPID() {
        return PID;
    }

    /**
     * @param PID the PID to set
     */
    public void setPID(String PID) {
        this.PID = PID;
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
     * @return the Payment_DATE
     */
    public String getPayment_DATE() {
        return Payment_DATE;
    }

    /**
     * @param Payment_DATE the Payment_DATE to set
     */
    public void setPayment_DATE(String Payment_DATE) {
        this.Payment_DATE = Payment_DATE;
    }

    /**
     * @return the Discount
     */
    public double getDiscount() {
        return Discount;
    }

    /**
     * @param Discount the Discount to set
     */
    public void setDiscount(double Discount) {
        this.Discount = Discount;
    }

    /**
     * @return the total_Amount
     */
    public double getTotal_Amount() {
        return total_Amount;
    }

    /**
     * @param total_Amount the total_Amount to set
     */
    public void setTotal_Amount(double total_Amount) {
        this.total_Amount = total_Amount;
    }

   
    
}
