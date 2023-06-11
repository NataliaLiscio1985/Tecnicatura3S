
package test;

import domain.Persona;


public class TestForEach {
    public static void main(String[] args) {
        int edades [] = {5,6,8,9};
        for (int edad: edades) { //Sintaxis forEach - la variable definida almacena cada valor del array en cada vuelta del ciclo
            //la variable del for each debe ser del mismo tipo que el array
            System.out.println("edad= "+edad);
        }
        
        Persona personas[] = {new Persona("Juan"), new Persona("Carla"), new Persona("Beatriz")};
        
        //ForEach
        for(Persona persona: personas){
            System.out.println("persona = " + persona);
        }
        
    }
}

