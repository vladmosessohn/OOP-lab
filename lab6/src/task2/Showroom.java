package task2;

import task2.Car;
import task2.CarType;
import task2.Dealership;

public class Showroom {
    public static void main(String[] args) {

        /* Innocent example to make sure the code runs */
        Dealership dealership = new Dealership(300, 100000);
        Car car1 = dealership.getCar(CarType.GENERIC);
        Car car2 = dealership.getCar(CarType.ELECTRIC_ANON);
        Car car3 = dealership.getCar(CarType.ELECTRIC_LAMBDA);

        /* TODO 2,3,4: Test all changes to the code */
    }
}
