package ase.cts.g1088.flyweight;

public class Autoturism extends Masina{

    public String suportBicileta;

    public Autoturism(String roti, String exterior, String sigla, String culoare, String suportBicileta) {
        super(roti, exterior, sigla, culoare);
        this.suportBicileta = suportBicileta;
    }

    @Override
    public void afiseaza() {
        System.out.println("Autoturism{" +
                "suportBicileta='" + suportBicileta + '\'' +
                ", roti='" + roti + '\'' +
                ", exterior='" + exterior + '\'' +
                ", sigla='" + sigla + '\'' +
                ", culoare='" + culoare + '\'' +
                '}');
    }

}
