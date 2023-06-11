
package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    static { //Bloque de inicializacion estatico
        System.out.println("Ejecicion bloque estatico");
        ++Persona.contadorPersonas;
        //idPersona = 10; noes estatico
    }
    
    {//Bloque de inicializacion no estatico (contexto dinamico)
        System.out.println("Ejecucion del bloque no estatico");
        this.idPersona = Persona.contadorPersonas++; //incrementamos atributo   
    }
    
    //Los bloques de inicializacionse ejecutan antes del constructor
    
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }
    
    public int getIdPersona(){
        return this.idPersona;
    }
}
