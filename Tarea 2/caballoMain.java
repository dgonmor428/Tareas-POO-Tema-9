public class caballoMain {
    public static void main(String[] args) {
        Caballo caballo1 = new Caballo("M", "Negro", "Callejero", "Babieca", 8, 10);

        Caballo caballo2 = new Caballo("H", "Negro", "Salvaje", "Lykos", 8, 10);
    
        caballo1.saluda1();
        caballo1.paso();
        caballo1.habla();
        caballo2.saluda2();
        caballo2.come();
        caballo2.paso();

    }

}
