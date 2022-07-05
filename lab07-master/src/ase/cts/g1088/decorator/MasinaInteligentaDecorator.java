package ase.cts.g1088.decorator;

public class MasinaInteligentaDecorator extends MasinaDecorator{
    public MasinaInteligentaDecorator(Masina m) {
        super(m);
    }

    public void pornesteMotorul(){
        decoratedMasina.pornesteMotorul();
        incalzesteScaune();
    }

    private void incalzesteScaune(){
        System.out.println("S-au incalzit scaunele");
    }

}
