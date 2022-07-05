package ase.cts.g1088.facade;

public class MasinaSport implements Automobil{
    public int electron;

    public MasinaSport(int electron) {
        this.electron = electron;
    }

    @Override
    public String getDescriere() {

        return "MasinaSport "+this.electron;
    }
}
