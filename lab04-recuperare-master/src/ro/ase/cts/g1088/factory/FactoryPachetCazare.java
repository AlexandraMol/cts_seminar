package ro.ase.cts.g1088.factory;

public class FactoryPachetCazare implements Factory {


    @Override
    public PachetTuristic crearePachet() {
        return  new PachetCazare();

    }
}
