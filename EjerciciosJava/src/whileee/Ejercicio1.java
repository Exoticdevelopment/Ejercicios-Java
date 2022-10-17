package whileee;

import java.util.Scanner;

/* 1.Interactuemos un poco con el usuario final pidiéndole un valor inicial
y un valor final por consola, e incrementemos el valor inicial dado hasta el tope establecido,
mostrando el valor de la variable contadora en cada iteracion.
 */
public class Ejercicio1 {
    public static void main(String[] args) {

        //Interactuemos un poco con el usuario final pidiéndole un valor inicial
        //y un valor final por consola

     Scanner entrada = new Scanner(System.in);

        System.out.println("Digita un valor inicial");
     int inicial= entrada.nextInt();
        System.out.println("Digita un valor final");
     int finall= entrada.nextInt();

     //bucle whilee
        while (inicial<=finall){
            System.out.println(inicial);
            inicial++;
        }



    }
}
