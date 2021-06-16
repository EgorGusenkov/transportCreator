package ru.sberbank.javaSchool.transport;

import java.util.GregorianCalendar;

public class Bus extends Transport {
    public Bus(String vin, GregorianCalendar dateOfIssue, int maxSpeed, int length, int width, int height, TypeTransport typeTransport) {
        super(vin, dateOfIssue, maxSpeed, length, width, height, typeTransport);
    }
}
