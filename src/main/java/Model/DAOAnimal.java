package Model;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class DAOAnimal {
    
    private static Session sesion;
    private static SessionFactory sesionFactory;
    private static Transaction tranza;
    
    public DAOAnimal(){
        
        sesionFactory=HibernateUtilidades.getSessionFactory();
        sesion=sesionFactory.openSession();
        tranza=sesion.beginTransaction();
        
    }
    
    public void cerrarTodo(){
        tranza.commit();
        sesion.close();
    }
    public void guardar(Animal a) throws Exception{
        sesion.save(a);
        cerrarTodo();
    }
    public ArrayList<Animal> buscarTodos() throws Exception{
        ArrayList<Animal> animales=(ArrayList<Animal>) sesion.createCriteria(Animal.class).list();
        cerrarTodo();
        return animales;
    }
    public Animal buscarPorId(Integer Id) throws Exception{
        Animal a=(Animal) sesion.createCriteria(Animal.class).add(Restrictions.idEq(Id)).uniqueResult();
        cerrarTodo();
        return a;
    }
    public void Actualizar(Animal a) throws Exception{
        sesion.update(a);
        cerrarTodo();
    }
    public void borrar(Integer Id) throws Exception{
        sesion.delete(Id);
    }
    
}
