package ase.cts.g1088;

import ase.cts.g1088.state.ComandaMancare;
import ase.cts.g1088.state.ComandaPlasata;
import ase.cts.g1088.strategy.*;

public class Main {
    public static void main(String[] args) {
        //State
        ComandaMancare comandaMancare=new ComandaMancare();
        comandaMancare.setState(new ComandaPlasata());
        comandaMancare.nextState();
        comandaMancare.nextState();
        comandaMancare.nextState();
        comandaMancare.nextState();
        comandaMancare.nextState();
        comandaMancare.nextState();

        // + varianta facuta cu singletone

        //Strategy

        MotorCriptare motorCriptare=new MotorCriptare();
        motorCriptare.setModCriptare(new Algoritm1());

        System.out.println(motorCriptare.getModCriptare("parola"));
        motorCriptare.setModCriptare(new Algoritm2());

        System.out.println(motorCriptare.getModCriptare("parola"));
        motorCriptare.setModCriptare(new Algoritm3());
        System.out.println(motorCriptare.getModCriptare("parola"));



    }
}
