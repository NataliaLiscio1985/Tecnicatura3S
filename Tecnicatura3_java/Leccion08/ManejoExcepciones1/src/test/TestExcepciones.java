
package test;

import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        System.out.println("resultado = " + resultado);
        try{
            resultado = division(10,2);
        }catch (OperacionExcepcion e){
            System.out.println("Ocurrio un error de tipo operacionExcepcion");
            System.out.println(e.getMessage());
        } catch(Exception e){
            System.out.println("Ocurrio un error");
            e.printStackTrace(System.out); //Se conoce como la pila de excepciones
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Se reviso la division entre cero");
        }
        System.out.println("La variable de resultado tiene como valor = " +resultado);
    }
}
