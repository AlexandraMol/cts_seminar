package ase.cts.g1088.state;

public class ComandaInCursLivrare extends ComandaMancare implements State {
    @Override
    public void updateState(ComandaMancare comandaMancare) {
        comandaMancare.setState(new Livrat(this.getState()));
        System.out.println("Comanda curs livrare -> livrata");

    }
    public ComandaInCursLivrare(State state) {
        super(state);
    }
}
