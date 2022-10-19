package ClasesObj;

public class Perro {
    //Atributos

    String raza;
    int peso;
    int Edad;
    String color;

    //Constructor
    public Perro(String raza , int peso , int Edad , String color){
        this.raza = raza;
        this.peso = peso;
        this.Edad= Edad;
        this.color =color;
    }
    //metodos!
    public void ladrar(){
        System.out.println("Wawao");
    }

    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                ", peso=" + peso +
                ", Edad=" + Edad +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        //PRIMER OBJETO
        Perro oky = new Perro("shitzu",10, 1, "mono con amarillo");

        System.out.println(oky);

        oky.ladrar();
    }
}
