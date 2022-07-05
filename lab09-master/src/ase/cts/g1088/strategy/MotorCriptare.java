package ase.cts.g1088.strategy;

public class MotorCriptare {
    ModCriptare modCriptare;

    public String getModCriptare(String parola) {
        return modCriptare.cripteaza(parola);
    }

    public void setModCriptare(ModCriptare modCriptare) {
        this.modCriptare = modCriptare;
    }
}
