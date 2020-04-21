
public class Persona
{

    String nombre, apellido, telefono, genero, direccion, movil, nacimiento, ldn/*Lugar de nacimiento */;
    
    
    public Persona()
    {
     
       
    }
    
    public Persona (String nom, String ape, String tel, String dir, String mov, String nac, String lugar) {
    this.nombre = nom;
    this.apellido = ape;
    this.telefono = tel;
    this.direccion = dir;
    this.movil= mov;
    this.nacimiento = nac;
    this.ldn = lugar;
    
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
    
    

    public void setTelefono(String tel){
    this.telefono = tel;
    }
    
    public String getTelefono () {
    return this.telefono;
    }
    
    
    public void setDireccion(String dir){
    this.direccion = dir;
    }
    
    public String getDireccion ( ) {
    return this.direccion;
    }
    
    
    public void setMovil(String mov){
    this.movil = mov;
    }
    
    public String getMovil ( ) {
    return this.movil;
    }    
    
    
    
    public void setNacimiento(String nac){
    this.nacimiento = nac;
    }
    
    public String getNacimiento ( ) {
    return this.nacimiento;
    }
    
    
    
    public void setLdn(String lugar){
    this.ldn = lugar;
    }
    
    public String getLdn ( ) {
    return this.ldn;
    }    
    
}
