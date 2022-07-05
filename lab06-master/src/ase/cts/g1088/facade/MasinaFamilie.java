package ase.cts.g1088.facade;

public class MasinaFamilie implements Automobil {

    public int nrScaunCopil;

    public MasinaFamilie(int nrScaunCopil) {
        this.nrScaunCopil = nrScaunCopil;
    }
    public MasinaFamilie() {

    }

    @Override
    public String getDescriere() {
        return "MasinaFamilie cu " + this.nrScaunCopil +" scaune de copii";
    }
}
