package ase.cts.g1088.builder;

public class BuilderAutoturismElectric implements BuilderMasina{
    private AutoturismElectric auto;
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

    BuilderAutoturismElectric(){
        auto=new AutoturismElectric();
    }

    public void buildTipIncarcator(String tipIncarcator){
        this.auto.setTipIncarcator(tipIncarcator);
    }

    @Override
    public Masina getMasina() {

        return this.auto;
    }

}
