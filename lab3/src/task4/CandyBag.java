package task4;
import task1.CandyBox;

import java.util.ArrayList;

public class CandyBag {
    private ArrayList<CandyBox> boxes = new ArrayList<>();

    public void addCandyBox(CandyBox box){
        boxes.add(box);
    }
    public void printBag(){
        for(CandyBox i : boxes){
            System.out.println(i);
        }
    }
}
