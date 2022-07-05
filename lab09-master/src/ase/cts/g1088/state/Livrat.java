package ase.cts.g1088.state;

public class Livrat extends ComandaMancare implements State {
    @Override
    public void updateState(ComandaMancare comandaMancare) {
        System.out.println("Finalizata");
    }
    public Livrat(State state) {
        super(state);
    }
}
