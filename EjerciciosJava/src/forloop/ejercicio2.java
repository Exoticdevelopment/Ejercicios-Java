package forloop;
/*Imprimir los números del 1 al 20.

Para números divisibles por 3, imprimir “Fizz”.
Para números divisibles por 5, imprimir “Buzz”.
Para números divisibles por 3 y 5, imprimir “FizzBuzz”.
En cualquier otro caso, imprimir el número. */

public class ejercicio2 {
    public static void main(String[] args) {

        //Ciclo for del 1-20

        for (int i=1 ; i<=20; i++){

            if (i%3==0){

                System.out.println(i+" "+"\nFizz");

            }

            if (i%5==0){
                System.out.println(i+" " +"\nBuzz");
            }

            if (i%3==0 && i%5==0){
                System.out.println(i+ " " +"\nFizzBuzz");
            }

        }
    }

}

