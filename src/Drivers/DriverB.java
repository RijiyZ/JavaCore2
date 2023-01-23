package Drivers;

import Transports.Car;

import java.util.List;

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
}