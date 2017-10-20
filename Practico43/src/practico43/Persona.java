
package practico43;
import practico43.Telefonia.*;

public class Persona {
    
    private long dni;
    private String nombre;
    
    public Persona(long dni, String nombre)
    {
        this.dni=dni;
        this.nombre=nombre;
    }
    
    public void llamarMensajear(Telefono telefono, long nroDestino, String mensaje)
    {
        
    }
    
    public void llamarMensajear(Telefono telefono, long nroDestino)
    {
        
    }
    
    
    
    public long getDni() {
        return dni;
    }
    public void setDni(long dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
