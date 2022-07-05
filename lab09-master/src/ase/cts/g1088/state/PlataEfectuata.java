package ase.cts.g1088.state;

public class PlataEfectuata extends ComandaMancare implements State{
    public PlataEfectuata(State state) {
        super(state);
    }


    @Override
    public void updateState(ComandaMancare comandaMancare) {
        comandaMancare.setState(new MancareInPreparare(this.getState()));
        System.out.println("Comanda plasata -> preparare");
    }
}
