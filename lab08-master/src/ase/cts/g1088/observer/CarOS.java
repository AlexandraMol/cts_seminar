package ase.cts.g1088.observer;

public class CarOS implements OS{
    public String lastUpdated;

    public CarOS(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public void update() {

    }

    public void printLastUpdate(){
        System.out.println(this.lastUpdated);
    }
}
