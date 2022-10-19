package whileee;

/* En este programa se ingresara un vbalor de n y nos muestra los primeros
* numeros naturales  */

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Digita un numero:");

        Scanner entrada = new Scanner(System.in);

        int i= entrada.nextInt();

        int n=i;

        System.out.println(i);

        while (i>=0){
            System.out.println(i);
            i--;
        }

    }
}
