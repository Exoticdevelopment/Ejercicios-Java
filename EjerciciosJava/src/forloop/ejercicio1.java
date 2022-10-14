package forloop;

import java.util.Scanner;

/* Ejercicio 1. Escribir un programa que imprima todos los números pares entre dos números que se le pidan al usuario. */
public class ejercicio1 {

    public static void main(String[] args) {
        //Los 2 numeros

        Scanner entrada = new Scanner(System.in);


        System.out.println("Digita un numero par!");//Pide el numero de inicio del ciclo for
        int primernumero= entrada.nextInt();

        System.out.println("Hasta que numero par desearias imprimir:");//Pide el numero de termino del ciclo for
        int segundonumero=entrada.nextInt();

        for (int i=primernumero;i <= segundonumero;i++){
            if (i % 2==0){
                System.out.println(i);

            }
        }

    }
}
