package ClasesObj;

public class Estudiantes {
    //Atributos:

    String nombre;
    String Apellido;
    int Edad;
    int Grado;

    //Constructor:

    public Estudiantes(String nombre ,String Apellido , int Edad , int Grado){
        this.nombre= nombre;
        this.Apellido=Apellido;
        this.Edad=Edad;
        this.Grado=Grado;


    }
    //Metodo:
    public void presentarse(){

        System.out.println("mi nombre es"+ " " +this.nombre+ " "  +"mi apellido es"+ " "  +this.Apellido+  " " +"Tengo"+ " "  +this.Edad+ " "  +"Años"+  " " +"Estoy en"+   " "  +this.Grado);

    }

    public static void main(String[] args) {
        Estudiantes primerest= new Estudiantes("Miguel", "Gonzalez",15,11);

        primerest.presentarse();

        Estudiantes segundoest= new Estudiantes("Isabela","Reyes",16,11);

        segundoest.presentarse();
    }
}

