/**
 *
 * @author pablo
 */
public class ExcesoDePesoException extends Exception {
    public ExcesoDePesoException(String s1){
        System.out.println("*******Se ha superado el maximo peso posible en*********"+s1+"\n********************************************************");
    }
}
