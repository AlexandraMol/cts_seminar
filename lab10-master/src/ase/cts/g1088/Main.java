package ase.cts.g1088;

import ase.cts.g1088.command.AlimentareCont;
import ase.cts.g1088.command.OperatiuneBancara;
import ase.cts.g1088.command.Plata;
import ase.cts.g1088.command.ServerOpBancare;
import ase.cts.g1088.memento.File;
import ase.cts.g1088.memento.FileSnapshot;
import ase.cts.g1088.memento.VersionControl;

public class Main {
    public static void main(String[] args) {

        File file=new File("content","1","../Desktop","Test");
        VersionControl versionControl=new VersionControl();

        FileSnapshot fileSnapshot=file.createSnapShot();
        System.out.println(file);
        System.out.println(fileSnapshot.getDetails());
        file.setContent("contentNou");
        versionControl.addFileSnapshot(fileSnapshot);
        FileSnapshot fileSnapshot2=file.createSnapShot();
        System.out.println(file.print());
        System.out.println(fileSnapshot2.getDetails());


        versionControl.addFileSnapshot(fileSnapshot2);
        file.restoreToSomePoint(fileSnapshot);
        System.out.println(file.print());

        versionControl.listSnapshotList();


        OperatiuneBancara op=new Plata("contDest1",100);
        OperatiuneBancara op2=new Plata("contDest2",20);
        OperatiuneBancara op3=new AlimentareCont("cont",500);

        op.efectuareOperatiune();
        op3.efectuareOperatiune();

        ServerOpBancare serverOpBancare=new ServerOpBancare();
        serverOpBancare.inregistrareOperatiune(op);
        serverOpBancare.inregistrareOperatiune(op2);
        serverOpBancare.inregistrareOperatiune(op3);
        serverOpBancare.efectuazaToateOperatiunile();

    }
}
