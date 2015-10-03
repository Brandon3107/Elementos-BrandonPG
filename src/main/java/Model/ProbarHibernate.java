package Model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ProbarHibernate {
    
    public static void main(String[] args)throws Exception{
        
        System.out.println("Bienvenido a Hibernate");
        SessionFactory fuck=HibernateUtilidades.getSessionFactory();
        Session sesion=fuck.openSession();
        Transaction tranza=sesion.beginTransaction();
        Usuario u=new Usuario("Brandon", "123");
        sesion.save(u);
        tranza.commit();
        sesion.close();
        System.out.println("Si se guardo");
        
    }
    
}