package ro.ase.cts.g1088.factory;

public class FactoryPachetComplet implements Factory {

    @Override
    public PachetTuristic crearePachet() {
        return new PachetComplet();
    }
}
