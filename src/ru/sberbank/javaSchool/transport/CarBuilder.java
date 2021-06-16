package ru.sberbank.javaSchool.transport;

public class CarBuilder extends TransportBuilder<Car> {
    @Override
    public Car build() {
        return new Car(vin, dateOfIssue, maxSpeed, length, width, height, TypeTransport.CAR);
    }
}
