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
public class CategoryDTO extends SuperDTO{
    private  String    CATID ;
    private  String   CAT_NAME; 

    public CategoryDTO(String CATID, String CAT_NAME) {
        this.CATID = CATID;
        this.CAT_NAME = CAT_NAME;
    }

    public CategoryDTO() {
    }

    /**
     * @return the CATID
     */
    public String getCATID() {
        return CATID;
    }

    /**
     * @param CATID the CATID to set
     */
    public void setCATID(String CATID) {
        this.CATID = CATID;
    }

    /**
     * @return the CAT_NAME
     */
    public String getCAT_NAME() {
        return CAT_NAME;
    }

    /**
     * @param CAT_NAME the CAT_NAME to set
     */
    public void setCAT_NAME(String CAT_NAME) {
        this.CAT_NAME = CAT_NAME;
    }
  
}
