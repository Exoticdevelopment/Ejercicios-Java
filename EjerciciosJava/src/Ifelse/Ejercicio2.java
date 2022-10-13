package Ifelse;
/* 2.La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto,
 ésta es de un sólo tipo y tamaño,
 se requiere determinar cuanto recibirá un productor por la uva que entrega en un embarque considerando lo siguiente:
 * Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si es de tamaño 2.
 * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2.*/

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //Definimos el precio del Kilo de Uva

        int kiloA= 5;
        int kiloB= 4;

        Scanner entrada= new Scanner(System.in);

        System.out.println("----Cuantos kilos de uva desea comprar----");

        int kilosdeuva= entrada.nextInt();

        System.out.println("----Que tipo de UVA ---- \n A) \n B)");

        String tipouva= entrada.next();

        if(tipouva.equals("A") || tipouva.equals("B")) { //Cuando quiero hacer una if con un valor string no se utiliza el ==" " , se utiliza el .equals(Valor String)
            System.out.println("----Que tipo de Tamaño desea----\n 1) \n 2)");

            int tamano= entrada.nextInt();

            if(tamano==1 || tamano==2 ){

                /* ---A--- */
                if (tipouva.equals("A") &&  tamano==1){
                    //Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1

                    int ecua1= kilosdeuva* kiloA;

                    float ecua2 = ecua1; //paso a ecua1 de int a float!

                    double ecua3 = ecua2 + 0.20;


                    System.out.println(ecua3);
                }
                else if (tipouva.equals("A") &&  tamano==2) {
                    //y 30 céntimos si es de tamaño 2.

                    int ecua1= kilosdeuva* kiloA;

                    float ecua2 = ecua1; //paso a ecua1 de int a float!

                    double ecua3 = ecua2 + 0.30;

                    System.out.println(ecua3);
                }
                /* ---B--- */

                if (tipouva.equals("B") &&  tamano==1){
                    //Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1,

                    int ecua1= kilosdeuva*kiloB;

                    float ecua2= ecua1;//paso a ecua1 de int a float!

                    double ecua3 = ecua2 -0.30;

                    System.out.println(ecua3);}
                if (tipouva.equals("B") &&  tamano==2){
                    //y - 50 céntimos cuando es de tamaño 2

                    int ecua1= kilosdeuva*kiloB;

                    float ecua2= ecua1;//paso a ecua1 de int a float!

                    double ecua3 = ecua2 -0.50;

                    System.out.println(ecua3);

                }

                }

            else {
                System.out.println("Error lea correctamente el enunciado y resuelvelo de nuevo!");

            }

        }
        else {
            System.out.println("Error lea correctamente el enunciado y resuelvelo de nuevo!");
        }

    }
}
