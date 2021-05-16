
import poo.io.*;

/**
 *
 * @author Pablo Casas Gomez
 * @version 1.0 En esta Clase tenemos varios Metodos con Polimorfismo En esta
 * Clase se ha empleado el Paquete Entrada/Salida que vimos en las Practicas
 *
 */
public class Carguero extends Barco implements ICargamento, Comparable {

    private int numeroContainer;
    private final int NUMEROCONTAINERMAXIMO;

    public Carguero(int numeroContainer, int NUMEROCONTAINERMAXIMO, String Marca, String Modelo, double Peso, double PESOMAXIMO, int Tripulantes, int TRIPULANTESMAXIMOS) {
        super(Marca, Modelo, Peso, PESOMAXIMO, Tripulantes, TRIPULANTESMAXIMOS);
        this.numeroContainer = numeroContainer;
        this.NUMEROCONTAINERMAXIMO = NUMEROCONTAINERMAXIMO;
    }

    /**
     * @return Devuelve el valor de numeroContainer
     */
    public int getNumeroContainer() {
        return numeroContainer;
    }

    /**
     * Metodo que modifica el numero de Containers siempre que este no supere al
     * valor maximo del mismo, en caso contrario imprime por pantalla un mensaje
     * de error.
     *
     * Podría haberse usado una Exception pero estas han sido usadas en
     * diferentes partes del codigo que son mas claras.
     *
     * @param numeroContainer Establece el valor de numeroContainer
     */
    public void setNumeroContainer(int numeroContainer) {
        if (numeroContainer <= this.NUMEROCONTAINERMAXIMO) {
            this.numeroContainer = numeroContainer;
        } else {
            System.out.println("El numero de containers es mayor al permitido.");
        }
    }

    /**
     * @return Devuelve el valor maximo de NUMEROCONTAINERMAXIMO
     */
    public int getNUMEROCONTAINERMAXIMO() {
        return NUMEROCONTAINERMAXIMO;
    }

    /**
     * Metodo que permite añadir Containers al Carguero siempre y cuando este no
     * supere ni el Peso Maximo permitido por el Carguero ni el Numero de
     * Containers Maximos permitidos. Además en este caso, este método hará uso
     * del paquete Entrada/Salida con el objetivo de pedir por teclado al
     * usuario que introduzca el paquete deseado, indicando el peso del mismo.
     * Tras ello se mostrará un mensaje por pantalla que indicará el peso total
     * tras la carga y se pedirá al usuario que indique si quiere o no seguir
     * cargando Containers.
     */
    public void anadirContainer() throws ExcesoDePesoException {
        double pesoContainer = 0;
        double i = 0;
        int j = 1;
        while (i != -9999) {
            if (this.getNumeroContainer() == this.getNUMEROCONTAINERMAXIMO()) {
                System.out.println("Ya se ha introducido el numero maximo de Containers");
                i = -9999;
            } else {
                System.out.println("\nIntroduzca el peso del Container " + j + " cargado: ");
                pesoContainer = IO.readNumber();
                System.out.println("\nPeso del paquete: " + pesoContainer);
                if ((super.getPeso() + pesoContainer) < super.getPESOMAXIMO()) {
                    super.setPeso(super.getPeso() + pesoContainer);
                    this.setNumeroContainer(this.getNumeroContainer() + 1);
                    j++;
                    System.out.println("Hay un total de " + this.numeroContainer + " del total maximo posible de " + this.NUMEROCONTAINERMAXIMO);
                    System.out.println("El peso actual es de : " + super.getPeso() + " del total de " + super.getPESOMAXIMO() + "\nSi ha terminado introduzca -9999, en caso contrario pulse cualquier numero");
                    i = IO.readNumber();
                } else {
                    i = -9999;
                    throw new ExcesoDePesoException(this.toString() + "\n Tiene un total de " +this.getNumeroContainer());
                }
            }

        }
    }

    /**
     * Metodo que permite retirar Containers al Carguero siempre y cuando queden
     * paquetes disponibles y el Peso restante no sea inferior a 0. En este
     * último caso se imprimirá un mensaje diciendo que el peso del paquete no
     * es correcto puesto que el valor restante es menor que 0. Además en este
     * caso, este método hará uso del paquete Entrada/Salida con el objetivo de
     * pedir por teclado al usuario que introduzca el paquete deseado, indicando
     * el peso del mismo. Tras ello se mostrará un mensaje por pantalla que
     * indicará el peso total tras la carga y se pedirá al usuario que indique
     * si quiere o no seguir cargando Containers.
     */
    public void sustraerContainer() {
        double pesoContainer = 0;
        double i = 0;
        int j = 1;
        while (i != -9999) {
            if (this.getNumeroContainer() == 0) {
                System.out.println("Ya se ha sustraido el numero maximo de Containers");
                i = -9999;
            } else {
                System.out.println("\nIntroduzca el peso del Container " + j + " descargado: ");
                pesoContainer = IO.readNumber();
                System.out.println("\nPeso del paquete: " + pesoContainer);
                if ((super.getPeso() - pesoContainer) > 0) {
                    super.setPeso(super.getPeso() - pesoContainer);
                    this.setNumeroContainer(this.getNumeroContainer() - 1);
                    j++;
                    System.out.println("Quedan un total de " + this.numeroContainer);
                    System.out.println("El peso actual es de : " + super.getPeso() + "\nSi ha terminado introduzca -9999, en caso contrario pulse cualquier numero");
                    i = IO.readNumber();
                } else {
                    System.out.println("\nError no queda ningun paquete con ese peso.");
                    i = -9999;
                }
            }
        }

    }

    /**
     * Metodo sin parametro que incrementa el numero de Tripulantes siempre que
     * no se haya llegado al maximo permitido, en tal caso se imprime mensaje
     * diciendo que ya se llego al maximo de tripulacion posible.
     */
    public void incrementarTripulantes() {
        if (this.getTripulantes() < this.getTRIPULANTESMAXIMOS()) {
            this.setTripulantes(this.getTripulantes() + 1);
            System.out.println("El Carguero tiene total de : " + this.getTripulantes() + " tripulantes.");
        } else {
            System.out.println("\nEl Carguero tiene el número máximo de Tripulantes");
        }
    }

    /**
     * Metodo sin parametro que decrementa el numero de Tripulantes siempre que
     * no sea 0, en tal caso se imprime mensaje diciendo que ya se llego al
     * mínimo de tripulacion posible.
     */
    public void decrementarTripulantes() {
        if (this.getTripulantes() > 0) {
            this.setTripulantes(this.getTripulantes() - 1);
            System.out.println("El Carguero tiene total de : " + this.getTripulantes() + " tripulantes.");
        } else {
            System.out.println("\nEl Carguero no tiene Tripulantes");
        }
    }

    /**
     * Metodo con parametro que incrementa el numero de Tripulantes siempre que
     * el resultado no sea mayo al maximo permitido, en tal caso se imprime
     * mensaje diciendo que ya se llego al maximo de tripulacion posible.
     *
     * @param Tripulantes numero de Tripulantes que queremos incrementar
     */
    public void incrementarTripulantes(int Tripulantes) {
        if ((this.getTripulantes() + Tripulantes) <= this.getTRIPULANTESMAXIMOS()) {
            this.setTripulantes(this.getTripulantes() + Tripulantes);
            System.out.println("El Carguero tiene total de : " + this.getTripulantes() + " tripulantes.");
        } else {
            System.out.println("\nEl Carguero tiene el número máximo de Tripulantes");
        }
    }

    /**
     * Metodo con parametro que decrementa el numero de Tripulantes siempre que
     * no sea 0, en tal caso se imprime mensaje diciendo que ya se llego al
     * mínimo de tripulacion posible.
     *
     * @param Tripulantes numero de Tripulantes que queremos decrementar
     *
     */
    public void decrementarTripulantes(int Tripulantes) {
        if ((this.getTripulantes() - Tripulantes) >= 0) {
            this.setTripulantes(this.getTripulantes() - Tripulantes);
            System.out.println("El Carguero tiene total de : " + this.getTripulantes() + " tripulantes.");
        } else {
            this.setTripulantes(0);
            System.out.println("\nEl Carguero no tiene Tripulantes");
        }
    }

    /**
     * Redefinicion del metodo toString de la Clase Object
     *
     * @return Una frase (String) qu indica diferentes atributos del Automovil
     */
    public String toString() {
        return super.toString()
                + "\n con una Capacidad Máxima de :" + this.getNUMEROCONTAINERMAXIMO() + " containers"
                + "\n con una Capacidad Actual de :" + this.getNumeroContainer() + " containers";
    }

    /**
     * Redeficion de metodo equals de la Clase Object, que permite comrpobar si
     * dos objetos son el mismo, debido a la comprobacion de cada uno de sus
     * atributos.
     *
     * @param o El objeto a comparar
     *
     * @return devuelve true en caso de ser el mismo objeto y false en caso de
     * ser objetos diferentes
     */
    public boolean equals(Object o) {
        Carguero ca = (Carguero) o;
        return super.getMarca() == ca.getMarca()
                && super.getModelo() == ca.getModelo()
                && this.getNUMEROCONTAINERMAXIMO() == ca.getNUMEROCONTAINERMAXIMO()
                && super.getPESOMAXIMO() == ca.getPESOMAXIMO()
                && super.getPeso() == ca.getPeso()
                && super.getTRIPULANTESMAXIMOS() == ca.getTRIPULANTESMAXIMOS()
                && super.getTripulantes() == ca.getTripulantes()
                && this.getNumeroContainer() == ca.getNumeroContainer();
    }

    /**
     * Metodo desarrollado en la clase Carguero proviniente de la clase
     * abstracta Barco. Este método permite cumplimentar la tabla
     * "InventarioTripulantes" donde se guardan String con el nombre del
     * tripulante y el cargo del mismo.
     */
    public void cumplimentarFicha() throws ArrayIndexOutOfBoundsException {
        for (int i = 0; i < super.getInventarioTripulantes().length; i++) {
            if (i <= super.getTRIPULANTESMAXIMOS()) {
                System.out.println("Introduce nombre de tripulante");
                super.getInventarioTripulantes()[i][0] = IO.readLine();
                System.out.println("Introduce el cargo de ");
                super.getInventarioTripulantes()[i][1] = IO.readLine();
            } else {
                throw new ArrayIndexOutOfBoundsException();
            }
        }
    }
    

    /**
     * Metodo para comparar dos objetos y establecer un orden natural entre
     * ellos. Para esto miramos primero el numero real de viajeros, en segundo
     * lugar el num de containers y por ultimo la direccion del mismo
     *
     * @param o Objeto que vamos a comprar
     * @return -1;1:0 en funcion de si son iguales o distintos y el orden de los
     * mismos.
     */
    public int compareTo(Object o) {
        Carguero av = (Carguero) o;

        int cmp = this.getNUMEROCONTAINERMAXIMO() - av.getNUMEROCONTAINERMAXIMO();

        if (cmp == 0) {
            cmp = this.getNumeroContainer() - av.getNumeroContainer();
            if (cmp == 0) {
                cmp = super.getTripulantes() - super.getTripulantes();
                if (cmp == 0) {
                    cmp = super.getMarca().compareToIgnoreCase(super.getMarca());
                }
            }
        } else {
            cmp = -1;
        }

        return cmp;
    }
}
