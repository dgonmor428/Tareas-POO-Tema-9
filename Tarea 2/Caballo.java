public class Caballo {
    public String nombre;
    public String color;
    public String raza;
    public String sexo;
    public int edad;
    public double peso;

    //Constructores
    public Caballo(String sexo, String color, String raza, String nombre, int edad, double peso){
        this.sexo = sexo;
        this.color = color;
        this.raza = raza;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }
    //Métodos
    public void saluda1(){
        System.out.println("Hola, me llamo " + this.nombre);
    }
    public void paso(){
        System.out.println("Tocotoc tocotoc tocotoc");
    }
    public void habla(){
        System.out.println("Hiiiiiiieeeeeee");
    }
    public void saluda2(){
        System.out.println("Hola, yo soy " + this.nombre);
    }
    public void come(){
        System.out.println("Ñam ñam ñam");
    }
    
}
