package Drivers;

import Transports.Bus;

import java.util.List;

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


    public static void driversDInTheList(List<Driver<Bus>> driversD) {
        for (Driver<Bus> driverD : driversD) {
            System.out.println("Вщдитель категории <" + CategoryDriverD.D + "> " +
                    driverD.getFullName() + ": стаж работы " + driverD.getExperience() + " лет");
        }
    }
}
