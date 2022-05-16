package by.epam.parking;


import by.epam.parking.creator.CarCreator;
import by.epam.parking.entity.Parking;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        Parking parking = new Parking();

        CarCreator carCreator = new CarCreator(parking,5);
        CarCreator carCreator1 = new CarCreator(parking,10);
        CarCreator carCreator2 = new CarCreator(parking,5);
        CarCreator carCreator3 = new CarCreator(parking,5);
       carCreator.start();
       carCreator1.start();
       carCreator2.start();
       carCreator3.start();

    }
}
