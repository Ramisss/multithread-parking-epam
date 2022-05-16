package by.epam.parking.entity;

import java.util.StringJoiner;

public class Car {
    private CarModelEnum carModelEnum;

    public Car(CarModelEnum randomType) {

    }

    public CarModelEnum getCarModelEnum() {
        return carModelEnum;
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", Car.class.getSimpleName() + "[", "]")
                .add("carModelEnum=" + carModelEnum)
                .toString();
    }
}
