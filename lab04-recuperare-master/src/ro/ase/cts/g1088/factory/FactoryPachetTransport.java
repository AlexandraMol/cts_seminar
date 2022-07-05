package ro.ase.cts.g1088.factory;

public class FactoryPachetTransport implements Factory{


    @Override
    public PachetTuristic crearePachet() {
        return new PachetTransport();
    }
}
