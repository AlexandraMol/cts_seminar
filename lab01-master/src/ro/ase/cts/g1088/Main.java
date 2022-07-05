package ro.ase.cts.g1088;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Testare");
        Scanner scanner=new Scanner(System.in);

        String prop=scanner.nextLine();
        System.out.println(prop);

        try{
            if(prop.toLowerCase()==prop){
                throw new ExceptieAllLower();
            }
            if(prop.toUpperCase()==prop){
                throw new ExceptieAllUpper();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        scanner.close();

    }
}
