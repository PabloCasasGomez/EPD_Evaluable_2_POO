
import java.util.Arrays;
import poo.io.IO;

/**
 * @author Pablo Casas Gomez
 * @version 1.0
 */
public class EPD_Evaluable_Vehiculos_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//
//        System.out.println("PRUEBA");
//        
//        System.out.println("---------------------------------------------------PRUEBA DE CLASE VEHICULO--------------------------------------------------------------------------------------------");
//
//        Vehiculos v1=new Vehiculos("Audi", "A3", "12891-X", "Recto", true, 5, 2, 70, 50, 10, 160, 900, 1100);
//        
//        /*Empezaremos con todos los getter y setter, 
//        es importante ver como los atributos FINAL no tienen set puesto que he definido que tengan que introducirse en el constructor, solo get.
//        Además usaremos Entrada/Salida para algun set, sin embargo en este trabajo son las clases Avion y Carguero 
//        las que implementan con mayor profundidad el paquete Entrada/Salida*/
//        System.out.println("Introduzca False si el Vehiculo esta Apagado o True si esta Encendido");
//        boolean Arrancado = IO.readBoolean();
//        v1.setArrancado(Arrancado);
//
//        System.out.println("Introduzca el valor de Deposito Restante");
//        double depositoRestante = IO.readNumber();
//        v1.setDepositoRestante(depositoRestante);
//
//        v1.setDireccion("Recto");
//        v1.setMarca("Mercedes");
//        v1.setModelo("S");
//        v1.setNumSerie("12350-8B");
//        v1.setOcupantes(3);
//        v1.setPeso(1500);
//        v1.setVelocidad(120);
//
//        System.out.println("Podemos ver como se han cambiado los atributos");
//
//        System.out.println(v1.getCapacidadDeposito());
//        System.out.println(v1.getDepositoRestante());
//        System.out.println(v1.getDireccion());
//        System.out.println(v1.isArrancado());
//        System.out.println(v1.getMarca());
//        System.out.println(v1.getModelo());
//        System.out.println(v1.getNUMEROPLAZASMAXIMO());
//        System.out.println(v1.getNumSerie());
//        System.out.println(v1.getOcupantes());
//        System.out.println(v1.getPESOMAXIMO());
//        System.out.println(v1.getPeso());
//        System.out.println(v1.getVelocidad());
//        System.out.println(v1.getVelocidadMaxima());
//        /*Todos los getter y setter funcionan*/
//
// /*Probamos como funcionan TODOS los metodos creados*/
//        System.out.println("Funcionamiento de los metodos");
//        v1.acelerar();
//        v1.acelerar(25);
//        v1.apagar();
//        v1.arrancar();
//        v1.aumentarOcupantes();
//        v1.aumentarOcupantes(3);
//        v1.cambiarDireccion("Derecha");
//        v1.consumirCombustible();
//        v1.frenar();
//        v1.frenar(25);
//        v1.repostar();

//        /*Probamos los metodos redefinidos de toString y equals*/
//        Vehiculos v2 = new Vehiculos("Seat", "Leon", "15322-B", "Recto", true, 5, 4, 18, 15, 10, 180, 1200, 1500);
//        Vehiculos v3 = new Vehiculos("Seat", "Leon", "15322-B", "Recto", true, 5, 4, 18, 15, 10, 180, 1200, 1500);
//
//        if (v2.equals(v3)) {
//            System.out.println("Son el mismo objeto");
//        } else {
//            System.out.println("Son diferentes");
//        }
//
//        System.out.println(v2.toString());
//        System.out.println(v3.toString());
//        /*Podemos probar algun metodo con restricciones para Vehiculos*/
//
//        v2.acelerar(1250);
//        v2.frenar(100);
//        v2.aumentarOcupantes(8);
//        v2.consumirCombustible();
//        v2.repostar();
//        v2.setPeso(2000);
//        v2.setOcupantes(5000);
//        v2.setVelocidad(5000);
//
//        
//        System.out.println("---------------------------------------------------PRUEBA DE CLASE AUTOMOVIL--------------------------------------------------------------------------------------------");
//
//        Automovil a1 = new Automovil("99999A", 5, true, "Mercedes", "CLA", "21156-K", "Recto", true, 5, 3, 50, 20, 10, 160, 1100, 1300, true, 5, 1.5, 150);
//        Automovil a2 = new Automovil("7762KD", 5, true, "Mercedes", "CLA", "21156-K", "Recto", true, 5, 3, 50, 20, 10, 160, 1100, 1300, true, 5, 1.5, 150);
//
//        /*Prueba de algunos set/get basicos*/
//        System.out.println(a1.getCapacidadDeposito() + " L");
//        System.out.println(a1.getNumeroMarchas());
//
//        a1.setNumeroMarchas(3);
//
//        System.out.println(a1.getNumeroMarchas());
//
//        a1.girarDerecha();
//        a1.terminarGiro();
//        a1.girarDerecha();
//        a1.terminarGiro();
//        a1.girarIzquierda();
//        
//        /*Hacemos uso de los bloques try/catch para capturar las excepciones, en este caso podemos ver que es ArrayIndexOutOfBoundsException genérico*/
//        
//        try {
//            a1.listaViajeros(3);
//        } catch (ArrayIndexOutOfBoundsException ae) {
//            System.out.println("El numero de viajeros es mas del permitido");
//        } 
//
//        a1.imprimirListaViajeros();
//        
//        
//        Automovil [] vectorautomovil = new Automovil [2];
//        
//        vectorautomovil[0]=a1;
//        vectorautomovil[1]=a2;
//        
//        System.out.println("Antes de ordenar: ");
//        
//        for (int i = 0; i < vectorautomovil.length; i++) {
//            System.out.println(vectorautomovil[i].toString());
//        }
//
//        Arrays.sort(vectorautomovil);
//        
//        System.out.println("Despues de ordenar: ");
//        for (int i = 0; i < vectorautomovil.length; i++) {
//            System.out.println(vectorautomovil[i].toString());
//        }
//         a1.obtenerPermiso();
//    
//        System.out.println("---------------------------------------------------PRUEBA DE CLASE AVION--------------------------------------------------------------------------------------------");
//
//        Avion av1 = new Avion(true, true, 10, 20, 100, 1000, 10, 20, 2, "Airbus", "A430", "184-L", "Recto", true, 10, 2, 1000, 500, 100, 800, 1500, 1900);
//
//        /*Probamos algunos de los metodos set/get*/
//        System.out.println(av1.getAltitud());
//        System.out.println(av1.getNumeroContainer());
//
//        av1.setAltitud(900);
//        av1.setNumeroContainer(11);
//
//        System.out.println(av1.getAltitud());
//        System.out.println(av1.getNumeroContainer());
//
//        System.out.println(av1.getNumRutasActuales());
//
//        try {
//            av1.anadirRutas(3);
//        }catch (Exception e){
//            System.out.println("El numero de rutas es superior al permitido");
//        }

///*Podemos ver como en el primer bloque de try/catch al estar volando el avion no permite anadir containers
//sin embargo al aterrizarlo podemos hacerlo*/
//
//        try {
//            av1.anadirContainer();
//        } catch (ExcesoDePesoException ae) {
//            ae.getMessage();
//        }
//
//        av1.Aterizar();
//
//        try {
//            av1.anadirContainer();
//        } catch (ExcesoDePesoException ae) {
//            ae.getMessage();
//        }
        Avion av2 = new Avion(true, true, 10, 20, 100, 1000, 80, 20, 2, "Airbus", "A430", "184-L", "Recto", true, 10, 2, 1000, 500, 100, 800, 1500, 1900);
        Avion av3 = new Avion(true, true, 10, 20, 100, 1000, 10, 20, 2, "BOING", "747", "184-L", "Recto", true, 10, 2, 1000, 500, 100, 800, 1500, 1900);

        Avion[] vectoravion = new Avion[2];

        vectoravion[0] = av2;
        vectoravion[1] = av3;

        System.out.println("Antes de ordenar con orden alternativo:");
        for (int i = 0; i < vectoravion.length; i++) {
            System.out.println(vectoravion[i].toString());
        }

        Arrays.sort(vectoravion);
        
        System.out.println("\nDespues de ordenar con orden alternativo:");
        for (int i = 0; i < vectoravion.length; i++) {
            System.out.println(vectoravion[i].toString());
        }
   
//        System.out.println("---------------------------------------------------PRUEBA DE CLASE CARGUERO--------------------------------------------------------------------------------------------");
//        /*En este caso vamos ha comprobar los métodos compareTo, equals, toString y vamos ha realizar uso de orden natural y de un orden alternativo
//            para asegurarnos que los nuevos métodos introducidos funcionan correctamente. Del mismo modo vamos a hacer uso de la exception propia de Exceso de peso*/
//        Carguero c2 = new Carguero(6, 12, "Mercedes", "CD3", 1500, 1800, 5, 2);
//        Carguero c3 = new Carguero(10, 20, "Evergreen", "CS2021", 1500, 1800, 8, 20);
////
////        try {
////            c2.anadirContainer();
////        } catch (ExcesoDePesoException ae) {
////            ae.getMessage();
////        }
//
//        System.out.println("Prueba de Ordenacion");
//
//          //c2.cumplimentarFicha();
//        System.out.println(c3.compareTo(c2));
//
//        System.out.println(c2.equals(c3));
//
//        Carguero[] vectorb = new Carguero[2];
//
//        vectorb[0] = c2;
//        vectorb[1] = c3;
//
//        System.out.println("Antes de ordenar con orden natural:");
//        for (int i = 0; i < vectorb.length; i++) {
//            System.out.println(vectorb[i].toString());
//        }
//
//        Arrays.sort(vectorb);
//
//        System.out.println("\nDespues de ordenar con orden natural: ");
//        for (int i = 0; i < vectorb.length; i++) {
//            System.out.println(vectorb[i].toString());
//        }
//
//        System.out.println("\nAntes de ordenar con orden alternativo:");
//        for (int i = 0; i < vectorb.length; i++) {
//            System.out.println(vectorb[i].toString());
//        }
//
//        Arrays.sort(vectorb, new comparePrioridadAlternativa());
//
//        System.out.println("Despues de ordenar: ");
//        for (int i = 0; i < vectorb.length; i++) {
//            System.out.println(vectorb[i].toString());
//        }

//        System.out.println("---------------------------------------------------PRUEBA DE CLASE PERMISO--------------------------------------------------------------------------------------------");
//        Permiso p1 = new Permiso(true, 3, 5, 1500);
//
//        /*Probamos set y get*/
//        System.out.println(p1.getAltura());
//        System.out.println(p1.getCarga());
//        System.out.println(p1.getNumeroOcupantes());
//        System.out.println(p1.isPermisoActualizado());
//
//        p1.setAltura(15);
//        p1.setCarga(1800);
//        p1.setNumeroOcupantes(5);
//        p1.setPermisoActualizado(false);
//
//        System.out.println(p1.getAltura());
//        System.out.println(p1.getCarga());
//        System.out.println(p1.getNumeroOcupantes());
//        System.out.println(p1.isPermisoActualizado());
//        
//        /*Probamos los metodos que devuelven el tipo de permiso en funcion de las caracteristicas del coche*/
//        System.out.println(p1.tipodePermisoAltura());
//        System.out.println(p1.tipodePermisoCarga());
//        System.out.println(p1.tipodePermisoPasajeros());
//
//        System.out.println("---------------------------------------------------PRUEBA DE CLASE PERSONA--------------------------------------------------------------------------------------------");
//        Persona p1=new Persona("Pablo", "Casas Gómez", "189198-B", 26);
//        
//        
//        /*Hacemos usos de los get/set*/
//        System.out.println(p1.getApellidos());
//        System.out.println(p1.getNombre());
//        System.out.println(p1.getDNI());
//        System.out.println(p1.getEdad());
//        
//        p1.setNombre("David");
//        p1.setApellidos("Casas Gómez");
//        p1.setDNI("5684984-J");
//        p1.setEdad(24);
//        
//        System.out.println(p1.getApellidos());
//        System.out.println(p1.getNombre());
//        System.out.println(p1.getDNI());
//        System.out.println(p1.getEdad());
//        
//        System.out.println("--------------------------------HACEMOS USO DE TOSTRING----------------");
//        System.out.println(p1.toString());
//
//        Persona p2=new Persona("Pablo", "Casas Gómez", "189198-B", 26);
//        Persona p3=new Persona("Pablo", "Casas Gómez", "189198-B", 26);
//        
//        System.out.println(p2.equals(p3));
    }
}

