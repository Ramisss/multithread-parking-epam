package by.epam.parking.entity;

import java.util.ArrayList;
import java.util.List;

public class Parking {

    private List<Car> carList;
    private static final int maxCarInParking = 5;
    private int carCounter = 0;

    public Parking() {
        carList = new ArrayList<>();
    }

    public synchronized boolean addCar(Car car) {
        if (carCounter < maxCarInParking) {
            notifyAll();
            carList.add(car);
            carCounter++;
        } else {
            return false;
        }
        return true;
    }


    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public int getCarCounter() {
        return carCounter;
    }

    public void setCarCounter(int carCounter) {
        this.carCounter = carCounter;
    }
}
