package ase.cts.g1088.facade;

public class MasinaElectrica implements Automobil{
    public String incarcator="";
    @Override
    public String getDescriere() {
        return "MasinaElectrica cu incarcator"+this.incarcator;
    }

    public MasinaElectrica(String incarcator) {
        this.incarcator = incarcator;
    }
}
