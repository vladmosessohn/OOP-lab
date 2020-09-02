package task2;

import task1.CandyBox;

public class Baravelli extends CandyBox {
    float radius;
    float height;

    Baravelli(){}

    public Baravelli(String flavour, String origin, float radius, float height) {
        super(flavour, origin);
        this.radius = radius;
        this.height = height;
    }

    float getVolume(){
        return (float) (Math.PI*radius*radius*height);
    }

    @Override
    public String toString() {
        return super.toString() +
                "has volume " +
                getVolume();
    }
    public void printBaravelli() {
        System.out.println("Cilindru de raza " + radius + " inaltime " +height);
    }
}
