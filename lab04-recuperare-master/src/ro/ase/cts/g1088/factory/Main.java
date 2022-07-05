package ro.ase.cts.g1088.factory;

public class Main {
    public static void main(String args[]){

        Factory fact = new FactoryPachetCazare();
        PachetTuristic pachet= fact.crearePachet();

        pachet.afiseazaDetalii();

    }
}
