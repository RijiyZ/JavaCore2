package Drivers;

import Transports.Truck;

import java.util.List;
import java.util.Objects;

public class DriverC extends Driver<Truck> {

    private CategoryDriverC categoryDriverC;

    public DriverC(String fullName,
                   boolean driversLicense,
                   double experience,
                   Truck vehicle,
                   CategoryDriverC categoryDriverC) {
        super(fullName, driversLicense, experience, vehicle);
        this.categoryDriverC = categoryDriverC;
    }

    public CategoryDriverC getCategoryDriverC() {
        return categoryDriverC;
    }

    public void setCategoryDriverC(CategoryDriverC categoryDriverC) {
        if (categoryDriverC == null) {
            throw new IllegalArgumentException("Необходимо указать категорию прав");
        }
        this.categoryDriverC = categoryDriverC;
    }


    public static void driversCInTheList(List<Driver<Truck>> driversC) {
        for (Driver<Truck> driverC : driversC) {
            System.out.println("Вщдитель категории <" + CategoryDriverC.C + "> " +
                    driverC.getFullName() + ": стаж работы " + driverC.getExperience() + " лет");
        }
    }

    @Override
    public String
    toString() {
        return "ФИО: " + getFullName() + " Транспорт: " + getVehicle();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DriverC driverC = (DriverC) o;
        return categoryDriverC == driverC.categoryDriverC;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), categoryDriverC);
    }
}