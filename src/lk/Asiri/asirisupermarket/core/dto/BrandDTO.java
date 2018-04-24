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
public class BrandDTO extends SuperDTO{
   private String BRNID;
   private String BRN_NAME;

    public BrandDTO() {
    }

    public BrandDTO(String BRNID, String BRN_NAME) {
        this.BRNID = BRNID;
        this.BRN_NAME = BRN_NAME;
    }

    /**
     * @return the BRNID
     */
    public String getBRNID() {
        return BRNID;
    }

    /**
     * @param BRNID the BRNID to set
     */
    public void setBRNID(String BRNID) {
        this.BRNID = BRNID;
    }

    /**
     * @return the BRN_NAME
     */
    public String getBRN_NAME() {
        return BRN_NAME;
    }

    /**
     * @param BRN_NAME the BRN_NAME to set
     */
    public void setBRN_NAME(String BRN_NAME) {
        this.BRN_NAME = BRN_NAME;
    }
    
}
