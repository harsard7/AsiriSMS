/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.asirisupermarket.core.dto;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Hafees
 */
public class EmployeeDTO extends SuperDTO{ 
    private String EID;
    private String Employee_FirstName;
    private String Employee_LastName;
    private String Employee_Gender;
    private String Date_Of_Birth;
    private String Employee_Address;
    private BigDecimal Basic_Salary;
    private String Contact_No;
    private String Employee_Email;
    private String Position;
    private byte[] employeeimage;
    private String empdoj;

    public EmployeeDTO(String EID, String Employee_FirstName, String Employee_LastName, String Employee_Gender, String Date_Of_Birth, String Employee_Address, BigDecimal Basic_Salary, String Contact_No, String Employee_Email, String Position, byte[] employeeimage,String empdoj) {
        this.EID = EID;
        this.Employee_FirstName = Employee_FirstName;
        this.Employee_LastName = Employee_LastName;
        this.Employee_Gender = Employee_Gender;
        this.Date_Of_Birth = Date_Of_Birth;
        this.Employee_Address = Employee_Address;
        this.Basic_Salary = Basic_Salary;
        this.Contact_No = Contact_No;
        this.Employee_Email = Employee_Email;
        this.Position = Position;
        this.employeeimage = employeeimage;
        this.empdoj=empdoj;
    }

    public EmployeeDTO() {
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
     * @return the Employee_FirstName
     */
    public String getEmployee_FirstName() {
        return Employee_FirstName;
    }

    /**
     * @param Employee_FirstName the Employee_FirstName to set
     */
    public void setEmployee_FirstName(String Employee_FirstName) {
        this.Employee_FirstName = Employee_FirstName;
    }

    /**
     * @return the Employee_LastName
     */
    public String getEmployee_LastName() {
        return Employee_LastName;
    }

    /**
     * @param Employee_LastName the Employee_LastName to set
     */
    public void setEmployee_LastName(String Employee_LastName) {
        this.Employee_LastName = Employee_LastName;
    }

    /**
     * @return the Employee_Gender
     */
    public String getEmployee_Gender() {
        return Employee_Gender;
    }

    /**
     * @param Employee_Gender the Employee_Gender to set
     */
    public void setEmployee_Gender(String Employee_Gender) {
        this.Employee_Gender = Employee_Gender;
    }

    /**
     * @return the Date_Of_Birth
     */
    public String getDate_Of_Birth() {
        return Date_Of_Birth;
    }

    /**
     * @param Date_Of_Birth the Date_Of_Birth to set
     */
    public void setDate_Of_Birth(String Date_Of_Birth) {
        this.Date_Of_Birth = Date_Of_Birth;
    }

    /**
     * @return the Employee_Address
     */
    public String getEmployee_Address() {
        return Employee_Address;
    }

    /**
     * @param Employee_Address the Employee_Address to set
     */
    public void setEmployee_Address(String Employee_Address) {
        this.Employee_Address = Employee_Address;
    }

    /**
     * @return the Basic_Salary
     */
    public BigDecimal getBasic_Salary() {
        return Basic_Salary;
    }

    /**
     * @param Basic_Salary the Basic_Salary to set
     */
    public void setBasic_Salary(BigDecimal Basic_Salary) {
        this.Basic_Salary = Basic_Salary;
    }

    /**
     * @return the Contact_No
     */
    public String getContact_No() {
        return Contact_No;
    }

    /**
     * @param Contact_No the Contact_No to set
     */
    public void setContact_No(String Contact_No) {
        this.Contact_No = Contact_No;
    }

    /**
     * @return the Employee_Email
     */
    public String getEmployee_Email() {
        return Employee_Email;
    }

    /**
     * @param Employee_Email the Employee_Email to set
     */
    public void setEmployee_Email(String Employee_Email) {
        this.Employee_Email = Employee_Email;
    }

    /**
     * @return the Position
     */
    public String getPosition() {
        return Position;
    }

    /**
     * @param Position the Position to set
     */
    public void setPosition(String Position) {
        this.Position = Position;
    }

    /**
     * @return the employeeimage
     */
    public byte[] getEmployeeimage() {
        return employeeimage;
    }

    /**
     * @param employeeimage the employeeimage to set
     */
    public void setEmployeeimage(byte[] employeeimage) {
        this.employeeimage = employeeimage;
    }
     public String getempdoj() {
        return empdoj;
    }

    /**
     * @param Date_Of_Birth the Date_Of_Birth to set
     */
    public void setempdoj(String empdoj) {
        this.empdoj = empdoj;
    }
    
}
