package task4;

import task2.Baravelli;
import task2.ChocAmor;
import task2.Lindt;

public class Main {
    public static void main(String[] args){
        CandyBag bag = new CandyBag();
        bag.addCandyBox(new Lindt("vanilie","spania",1,2,3));
        bag.addCandyBox(new Baravelli("lamaie","italia",2,5));
        bag.addCandyBox(new ChocAmor("ciocolata","grecia",6));
        bag.printBag();
        Lindt lin = new Lindt("vanilie","spania",1,2,3);
        lin.printLindt();
    }
}
