package ase.cts.g1088.flyweight;

public class Camion extends Masina{

    public String remorca;

    public Camion(String roti, String exterior, String sigla, String culoare, String remorca) {
        super(roti, exterior, sigla, culoare);
        this.remorca = remorca;
    }

    @Override
    public void afiseaza() {
        System.out.println("Camion{" +
                "remorca='" + remorca + '\'' +
                ", roti='" + roti + '\'' +
                ", exterior='" + exterior + '\'' +
                ", sigla='" + sigla + '\'' +
                ", culoare='" + culoare + '\'' +
                '}');
    }

}
