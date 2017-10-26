
package practico43.Telefonia;

public class Inalambrico extends Telefono{
    private int canal;
    private double alcance;

    public Inalambrico(long numero, String modelo, String marca, int canal, double alcance)
    {
        super(numero, modelo, marca);
        this.canal=canal;
        this.alcance=alcance;
    }
    
    
    public boolean Llamar(long nroDestino)
    {
        System.out.println("Llamada realizada al numero: "+nroDestino);
        return true;
    }
    
    
    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        this.canal = canal;
    }
    public double getAlcance() {
        return alcance;
    }
    public void setAlcance(double alcance) {
        this.alcance = alcance;
    }
}
