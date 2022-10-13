package Ifelse;
/*
1.El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de cobrar es la siguiente:
* Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
* De 50 a 99 alumnos, el costo es de 70 euros.
* De 30 a 49 alumnos, el costo es de 95 euros.
* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos.
Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe pagar cada alumno por el viaje.  */

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        System.out.println("Cuantos alumnos iran al viaje:");

        Scanner entrada = new Scanner(System.in);

        int alumnos= entrada.nextInt();


        if (alumnos>=100){

            int precioxalum= 65;

            ecuacion(alumnos,precioxalum);
        }
        else if (alumnos>=50 && alumnos<=99) {

            int precioxalum1= 70;

            ecuacion(alumnos,precioxalum1);

        }
        else if (alumnos>=30 && alumnos<=49) {

            int precioxalum2= 95;

            ecuacion(alumnos,precioxalum2);

        }

        else {
            int cuentaxalumno= 4000/alumnos;

            System.out.println("Se le debe pagar a la compañia de buses 4000 euros" + " "+"y por alumno debe pagar" + " " + cuentaxalumno + " "+ "Euros");


        }

    }

    //Funcion:|
    public static void ecuacion(int nalumnos , int precio) {
        int ecua= nalumnos*precio;
        System.out.println("Se le debe pagar a la compañia de buses"+ " " +ecua+" "+"y el precio x alumno es de :"+" "+precio+ " "+"Euros");
    }
}
