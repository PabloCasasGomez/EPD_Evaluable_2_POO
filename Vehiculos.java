
/**
 *
 * @author Pablo Casas Gomez
 * @version 1.0 En esta Clase tenemos varios Metodos con Polimorfismo
 */

public class Vehiculos {  
    
    private String Marca;
    private String Modelo;
    
    private String numSerie;
    private String Direccion;

    private boolean Arrancado;

    private final int NUMEROPLAZASMAXIMO;
    private int Ocupantes;

    private final double CAPACIDADDEPOSITO;
    private double depositoRestante;

    private double Velocidad;
    private final double VELOCIDADMAXIMA;

    private double Peso;
    private final double PESOMAXIMO;

    public Vehiculos(String Marca, String Modelo, String numSerie, String Direccion, boolean Arrancado, int NUMEROPLAZASMAXIMO, int Ocupantes, double CAPACIDADDEPOSITO, double depositoRestante, double Velocidad, double VELOCIDADMAXIMA, double Peso, double PESOMAXIMO) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.numSerie = numSerie;
        this.Direccion = Direccion;
        this.Arrancado = Arrancado;
        this.NUMEROPLAZASMAXIMO = NUMEROPLAZASMAXIMO;
        this.Ocupantes = Ocupantes;
        this.CAPACIDADDEPOSITO = CAPACIDADDEPOSITO;
        this.depositoRestante = depositoRestante;
        this.Velocidad = Velocidad;
        this.VELOCIDADMAXIMA = VELOCIDADMAXIMA;
        this.Peso = Peso;
        this.PESOMAXIMO = PESOMAXIMO;
    }

    /**
     * @return La Marca del Vehiculo en cuestion
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * @param Marca nuevo nombre de la Marca del Vehiculo
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    /**
     * @return El Modelo del Vehiculo en cuestion
     */
    public String getModelo() {
        return Modelo;
    }

    /**
     * @param Modelo nuevo nombre del Modelo del Vehiculo
     */
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    /**
     * @return Numero de Serie del Vehiculo en cuestion
     */
    public String getNumSerie() {
        return numSerie;
    }

    /**
     * @param numSerie nuevo valor del numero de Serie del Vehiculo
     */
    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    /**
     * @return La Direccion en la cual se mueve el Vehiculo
     */
    public String getDireccion() {
        return Direccion;
    }

    /**
     * @param Direccion nuevo valor de la Direccion del Vehiculo
     */
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    /**
     * @return El estado actual del Vehiculo (Arrancado o no)
     */
    public boolean isArrancado() {
        return Arrancado;
    }

    /**
     * @param Arrancado establece si el Vehiculo esta o no Arrancado
     */
    public void setArrancado(boolean Arrancado) {
        this.Arrancado = Arrancado;
    }

    /**
     * @return El numero de plazas Maximas del vehiculo
     */
    public int getNUMEROPLAZASMAXIMO() {
        return NUMEROPLAZASMAXIMO;
    }

    /**
     *
     * @return El numero de Ocupantes del vehiculo
     */
    public int getOcupantes() {
        return Ocupantes;
    }

    /**Metodo que establece el nuevo valor de Ocupantes del Vehículo y comprueba que 
     * no se supere el valor maximo de plazas determinado
     * @param Ocupantes nuevo valor de Ocupantes del Vehiculo
     */
    public void setOcupantes(int Ocupantes) {
        if (Ocupantes <= this.NUMEROPLAZASMAXIMO) {
            this.Ocupantes = Ocupantes;
        } else {
            System.out.println("\nEl numero de Ocupantes es mayor que el numero de Plazas.");
        }

    }

    /**
     * @return La capacida Maxima del Deposito del Vehiculo
     */
    public double getCapacidadDeposito() {
        return CAPACIDADDEPOSITO;
    }

    /**
     * @return El valor de cuanto Deposito queda lleno en el vehiculo
     */
    public double getDepositoRestante() {
        return depositoRestante;
    }

    /**
     * @param depositoRestante establece el uso que se ha hecho del Deposito del
     * Vehiculo, comprobando que no se supere el valor maximo de capacidad de deposito
     */
    public void setDepositoRestante(double depositoRestante) {
        if (depositoRestante <= this.CAPACIDADDEPOSITO) {
            this.depositoRestante = depositoRestante;
        } else {
            System.out.println("\nEl valor introducido excede el valor maximo del deposito");
        }
    }

    /**
     * @return El valor de velocidad Actual del Vehiculo
     */
    public double getVelocidad() {
        return Velocidad;
    }

    /**
     * Metodo que modifica el valor de Velocidad siempre que cumpla el criterio de
     * Velocidad menor o igual que velocidad maxima
     * @param Velocidad nuevo valor de Velocidad del Vehiculo
     */
    public void setVelocidad(double Velocidad) {
        if (Velocidad <= this.VELOCIDADMAXIMA) {
            this.Velocidad = Velocidad;
        } else {
            System.out.println("\nLa velocidad es superior a la velocidad Maxima Permitida.");
        }
    }

    /**
     * @return El valor de velocidad Maximo del Vehiculo
     */
    public double getVelocidadMaxima() {
        return VELOCIDADMAXIMA;
    }

    /**
     * @return El valor del Peso del Vehiculo
     */
    public double getPeso() {
        return Peso;
    }

    /**
     * Modifica el valor de Peso siempre que no se super el valor maximo permitido
     * @param Peso establece el nuevo peso del Vehiculo
     */
    public void setPeso(double Peso) {
        if (Peso <= this.PESOMAXIMO) {
            this.Peso = Peso;
        } else {
            System.out.println("El valor de Peso es superior al Maximo permitido.");
        }
    }

    /**
     * @return El valor de Peso Maximo
     */
    public double getPESOMAXIMO() {
        return PESOMAXIMO;
    }

    /**
     * Metodo sin parametro que incrementa la velocidad del Vehiculo siempre que
     * no se supere la Velocidad Maxima del mismo,si superara a la velocidad
     * Maxima se de de indica que se alcanzo dicho valor. Este metodo no
     * devuelve ningún valor, se imprime por pantalla una frase que indica la
     * velocidad actual.
     */
    public void acelerar() {
        if (this.getVelocidad() < this.getVelocidadMaxima()) {
            this.setVelocidad(this.getVelocidad() + 1);
            System.out.println("La velocidad del Vehículo es de " + this.getVelocidad());
        } else {
            System.out.println("La velocidad " + this.getVelocidadMaxima() + "es la máxima");
        }
    }

    /**
     * Metodo sin parametro que disminuye la velocidad del Vehiculo y puede
     * llegar a deternlo por completo (velocidad=0). Este metodo no devuelve
     * ningún valor, se imprime por pantalla una frase que indica la velocidad
     * actual.
     */
    public void frenar() {
        if (this.getVelocidad() > 0) {
            this.setVelocidad(this.getVelocidad() - 1);
            System.out.println("La velocidad del Vehículo es de " + this.getVelocidad());
        } else {
            System.out.println("El Vehículo esta parado");
        }
    }

    /**
     * Metodo con parametro que suma el numero que recibe a la Velocidad Actual
     * siempre que no se supere la Velocidad Maxima del mismo, si superara a la
     * velocidad Maxima se de de indica que se alcanzo dicho valor.
     *
     * @param acelerar Objeto de tipo Double
     *
     * Este metodo no devuelve ningún valor, se imprime por pantalla una frase
     * que indica la velocidad actual.
     */
    public void acelerar(double acelerar) {
        if ((this.getVelocidad() + acelerar) < this.getVelocidadMaxima()) {
            this.setVelocidad(this.getVelocidad() + acelerar);
            System.out.println("La velocidad del Vehículo es de " + this.getVelocidad());
        } else {
            System.out.println("La velocidad " + this.getVelocidadMaxima() + "es la máxima");
        }
    }

    /**
     * Metodo con parametro que resta el numero que recibe a la Velocidad
     * Actual. En caso de que la resta sea 0 o menor que 0 se indicará que el
     * Vehiculo esta parado.
     *
     *
     * @param frenar Objeto de tipo Double
     *
     * Este metodo no devuelve ningún valor, se imprime por pantalla una frase
     * que indica la velocidad actual.
     */
    public void frenar(double frenar) {
        if ((this.getVelocidad() - frenar) > 0) {
            this.setVelocidad(this.getVelocidad() - frenar);
            System.out.println("La velocidad del Vehículo es de " + this.getVelocidad());
        } else {
            this.setVelocidad(0);
            System.out.println("El Vehículo esta parado");
        }
    }

    /**
     * Metodo sin parametro que incrementa el valor de Deposito Restante en 1,
     * llegando a la Capacidad Maxima del Deposito. Este metodo no devuelve
     * ningún valor, se imprime por pantalla una frase que indica el nivel de
     * Deposito Restante. En este caso hemos usado this. en lugar de hacer uso
     * de set y get para ver que el uso es indiferente
     */
    public void repostar() {
        while (this.depositoRestante < this.CAPACIDADDEPOSITO) {
            this.depositoRestante++;
            System.out.println("El deposito esta cargandose, estado actual : " + this.getDepositoRestante());
        }
        System.out.println("El deposito esta totalmente cargado con " + this.getDepositoRestante() + " L.");
    }

    /**
     * Metodo sin parametro que decrementa el valor de Deposito Restante en 1,
     * hasta llegar a 0. Este metodo no devuelve ningún valor, se imprime por
     * pantalla una frase que indica el nivel de Deposito Restante. En este caso
     * hemos usado this. en lugar de hacer uso de set y get para ver que el uso
     * es indiferente
     */
    public void consumirCombustible() {
        while (this.depositoRestante > 0) {
            this.depositoRestante--;
            System.out.println("El deposito esta cargandose, estado actual : " + this.getDepositoRestante());
        }
        System.out.println("El deposito esta totalmente descargado" + this.getDepositoRestante() + " L.");

    }

    /**
     *
     * @param Direccion a la cual se va a realizar el giro
     * @return Devuelve la direccion en cuestion
     */
    public String cambiarDireccion(String Direccion) {
        this.setDireccion(Direccion);
        return this.getDireccion();
    }

    /**
     * Metodo sin parametro que arranca el Vehiculo, en este caso no
     * consideramos ninguna variable limitante. En otras clases si se consideran
     * como veremos despues
     *
     * @return el valor booleano del atributo Arrancado siendo este true
     */
    public boolean arrancar() {
        this.setArrancado(true);
        return this.isArrancado();
    }

    /**
     * Metodo sin parametro que apaga el Vehiculo, en este caso no consideramos
     * ninguna variable limitante. En otras clases si se consideran como veremos
     * despues
     *
     * @return el valor booleano del atributo Arrancado siendo este false
     */
    public boolean apagar() {
        this.setArrancado(false);
        return this.isArrancado();
    }

    /**
     * Metodo sin parametro que incrementa en 1 el numero de Ocupantes del
     * Vehiculo siempre que no se llegue al maximo de plazas disponibles en cuyo
     * caso se indicará por pantalla.
     *
     * Este metodo no devuelve ningun valor, imprime por pantalla una frase
     * indicando el numero de ocupantes que hay en el vehiculo o si se alcanzo
     * el numero maximo de los mismos
     */
    public void aumentarOcupantes() {
        if (this.getOcupantes() <= this.getNUMEROPLAZASMAXIMO()) {
            this.setOcupantes(this.getOcupantes() + 1);
            System.out.println("El numero de Ocupantes es" + this.getOcupantes());
        } else {
            System.out.println("Esta al máximo");
        }
    }

    /**
     * Metodo con parametro que suma dicho valor al numero de Ocupantes previo
     * del Vehiculo siempre que no se llegue al maximo de plazas disponibles en
     * cuyo caso se indicará por pantalla.
     *
     * @param Ocupantes
     *
     * Este metodo no devuelve ningun valor, imprime por pantalla una frase
     * indicando el numero de ocupantes que hay en el vehiculo o si se alcanzo
     * el numero maximo de los mismos
     */
    public void aumentarOcupantes(int Ocupantes) {
        if ((this.getOcupantes() + Ocupantes) <= this.getNUMEROPLAZASMAXIMO()) {
            this.setOcupantes(this.getOcupantes() + Ocupantes);
            System.out.println("El numero de Ocupantes es" + this.getOcupantes());
        } else {
            System.out.println("Esta al máximo");
        }
    }

    /**
     * Redefinicion del metodo toString de la Clase Object
     *
     * @return Una frase (String) que indica diferentes atributos del Vehiculo
     */
    public String toString() {
        return "\n Vehiculo : " + this.getNumSerie()
                + "\n Marca : " + this.getMarca()
                + "\n Modelo : " + this.getModelo()
                + "\n Con Numero de Serie : " + this.getNumSerie()
                + "\n Con una Capacidad de Deposito de : " + this.getCapacidadDeposito()
                + "\n Actualmente queda un total de " + this.getDepositoRestante() + " del deposito"
                + "\n Le queda un total de : " + (this.getCapacidadDeposito() - this.getDepositoRestante()) + "restante"
                + "\n Presenta una Velocidad Actual de : " + this.getVelocidad();
    }

    /**
     * Redeficion de metodo equals de la Clase Object, que permite comrpobar si
     * dos objetos son el mismo, debido a la comprobacion de cada uno de sus
     * atributos.
     *
     * @param o El objeto a comparar
     * @return devuelve true en caso de ser el mismo objeto y false en caso de
     * ser objetos diferentes
     */
    public boolean equals(Object o) {
        Vehiculos v = (Vehiculos) o;
        return this.getNumSerie() == v.getNumSerie()
                && this.getMarca() == v.getMarca()
                && this.getModelo() == v.getModelo()
                && this.getVelocidadMaxima() == v.getVelocidadMaxima()
                && this.getVelocidad() == v.getVelocidad()
                && this.getCapacidadDeposito() == v.getCapacidadDeposito()
                && this.getDepositoRestante() == v.getDepositoRestante()
                && this.isArrancado() == v.isArrancado()
                && this.getDireccion() == v.getDireccion()
                && this.getNUMEROPLAZASMAXIMO() == v.getNUMEROPLAZASMAXIMO()
                && this.getOcupantes() == v.getOcupantes()
                && this.getPeso() == v.getPeso()
                && this.getPESOMAXIMO() == v.getPESOMAXIMO();

    }

}
