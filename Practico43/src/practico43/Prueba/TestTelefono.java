/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico43.Prueba;
import practico43.Telefonia.*;
import practico43.Persona;

/**
 *
 * @author SYSTEM
 */
public class TestTelefono {
    
    public static void main(String []args)
    {
        Persona per=new Persona(39137505,"Jonathan");
        Celular cel=new Celular(266019368,"Core","Samsung");
        Fijo fi=new Fijo(234323434,"trucha","telef","Telefonica");
        Inalambrico i=new Inalambrico(2343243,"inalam","Alcatel",5,134.6);
        
        
        per.llamarMensajear(fi,266557892);
        per.llamarMensajear(cel, 266557892, "Hola como estas");
        
    }
    
}
