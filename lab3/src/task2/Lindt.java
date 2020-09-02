package task2;

import task1.CandyBox;

public class Lindt extends CandyBox {
    float length;
    float width;
    float height;

    Lindt() {
    }

    public Lindt(String flavour, String origin, float length, float width, float height){
        super(flavour, origin);
        this.length = length;
        this.width = width;
        this.height = height;
    }
    float getVolume(){
        return length*width*height;
    }

    @Override
    public String toString() {
        return super.toString() +
               "has volume " +
                getVolume();
    }

    public void printLindt() {
        System.out.println("lungime " + length + " latime " + width + " inaltime " + height);
    }
}
