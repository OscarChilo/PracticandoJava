package TemasEda.ClasesMetodosAbstratos;

public class Principal {
    public static void main(String[] args) {
        Planta planta = new Planta();
        AnimalCarnivoro anicarni = new AnimalCarnivoro();

        planta.alimentarse();
        anicarni.alimentarse();
    }
}
