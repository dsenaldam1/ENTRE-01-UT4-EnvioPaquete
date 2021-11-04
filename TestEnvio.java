
/**
 *  
 * Clase para testear el envio de paquetes
 * @author  David Sena
 * @version  
 */
public class TestEnvio
{
     

    /**
     *  
     */
    public static void main(String[] args){
         Paquete paquete1 = new Paquete();
         Paquete paquete2 = new Paquete(40, 60, 40);
         Envio envio = new Envio();
         envio.addPaquete(paquete1);
         envio.addPaquete(paquete2);
         //envio.print();
         Paquete paquete3 = new Paquete(new Dimension(50,50,70), 13);
         envio.addPaquete(paquete3);
         envio.print();
         Paquete copiaPaquete2 = paquete2.obtenerCopia();
         envio.addPaquete(copiaPaquete2);
    }
    
}
