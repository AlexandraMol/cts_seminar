package ase.cts.g1088.state;

public class ComandaMancare {
    private State state;

    public ComandaMancare(State state) {
        this.state = state;
    }

    public ComandaMancare() {

    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void nextState(){
        this.state.updateState(this);
    }
}
