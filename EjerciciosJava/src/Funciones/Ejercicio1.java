package Funciones;
/* 1.Desarrolla un programa java que pida al usuario que introduzca un número entero que este entre 1 y 9.
 Y dibuja por pantalla la tabla de multiplicar de dicho número. */

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        System.out.println("Digite un numero entero entre el 1 al 9:");

        Scanner entrada= new Scanner(System.in);

        int numero= entrada.nextInt();


        if (numero>=1 && numero<=9){

            for (int i=0; i<10; i++){

                int multiplicador= numero*i;

                int mult=i;

                System.out.println(numero+"*"+i+"="+multiplicador);
            }

        }

        else {
            System.out.println("Error!");
        }


    }

}
