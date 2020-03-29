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
public class Student extends Person{
      private String department;
   public Student(){
       
   }
   public Student(String first_name,String last_name,String department){
       super(first_name, last_name);
       this.department=department;
       
   }
  public String getDepartment() {
        return department;
    }

    /**
     * @param hire_date the hire_date to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return the hireDate
     */
 
    
}
