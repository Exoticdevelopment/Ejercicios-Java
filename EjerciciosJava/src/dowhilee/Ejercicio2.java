package dowhilee;
/* Programa que lea 10 números desde teclado en un proceso repetitivo y muestre la suma.
Realizar el programa con <<do-while>> */

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        int sumador= 0;
        int iterador=10;

        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Digita un numero");
            int numero = entrada.nextInt();
            sumador+=numero;
            iterador--;



        }while (iterador>0);{
            System.out.println(sumador);
        }
        
    }
}
