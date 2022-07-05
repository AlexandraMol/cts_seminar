package ase.cts.g1088.facade;

public class DealerAuto {
    public Automobil masinaFamilie=null;
    public Automobil masinaSport=null;
    public Automobil masinaElectrica=null;
    //parametru care sa fie transmis mai departe;
    public String getDescriereMasinaFamilie(){
        if(masinaFamilie==null){
            masinaFamilie=new MasinaFamilie(3);
        }
        return masinaFamilie.getDescriere();
    }

    public String getDescriereMasinaSport(){
        if(masinaSport==null){
            masinaSport=new MasinaSport(4);
        }
        return masinaSport.getDescriere();
    }

    public String getDescriereMasinaElectrica(){
        if(masinaElectrica==null){
            masinaElectrica=new MasinaElectrica("Type 1");
        }
        return masinaElectrica.getDescriere();
    }

}
