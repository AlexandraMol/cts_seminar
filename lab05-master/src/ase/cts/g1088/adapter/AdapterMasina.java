package ase.cts.g1088.adapter;

public class AdapterMasina implements JucarieMobila{
    Masina m;
    public AdapterMasina(){
        m=new Autoturism();
    }
    @Override
    public void seDeplaseaza() {
        m.ruleazaCuVitezaMare();
    }

    @Override
    public void emiteSunete() {
        m.claxoneaza();
    }
}
