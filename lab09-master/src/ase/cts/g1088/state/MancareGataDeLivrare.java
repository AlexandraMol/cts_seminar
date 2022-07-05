package ase.cts.g1088.state;

public class MancareGataDeLivrare extends ComandaMancare implements State {

    public MancareGataDeLivrare(State state) {
        super(state);
    }

    @Override
    public void updateState(ComandaMancare comandaMancare) {
        comandaMancare.setState(new ComandaInCursLivrare(this.getState()));
        System.out.println("Comanda finalizata -> in curs de livrare");
    }
}
