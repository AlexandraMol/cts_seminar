package ase.cts.g1088.proxy;

public class InternetProvider implements Internet{
    @Override
    public void connectToUrl(String url) {
        System.out.println("Connectat cu succes");
    }
}
