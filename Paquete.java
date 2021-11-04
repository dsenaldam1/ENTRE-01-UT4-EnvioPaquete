import java.util.Random;
/**
 *  Un objeto de esta clase guarda los datos de un
 *  paquete
 * 
 * @author - 
 *  
 */
public class Paquete 
{
    private Random generador;
    private Dimension dimension;
    private double peso;

    /**
     * Constructor 1 sin parámetros
     * Crea el paquete con 40 , 30, 50 de
     * alto, ancho, largo (en cm) y peso 8 Kg
     */
    public Paquete()    {
        dimension = new Dimension(40, 30, 50);
        peso = 8; 

    }

    /**
     * Constructor 2 
     *  Crea el paquete con el alto, ancho, largo (en cm) indicados
     *  y peso un valor aleatorio entre 2 y 8 Kg inclusive
     *  Se crea aquí el generador
     */
    public Paquete(double alto, double ancho, double largo)    {
        dimension = new Dimension(alto, ancho, largo);
        generador = new Random(); 
        peso = generador.nextInt(7) + 2;
    }

    /**
     * Constructor 3 
     * Crea el paquete a la dimension y peso indicados
     * 
     */
    public Paquete(Dimension dimension, double peso)    {
        this.dimension = dimension;
        this.peso = peso;

    }

    /**
     * accesor para la dimensión
     */
    public Dimension getDimension() {
        return this.dimension;

    }

    /**
     * accesor para el peso
     */
    public double getPeso() {
        return this.peso;

    }

    /**
     * calcula y devuelve el volumen del paquete (en cm3)
     * El volumen = alto x ancho x largo
     */
    public double calcularVolumen() {
       double vol = 0;
       vol = dimension.getAlto() * dimension.getAncho() * dimension.getLargo();
       return vol;

    }

    /**
     * calcula y devuelve el peso volumétrico del paquete (en Kg)
     * Peso volumétrico = volumen del paquete / 5000
     */
    public double calcularPesoVolumetrico() {
        double pesoVol = 0;
        pesoVol = calcularVolumen()/5000;
        return pesoVol;
 
    }

    /**
     *  Devuelve el peso facturable de un paquete
     *  Siempre es el valor mayor entre su peso real y su peso volumétrico
     *      
     */
    public double calcularPesoFacturable() {
        double facturable = 0;
        if( this.getPeso() > calcularPesoVolumetrico()){
            facturable = this.getPeso();            
        }
        else{

            facturable = calcularPesoVolumetrico();
        }
        return facturable;

    }


    /**
     * Devuelve una copia exacta al objeto actual
     * Se obtienen copias también de los objetos que contenga
     */
    public Paquete obtenerCopia() {
       return new Paquete(this.getDimension(), this.getPeso());
       

    }

    /**
     * Representación textual del paquete
     *  (leer enunciado)
     */
    public String toString() {
       String peso = "Peso real:";
        String volumen = "Volumen:";
        String pesovol = "Peso volumétrico:";
        String str = "Descripcion del paquete\n";
        str += dimension.toString();
        str += String.format("%20s %10.2f(kg)\n", peso, this.getPeso());
        str += String.format("%20s %10.2f(cm3)\n", volumen, calcularVolumen());
        str += String.format("%20s %10.2f(kg)", pesovol, calcularPesoVolumetrico());
       return str;

    }
    
    /**
     * Muestra en pantalla el objeto actual
     * Este método se incluye como método de prueba
     * de la clase Paquete
     */
    public void print() {
        System.out.println(this.toString());
    }

    

}
