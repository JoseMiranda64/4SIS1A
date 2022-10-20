public class Iguana extends Animal{
    
    int num_vidas;

    public Iguana(){

    }

    public Iguana(String nombre, String raza, String tipo_alimento, int edad, int num_vidas){
        
        super(nombre, raza, tipo_alimento, edad,num_vidas);
        this.num_vidas = num_vidas;
    }

    
    public int getNum_vidas(){
        return num_vidas;
    }

   
    public void setNum_vidas(int num_vidas){
        this.num_vidas = num_vidas;
    }

    
    public void mostrarIguana(){
        System.out.println("El nombre de la pequeña es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n" + "Se alimenta de: " +
        getTipo_alimento() +  "\n" + "Tiene la edad de: " + getedad() + "\n" + "Su num de vidas es: " + num_vidas);
    }




    
}
