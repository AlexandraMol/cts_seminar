package ase.cts.g1088.state;

public class MancareInPreparare extends ComandaMancare implements State {
    public MancareInPreparare(State state) {
        super(state);
    }

    @Override
    public void updateState(ComandaMancare comandaMancare) {
        comandaMancare.setState(new MancareGataDeLivrare(this.getState()));
        System.out.println("Comanda preparare -> livrare");
    }
}
