
package paquete2;

import paquete1.Clase1;

public class Clase3 extends Clase1{
    public Clase3(){
        super("protected");//llamamos al constructor de la clase padre
        this.atributoProtected = "Accedemos desde la clase hija";
        System.out.println("Atributo protected = " + this.atributoProtected);
        this.atributoProtected = "es totalmente publico";
        
    }
    
}
