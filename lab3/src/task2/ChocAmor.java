package task2;

import task1.CandyBox;

public class ChocAmor extends CandyBox {
    float lenght;

    ChocAmor(){}

    public ChocAmor(String flavour, String origin, float lenght){
        super(flavour, origin);
        this.lenght = lenght;
    }

    float getVolume(){
        return lenght*lenght*lenght;
    }

    @Override
    public String toString() {
        return super.toString() +
                "has volume " +
                getVolume();
    }

    public void printChocoAmor() {
        System.out.println("cub cu latura " + lenght);
    }
}
