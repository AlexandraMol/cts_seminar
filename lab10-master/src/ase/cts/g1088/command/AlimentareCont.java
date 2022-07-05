package ase.cts.g1088.command;

public class AlimentareCont implements OperatiuneBancara{
    String cont;
    double suma;

    public AlimentareCont(String cont, double suma) {
        this.cont = cont;
        this.suma = suma;
    }

    @Override
    public void efectuareOperatiune() {
        System.out.println("Ai depus "+suma+" pentru contul "+cont);
    }
}
