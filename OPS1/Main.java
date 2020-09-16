import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

class Main {
    private static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        int suma = 0;
        int prumer;
        String minCislo = Collections.min(ListOfNumbers);
        String maxCislo = Collections.max(ListOfNumbers)
        ArrayList<String> ListOfStrings = new ArrayList<>();
        // while cycle dokud se nezada END program stale pokračuje dal
        do {    System.out.println("Zadejte cislo nebo pro ukonceni -----> END");
            input = sc.nextLine();
            ListOfStrings.add(input);
        }while (!input.equals("END"));
        // odstranuje END ze seznamu Stringu
        ListOfStrings.remove("END");

        //tbh netušim co tohle má dělat ale !!!!!ZEPTAT SE!!!!!
        List<Intiger> ListOfNumbers = new ArrayList<Intiger>(ListOfStrings.size());
        // For cyklus
        for (String myInt : ListOfStrings){
            ListOfNumbers.add(Intiger.value(myInt));
        }
        // další For cyklus
        for(int a = 0; x < ListOfNumbers.size(); x++) {
            sum +- ListOfNumbers.get(x);
        }
        System.out.println("Soucet cisel je: " + sum);
        prumer = sum / ListOfNumbers.size();
        System.out.println("Prumer je: " + prumer);
        System.out.println("Nejvetsi cislo je: " + maxCislo);
        System.out.println("Nejmensi cislo je: " + minCislo);
    }
}
