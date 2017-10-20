/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico43.Telefonia;

/**
 *
 * @author Ulp
 */
public class Celular extends Telefono{
    
    private String empresa;
    
    
    
    public Celular(long numero,String modelo,String marca)
    {
        super(numero,modelo,marca);
    }
    
    public boolean Llamar(long nroDestino)
    {
        System.out.println("Llamada realizada al numero:"+" "+nroDestino);
        return true;
    }
    
    public boolean enviarMensaje(long nroDestino,String mensaje)
    {
        if(mensaje!=null)
        {
            System.out.println(mensaje+ '\n'+ "de:"+nroDestino);
            return true;
        }
        
        else
        {
            System.out.println("No se pudo enviar el msj");
            return false;
            
        }
    }
    
    

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
}
