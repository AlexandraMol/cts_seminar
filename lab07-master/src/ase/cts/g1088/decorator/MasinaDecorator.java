package ase.cts.g1088.decorator;

public abstract class MasinaDecorator implements Masina {
    protected Masina decoratedMasina;

    public MasinaDecorator(Masina m){
        this.decoratedMasina=m;
    }
    public void pornesteMotorul(){
        decoratedMasina.pornesteMotorul();
    }

}
