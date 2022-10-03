import java.util.Scanner;

class Ejercicios {
    // vamos a hacer una calculadora, un conversos de unidades creacion de cuadros y de movimiento
    //los metodos son las operaciones de un objeto o de una clase,tambien llamada comportamiento

    //objetos
    Scanner entrada = new Scanner(System.in);

    //vamos a hacer un metodo para el menu del programa
    public void menu(){
        //menun del programa
        System.out.println("Ejercicios de yo para tu");
        System.out.println("a.- Calculadora");
        System.out.println("b.- Conversion de unidades");
        System.out.println("c.- Crear cuadros magicos");
        System.out.println("d.- Desplacamiento de cuadro");
        System.out.println("Elija una opcion");

        op = entrada.next().chatAT(index:0);

        switch(op){
            case 'a' :
            //implementamos metodos
            Ejercicio1();
            break;
            case 'b' :
            //implementamos metodos
            Ejercicio2();
            break;
            case 'c' :
            //implementamos metodos
            Ejercicio3();
            break;
            case 'd'
            //implementamos metodos
            Ejercicio4();
            break;

        }
            
        
    }
}