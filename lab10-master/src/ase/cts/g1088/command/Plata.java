package ase.cts.g1088.command;

public class Plata implements OperatiuneBancara{
    String contDestinatie;
    double suma;

    public Plata(String contDestinatie, double suma) {
        this.contDestinatie = contDestinatie;
        this.suma = suma;
    }


    @Override
    public void efectuareOperatiune() {
        System.out.println("Ai efectuat plata pentru contul "+contDestinatie+" cu succes");
    }
}
