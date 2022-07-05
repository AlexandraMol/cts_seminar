package ase.cts.g1088.state;

public class ComandaPlasata extends ComandaMancare implements State {

    public ComandaPlasata() {
    }

    public ComandaPlasata(State state) {
        super(state);
    }

    @Override
    public void updateState(ComandaMancare comandaMancare) {
        comandaMancare.setState(new PlataEfectuata(this.getState()));
        System.out.println("Comanda mancare -> plasata");

    }
}
