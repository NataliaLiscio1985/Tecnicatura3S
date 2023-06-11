import java.util.Scanner;

public class CalculadoraUTN {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while(true){//ciclo infinito
        System.out.println("*******Aplicacion Calculadora*******");
        mostrarMenu();

                try{
            var operacion = Integer.parseInt(entrada.nextLine());
            if(operacion >= 1 && operacion <=4) {
                ejecutarOperacion(operacion,entrada);
            }
                else if(operacion == 5){
                    System.out.println("Hasta pronto...");
                    break;//Rompe el ciclo y sale
                }//fin else if
                else{
                    System.out.println("Opcion erronea: "+operacion);
                }
            //Imprimimos un salto de linea antes de repetir el menu
                System.out.println();
            } catch (Exception e){
                System.out.println("Ocurrio un error: "+e.getMessage());
                }
             } //Fin while
    }//fin main

    private static void mostrarMenu(){
        //Mostramos el menu
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicacion
                4. Division
                5. Salir
                """);
        System.out.println("Operacion a realizar? ");
    }

    private static void ejecutarOperacion(int operacion, Scanner entrada){
        System.out.println("Digite el valor para el operando 1:");
        var operando1 = Double.parseDouble(entrada.nextLine());
        System.out.println("Digite el valor para el operando 2:");
        var operando2 = Double.parseDouble(entrada.nextLine());
        Double resultado;

        switch (operacion) {
            case 1 -> {
                resultado = operando1 + operando2;
                System.out.println("Resultado de la suma: " + resultado);
            }
            case 2 -> {
                resultado = operando1 - operando2;
                System.out.println("Resultado de la resta: " + resultado);
            }
            case 3 -> {
                resultado = operando1 * operando2;
                System.out.println("Resultado de la multiplicacion: " + resultado);
            }
            case 4 -> {
                resultado = operando1 + operando2;
                System.out.println("Resultado de la division: " + resultado);
            }
            default -> System.out.println("Opcion erronea: " + operacion);
        }
    }
} //fin clase
