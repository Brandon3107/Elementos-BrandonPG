package Model;

import java.util.ArrayList;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.*;

public class ProbarHibernate {
    
    public static void main(String[] args)throws Exception{
        
        System.out.println("Bienvenido a Hibernate");
        SessionFactory fuck=HibernateUtilidades.getSessionFactory();
        Session sesion=fuck.openSession();
        Transaction tranza=sesion.beginTransaction();
        //Insert into
        /*Usuario u=new Usuario("Oscar", "456");
        sesion.save(u);*/
        
        //Select *
        /*Criteria cricri=sesion.createCriteria(Usuario.class);
        ArrayList<Usuario> usuario=(ArrayList<Usuario>) cricri.list();
        for(Usuario u:usuario){
            System.out.println(u);
        }*/
        
        //Select X
        /*Criteria cricri=sesion.createCriteria(Usuario.class);
        Usuario u=(Usuario)cricri.add(Restrictions.idEq(2)).uniqueResult();*/
        
        //Update
        /*Usuario u=new Usuario(1);
        u.setLogin("Juanito");
        u.setPassword("789");
        sesion.update(u);*/
        
        //Delete
        Usuario u=new Usuario(2);
        sesion.delete(u);
        tranza.commit();
        sesion.close();
        System.out.println("");
        
    }
    
}