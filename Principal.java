import java.util.ArrayList;


public class Principal
{

    public static void main (String [] args)
    {
     ArrayList <Empleado> contratistas = new ArrayList <Empleado> ();
     
     Empleado empleado1 = new Empleado ();
     empleado1.setNombre("Margarito");
     empleado1.setApellido("Pilacuente");
     
     Empleado empleado2 = new Empleado ();
     empleado2.setNombre("Joseph");
     empleado2.setApellido("Sierra ");
     
     contratistas.add(empleado1); //Posición 0 Array
     contratistas.add(empleado2); //Pocición 1 Array
     
     contratistas.forEach((emp) -> System.out.println(emp.getNombre() + " " + emp.getApellido () ));
    }

}
