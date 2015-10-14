package Model;

import java.util.ArrayList;

public class GeneradorAlumnos {
    
    public static ArrayList<Alumno> generar(){
        
        ArrayList<Alumno> alumnos=new ArrayList<Alumno>();
        Materia m1=new Materia();
        m1.setNombre("Elementos de Programacion");
        Alumno a1=new Alumno();
        a1.setCuenta(123456);
        a1.setMateria(m1);
        a1.setNombre("Brandon");
        Alumno a2=new Alumno();
        a2.setCuenta(456789);
        a2.setMateria(m1);
        a2.setNombre("Oscar");
        Alumno a3=new Alumno();
        a3.setCuenta(789123);
        a3.setMateria(m1);
        a3.setNombre("Juan");
        alumnos.add(a1);
        alumnos.add(a2);
        alumnos.add(a3);
        return alumnos;
        
    }
    
}
