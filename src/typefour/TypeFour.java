/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typefour;

import entity.Person;
import entity.Student;
import entity.Teacher;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author DELL
 */
public class TypeFour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         SessionFactory sessionFactory = new Configuration() .configure("hibernate.cfg.xml").buildSessionFactory();
          Session session = sessionFactory.openSession();//"shimaa", "elnady", new Date()
          ///Insert 
        Person person=new Person("shimaa","elnady");
      
        session.beginTransaction();
        session.persist(person);
        session.getTransaction().commit();
        System.out.println("person Done");
       
        Student user=new Student();
        user.setFirstName("shimaa");
        user.setLastName("elnady");
        user.setDepartment("cs");
        session.beginTransaction();
        session.persist(user);
        session.getTransaction().commit();
        System.out.println("user Done");
        Teacher teacher=new Teacher();
        teacher.setFirstName("ahmed");
        teacher.setLastName("ahmed");
        teacher.setHireDate(new Date());
        session.beginTransaction();
        session.persist(teacher);
        session.getTransaction().commit();
        System.out.println("user Done");
        
        //Get Operation
        Student getStudent=(Student) session.get(Student.class, 2);
        System.out.println("First Name of Student :"+getStudent.getFirstName());
        //Update Operation
        getStudent.setFirstName("Alyaa");
          session.update(getStudent);
        System.out.println("First Name of Student :"+getStudent.getFirstName());
        //Merge Operation
        session.evict(getStudent);
       getStudent.setFirstName("ahmed");
       Student mergedPerson = (Student) session.merge(getStudent);
       System.out.println("First Name of Student :"+getStudent.getFirstName());

        
        
    }
    
}
