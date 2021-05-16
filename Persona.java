/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pablo
 */
public class Persona {

    private String Nombre;
    private String Apellidos;
    private String DNI;

    private double edad;

    public Persona(String Nombre, String Apellidos, String DNI, double edad) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.DNI = DNI;
        this.edad = edad;
    }

    /**
     * 
     * @return El nombre de la Persona
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Metodo para modificar el nombre de la persona
     * @param Nombre Variable que indica el nuevo nombre de la persona
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * Metodo para obtener el apellido de la persona
     * @return El nombre de la persona en cuestion 
     */
    public String getApellidos() {
        return Apellidos;
    }

    /**
     * Metodo que permite modificar el apellido de la persona
     * @param Apellidos Variable que indica el nuevo apellido de la persona
     */
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    /**
     * Metodo que devuelve el valor del DNI de la persona
     * @return El valor del DNI de la persona
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * 
     * @param DNI El nuevo DNI a introducir
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    
    /**
     * Metodo que devuelve la edad de la persona en cuestion 
     * @return Double con la edad de la persona
     */
    public double getEdad() {
        return edad;
    }

    /**
     * Varia la edad de la persona
     * @param edad establece el valor de la edad en cuestion 
     */
    public void setEdad(double edad) {
        this.edad = edad;
    }

    /**
     * Redefinicion del metodo toString
     * @return 
     */
    public String toString() {
        return "\n" + this.getNombre()
                + " " + this.getApellidos() + " con DNI:"
                + this.getDNI() + " y con una edad de :"
                + this.getEdad();
    }

    /**
     * En este caso a diferencia de otros boolean hemos considerado solo el uso de DNI como comparador
     * @param o Objeto con el que queremos compararlo
     * @return 
     */
    public boolean equals(Object o) {
        Persona p = (Persona) o;
        return this.getDNI() == p.getDNI();
    }
}
