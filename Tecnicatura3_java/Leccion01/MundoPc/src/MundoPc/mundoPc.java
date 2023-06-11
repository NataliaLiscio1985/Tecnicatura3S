
package MundoPc;

import ar.com.system2023.mundopc.*;


public class mundoPc {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("Bluetooth","HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);      
    
        //Otros Objetos
        Monitor monitorGamer = new Monitor("Gamer", 32);
        Teclado tecladoGamer = new Teclado("Bluetooth","Gamer");
        Raton ratonGamer = new Raton("Bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
        
        
        Orden orden1 = new Orden(); //Inicializamos arreglo vacio
        Orden orden2 = new Orden ();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        
        Computadora computadorasVarias = new Computadora("Computadora de diferentes marcas", monitorHP,tecladoGamer, ratonHP);
        orden2.agregarComputadora(computadorasVarias);
        
        orden1.mostrarOrden();
        orden2.mostrarOrden();
        
        //TAREA
        //Crear mas objetos de tipo computadora con todos sus elementos
        //completar una lista en el objeto orden1 que llegue a los 10 elementos
        //probar de esta manera los metodos al maximo rendimiento
        
        //CREO LOS OBJETOS DE PARTES DE COMPUTADORAS
        Monitor monitorSamsung = new Monitor("Samsung", 45);
        Teclado tecladoSamsung = new Teclado("Bluetooth","Samsung");
        Raton ratonSamsung = new Raton("Bluetooth", "Samsung");
        
        Monitor monitorMicrosoft = new Monitor("Microsoft", 70);
        Teclado tecladoMicrosoft = new Teclado("Bluetooth","Microsoft");
        Raton ratonMicrosoft = new Raton("Bluetooth", "Microsoft");
        
        Monitor monitorApple = new Monitor("Apple", 70);
        Teclado tecladoApple = new Teclado("Bluetooth","Apple");
        Raton ratonApple = new Raton("Bluetooth", "Apple");
        
        Monitor monitorDell = new Monitor("Dell", 70);
        Teclado tecladoDell = new Teclado("Bluetooth","Dell");
        Raton ratonDell = new Raton("Bluetooth", "Dell");
        
        //CREO OBJETOS COMPUTADORA
        Computadora computadoraSamsung = new Computadora("Computadora Samsung", monitorSamsung, tecladoSamsung, ratonSamsung);
        Computadora computadoraMicrosoft = new Computadora("Computadora Microsoft", monitorMicrosoft, tecladoMicrosoft, ratonMicrosoft);
        Computadora computadoraApple = new Computadora("Computadora Apple", monitorApple, tecladoApple, ratonApple);
        Computadora computadoraDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);
        Computadora computadoraMix1 = new Computadora("Computadora Mix1", monitorGamer, tecladoDell, ratonMicrosoft);
        Computadora computadoraMix2 = new Computadora("Computadora Mix2", monitorDell, tecladoApple, ratonSamsung);
        Computadora computadoraMix3 = new Computadora("Computadora Mix3", monitorMicrosoft, tecladoSamsung, ratonDell);
        Computadora computadoraMix4 = new Computadora("Computadora Mix4", monitorApple, tecladoMicrosoft, ratonGamer);
        
        //COMPLETO LISTA ORDEN 1 CON 10 ELEMENTOS, PREVIAMENTE TENIA 2 CARGADOS (+8)
        orden1.agregarComputadora(computadoraSamsung);
        orden1.agregarComputadora(computadoraMicrosoft);
        orden1.agregarComputadora(computadoraApple);
        orden1.agregarComputadora(computadoraDell);
        orden1.agregarComputadora(computadoraMix1);
        orden1.agregarComputadora(computadoraMix2);
        orden1.agregarComputadora(computadoraMix3);
        orden1.agregarComputadora(computadoraMix4);
        
        //MOSTRAMOS LA LISTA COMPLETA ORDEN1
        orden1.mostrarOrden();
        
    }
    
}
