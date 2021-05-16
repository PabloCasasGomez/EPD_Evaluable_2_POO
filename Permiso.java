
/**
 *
 * @author Pablo Casas Gomez
 * @version 1.0 En este caso el tipoPermiso no puede establecerse desde fuera
 * por ello el set es private y no se incluye en el constructor
 */
public class Permiso {

    private boolean permisoActualizado;

    private String tipoPermiso;

    private int numeroOcupantesMaximo;
    private double Altura;
    private double Carga;

    public Permiso(boolean permisoActualizado, int numeroOcupantes, double Altura, double Carga) {
        this.permisoActualizado = permisoActualizado;
        this.numeroOcupantesMaximo = numeroOcupantes;
        this.Altura = Altura;
        this.Carga = Carga;
    }

    /**
     * @return Indica el valor de permisoActualizado
     */
    public boolean isPermisoActualizado() {
        return permisoActualizado;
    }

    /**
     * @param permisoActualizado Establece el atributo permisoActualizado
     */
    public void setPermisoActualizado(boolean permisoActualizado) {
        this.permisoActualizado = permisoActualizado;
    }

    /**
     * @return Devuelve el tipoPermiso
     */
    public String getTipoPermiso() {
        return tipoPermiso;
    }

    /**
     * @param tipoPermiso Establece el valor de tipoPermiso
     */
    private void setTipoPermiso(String tipoPermiso) {
        this.tipoPermiso = tipoPermiso;
    }

    /**
     * @return Devuelve el valor de numeroOcupantes
     */
    public int getNumeroOcupantes() {
        return numeroOcupantesMaximo;
    }

    /**
     * @param numeroOcupantes Establece el valor de numeroOcupantes
     */
    public void setNumeroOcupantes(int numeroOcupantes) {
        this.numeroOcupantesMaximo = numeroOcupantes;
    }

    /**
     * @return Devuelve el valor de Altura del objeto
     */
    public double getAltura() {
        return Altura;
    }

    /**
     * @param Altura Establece el valor de Altura del Objeto
     */
    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    /**
     * @return Devuelve el valor de cargaMaxima
     */
    public double getCarga() {
        return Carga;
    }

    /**
     * @param Carga Establece el valor de Carga del Objeto.
     */
    public void setCarga(double Carga) {
        this.Carga = Carga;
    }

    /**
     * Modifica el permiso a True y da por pantalla el mensaje del anio hasta el
     * que es valido
     *
     * @param Anio hasta que es valido el permiso
     */
    public void actualizarPermiso(int Anio) {
        this.setPermisoActualizado(true);
        System.out.println("\nEl permiso se ha validado hasta el año " + Anio);
    }

    /**
     *
     * @return un String indicando el tipo de Permiso de Altura que tiene
     */
    public String tipodePermisoAltura() {
        if (this.getAltura() > 5) {
            this.setTipoPermiso("El coche es Alto");
        } else if (this.getAltura() > 3) {
            this.setTipoPermiso("El coche presenta una altura Moderado");
        } else {
            this.setTipoPermiso("El coche es Bajo");
        }
        return this.getTipoPermiso();
    }

    /**
     *
     * @return un String indicando el tipo de Permiso de Pasajeros que tiene
     */
    public String tipodePermisoPasajeros() {
        if (this.getNumeroOcupantes() > 5) {
            this.setTipoPermiso("Alto número de pasajeros");
        } else if (this.getNumeroOcupantes() == 5) {
            this.setTipoPermiso("Capacidad de pasajeros Estandar");
        } else if (this.getNumeroOcupantes() < 5) {
            this.setTipoPermiso("Bajo número de pasajeros");
        }
        return this.getTipoPermiso();
    }

    /**
     *
     * @return un String indicando el tipo de Permiso de Carga que tiene
     */
    public String tipodePermisoCarga() {
        if (this.getCarga() > 10000) {
            this.setTipoPermiso("Alta capacidad de carga");
        } else if (this.getCarga() > 5000) {
            this.setTipoPermiso("Capacidad de Carga Estandar");
        } else{
            this.setTipoPermiso("Baja capacidad de carga");
        }
        return this.getTipoPermiso();
    }

    /**
     * Redefinicion del metodo toString de la Clase Object
     *
     * @return Una frase (String) qu indica diferentes atributos del Automovil
     */
    public String toString() {
        return "\nEl permiso es para un Vehiculo de Altura: " + this.Altura
                + "\n con una Carga de :" + this.Carga
                + "\n con un numero de pasajeros : " + this.numeroOcupantesMaximo;
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
        Permiso p = (Permiso) o;
        return this.Altura == p.Altura
                && this.Carga == p.Carga
                && this.numeroOcupantesMaximo == p.numeroOcupantesMaximo
                && this.tipoPermiso == p.tipoPermiso;

    }
}
