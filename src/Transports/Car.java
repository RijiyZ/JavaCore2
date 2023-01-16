package Transports;

import Enums.BodyOfType;

import java.util.List;

public class Car extends Transport implements Competing {

    private BodyOfType bodyOfType; // переменная перечисления (enum)

    public Car(String brand,
               String model,
               double engineVolume,
               BodyOfType bodyOfType) {
        super(brand, model, engineVolume);
        this.bodyOfType = bodyOfType;
    }

    public BodyOfType getBodyOfType() {
        return bodyOfType;
    }

    public void setBodyOfType(BodyOfType bodyOfType) {
        this.bodyOfType = bodyOfType;
    }

    @Override
    public void gas() {
        System.out.println(getBrand() + " " + getModel() + " начать движение");
    }

    @Override
    public void brake() {
        System.out.println(getBrand() + " " + getModel() + " закончить движение");
    }


    @Override
    public void pitStop() {
        System.out.println(getBrand() + " " + getModel() + " - Пит-стоп делают только гоночные автомобили");
    }

    @Override
    public void bestLapTime() {
        System.out.println(getBrand() + " " +
                getModel() + " - лучшее время круга: " +
                ((Math.random() * ((100 - 70) + 1)) + 70));
    }

    @Override
    public void maxSpeed() {
        System.out.println(getBrand() + " " +
                getModel() + " - максимальная скорость: " +
                ((Math.random() * ((350 - 150) + 1)) + 150));
    }


    public void printType() {
        if (bodyOfType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Тип транспортного средства " + getBrand() + " " + getModel() + " : " + bodyOfType);
        }
    }

    @Override
    public boolean service() {
        return Math.random() > 0.7;
    }


    public static void carsInTheList(List<Car> cars) { // на печать список автомобилей
        for (Car car : cars) {
            System.out.println(car.getBrand() + " " + car.getModel() + " " + car.getEngineVolume() + " " +  car.getBodyOfType());
        }
    }
}