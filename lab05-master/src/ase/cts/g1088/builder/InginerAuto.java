package ase.cts.g1088.builder;

public class InginerAuto {
    BuilderAutoturismClasic b;
    private String sasiu;
    private String roti;
    private String motor;
    private String interior;
    private String tipAditivi;

    public InginerAuto(String sasiu, String roti, String motor, String interior, String tipAditivi) {
        this.sasiu = sasiu;
        this.roti = roti;
        this.motor = motor;
        this.interior = interior;
        this.tipAditivi = tipAditivi;
        b=new BuilderAutoturismClasic();
    }

//    public InginerAuto(String tipMasina){
////        if(tipMasina=="electric") {
////            BuilderAutoturismElectric b;
////        }else if(tipMasina=="clasic"){
////            BuilderAutoturismClasic b;
////        }
//    }
    public void buildMasina(){
        b.buildSasiu(this.sasiu);
        b.buildRoti(this.roti);
        b.buildMotor(this.motor);
        b.buildInterior(this.interior);
        b.buildTipAditivi(this.tipAditivi);
    }
    public Masina getMasina(){
        return  b.getMasina();
    }

    @Override
    public String toString() {
        return "InginerAuto{" +
                "b=" + b +
                '}';
    }
}
