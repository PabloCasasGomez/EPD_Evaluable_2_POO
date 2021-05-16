

/**
 *
 * @author pablo
 */
public abstract class Barco implements Comparable {

    private String Marca;
    private String Modelo;

    private double Peso;
    private final double PESOMAXIMO;

    private int Tripulantes;
    private final int TRIPULANTESMAXIMOS;

    private String inventarioTripulantes[][]; //Vamos a ver como en los constructores tenemos multiples filas determinadas por el valor de TRIPULANTESMAXIMOS pero solo 2 columnas puesto que solo queremos que haya nombre y cargo

    /**
     * Constructor que no requiere el paso por parametro de una tabla "inventarioTripulantes", ya que crea de manera automática una tabla vacia con filas=TRIPULANTESMAXIMOS
     * @param Marca
     * @param Modelo
     * @param Peso
     * @param PESOMAXIMO
     * @param Tripulantes
     * @param TRIPULANTESMAXIMOS 
     */
    public Barco(String Marca, String Modelo, double Peso, double PESOMAXIMO, int Tripulantes, int TRIPULANTESMAXIMOS) {
        this.inventarioTripulantes = new String[TRIPULANTESMAXIMOS][2];                //Considera 0 y 1
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Peso = Peso;
        this.PESOMAXIMO = PESOMAXIMO;
        this.Tripulantes=Tripulantes;
        this.TRIPULANTESMAXIMOS = TRIPULANTESMAXIMOS;
    }

    /**
     * Este constructor requiere que tengamos creado una tabla de inventario de Tripulantes en el main y que se le pase como parámetro
     * @param Marca
     * @param Modelo
     * @param Peso
     * @param PESOMAXIMO
     * @param Tripulantes
     * @param TRIPULANTESMAXIMOS
     * @param inventarioTripulantes 
     */
    public Barco(String Marca, String Modelo, double Peso, double PESOMAXIMO, int Tripulantes, int TRIPULANTESMAXIMOS, String[][] inventarioTripulantes) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Peso = Peso;
        this.PESOMAXIMO = PESOMAXIMO;
        this.Tripulantes = Tripulantes;
        this.TRIPULANTESMAXIMOS = TRIPULANTESMAXIMOS;
        this.inventarioTripulantes = inventarioTripulantes;
    }
   
    
    /**
     * @return Devuelve la Marca del Carguero
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * @param Marca Establece la Marca del Carguero
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    /**
     * @return Devuelve el Modelo en cuestion
     */
    public String getModelo() {
        return Modelo;
    }

    /**
     * @param Modelo Cadena donde se indica el Modelo a establecer
     */
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    /**
     * @return Devuelve el valor del Peso
     */
    public double getPeso() {
        return Peso;
    }

    /**
     * Metodo que modifica el valor del Peso siempre que este no supere al valor
     * maximo del mismo, en caso contrario imprime por pantalla un mensaje de
     * erro.
     *
     * @param Peso Establece el valor numerico de Peso
     */
    public void setPeso(double Peso) {
        if (Peso <= getPESOMAXIMO()) {
            this.Peso = Peso;
        } else {
            System.out.println("\n Se ha sobrepasado el peso maximo");
        }
    }

    /**
     * @return Devuelve el valor de PESOMAXIMO
     */
    public double getPESOMAXIMO() {
        return PESOMAXIMO;
    }

    /**
     * @return Devuelve el numero total de Tripulantes
     */
    public int getTripulantes() {
        return Tripulantes;
    }

    /**
     * Metodo que modifica el numero de Tripulantes siempre que este no supere
     * al valor maximo del mismo, en caso contrario imprime por pantalla un
     * mensaje de error.
     *
     * En este método podríamos haber implementado un throws Exception, sin embargo,
     * como ya hay ejemplos de otras Exceptions en el código hemos usado un System.out.println
     * 
     * @param Tripulantes numero de Tripulantes a introducir
     */
    public void setTripulantes(int Tripulantes){
        if (Tripulantes <= this.TRIPULANTESMAXIMOS) {
            this.Tripulantes = Tripulantes;
        } else {
            System.out.println("\nHa introducido mas tripulantes de los permitidos");
        }

    }

    /**
     * @return Devuelve el valor de TRIPULANTESMAXIMOS permitidos
     */
    public int getTRIPULANTESMAXIMOS() {
        return TRIPULANTESMAXIMOS;
    }

    /**
     * Metodo para obetener la tabla
     * @return Tabla de String [][] con los valores previamente introducidos,
     * en caso de no haberse introducido datos devolvera una tabla de null
     */
    public String[][] getInventarioTripulantes() {
        return inventarioTripulantes;
    }

    /**
     * Metodo abstracto que necesita ser implementado y desarrollado por las clases que
     * hagan uso de la clase abstracta Barco
     */
    public abstract void cumplimentarFicha();


    public double incrementaPeso() throws ExcesoDePesoException {
        if (Peso < PESOMAXIMO) {
            Peso = Peso + 1;
            return Peso;
        } else {
            throw new ExcesoDePesoException(toString());
        }
    }

    public int compareTo(Object o) {
        Barco n = (Barco) o;
        if (this.Peso == n.Peso) {
            return 0;
        } else if (this.Peso < n.Peso) {
            return -1;
        } else {
            return 1;
        }
    }

    /**
     * Redefinicion del metodo toString para que se impriman por pantalla los valores de Barco
     * @return 
     */
    public String toString() {
        return "\nBarco Marca: " + this.getMarca() + " Modelo: " + this.getModelo()
                + "\n con una Capacidad de Carga Máxima :" + this.getPESOMAXIMO()
                + "\n con Capacidad para un total de : " + this.getTripulantes() + " tripulantes.";
    }
    
    public boolean equals(Object o){
        Barco b=(Barco) o;
        
        return this.getMarca()==b.getMarca() &&
                this.getModelo()==b.getModelo() &&
                this.getPeso()==b.getPeso() &&
                this.getPESOMAXIMO()==b.getPESOMAXIMO() &&
                this.getTripulantes()==b.getTripulantes() &&
                this.getTRIPULANTESMAXIMOS()==b.getTRIPULANTESMAXIMOS();
    }
}
