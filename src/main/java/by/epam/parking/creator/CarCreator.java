package by.epam.parking.creator;


import by.epam.parking.entity.Car;
import by.epam.parking.entity.CarModelEnum;
import by.epam.parking.entity.Parking;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class CarCreator extends Thread {
    private Parking parking;
    private int carCount;

    public CarCreator(Parking parking, int carCount) {
        this.parking = parking;
        this.carCount = carCount;
    }


    @Override
    public void run() {
        int count = 0;
        while (count < carCount) {
            Thread.currentThread().setName(" Generator car"+ count);
            System.out.println(Thread.currentThread().getName());
            count++;
            parking.addCar(new Car(getRandomType()));
            count++;
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }


    private CarModelEnum getRandomType() {
        Random random = new Random();
        return CarModelEnum.values()[random.nextInt(CarModelEnum.values().length)];
    }
}
