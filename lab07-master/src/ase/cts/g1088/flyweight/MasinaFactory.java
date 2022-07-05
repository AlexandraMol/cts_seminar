package ase.cts.g1088.flyweight;

import java.util.HashMap;
import java.util.Map;

public class MasinaFactory {

    private HashMap<TipMasina,Masina> mda=new HashMap<>();

    public Masina getMasina(TipMasina tipMasina){
        Masina m=null;

        if(mda.containsKey(tipMasina)){
            m=mda.get(tipMasina);
        }else{
            if(tipMasina==TipMasina.AutoturismGalben){
                m=new Autoturism("iarna","mat","opel","galben", "nu");
                mda.put(TipMasina.AutoturismGalben,m);
            }else if(tipMasina==TipMasina.AutoturismRosu){
                m=new Autoturism("iarna","mat","opel","rosu", "nu");
                mda.put(TipMasina.AutoturismRosu,m);

            }else if(tipMasina==TipMasina.CamionGalben){
                m=new Camion("iarna","mat","BMW","galben","da");
                mda.put(TipMasina.CamionGalben,m);
            }else if(tipMasina==TipMasina.CamionRosu){
                m=new Camion("iarna","mat","BMW","rosu","da");
                mda.put(TipMasina.CamionRosu,m);

            }
        }
        return m;
    }

}
