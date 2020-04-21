
public class Persona
{

    String nombre, apellido, telefono, genero;
    
    
    public Persona()
    {
     
       
    }
    
    public Persona (String nom, String ape) {
    this.nombre = nom;
    this.apellido = ape;
    }
    
    public void setNombre(String nom){
    this.nombre = nom;
    }
    
    public void setApellido (String ape) {
    this.apellido = ape;
    }
    
    public String getNombre () {
    return this.nombre;
    }
    
    public String getApellido () {
    return this.apellido;
    }
}
