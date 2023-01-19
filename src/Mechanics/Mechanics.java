package Mechanics;

import Transports.Bus;
import Transports.Car;
import Transports.Transport;
import Transports.Truck;

import java.util.List;
import java.util.Objects;

public class Mechanics<B extends Transport> {

    private final String firstName; // имя механика
    private final String familyName; // фамилия механика
    private String companyWork; // компания работы
    private B vehicle;

    public Mechanics(String firstName, String familyName, String companyWork, B vehicle) {
        this.firstName = firstName;
        this.familyName = familyName;
        this.companyWork = companyWork;
        this.vehicle = vehicle;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getCompanyWork() {
        return companyWork;
    }

    public void setCompanyWork(String companyWork) {
        this.companyWork = companyWork;
    }

    public B getVehicle() {
        return vehicle;
    }

    public void setVehicle(B vehicle) {
        this.vehicle = vehicle;
    }

    public void performMaintenance() {
        System.out.println(getFirstName() + " " + getFamilyName() + " провести техобслуживание " + getVehicle().getBrand() + " " + getVehicle().getModel());
    }

    public void fixVehicle() {
        System.out.println(getFirstName() + " " +  getFamilyName() + " починить машину " + getVehicle().getBrand() + " " + getVehicle().getModel());
    }

    public static void mechanicsBusInTheList(List<Mechanics<Bus>> mechanicBus) {
        for (Mechanics<Bus> mechanicD : mechanicBus) {
            System.out.println("Механик по обслуживанию автобусов: " + mechanicD.getFirstName() + " " + mechanicD.getFamilyName() +
                    " с компании " + mechanicD.companyWork);
        }
    }
    public static void mechanicsCarInTheList(List<Mechanics<Car>> mechanicCar) {
        for (Mechanics<Car> mechanicB : mechanicCar) {
            System.out.println("Механик по обслуживанию легковых автомобилей: " + mechanicB.getFirstName() + " " + mechanicB.getFamilyName() +
                    " с компании " + mechanicB.companyWork);
        }
    }
    public static void mechanicsTruckInTheList(List<Mechanics<Truck>> mechanicTruck) {
        for (Mechanics<Truck> mechanicC : mechanicTruck) {
            System.out.println("Механик по обслуживанию грузовых автомобилей: " + mechanicC.getFirstName() + " " + mechanicC.getFamilyName() +
                    " с компании " + mechanicC.companyWork);
        }
    }


    public void add(Mechanics mechanics) {
    }
    public void runTO() {
        System.out.println("Техобслуживание транспорта");
    }

    @Override
    public String toString() {
        return firstName + " " + familyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanics<?> mechanics = (Mechanics<?>) o;
        return Objects.equals(firstName, mechanics.firstName) && Objects.equals(familyName, mechanics.familyName) && Objects.equals(companyWork, mechanics.companyWork) && Objects.equals(vehicle, mechanics.vehicle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, familyName, companyWork, vehicle);
    }
}