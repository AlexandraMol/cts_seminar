package ase.cts.g1088;
import ase.cts.g1088.flyweight.Masina;
import ase.cts.g1088.flyweight.MasinaFactory;
import ase.cts.g1088.flyweight.TipMasina;

public class MainFlyweigth {
    public static void main(String args[]) {


        MasinaFactory masinaFactory = new MasinaFactory();
        Masina camion = masinaFactory.getMasina(TipMasina.CamionRosu);
        camion.afiseaza();

        Masina camion2=masinaFactory.getMasina(TipMasina.CamionRosu);
        camion2.afiseaza();

        camion.setCuloare("albastru");
        camion.afiseaza();
        camion2.afiseaza();
    }
}
