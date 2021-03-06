package onetomanyrelationship;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


 

 
public class One2ManyRelationship {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SessionFactory factory=new  Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        // Session Factory is Thread Safe Object and can live in the memory for long without any negative effect
         Session session=    factory.openSession();
        // Session is not Thread Safe Object and can not live in the memory for long
         Transaction tx= session.beginTransaction();
         // Process to execute the Query         
         Phone p1=new Phone();
         p1.setPhoneNumber("34343455645");
         p1.setType("home");
         Phone p2=new Phone();
         p2.setPhoneNumber("355645");
         p2.setType("office");
         List<Phone> phones = new ArrayList<Phone>();
         phones.add(p2);
         phones.add(p1);
         Employee employee=new Employee();
         employee.setEmpAddress("kadapa");
         employee.setEmpContact(34543434);
         employee.setEmpName("Dr. Tarkeshwar Barua");
         employee.setTelephones(phones);
         Laptop laptop =new Laptop();
         laptop.setModelNo("2345");
         session.save(p1);
         session.save(p2);
         session.save(employee);
         tx.commit();  // Saving Object Permanently ans closing session
         factory.close(); // closing very expensive connection
    }
 
}
