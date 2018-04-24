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
public class ProductDTO extends SuperDTO{
    private String CODE;
    private String CATID;
    private String BRNID;
    private String BCHID;
    private String SID;
    private String DESCRIPTION;
    private BigDecimal Unit_Price;
    private int Qty_on_hand;
    private byte[] prodimage;

    public ProductDTO(String CODE, String CATID, String BRNID, String BCHID, String SID, String DESCRIPTION, BigDecimal Unit_Price, int Qty_on_hand,byte[] prodimage) {
        this.CODE = CODE;
        this.CATID = CATID;
        this.BRNID = BRNID;
        this.BCHID = BCHID;
        this.SID = SID;
        this.DESCRIPTION = DESCRIPTION;
        this.Unit_Price = Unit_Price;
        this.Qty_on_hand = Qty_on_hand;
        this.prodimage=prodimage;
    }

    public ProductDTO() {
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
     * @return the BCHID
     */
    public String getBCHID() {
        return BCHID;
    }

    /**
     * @param BCHID the BCHID to set
     */
    public void setBCHID(String BCHID) {
        this.BCHID = BCHID;
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
     * @return the DESCRIPTION
     */
    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    /**
     * @param DESCRIPTION the DESCRIPTION to set
     */
    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    /**
     * @return the Unit_Price
     */
    public BigDecimal getUnit_Price() {
        return Unit_Price;
    }

    /**
     * @param Unit_Price the Unit_Price to set
     */
    public void setUnit_Price(BigDecimal Unit_Price) {
        this.Unit_Price = Unit_Price;
    }

    
    public int getQty_on_hand() {
        return Qty_on_hand;
    }

    public void setQty_on_hand(int Qty_on_hand) {
        this.Qty_on_hand = Qty_on_hand;
    }
    public byte [] getprodimage() {
        return prodimage;
    }

    public void setprodimage(byte[] prodimage) {
        this.prodimage = prodimage;
    }

    
}
