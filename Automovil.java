
import poo.io.IO;

/**
 *
 * @author Pablo Casas Gomez
 * @version 1.0
 */
public class Automovil extends Vehiculos implements Comparable {

    private String Matricula;

    private int numeroMarchas;

    private boolean Intermitente;

    private Permiso modeloPermiso;

    private Persona viajeros[];

    private int numviajerosactual;//Contador de viajeros en coche

    private static final int NUMMAXPERSONA = 2;

    public Automovil(String Matricula, int numeroMarchas, boolean Intermitente, String Marca, String Modelo, String numSerie, String Direccion,
            boolean Arrancado, int PLAZAS, int Ocupantes, double CAPACIDADDEPOSITO, double depositoRestante, double Velocidad, double VELOCIDADMAXIMA, double Peso, double PESOMAXIMO,
            boolean permisoActualizado, int numeroOcupantesMaximo, double Altura, double Carga) {
        super(Marca, Modelo, numSerie, Direccion, Arrancado, PLAZAS, Ocupantes, CAPACIDADDEPOSITO, depositoRestante, Velocidad, VELOCIDADMAXIMA, Peso, PESOMAXIMO);
        this.Matricula = Matricula;
        this.numeroMarchas = numeroMarchas;
        this.Intermitente = Intermitente;

        this.modeloPermiso = new Permiso(permisoActualizado, numeroOcupantesMaximo, Altura, Carga);
        this.viajeros = new Persona[NUMMAXPERSONA];
    }

    /**
     * @return Devuelve la Matricula del Automovil
     */
    public String getMatricula() {
        return Matricula;
    }

    /**
     * @param Matricula Establece la Matricula del Automovil en cuestion.
     */
    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    /**
     * @return El numeroMarchas que tiene el Automovil
     */
    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    /**
     * @param numeroMarchas Establece el numeroMarchas que tiene el Automovil
     */
    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    /**
     * @return Devuelve si el Intermitente del Automovil esta encendido o no
     */
    public boolean isIntermitente() {
        return Intermitente;
    }

    /**
     * @param Intermitente Establece el valor de Intermitente (true=activo o
     * false=apagado)
     */
    public void setIntermitente(boolean Intermitente) {
        this.Intermitente = Intermitente;
    }

    /**
     * Metodo con parametro que permite establecer un cambio de direccion
     * siempre y cuando el intermitente este apagado y la direccion previa sea
     * Recto
     *
     * @param Direccion indica a que direccion vamos a ir, sin codificar.
     */
    public void Girar(String Direccion) {
        if (this.isIntermitente() == false && super.getDireccion() == "Recto") {
            this.setIntermitente(true);
            super.setDireccion(Direccion);
            System.out.println("Se esta realizando un giro hacia la " + Direccion);
        } else {
            System.out.println("Ya esta realizandose una maniobra");
        }
    }

    /**
     * Metodo sin parametro que permite establecer un cambio de direccion a la
     * Derecha siempre y cuando el intermitente este apagado y la direccion
     * previa sea Recto
     *
     */
    public void girarDerecha() {
        if (this.isIntermitente() == false && super.getDireccion() == "Recto") {
            this.setIntermitente(true);
            super.setDireccion("Derecha");
            System.out.println("Se esta realizando un giro hacia la Derecha");
        } else {
            System.out.println("Ya esta realizandose una maniobra");
        }
    }

    /**
     * Metodo sin parametro que permite establecer un cambio de direccion a la
     * Izquierda siempre y cuando el intermitente este apagado y la direccion
     * previa sea Recto
     *
     */
    public void girarIzquierda() {
        if (this.isIntermitente() == false) {
            this.setIntermitente(true);
            super.setDireccion("Izquierda");
            System.out.println("Se esta realizando un giro hacia la Izquierda");
        } else {
            System.out.println("Ya esta realizandose una maniobra");
        }
    }

    /**
     * Metodo sin parametro que permite terminar el giro, estableciendo el valor
     * de Direcion a "Recto" y apagando los intermitentes.
     */
    public void terminarGiro() {
        if (this.isIntermitente() == true || super.getDireccion() != "Recto") {
            this.setIntermitente(false);
            super.setDireccion("Recto");
            System.out.println("Se ha completado el giro");
        } else {
            System.out.println("No había ningun giro en marcha");
        }
    }

    /**
     * Metodo sin parametro proviniente de la Clase Agregada "Permiso" que
     * permite obtener el titulo de los permisos que tiene nuestro coche, segun
     * Altura, Carga y Pasajeros.
     */
    public void obtenerPermiso() {
        System.out.println(modeloPermiso.tipodePermisoAltura());
        System.out.println(modeloPermiso.tipodePermisoPasajeros());
        System.out.println(modeloPermiso.tipodePermisoCarga());
    }

    /**
     * Metodo con parametro que llama al metodo de la clase "Permiso" y permite
     * actualizar al anio necesario el permiso del Automovil
     *
     * @param Anio indica el anio hasta el cual el permiso es valido
     */
    public void renovarPermiso(int Anio) {
        modeloPermiso.actualizarPermiso(Anio);
    }

    /**
     * Redefinicion del metodo toString de la Clase Object
     *
     * @return Una frase (String) qu indica diferentes atributos del Automovil
     */
    public String toString() {
        return "\nEl Automovil:"
                + "\nCon Matricula: " + this.getMatricula()
                + "\ncCon un Numero de Marchas de : " + this.getNumeroMarchas()
                + super.toString();
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
        Automovil au = (Automovil) o;
        return super.equals(o)
                && this.isIntermitente() == au.isIntermitente()
                && this.getMatricula() == au.getMatricula()
                && this.getNumeroMarchas() == au.getNumeroMarchas()
                && this.modeloPermiso.tipodePermisoAltura() == au.modeloPermiso.tipodePermisoAltura()
                && this.modeloPermiso.tipodePermisoCarga() == au.modeloPermiso.tipodePermisoCarga()
                && this.modeloPermiso.tipodePermisoPasajeros() == au.modeloPermiso.tipodePermisoPasajeros();
    }

    /*-----------------------------------------------------------------------------------------*/
    /**
     * Metodo que crea una nueva persona y la introduce en la posicion i de la
     * tabla "viajeros"
     *
     * @param numViajeros el numero de viajeros totales que vamos a introducir
     * @throws Exception Devuelve una Exception en caso de que el numero de
     * personas a introducir sea mayor que el permitido
     */
    public void listaViajeros(int numViajeros) throws ArrayIndexOutOfBoundsException {
        for (int i = 0; i < numViajeros; i++) {
            if (i < NUMMAXPERSONA) {
                System.out.println("Introduzca el Nombre de la Persona");
                String nombre = IO.readLine();
                System.out.println("Introduzca el Apellidos de la Persona");
                String apellidos = IO.readLine();
                System.out.println("Introduzca el DNI de la Persona");
                String DNI = IO.readLine();
                System.out.println("Introduzca la edad de la Persona");
                double edad = IO.readNumber();

                viajeros[i] = new Persona(nombre, apellidos, DNI, edad);
                
                numviajerosactual++;
            } else {
                throw new ArrayIndexOutOfBoundsException();
            }

        }
        System.out.println("Se han actualizado los viajeros");
    }
    
    public void imprimirListaViajeros(){
        for(int i=0;i<numviajerosactual;i++){
            System.out.println("EL viajero "+(i+1)+" es: "+ viajeros[i]);
        }
    }


    /*---------------------------------------------------------------------------------------------PREGUNTAR---------------*/
    /**
     *
     * @return
     */
    public int getNUMMAXPERSONA() {
        return this.NUMMAXPERSONA;
    }

    /**
     * Metodo compareTo por el cual establecemos un nuevo orden natural en esta
     * clase. Para este caso compara en primer lugar la altura, en segundo lugar
     * la carga, en tercer lugar el Permiso de pasajeros y por ultimo el numero
     * efectivo de pasajeros
     *
     * @param o Obejeto con el cual vamos a compararlo
     * @return -1;1;0 en caso de si son diferentes o iguales
     */
    public int compareTo(Object o) {
        Automovil a = (Automovil) o;
        int cmp = this.modeloPermiso.tipodePermisoAltura().compareToIgnoreCase(a.modeloPermiso.tipodePermisoAltura());

        if (cmp == 0) {
            cmp = this.modeloPermiso.tipodePermisoCarga().compareToIgnoreCase(a.modeloPermiso.tipodePermisoCarga());
            if (cmp == 0) {
                cmp = this.modeloPermiso.tipodePermisoPasajeros().compareToIgnoreCase(a.modeloPermiso.tipodePermisoPasajeros());
                if (cmp == 0) {
                    cmp=this.numviajerosactual-a.numviajerosactual;
                }
            }
        } else {
            cmp = 1;
        }
        return cmp;
    }

}
