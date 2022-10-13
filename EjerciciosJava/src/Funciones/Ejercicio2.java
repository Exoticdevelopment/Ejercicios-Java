package Funciones;

import java.util.Scanner;

/* 2.Escribe un programa Java que pida al usuario que introduzca los siguientes datos:
Su nombre (tipo String)
El año de su Nacimiento (tipo int)
Si tiene o no carnet de conducir (tipo boolean)
Si el usuario tiene 18 años o más, y tiene carnet de conducir,
 el programa tiene que pintar por pantalla un mensaje con el nombre del usuario y
diciendo que está autorizado para conducir un coche. Para el resto de posibilidades, escribe el mensaje que estimes más oportuno. */
public class Ejercicio2 {
    public static void main(String[] args) {

        System.out.println("Digite su nombre:");

        Scanner entrada = new Scanner(System.in);

        String name = entrada.next();

        System.out.println("Digite su edad:");

        int edad= entrada.nextInt();

        System.out.println("Conteste con false o true / Tienes carnet de conducir?");

        boolean carnet= entrada.nextBoolean();

        requisitos(name , edad , carnet);



    }

    public static void requisitos(String nombre , int year , boolean pase) {
        if (pase==true && year>= 18 ){
            System.out.println(nombre +" " + "Puedes conducir un coche");
        }

        else {
            System.out.println("No eres apto para manejar un auto!");
        }
    }
}

