package ru.sberbank.javaSchool.transport;

public class MotorcycleBuilder extends TransportBuilder<Motorcycle> {
    @Override
    public Motorcycle build() {
        return new Motorcycle(vin, dateOfIssue, maxSpeed, length, width, height, TypeTransport.MOTORCYCLE);
    }
}
