package Drivers;

import Transports.Bus;

import java.util.List;
import java.util.Objects;

public class DriverD extends Driver<Bus> {

    private CategoryDriverD categoryDriverD;

    public DriverD(String fullName,
                   boolean driversLicense,
                   double experience,
                   Bus vehicle,
                   CategoryDriverD categoryDriverD) {
        super(fullName, driversLicense, experience, vehicle);
        this.categoryDriverD = categoryDriverD;
    }

    public CategoryDriverD getCategoryDriverD() {
        return categoryDriverD;
    }

    public void setCategoryDriverD(CategoryDriverD categoryDriverD) {
        if (categoryDriverD == null) {
            throw new IllegalArgumentException("Необходимо указать категорию прав");
        }
        this.categoryDriverD = categoryDriverD;
    }

    @Override
    public String toString() {
       return "ФИО: " + getFullName() + " Транспорт: " + getVehicle();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DriverD driverD = (DriverD) o;
        return categoryDriverD == driverD.categoryDriverD;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), categoryDriverD);
    }

    public static void driversDInTheList(List<Driver<Bus>> driversD) {
        for (Driver<Bus> driverD : driversD) {
            System.out.println("Вщдитель категории <" + CategoryDriverD.D + "> " +
                    driverD.getFullName() + ": стаж работы " + driverD.getExperience() + " лет");
        }
    }
}
