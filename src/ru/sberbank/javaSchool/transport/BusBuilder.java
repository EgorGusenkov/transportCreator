package ru.sberbank.javaSchool.transport;

public class BusBuilder extends TransportBuilder<Bus> {
    @Override
    public Bus build() {
        return new Bus(vin, dateOfIssue, maxSpeed, length, width, height, TypeTransport.BUS);
    }
}
