
package practico43.Telefonia;


public class Fijo extends Telefono {
    
    private String tipoDeLinea;
    
    public Fijo(long numero, String modelo, String marca, String tipoDeLinea)
    {
        super(numero, modelo, marca);
        this.tipoDeLinea=tipoDeLinea;
    }
    
    
    public boolean Llamar(long nroDestino)
    {
       
        System.out.println("Llamada realizada al numero: "+nroDestino);
        return true;
    }
 
            
    public String getTipoDeLinea() {
        return tipoDeLinea;
    }
    public void setTipoDeLinea(String tipoDeLinea) {
        this.tipoDeLinea = tipoDeLinea;
    }
    
    
    
    


    
    
}
