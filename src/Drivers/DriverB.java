package Drivers;

import Transports.Car;

import java.util.List;
import java.util.Objects;

public class DriverB extends Driver<Car> {

    private CategoryDriverB categoryDriverB;

    // конструктор
    public DriverB(String fullName,
                   boolean driversLicense,
                   double experience,
                   Car vehicle,
                   CategoryDriverB categoryDriverB) {
        super(fullName, driversLicense, experience, vehicle);
        this.categoryDriverB = categoryDriverB;
    }

    public CategoryDriverB getCategoryDriverB() {
        return categoryDriverB;
    }

    public void setCategoryDriverB(CategoryDriverB categoryDriverB) {
        if (categoryDriverB == null) {
            throw new IllegalArgumentException("Необходимо указать категорию прав");
        }
        this.categoryDriverB = categoryDriverB;
    }

    // Список водителей:
    public static void driversBInTheList(List<Driver<Car>> driversB) {
        for (Driver<Car> driverB : driversB) {
            System.out.println("Вщдитель категории <" + CategoryDriverB.B + "> " +
                    driverB.getFullName() + ": стаж работы " + driverB.getExperience() + " лет");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DriverB driverB = (DriverB) o;
        return categoryDriverB == driverB.categoryDriverB;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), categoryDriverB);
    }

    @Override
    public String toString() {
        return "ФИО: " + getFullName() + " Транспорт: " + getVehicle();
    }
}