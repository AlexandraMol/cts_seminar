package ro.ase.cts.g1088.prototype;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){
    List<Copac> listaCopaci=new ArrayList<>();

    Copac copac=new Copac("cerc",10,"maro","pin",new Locatie(10,20));
    listaCopaci.add(copac);
    Copac copac2=copac.clone();
    copac2.planteaza(new Locatie(30,30));
    listaCopaci.add(copac2);

    System.out.println(listaCopaci);

    }
}