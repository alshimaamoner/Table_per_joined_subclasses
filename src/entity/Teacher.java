/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class Teacher extends Person{
  
       private Date hireDate;
   public Teacher(){
       
   }
   public Teacher(String first_name,String last_name,Date hire_date){
       super(first_name, last_name);
      
        this.hireDate=hire_date;
       
   }

    /**
     * @return the hire_date
     */
     public Date getHireDate() {
        return hireDate;
    }

    /**
     * @param hireDate the hireDate to set
     */
    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

     
}
