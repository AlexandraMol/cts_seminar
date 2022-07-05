package ase.cts.g1088;

import ase.cts.g1088.facade.DealerAuto;
import ase.cts.g1088.facade.MasinaFamilie;
import ase.cts.g1088.proxy.Internet;
import ase.cts.g1088.proxy.InternetProvider;
import ase.cts.g1088.proxy.ProxyInternet;

public class Main {
    public static void main(String args[]){

        DealerAuto dealerAuto=new DealerAuto();

        System.out.println(dealerAuto.getDescriereMasinaFamilie());
        System.out.println(dealerAuto.getDescriereMasinaElectrica());
        System.out.println(dealerAuto.getDescriereMasinaSport());

        Internet internetProvider=new InternetProvider();
        internetProvider.connectToUrl("google.com");
        Internet proxyInternet=new ProxyInternet();

        proxyInternet.connectToUrl("facebook");
        proxyInternet.connectToUrl("google.com");

    }
}
