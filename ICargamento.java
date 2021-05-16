
/**
 *
 * @author Pablo Casas Gomez
 * @version 1.0 La interfaz tiene metodos que presenta polimorfismo.
 */
public interface ICargamento {

    public void anadirContainer() throws ExcesoDePesoException;

    public void sustraerContainer();

    public void incrementarTripulantes();

    public void decrementarTripulantes();

    public void incrementarTripulantes(int Tripulantes);

    public void decrementarTripulantes(int Tripulantes);

}
