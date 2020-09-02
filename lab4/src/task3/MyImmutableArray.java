package task3;

import java.util.ArrayList;

public class MyImmutableArray {
    public final ArrayList<Integer> immutableArray;
    MyImmutableArray(ArrayList<Integer> array){
        immutableArray = new ArrayList<>(array);
    }
    ArrayList<Integer> getArray(){
        ArrayList<Integer> copy = new ArrayList<>(immutableArray);
        return copy;
    }
}
