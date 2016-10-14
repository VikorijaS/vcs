package vcs;

import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {

    //-----------------------------------------------------------
        Scanner scan = new Scanner(System.in);
        System.out.println ("Ivesk zodi");
	    String zodis = scan.next();
        int kiekis = 0;
        for (char raide : zodis.toCharArray())
            if (raide == 'a')
            {
                kiekis++;
            }



        String str2 = zodis.replaceAll("a", "z");


          System.out.println("zodis" + zodis);
          System.out.println("pakeisim raide a i z:\"" + str2 + "\"");
          System.out.println("a raidziu skaicius: " + kiekis);
          System.out.println("a raidziu skaicius: " + zodis.length());
//        System.out.println("trim() metodo rezultatas: '" .concat(str2.trim().concat("'")));
//        String str3 = str2.replaceAll(" ", "");
//        System.out.println("Ivestas zodis turi numeri be tarpu: " + str3.trim().length());



        //------------------------------------------------------------

    }
}
