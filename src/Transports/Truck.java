package Transports;

import Enums.LoadCapacity;

import java.util.List;
import java.util.Objects;

public class Truck extends Transport implements Competing {

    private LoadCapacity loadCapacity;

    public Truck(String brand,
                 String model,
                 double engineVolume,
                 LoadCapacity loadCapacity) {
        super(brand, model, engineVolume);
        this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
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
                ((Math.random() * ((130 - 75) + 1)) + 75));
    }

    @Override
    public void maxSpeed() {
        System.out.println(getBrand() + " " +
                getModel() + " - максимальная скорость: " +
                ((Math.random() * ((180 - 120) + 1)) + 120));
    }

    @Override
    public void printType() {
        if (loadCapacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            String from = loadCapacity.getFrom() == null ? "" : "от " + loadCapacity.getFrom() + " ";
            String to = loadCapacity.getTo() == null ? "" : "до " + loadCapacity.getTo();
            System.out.println("Грузоподъемность транспортного средства " + getBrand() + " " + getModel() + " : " + from + to + " тн");
        }
    }

    @Override
    public boolean service() {
        return Math.random() > 0.75;
    }

    public static void trucksInTheList(List<Truck> trucks) { // на печать список грузовиков
        for (Truck truck : trucks) {
            System.out.println(truck.getBrand() + " " + truck.getModel() + " " + truck.getEngineVolume() + " " +  truck.getLoadCapacity());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Truck truck = (Truck) o;
        return loadCapacity == truck.loadCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(loadCapacity);
    }

    @Override
    public String toString() {
        return getBrand() + getModel();
    }
}