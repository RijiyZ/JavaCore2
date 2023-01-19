package Transports;

import Enums.Capacity;

import java.util.List;
import java.util.Objects;

public class Bus extends Transport implements Competing {

    private Capacity capacity;

    public Bus(String brand,
               String model,
               double engineVolume,
               Capacity capacity) {
        super(brand, model, engineVolume);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
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
                ((Math.random()*((75-60)+1))+60));
    }

    @Override
    public void maxSpeed() {
        System.out.println(getBrand() + " " +
                getModel() + " - максимальная скорость: " +
                ((Math.random()*((160-100)+1))+100));
    }

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Вместимость транспортного средства " + getBrand() + " " + getModel() +
                    " от " + capacity.getFrom() + " до " + capacity.getTo() + " чел.");
        }
    }

    @Override
    public boolean service() {
        System.out.println("Автобусу " + getBrand() + " " + getModel() + " диагностика не требуется");
        return true;
    }
    public static void busesInTheList(List<Bus> buses) { // на печать список автобусов
        for (Bus bus : buses) {
            System.out.println(bus.getBrand() + " " + bus.getModel() + " " + bus.getEngineVolume() + " " + bus.getCapacity());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return capacity == bus.capacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacity);
    }

    @Override
    public String toString() {
        return getBrand() + getModel();
    }
}
