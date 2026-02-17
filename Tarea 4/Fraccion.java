public class Fraccion {
    // atributos
    private int numerador;
    private int denominador;


    // constructor
    Fraccion(int numerador, int denominador) {
        if (denominador == 0) throw new IllegalArgumentException("No se puede crear una fraccion con denominador 0");
        this.numerador = numerador;
        this.denominador = denominador;
    }

    // metodos
    public Fraccion invertir() {
        return new Fraccion(denominador, numerador);
    }

    public Fraccion multiplicar(Fraccion otra) {
        return new Fraccion(numerador * otra.numerador, denominador * otra.denominador);
    }

    public String toString() {
        return numerador + "/" + denominador;
    }

    public Fraccion sumar(Fraccion otra){
        return new Fraccion((numerador * otra.denominador) + (otra.numerador * denominador), denominador * otra.numerador);
    }

    public Fraccion simplificar(){
        int mcd = MCD(numerador, denominador);
        return new Fraccion(numerador /mcd, denominador / mcd);
    }


    private int MCD(int a, int b){
        while (b != 0){
            int aux = b;
            b = a % b;
            a = aux;
        }
        return a;
    }

}