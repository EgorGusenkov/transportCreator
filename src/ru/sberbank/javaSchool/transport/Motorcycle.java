package ru.sberbank.javaSchool.transport;

import java.util.GregorianCalendar;

public class Motorcycle extends Transport {
    public Motorcycle(String vin, GregorianCalendar dateOfIssue, int maxSpeed, int length, int width, int height, TypeTransport typeTransport) {
        super(vin, dateOfIssue, maxSpeed, length, width, height, typeTransport);
    }
}
