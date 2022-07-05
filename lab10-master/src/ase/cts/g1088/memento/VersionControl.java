package ase.cts.g1088.memento;

import java.util.HashMap;

public class VersionControl {
    HashMap<Integer,FileSnapshot> versions=new HashMap<>();
    public static int version;

    public static int getNextVersionNumber(){
        return version++;
    }

    public void addFileSnapshot(FileSnapshot fileSnapshot){
        versions.put(version,fileSnapshot);
        System.out.println("FileSnapshot added");
    }

    public int getFileSnapshotByVersion(){
        return versions.get(version).version;
    }

    public void listSnapshotList(){
        for(int version : versions.keySet()){
            System.out.println(version);
        }
        for(FileSnapshot fileSnapshot : versions.values()){
            fileSnapshot.getDetails();
        }
    }

}
