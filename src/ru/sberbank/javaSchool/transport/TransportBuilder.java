package ru.sberbank.javaSchool.transport;

import java.util.Calendar;
import java.util.GregorianCalendar;

public abstract class TransportBuilder<T extends Transport> {
    protected String vin;
    protected GregorianCalendar dateOfIssue = new GregorianCalendar(1886, Calendar.JANUARY, 29);
    protected int maxSpeed = 0;
    protected int length = 0;
    protected int width = 0;
    protected int height = 0;

    public TransportBuilder<T> setVin(String vin) {
        this.vin = vin;
        return this;
    }

    public TransportBuilder<T> setDateOfIssue(int year, int month, int date) {
        this.dateOfIssue.set(year, month, date);
        return this;
    }

    public TransportBuilder<T> setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    public TransportBuilder<T> setLength(int length) {
        this.length = length;
        return this;
    }

    public TransportBuilder<T> setWidth(int width) {
        this.width = width;
        return this;
    }

    public TransportBuilder<T> setHeight(int height) {
        this.height = height;
        return this;
    }

    public abstract T build();
}