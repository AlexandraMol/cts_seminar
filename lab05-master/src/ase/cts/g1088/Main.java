package ase.cts.g1088;


import ase.cts.g1088.adapter.AdapterMasina;
import ase.cts.g1088.adapter.JucarieMobila;
import ase.cts.g1088.adapter.MasinaJucarie;
import ase.cts.g1088.builder.Autoturism;
import ase.cts.g1088.builder.InginerAuto;

public class Main {
    public static void main(String args[]){

        InginerAuto inginerAuto=new InginerAuto("test","de iarna","test","test12","test");
        inginerAuto.buildMasina();
        Autoturism auto= (Autoturism) inginerAuto.getMasina();
        System.out.println(auto);


        JucarieMobila adapterMasina=new AdapterMasina();

        adapterMasina.seDeplaseaza();
        adapterMasina.emiteSunete();


        JucarieMobila j1=new MasinaJucarie();
        j1.seDeplaseaza();
        j1.emiteSunete();

    }
}
