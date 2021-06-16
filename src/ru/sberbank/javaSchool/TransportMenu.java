package ru.sberbank.javaSchool;

import ru.sberbank.javaSchool.transport.*;

import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Vector;

public class TransportMenu {
    Scanner sc;
    boolean isQ;
    Vector<Car> cars;
    Vector<Bus> buses;
    Vector<Motorcycle> motorcycles;

    public TransportMenu() {
        sc = new Scanner(System.in);
        isQ = true;
        cars = new Vector<>();
        buses = new Vector<>();
        motorcycles = new Vector<>();
    }

    public void start() {
        System.out.println("Добро пожаловать в гараж! для выбора действия введите следующий символ:");
        while (isQ) {
            System.out.println("'A' - Добавить автомобиль |'S'- Добавить автобус | 'D' - добавить мотоцикл");
            System.out.println("'Q' - покинуть гараж");
            char menuReader = Character.toUpperCase(sc.next().charAt(0));
            switch (menuReader) {
                case 'A':
                    cars.add(setCar());
                    break;
                case 'S':
                    buses.add(setBus());
                    break;
                case 'D':
                    motorcycles.add(setMotorcycle());
                case 'Q':
                    isQ = false;
            }
        }
    }

    private static Car setCar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите vin");
        String vin = sc.nextLine();
        GregorianCalendar dateOfIssue;
        System.out.println("Введите дату создания автомобиля");
        System.out.println("Введите год");
        int year = sc.nextInt();
        System.out.println("Введите месяц");
        int month = sc.nextInt();
        System.out.println("Введите день");
        int date = sc.nextInt();
        System.out.println("Введите максимальную скорость");
        int maxSpeed = sc.nextInt();
        System.out.println("Введите длину автомобиля");
        int length = sc.nextInt();
        System.out.println("Введите ширину автомобиля");
        int width = sc.nextInt();
        System.out.println("Введите высоту автомобиля");
        int height = sc.nextInt();
        return new CarBuilder()
                .setVin(vin)
                .setDateOfIssue(year, month, date)
                .setMaxSpeed(maxSpeed)
                .setLength(length)
                .setHeight(height)
                .setWidth(width)
                .build();
    }

    private static Bus setBus() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите vin");
        String vin = sc.nextLine();
        GregorianCalendar dateOfIssue;
        System.out.println("Введите дату создания автомобиля");
        System.out.println("Введите год");
        int year = sc.nextInt();
        System.out.println("Введите месяц");
        int month = sc.nextInt();
        System.out.println("Введите день");
        int date = sc.nextInt();
        System.out.println("Введите максимальную скорость");
        int maxSpeed = sc.nextInt();
        System.out.println("Введите длину автомобиля");
        int length = sc.nextInt();
        System.out.println("Введите ширину автомобиля");
        int width = sc.nextInt();
        System.out.println("Введите высоту автомобиля");
        int height = sc.nextInt();
        return new BusBuilder()
                .setVin(vin)
                .setDateOfIssue(year, month, date)
                .setMaxSpeed(maxSpeed)
                .setLength(length)
                .setHeight(height)
                .setWidth(width)
                .build();
    }

    private static Motorcycle setMotorcycle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите vin");
        String vin = sc.nextLine();
        GregorianCalendar dateOfIssue;
        System.out.println("Введите дату создания автомобиля");
        System.out.println("Введите год");
        int year = sc.nextInt();
        System.out.println("Введите месяц");
        int month = sc.nextInt();
        System.out.println("Введите день");
        int date = sc.nextInt();
        System.out.println("Введите максимальную скорость");
        int maxSpeed = sc.nextInt();
        System.out.println("Введите длину автомобиля");
        int length = sc.nextInt();
        System.out.println("Введите ширину автомобиля");
        int width = sc.nextInt();
        System.out.println("Введите высоту автомобиля");
        int height = sc.nextInt();
        return new MotorcycleBuilder()
                .setVin(vin)
                .setDateOfIssue(year, month, date)
                .setMaxSpeed(maxSpeed)
                .setLength(length)
                .setHeight(height)
                .setWidth(width)
                .build();
    }
}
