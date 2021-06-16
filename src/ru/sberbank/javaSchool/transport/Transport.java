package ru.sberbank.javaSchool.transport;

import java.util.GregorianCalendar;

public abstract class Transport {
    private final String vin;
    private final GregorianCalendar dateOfIssue;
    private final int maxSpeed;
    private final int length;
    private final int width;
    private final int height;
    private final TypeTransport typeTransport;

    public Transport(String vin, GregorianCalendar dateOfIssue, int maxSpeed, int length, int width, int height, TypeTransport typeTransport) {
        this.vin = vin;
        this.dateOfIssue = dateOfIssue;
        this.maxSpeed = maxSpeed;
        this.length = length;
        this.width = width;
        this.height = height;
        this.typeTransport = typeTransport;
    }

    public String getVin() {
        return vin;
    }

    public GregorianCalendar getDateOfIssue() {
        return (GregorianCalendar) dateOfIssue.clone();
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public TypeTransport getTypeTransport() {
        return typeTransport;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}

