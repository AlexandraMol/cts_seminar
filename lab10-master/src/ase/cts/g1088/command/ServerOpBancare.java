package ase.cts.g1088.command;


import java.util.ArrayList;

public class ServerOpBancare {
    ArrayList<OperatiuneBancara> listaOperatiuni=new ArrayList<>();

    public void inregistrareOperatiune(OperatiuneBancara operatiuneBancara){
        listaOperatiuni.add(operatiuneBancara);
    }


    public void efectuazaToateOperatiunile(){


        for (int i=0;i<listaOperatiuni.size();i++){
            listaOperatiuni.get(i).efectuareOperatiune();
        }
        listaOperatiuni.clear();

        for (OperatiuneBancara op: listaOperatiuni
        ) {
            listaOperatiuni.remove(op);
        }

    }
}
