
/**
 *  Representa una dimensión
 *  
 *  @author David Sena
 */
public class Dimension  
{
    private double alto;
    private double ancho;
    private double largo;

    /**
     * constructor  
     */
    public Dimension(double alto, double ancho, double largo)    {
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;

    }   

    /**
     * accesor para  el alto
     */
    public double getAlto()    {
        return alto;
    }

    /**
     * accesor para  el ancho
     */
    public double getAncho()    {
        return ancho;
    }

    /**
     * accesor para  el largo
     */
    public double getLargo()    {
        return largo;
    }

    /**
     * Devuelve una copia exacta al objeto actual
     */
    public Dimension obtenerCopia() {
        return new Dimension(this.getAlto(), this.getAncho(), this.getLargo());

    }

    /**
     * Repesentación textual de la dimensión
     * (leer enunciado)
     */
    public String toString() {
        String alto = "Alto:";
        String ancho = "Ancho:";
        String largo = "Largo:";
        String str = "";
        str += String.format("%20s %10.2f(cm)\n", alto, this.alto);
        str += String.format("%20s %10.2f(cm)\n", ancho, this.ancho);
        str += String.format("%20s %10.2f(cm)\n", largo, this.largo);
        return str;

    }

    /**
     * Muestra en pantalla el objeto actual
     * Este método se incluye como método de prueba
     * de la clase Dimension
     */
    public void print() {
        System.out.println(this.toString());
    }

    
}
