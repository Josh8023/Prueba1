import java.util.ArrayList;


public class Principal
{

    public static void main (String [] args)
    {
     ArrayList <Empleado> contratistas = new ArrayList <Empleado> ();
     
     Empleado empleado1 = new Empleado ();
     empleado1.setNombre("Margarito");
     empleado1.setApellido("Pilacuente");
     empleado1.setTelefono("3545681");
     empleado1.setDireccion("Calle 13 - 45 B El morro");
     empleado1.setMovil ("3459972301");
     empleado1.setNacimiento ("03/05/1981");
     empleado1.setLdn ("Polo nuevo magdalena");
     
     Empleado empleado2 = new Empleado ();
     empleado2.setNombre("Joseph");
     empleado2.setApellido("Sierra ");
     empleado2.setTelefono("2453451");
     empleado2.setDireccion("Carrera 21 - 16 C Repelon");
     empleado2.setMovil ("3135123456");
     empleado2.setNacimiento ("04/06/1991"); 
     empleado2.setLdn ("San José");
     
     
     contratistas.add(empleado1); //Posición 0 Array
     contratistas.add(empleado2); //Pocición 1 Array
     
     contratistas.forEach((emp) -> System.out.println(emp.getNombre() + "\n" + emp.getApellido () + 
     "\n" + emp.getTelefono() + "\n" + emp.getDireccion() + "\n" + emp.getMovil () + "\n" + emp.getNacimiento () + 
     "\n" + emp.getLdn () + "\n")); 
    }

}