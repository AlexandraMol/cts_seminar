package ase.cts.g1088.composite;

import java.util.ArrayList;
import java.util.List;

public class Angajat implements iAngajat{

    public String nume;
    public float codAngajat;
    public float salariu;
    public List<Angajat> listaSubordonati=new ArrayList<Angajat>();

    public Angajat(String nume, float codAngajat, float salariu, List<Angajat> listaSubordonati) {
        this.nume = nume;
        this.codAngajat = codAngajat;
        this.salariu = salariu;
        this.listaSubordonati = listaSubordonati;
    }

    @Override
    public void printDetalii() {
        System.out.println(this.nume+" "+this.codAngajat+" "+this.salariu+" ");
        for (Angajat a: this.listaSubordonati
             ) {
            System.out.println(a.nume+" "+a.codAngajat+" "+a.salariu+" ");
        }

        }


    @Override
    public void addSubordonat(Angajat angajat) {
        listaSubordonati.add(angajat);
    }

    @Override
    public void delSubordonat(Angajat angajat) {
        listaSubordonati.remove(angajat);
    }
}
