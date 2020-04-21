import java.util.ArrayList;


public class Principal
{

    public static void main (String [] args)
    {
     ArrayList <Empleado> contratistas = new ArrayList <Empleado> ();
     
     Empleado empleado1 = new Empleado ();
     empleado1.setNombre("Joseph");
     empleado1.setApellido("Sierra ");
     
     Empleado empleado2 = new Empleado ();
     empleado1.setNombre("Joseph");
     empleado1.setApellido("Sierra ");
     
     contratistas.add(empleado1); //Posición 0 Array
     contratistas.add(empleado2); //Pocición 1 Array
    }

}
