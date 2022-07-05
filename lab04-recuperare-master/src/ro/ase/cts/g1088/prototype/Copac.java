package ro.ase.cts.g1088.prototype;

public class Copac implements Cloneable {

    public String tipCoroana;
    public float inaltime;
    public String culoare;
    public String familie;
    public Locatie locatiePlantare;

    public void planteaza(Locatie l){
        this.locatiePlantare.x=l.x;
        this.locatiePlantare.y=l.y;
        System.out.println("Locatie X:"+l.x);
        System.out.println("Locatie Y:"+l.y);
    }

    @Override
    public Copac clone()
    {

        Copac clone = new Copac(this.tipCoroana,this.inaltime,this.culoare,this.familie,new Locatie(this.locatiePlantare.x,this.locatiePlantare.y));
        return clone;
    }

    public Copac(String tipCoroana, float inaltime, String culoare, String familie, Locatie locatiePlantare) {
        this.tipCoroana = tipCoroana;
        this.inaltime = inaltime;
        this.culoare = culoare;
        this.familie = familie;
        this.locatiePlantare = locatiePlantare;
    }
}
