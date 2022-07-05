package ase.cts.g1088;

import ase.cts.g1088.composite.Angajat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){

        Angajat angajat=new Angajat("ion",1,2000,new ArrayList<Angajat>());
        angajat.addSubordonat(new Angajat("alin",2,1000,new ArrayList<Angajat>()));
        angajat.printDetalii();
    }
}

