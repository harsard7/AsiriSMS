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
public class CustomerDTO extends SuperDTO{
    private  String     CID ;
    private  String	Customer_FirstName; 
    private  String	Customer_LastName; 
    private  String	Customer_Gender ;
    private  String	Customer_Address; 
    private  String	City ;
    private  String	Customer_Email ;
    private  String	ContactNo ;

    public CustomerDTO() {
    }
    

    public CustomerDTO(String CID, String Customer_FirstName, String Customer_LastName, String Customer_Gender, String Customer_Address, String City, String Customer_Email, String ContactNo) {
        this.CID = CID;
        this.Customer_FirstName = Customer_FirstName;
        this.Customer_LastName = Customer_LastName;
        this.Customer_Gender = Customer_Gender;
        this.Customer_Address = Customer_Address;
        this.City = City;
        this.Customer_Email = Customer_Email;
        this.ContactNo = ContactNo;
    }

    public CustomerDTO(String CID) {
        this.CID = CID;
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
     * @return the Customer_FirstName
     */
    public String getCustomer_FirstName() {
        return Customer_FirstName;
    }

    /**
     * @param Customer_FirstName the Customer_FirstName to set
     */
    public void setCustomer_FirstName(String Customer_FirstName) {
        this.Customer_FirstName = Customer_FirstName;
    }

    /**
     * @return the Customer_LastName
     */
    public String getCustomer_LastName() {
        return Customer_LastName;
    }

    /**
     * @param Customer_LastName the Customer_LastName to set
     */
    public void setCustomer_LastName(String Customer_LastName) {
        this.Customer_LastName = Customer_LastName;
    }

    /**
     * @return the Customer_Gender
     */
    public String getCustomer_Gender() {
        return Customer_Gender;
    }

    /**
     * @param Customer_Gender the Customer_Gender to set
     */
    public void setCustomer_Gender(String Customer_Gender) {
        this.Customer_Gender = Customer_Gender;
    }

    /**
     * @return the Customer_Address
     */
    public String getCustomer_Address() {
        return Customer_Address;
    }

    /**
     * @param Customer_Address the Customer_Address to set
     */
    public void setCustomer_Address(String Customer_Address) {
        this.Customer_Address = Customer_Address;
    }

    /**
     * @return the City
     */
    public String getCity() {
        return City;
    }

    /**
     * @param City the City to set
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * @return the Customer_Email
     */
    public String getCustomer_Email() {
        return Customer_Email;
    }

    /**
     * @param Customer_Email the Customer_Email to set
     */
    public void setCustomer_Email(String Customer_Email) {
        this.Customer_Email = Customer_Email;
    }

    /**
     * @return the ContactNo
     */
    public String getContactNo() {
        return ContactNo;
    }

    /**
     * @param ContactNo the ContactNo to set
     */
    public void setContactNo(String ContactNo) {
        this.ContactNo = ContactNo;
    }
}
