package task2;

import task2.Car;
import task2.CarType;

import java.util.ArrayList;

public class Dealership {

    public double basePrice;

    public double baseSpeed;

    private ArrayList<Car> cars = new ArrayList<>();

    public Dealership(double baseSpeed, double basePrice) {
        this.baseSpeed = baseSpeed;
        this.basePrice = basePrice;
    }

    /* TODO 2: Hide the cars produced by the dealership so that they cannot be altered */
    private class Toyota implements Car {

        CarType type = CarType.GENERAL_PURPOSE;

        @Override
        public String showPresentation() {
            return type + " car that runs at top speed " + baseSpeed / 2 + " and costs " + basePrice / 2;
        }
    }

    private class Audi implements Car {

        CarType type = CarType.SPORTS;

        @Override
        public String showPresentation() {
            return type + " car that runs at top speed " + baseSpeed / 1.5 + " and costs " + basePrice / 1.5;
        }
    }

    /* TODO 3: Cut off all ties between Ferrari and Dealership */
    private static class Ferrari implements Car{
        CarType type = CarType.RACING;

        @Override
        public String showPresentation() {
            return type + " car that runs at top speed 450 and costs 1000000";
        }
    }

    private class Mustang implements Car {

        CarType type = CarType.MUSCLE;

        @Override
        public String showPresentation() {
            return type + " car that runs at top speed " + baseSpeed + " and costs " + basePrice * 1.3;
        }
    }

    /* TODO 4: Implement Tesla cars using anonymous inner classes and lambda functions */
    public Car getCar(CarType type) {
        Car car;
        switch (type) {
            case GENERAL_PURPOSE:
                car = new Toyota();
                break;
            case SPORTS:
                car = new Audi();
                break;
            case MUSCLE:
                car = new Mustang();
                break;
            case RACING:
                car = new Ferrari();
                break;
            case ELECTRIC_ANON:
                car = new Car() {

                    @Override
                    public String showPresentation() {
                        return  "This is a" + type + "car";
                    }
                };
                break;

            case ELECTRIC_LAMBDA:
                car = () -> "This is a" + Car.type + "car";
                break;
            default:
                System.out.println("[DEALERSHIP]CarType " + type + " not supported");
                return null;
        }
        this.cars.add(car);
        return car;
    }

    /*public void showCars() {
        for (Car car : this.cars)
            System.out.println(car.showPresentation());
    }*/

}