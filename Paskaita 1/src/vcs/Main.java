package vcs;

import java.util.Scanner;

public class Main {

    /**
     * Musu pasisveikinimo klase
     *
     * @param args
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ivedimas = input.next();
        
        System.out.println("");

        if (ivedimas.equals("pabaiga")) {
            System.out.println("Zodis geras");
        }
        else {
            System.out.println("Blogas zodis");
        }

    }
}

