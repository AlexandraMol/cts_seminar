package ro.ase.cts.g1088;

public class OShop {

    private String name;

    private static OShop oshop_instance=null;

    private OShop(){
        name="Emag";
    }

    public static OShop getInstance(){
        if(oshop_instance==null)
            oshop_instance=new OShop();

            return oshop_instance;

    }

}
