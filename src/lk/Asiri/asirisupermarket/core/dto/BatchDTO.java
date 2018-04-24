/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.asirisupermarket.core.dto;

/**
 *
 * @author Hafees
 */
public class BatchDTO extends SuperDTO{
        private String BID;
        private String GRNID;
        private String SID;
        private String Date;

    public BatchDTO(String BID,String GRNID, String SID, String Date) {
        this.BID = BID;
        this.GRNID=GRNID;
        this.SID = SID;
        this.Date = Date;
        
    }

    public BatchDTO() {
    }

    /**
     * @return the BID
     */
    public String getBID() {
        return BID;
    }

    /**
     * @param BID the BID to set
     */
    public void setBID(String BID) {
        this.BID = BID;
    }
    
     public String getGRNID() {
        return GRNID;
    }

    /**
     * @param BID the BID to set
     */
    public void setGRNID(String GRNID) {
        this.GRNID = GRNID;
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
     * @return the Date
     */
    public String getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(String Date) {
        this.Date = Date;
    }
}
