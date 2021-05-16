
import poo.io.*;

/**
 *
 * @author Pablo Casas Gomez
 * @version 1.0 En esta Clase tenemos varios Metodos con Polimorfismo En esta
 * Clase se ha empleado el Paquete Entrada/Salida que vimos en las Practicas
 */
public class Avion extends Vehiculos implements ICargamento, Comparable {

    private boolean Volando;
    private boolean Ruedas;

    private int Tripulacion;
    private final int TRIPULACIONMAXIMA;

    private double Altitud;
    private final double ALTITUDMAXIMA;

    private int numeroContainer;
    private final int NUMEROCONTAINERMAXIMO;

    private final int ARRIBA = 1;
    private final int ABAJO = 2;
    private final int DERECHA = 3;
    private final int IZQUIERDA = 4;

    private String inventarioRutas[][];

    private int numRutasActuales;

    private static final int NUMMAXRUTAS = 100;

    /*-------------------------------------------------------------------------------------------------------------------------------------------------------*/
    public Avion(boolean Volando, boolean Ruedas, int Tripulacion, int TRIPULACIONMAXIMA, double Altitud, double ALTITUDMAXIMA, int numeroContainer, int NUMEROCONTAINERMAXIMO,
            int numRutasActuales, String Marca, String Modelo, String numSerie, String Direccion, boolean Arrancado, int NUMEROPLAZASMAXIMO, int Ocupantes,
            double CAPACIDADDEPOSITO, double depositoRestante, double Velocidad, double VELOCIDADMAXIMA, double Peso, double PESOMAXIMO) {
        super(Marca, Modelo, numSerie, Direccion, Arrancado, NUMEROPLAZASMAXIMO, Ocupantes, CAPACIDADDEPOSITO, depositoRestante, Velocidad, VELOCIDADMAXIMA, Peso, PESOMAXIMO);
        this.inventarioRutas = new String[NUMMAXRUTAS][3];
        this.Volando = Volando;
        this.Ruedas = Ruedas;
        this.Tripulacion = Tripulacion;
        this.TRIPULACIONMAXIMA = TRIPULACIONMAXIMA;
        this.Altitud = Altitud;
        this.ALTITUDMAXIMA = ALTITUDMAXIMA;
        this.numeroContainer = numeroContainer;
        this.NUMEROCONTAINERMAXIMO = NUMEROCONTAINERMAXIMO;
        this.numRutasActuales = numRutasActuales;
    }
    /*-------------------------------------------------------------------------------------------------------------------------------------------------------*/
    /*En este caso tenemos que crear una tabla String [][] en el main y pasarlo por parametro*/
    public Avion(boolean Volando, boolean Ruedas, int Tripulacion, int TRIPULACIONMAXIMA, double Altitud, double ALTITUDMAXIMA, int numeroContainer, int NUMEROCONTAINERMAXIMO,
            String[][] inventarioRutas, int numRutasActuales, String Marca, String Modelo, String numSerie, String Direccion, boolean Arrancado, int NUMEROPLAZASMAXIMO,
            int Ocupantes, double CAPACIDADDEPOSITO, double depositoRestante, double Velocidad, double VELOCIDADMAXIMA, double Peso, double PESOMAXIMO) {
        super(Marca, Modelo, numSerie, Direccion, Arrancado, NUMEROPLAZASMAXIMO, Ocupantes, CAPACIDADDEPOSITO, depositoRestante, Velocidad, VELOCIDADMAXIMA, Peso, PESOMAXIMO);
        this.Volando = Volando;
        this.Ruedas = Ruedas;
        this.Tripulacion = Tripulacion;
        this.TRIPULACIONMAXIMA = TRIPULACIONMAXIMA;
        this.Altitud = Altitud;
        this.ALTITUDMAXIMA = ALTITUDMAXIMA;
        this.numeroContainer = numeroContainer;
        this.NUMEROCONTAINERMAXIMO = NUMEROCONTAINERMAXIMO;
        this.inventarioRutas = inventarioRutas;
        this.numRutasActuales = numRutasActuales;
    }

    /*-------------------------------------------------------------------------------------------------------------------------------------------------------*/
    /**
     * Metodo que sirve para modificar y anadir rutas a la tabla inventarioRutas
     * de la clase
     */
    public void anadirRutas(int numeroRutas) throws Exception {
        if (numeroRutas < NUMMAXRUTAS) {
            for (int i = 0; i < numeroRutas; i++) {
                System.out.println("Introduzca el nombre del aeropuerto nº " + (i+1) + " visitado:");
                inventarioRutas[i][0] = IO.readLine();
                for (int j = 1; j < inventarioRutas[i].length; j++) {
                    if (j == 1) {
                        System.out.println("Introduzca fecha de entrada en el puerto" + inventarioRutas[i][0]);
                        inventarioRutas[i][j] = IO.readLine();
                    } else {
                        System.out.println("Introduzca fecha de salida en el puerto" + inventarioRutas[i][0]);
                        inventarioRutas[i][j] = IO.readLine();
                    }
                }
            }
        } else {
            throw new Exception();
        }
    }

    /**
     * Metodo para obtener el valor de la tabla inventarioRutas
     *
     * @return la tabla String [][] inventarioRutas
     */
    public String[][] getInventarioRutas() {
        return this.inventarioRutas;
    }

    /**
     *
     * @return El numero de Viajeros actuales.
     */
    public int getNumRutasActuales() {
        return numRutasActuales;
    }

    /**
     * Metodo para variar el numero actual de viajeros, sin embargo, este metodo
     * es privado y solo puede ser accedido desde otros metodos de la clase
     * Avion
     *
     * @param numRutasActuales el nuevo valor de numRutasActuales
     */
    private void setNumRutasActuales(int numRutasActuales) {
        this.numRutasActuales = numRutasActuales;
    }

    /**
     * @return El estado actual del Avion (Volando o no)
     */
    public boolean isVolando() {
        return Volando;
    }

    /**
     * @param Volando establece si el Avion esta o no Volando
     */
    public void setVolando(boolean Volando) {
        this.Volando = Volando;
    }

    /**
     * @return El estado de las Ruedas del Avion en este momento
     */
    public boolean isRuedas() {
        return Ruedas;
    }

    /**
     * @param Ruedas establece si el Avion esta o no con las Ruedas desplegadas
     */
    public void setRuedas(boolean Ruedas) {
        this.Ruedas = Ruedas;
    }

    /**
     * @return el valor de la Tripulacion que hay actualmente en el Avion
     */
    public int getTripulacion() {
        return Tripulacion;
    }

    /**
     * @param Tripulacion establece el valor de la Tripulacion que queremos
     * establecer
     */
    public void setTripulacion(int Tripulacion) {
        if (Tripulacion <= this.TRIPULACIONMAXIMA) {
            this.Tripulacion = Tripulacion;
        } else {
            System.out.println("\nEl valor de Tripulacion es mayor que el maximo permitido.");
        }
    }

    /**
     * @return El valor de TRIPULACIONMAXIMA que permite el Avion
     */
    public int getTRIPULACIONMAXIMA() {
        return TRIPULACIONMAXIMA;
    }

    /**
     * @return El valor de la Altitud a la cual esta el Avion
     */
    public double getAltitud() {
        return Altitud;
    }

    /**
     * @param Altitud establece el valor de Altitud actual del Avion
     */
    public void setAltitud(double Altitud) {
        if (Altitud <= this.ALTITUDMAXIMA) {
            this.Altitud = Altitud;
        } else {
            System.out.println("\nEl valor de Altitud excede el maximo posible.");
        }
    }

    /**
     * @return El valor de ALTITUDMAXIMA a la que puede operar el Avion
     */
    public double getALTITUDMAXIMA() {
        return ALTITUDMAXIMA;
    }

    /**
     * @return El numero de numeroContainer que tiene el Avion en este momento
     */
    public int getNumeroContainer() {
        return numeroContainer;
    }

    /**
     * @param numeroContainer Establece el numeroContainer que tiene el Avion
     */
    public void setNumeroContainer(int numeroContainer) {
        if (numeroContainer <= this.NUMEROCONTAINERMAXIMO) {
            this.numeroContainer = numeroContainer;
        } else {
            System.out.println("\nEl numero de Contariners introducido supera al maximo posible.");
        }
    }

    /**
     * @return Devuelve el NUMEROCONTAINERMAXIMO que puede llevar el Avion
     */
    public int getNUMEROCONTAINERMAXIMO() {
        return NUMEROCONTAINERMAXIMO;
    }

    /**
     * Metodo que permite anadir Containers al Avion siempre y cuando el Avion
     * no este volando y no se supere ni el Peso Maximo permitido por el Avion
     * ni el Numero de Containers Maximos permitidos. Además en este caso, este
     * método hará uso del paquete Entrada/Salida con el objetivo de pedir por
     * teclado al usuario que introduzca el paquete deseado, indicando el peso
     * del mismo. Tras ello se mostrará un mensaje por pantalla que indicará el
     * peso total tras la carga y se pedirá al usuario que indique si quiere o
     * no seguir cargando Containers.
     *
     * @throws ExcesoDePesoException En caso de superar el peso maximo permitido
     * emitiremos una exception propia
     */
    public void anadirContainer() throws ExcesoDePesoException {
        double pesoContainer = 0;
        double i = 0;
        int j = 1;
        while (i != -9999) {
            if (this.isVolando() == false) {
                if (this.getNumeroContainer() == this.getNUMEROCONTAINERMAXIMO()) {
                    System.out.println("Ya se ha introducido el numero maximo de Containers");
                    i = -9999;
                } else {
                    System.out.println("\nIntroduzca el peso del Container " + j + " cargado: ");
                    pesoContainer = IO.readNumber();
                    System.out.println("\nPeso del paquete: " + pesoContainer);
                    if ((super.getPeso() + pesoContainer) < super.getPESOMAXIMO()) {
                        super.setPeso(getPeso() + pesoContainer);
                        this.setNumeroContainer(this.getNumeroContainer() + 1);
                        j++;
                        System.out.println("Hay un total de " + this.numeroContainer + " del total maximo posible de " + this.NUMEROCONTAINERMAXIMO);
                        System.out.println("El peso actual es de : " + super.getPeso() + " del total de " + super.getPESOMAXIMO() + "\nSi ha terminado introduzca -9999, en caso contrario pulse cualquier numero");
                        i = IO.readNumber();
                    } else {
                        i = -9999;
                        throw new ExcesoDePesoException(this.toString() + "\n El numero total de containers es de: " + this.getNUMEROCONTAINERMAXIMO());//Aclara con this.
                    }
                }
            } else {
                System.out.println(toString() + "\nActualmente esta en vuelo no se puede realizar cargas.");
                i = -9999;
            }

        }
    }

    /**
     * Metodo que permite retirar Containers al Avion siempre y cuando el Avion
     * no este volando, queden paquetes disponibles y el Peso restante no sea
     * inferior a 0. En este último caso se imprimirá un mensaje diciendo que el
     * peso del paquete no es correcto puesto que el valor restante es menor que
     * 0. Además en este caso, este método hará uso del paquete Entrada/Salida
     * con el objetivo de pedir por teclado al usuario que introduzca el paquete
     * deseado, indicando el peso del mismo. Tras ello se mostrará un mensaje
     * por pantalla que indicará el peso total tras la carga y se pedirá al
     * usuario que indique si quiere o no seguir cargando Containers.
     */
    public void sustraerContainer() {
        double pesoContainer = 0;
        double i = 0;
        int j = 1;
        while (i != -9999) {
            if (this.isVolando() == false) {
                if (this.getNumeroContainer() == 0) {
                    System.out.println("Ya se ha sustraido el numero maximo de Containers");
                    i = -9999;
                } else {
                    System.out.println("\nIntroduzca el peso del Container " + j + " descargado: ");
                    pesoContainer = IO.readNumber();
                    System.out.println("\nPeso del paquete: " + pesoContainer);
                    if ((super.getPeso() - pesoContainer) > 0) {
                        super.setPeso(getPeso() - pesoContainer);
                        this.setNumeroContainer(this.getNumeroContainer() - 1);
                        j++;
                        System.out.println("Hay un total de " + this.numeroContainer);
                        System.out.println("El peso actual es de : " + super.getPeso() + "\nSi ha terminado introduzca -9999, en caso contrario pulse cualquier numero");
                        i = IO.readNumber();
                    } else {
                        System.out.println("\nError no queda ningun paquete con ese peso.");
                        i = -9999;
                    }
                }
            } else {
                System.out.println("El" + toString() + "esta en vuelo no se puede realizar cargas.");
                i = -9999;
            }
        }
    }

    /**
     * Metodo que permite aterrizar el Avion, el procedimiento primero
     * comprobará la altitud y la modificará hasta llegar a 0, entonces
     * realizará la comprobacion de la velocidad y llamará a frenar desplegando
     * las Ruedas y por ultimo cambiará el valor de volando a false
     *
     * @return el valor de Volando
     */
    public boolean Aterizar() {
        while (isVolando() == true) {
            if (this.getAltitud() > 0) {
                this.setAltitud(this.getAltitud() - 1);
                this.setVolando(true);
            } else if (this.getAltitud() == 0 && super.getVelocidad() > 0) {
                this.setRuedas(true);
                super.frenar();
            } else if (this.getAltitud() == 0 && super.getVelocidad() == 0) {
                System.out.println("Se ha aterrizado correctamente");
                this.setVolando(false);
            }
        }
        return isVolando();
    }

    /**
     * Metodo que permite Despegar el Avion, el procedimiento comprobará que no
     * estemos volando previamente, tras ello incrementará tanto la altura como
     * la velocidad y por ultimo recogerá ruedas (Ruedas =false) y establecerá
     * Volando= true.
     *
     * @return el valor de Volando
     */
    public boolean Despegar() {
        while (isVolando() == false) {
            if (this.getAltitud() == 0 && super.getVelocidad() == 0) {
                super.acelerar();
                this.setVolando(false);
                this.setAltitud(this.getAltitud() + 1);
                System.out.println("\nSe ha iniciado la aceleracion.");
            } else if (this.getAltitud() > 0 && super.getVelocidad() > 0) {
                this.setVolando(true);
                this.setRuedas(false);
                System.out.println("\nSe ha despegado.");
            }
        }
        return isVolando();
    }

    /**
     * Metodo sin parametro que incrementa la altitud del Avion cuando no
     * estemos a Maxima altitud, en caso contrario indica por pantalla un
     * mensaje que dice que llego a su maxima altitud.
     */
    public void incrementarAltitud() {
        if (this.getAltitud() < this.getALTITUDMAXIMA()) {
            this.setAltitud(this.getAltitud() + 1);
            System.out.println("\nLa altitud actual es de : " + this.getAltitud());
        } else {
            System.out.println("\nSe alcanzo la altitud maxima de trabajo");
        }
    }

    /**
     * Metodo sin parametro que decrementa la altitud del Avion cuando no
     * estemos 0 metros de elevacion, en caso contrario indica por pantalla un
     * mensaje que dice que llego al suelo.
     */
    public void decrementarAltitud() {
        if (this.getAltitud() > 0) {
            this.setAltitud(this.getAltitud() - 1);
            System.out.println("\nLa altitud actual es de : " + this.getAltitud());
        } else {
            System.out.println("\nEsta en el suelo");
        }
    }

    /**
     * Metodo con parametro que incrementa la altitud del Avion sumando el valor
     * del parametro cuando no de como resultado altura superior a Maxima
     * altitud, en caso contrario indica por pantalla un mensaje que dice que
     * llego a su maxima altitud.
     *
     * @param Altitud que se desea incrementar
     */
    public void incrementarAltitud(double Altitud) {
        if ((this.getAltitud() + Altitud) <= this.getALTITUDMAXIMA()) {
            this.setAltitud(this.getAltitud() + Altitud);
            System.out.println("\nLa altitud actual es de : " + this.getAltitud());
        } else {
            this.Altitud = this.ALTITUDMAXIMA;
            System.out.println("\nSe alcanzo la altitud maxima de trabajo");
        }
    }

    /**
     * Metodo con parametro que decrementa la altitud del Avion restando el
     * valor del parametro cuando no de como resutlado altura inferior a 0, en
     * caso contrario indica por pantalla un mensaje que dice que llego al
     * suelo.
     *
     * @param Altitud que se desea decrementar
     */
    public void decrementarAltitud(double Altitud) {
        if ((this.getAltitud() - Altitud) >= 0) {
            this.setAltitud(this.getAltitud() - Altitud);
            System.out.println("\nLa altitud actual es de : " + this.getAltitud());
        } else {
            this.Altitud = 0;
            System.out.println("\nEsta en el suelo");
        }
    }

    /**
     * Metodo sin parametro que incrementa el numero de Tripulantes siempre que
     * no se haya llegado al maximo permitido, en tal caso se imprime mensaje
     * diciendo que ya se llego al maximo de tripulacion posible.
     */
    public void incrementarTripulantes() {
        if (this.getTripulacion() < this.getTRIPULACIONMAXIMA()) {
            this.setTripulacion(this.getTripulacion() + 1);
            System.out.println("El Avion tiene total de : " + this.getTripulacion() + " tripulantes.");
        } else {
            System.out.println("\nEl valor de la Tripulacion es maximo");
        }
    }

    /**
     * Metodo sin parametro que decrementa el numero de Tripulantes siempre que
     * no sea 0, en tal caso se imprime mensaje diciendo que ya se llego al
     * mínimo de tripulacion posible.
     */
    public void decrementarTripulantes() {
        if (this.getTripulacion() > 0) {
            this.setTripulacion(this.getTripulacion() - 1);
            System.out.println("El Avion tiene total de : " + this.getTripulacion() + " tripulantes.");
        } else {
            System.out.println("\nEl valor de la Tripulacion es cero.");
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
        if ((this.getTripulacion() + getTripulacion()) <= this.getTRIPULACIONMAXIMA()) {
            this.setTripulacion(this.getTripulacion() + getTripulacion());
            System.out.println("El Avion tiene total de : " + this.getTripulacion() + " tripulantes.");
        } else {
            this.setTripulacion(this.getTRIPULACIONMAXIMA());
            System.out.println("\nEl valor de la Tripulacion es maximo");
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
        if ((this.getTripulacion() - getTripulacion()) >= 0) {
            this.setTripulacion(this.getTripulacion() - getTripulacion());
            System.out.println("El Avion tiene total de : " + this.getTripulacion() + " tripulantes.");
        } else {
            System.out.println("\nEl valor de la Tripulacion es cero.");
        }
    }

    /**
     * Metodo con parametro que permite establecer un cambio de direccion
     * siempre y cuando la direccion previa sea "Recto".
     *
     * @param Direccion indica a que direccion queremos hacer el giro y esta
     * codificado con Arriba=1, Abajo=2,Derecha=3 Izquierda=4.
     */
    public void cambioDireccion(int Direccion) {
        if (super.getDireccion() == "Recto" && Direccion == ARRIBA) {
            super.setDireccion("Arriba");
            System.out.println("Se ha iniciado un cambio de Direccion a : " + super.getDireccion());
        } else if (super.getDireccion() == "Recto" && Direccion == ABAJO) {
            super.setDireccion("Abajo");
            System.out.println("Se ha iniciado un cambio de Direccion a : " + super.getDireccion());
        } else if (super.getDireccion() == "Recto" && Direccion == DERECHA) {
            super.setDireccion("Derecha");
            System.out.println("Se ha iniciado un cambio de Direccion a : " + super.getDireccion());
        } else if (super.getDireccion() == "Recto" && Direccion == IZQUIERDA) {
            super.setDireccion("Izquierda");
            System.out.println("Se ha iniciado un cambio de Direccion a : " + super.getDireccion());
        } else {
            System.out.println("Todavia se esta realizando un giro");
        }
    }

    /**
     * Metodo con parametro que permite establecer un cambio de direccion
     * siempre y cuando la direccion previa sea "Recto".
     *
     * @param Direccion indica a que direccion vamos a ir, sin codificar.
     */
    public void cambioDireccion(String Direccion) {
        if (super.getDireccion() == "Recto") {
            super.setDireccion(Direccion);
            System.out.println("Se ha iniciado un cambio de Direccion a : " + super.getDireccion());
        } else {
            System.out.println("Todavía se esta realizando un giro");
        }
    }

    /**
     * Metodo sin parametro que permite terminar el giro, estableciendo el valor
     * de Direcion a "Recto".
     */
    public void terminarGiro() {
        if (super.getDireccion() != "Recto") {
            super.setDireccion("Recto");
            System.out.println("\nSe ha completado el giro");
        } else {
            System.out.println("\nNo había ningun giro en marcha.");
        }
    }

    /**
     * Redefinicion del metodo toString de la Clase Object
     *
     * @return Una frase (String) qu indica diferentes atributos del Avion
     */
    public String toString() {
        return "\nEl Avion:" + super.toString()
                + "\n Tiene una Altitud de : " + this.getAltitud()
                + "\n Con una Altitud Maxima de vuelo de : " + this.getALTITUDMAXIMA()
                + "\n Presenta capacidad para un total de : " + this.getTRIPULACIONMAXIMA() + " tripulantes";
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
        Avion a = (Avion) o;
        return super.equals(o)
                && this.getALTITUDMAXIMA() == a.getALTITUDMAXIMA()
                && this.getAltitud() == a.getAltitud()
                && this.getNUMEROCONTAINERMAXIMO() == a.getNUMEROCONTAINERMAXIMO()
                && this.getNumeroContainer() == a.getNumeroContainer()
                && this.isRuedas() == a.isRuedas()
                && this.getTRIPULACIONMAXIMA() == a.getTRIPULACIONMAXIMA()
                && this.getTripulacion() == a.getTripulacion()
                && this.isVolando() == a.isVolando();
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
        Avion av = (Avion) o;

        int cmp = this.getNumRutasActuales() - av.getNumRutasActuales();

        if (cmp == 0) {
            cmp = this.getNumeroContainer() - av.getNumeroContainer();
            if (cmp == 0) {
                cmp = this.getDireccion().compareToIgnoreCase(av.getDireccion());
            }
        } else {
            cmp = -1;
        }

        return cmp;
    }
}
