package com.example.teacheronetomany;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	Configuration con = new Configuration().configure().addAnnotatedClass(Trainer.class);
    	Configuration con1 = new Configuration().configure().addAnnotatedClass(Cource.class);
        SessionFactory sf=con.buildSessionFactory();
        Session session = sf.openSession();
        
        
        /* Different Courses offered by a particular Trainer */
        
        Cource c1 = new Cource();
        c1.setCid(111);
        c1.setCname("Java Programming");
        
        Cource c2 = new Cource();
        c2.setCid(112);
        c2.setCname("Python Programming");
     
        Cource c3 = new Cource();
        c3.setCid(113);
        c3.setCname("Angular Programming");
        
       
        
        /* Trainer Object */
        
        Trainer t1 = new Trainer();
        t1.setTid(1);
        t1.setTname("Mridula");
        
        /* Adding list of Courses */
        t1.getCources().add(c1);
        t1.getCources().add(c2);
        t1.getCources().add(c3);
        

        
        
          
        Transaction t=session.beginTransaction();   
          
        
        session.persist(t1); 
        

        
//        	/* Updation Performing */
//   		Trainer Tu = (Trainer)session.get(Trainer.class, 1);
//    		Tu.setTname("Mridula Mam");
//    		System.out.println("-------------Updated SuccessFully----------------------");
//    		session.getTransaction().commit();
        
//        /* Deletion Performing */
//        Trainer Td = (Trainer)session.get(Trainer.class, 1);
//        session.delete(Td);
//        System.out.println("--------------------Deleted SuccessFully-------------------");
//        session.getTransaction().commit();

        

        t.commit();    
        session.close();
        
        System.out.println("----------------Details Saved Successfully-----------------------");
    }
    
    

}
