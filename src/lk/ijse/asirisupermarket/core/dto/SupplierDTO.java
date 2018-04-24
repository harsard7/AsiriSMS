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
public class SupplierDTO extends SuperDTO{
    private String SID;
    private String Supplier_Name;
    private String Supplier_Address;
    private String Supplier_City;
    private String Phone_No;
    private String Fax_No;
    private String Supplier_Email;
    private String Webpage;

    public SupplierDTO(String SID, String Supplier_Name, String Supplier_Address, String Supplier_City, String Phone_No, String Fax_No, String Supplier_Email, String Webpage) {
        this.SID = SID;
        this.Supplier_Name = Supplier_Name;
        this.Supplier_Address = Supplier_Address;
        this.Supplier_City = Supplier_City;
        this.Phone_No = Phone_No;
        this.Fax_No = Fax_No;
        this.Supplier_Email = Supplier_Email;
        this.Webpage = Webpage;
    }

    public SupplierDTO() {
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
     * @return the Supplier_Name
     */
    public String getSupplier_Name() {
        return Supplier_Name;
    }

    /**
     * @param Supplier_Name the Supplier_Name to set
     */
    public void setSupplier_Name(String Supplier_Name) {
        this.Supplier_Name = Supplier_Name;
    }

    /**
     * @return the Supplier_Address
     */
    public String getSupplier_Address() {
        return Supplier_Address;
    }

    /**
     * @param Supplier_Address the Supplier_Address to set
     */
    public void setSupplier_Address(String Supplier_Address) {
        this.Supplier_Address = Supplier_Address;
    }

    /**
     * @return the Supplier_City
     */
    public String getSupplier_City() {
        return Supplier_City;
    }

    /**
     * @param Supplier_City the Supplier_City to set
     */
    public void setSupplier_City(String Supplier_City) {
        this.Supplier_City = Supplier_City;
    }

    /**
     * @return the Phone_No
     */
    public String getPhone_No() {
        return Phone_No;
    }

    /**
     * @param Phone_No the Phone_No to set
     */
    public void setPhone_No(String Phone_No) {
        this.Phone_No = Phone_No;
    }

    /**
     * @return the Fax_No
     */
    public String getFax_No() {
        return Fax_No;
    }

    /**
     * @param Fax_No the Fax_No to set
     */
    public void setFax_No(String Fax_No) {
        this.Fax_No = Fax_No;
    }

    /**
     * @return the Supplier_Email
     */
    public String getSupplier_Email() {
        return Supplier_Email;
    }

    /**
     * @param Supplier_Email the Supplier_Email to set
     */
    public void setSupplier_Email(String Supplier_Email) {
        this.Supplier_Email = Supplier_Email;
    }

    /**
     * @return the Webpage
     */
    public String getWebpage() {
        return Webpage;
    }

    /**
     * @param Webpage the Webpage to set
     */
    public void setWebpage(String Webpage) {
        this.Webpage = Webpage;
    }
    
    
}
