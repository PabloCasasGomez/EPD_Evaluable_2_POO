
import java.util.Comparator;

/**
 *  Clase que establece una comparacion alternativo (Orden Alternativo) para los objetos de clase barco
 * @author pablo
 */
public class comparePrioridadAlternativa implements Comparator {

    public int compare(Object o1, Object o2) {
        Barco b1 = (Barco) o1;
        Barco b2 = (Barco) o2;

        int cmp = b1.getTripulantes() - b2.getTripulantes();

        if (cmp == 0) {
            cmp = b1.getMarca().compareToIgnoreCase(b2.getMarca());
            if (cmp == 0) {
                cmp = b1.getModelo().compareToIgnoreCase(b2.getModelo());
            }
        } else {
            cmp = -1;
        }
        return cmp;

    }

}
