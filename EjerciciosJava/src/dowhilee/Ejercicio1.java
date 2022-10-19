package dowhilee;
/*Realiza un programa en Java que lea dos números pasados por teclado en un proceso repetitivo.
 Este proceso terminará cuando los números leídos sean iguales.
*  */

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        System.out.println("----En este programa digitaras dos numeros :---- \n Recuerda que el primer numero" +
                "debe ser mayor al segundo!");

        Scanner reader = new Scanner(System.in);

        System.out.println("Introduce el número 1:");
        int numero1 = reader.nextInt();
        System.out.println("Introduce el número 2:");
        int numero2 = reader.nextInt();
        do {
            System.out.println(numero1);
            numero1--;

        }while(numero1!=numero2);
        System.out.println("Has terminado, los números son iguales");
    }
}
