package ase.cts.g1088.builder;

public class BuilderAutoturismClasic implements BuilderMasina{
    private Autoturism auto;
    @Override
    public void buildSasiu(String sasiu) {
        this.auto.setSasiu(sasiu);
    }

    @Override
    public void buildRoti(String roti) {
        this.auto.setRoti(roti);
    }

    @Override
    public void buildMotor(String motor) {
        this.auto.setMotor(motor);
    }

    @Override
    public void buildInterior(String interior) {
        this.auto.setInterior(interior);
    }

    BuilderAutoturismClasic(){
        auto=new Autoturism();
    }

    public void buildTipAditivi(String tipAditivi){
        this.auto.setAditivi(tipAditivi);
    }

    @Override
    public Masina getMasina() {
        return this.auto;
    }

    @Override
    public String toString() {
        return "BuilderAutoturismClasic{" +
                "auto=" + auto +
                '}';
    }
}
