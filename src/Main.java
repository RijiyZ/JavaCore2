import Drivers.*;
import Enums.*;
import Mechanics.Mechanics;
import Mechanics.STO;
import Transports.Bus;
import Transports.Car;
import Transports.Transport;
import Transports.Truck;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Land Cruiser", 4.5, BodyOfType.SUV);
        Car car2 = new Car("Mitsubishi", "Pajero", 3.0, BodyOfType.SUV);
        Car car3 = new Car("Land Rover", "Range Rover P530 Long", 4.4, BodyOfType.SUV);
        Car car4 = new Car("Jeep", "Grand Cherokee", 3.6, BodyOfType.SUV);

        List<Car> cars = new ArrayList<>(); // добавляю в список экземпляры с параметрами
        cars.add(new Car("Toyota", "Land Cruiser", 4.5, BodyOfType.SUV));
        cars.add(new Car("Mitsubishi", "Pajero", 3.0, BodyOfType.SUV));
        cars.add(new Car("Land Rover", "Range Rover P530 Long", 4.4, BodyOfType.SUV));
        cars.add(new Car("Jeep", "Grand Cherokee", 3.6, BodyOfType.SUV));

        System.out.println("Автомобили в списке: ");
        Car.carsInTheList(cars); // список автомобилей вывод

        System.out.println();
        car1.gas();  car2.gas();  car3.gas();   car4.gas(); // начать движение
        car1.brake();  car2.brake();  car3.brake(); car4.brake(); // закончить движение

        System.out.println();
        System.out.println("Движение автомобилей: ");

        car1.pitStop(); car2.pitStop();  car3.pitStop();  car4.pitStop();
        car1.bestLapTime();  car2.bestLapTime();  car3.bestLapTime();   car4.bestLapTime();
        car1.maxSpeed();   car2.maxSpeed();  car3.maxSpeed();  car4.maxSpeed();

        System.out.println();
        Truck truck1 = new Truck("DAF", "LF 45", 4.0, LoadCapacity.N1);
        Truck truck2 = new Truck("MAN", "TGL", 4.6, LoadCapacity.N2);
        Truck truck3 = new Truck("Daewoo", "Novus SE Medium Cargo", 5.9, LoadCapacity.N2);
        Truck truck4 = new Truck("ISUZU", "ELF", 5.2, LoadCapacity.N2);

        List<Truck> trucks = new ArrayList<>(); // добавляю в список экземпляры с параметрами
        trucks.add(new Truck("DAF", "LF 45", 4.0, LoadCapacity.N1));
        trucks.add(new Truck("MAN", "TGL", 4.6, LoadCapacity.N2));
        trucks.add(new Truck("Daewoo", "Novus SE Medium Cargo", 5.9, LoadCapacity.N2));
        trucks.add(new Truck("ISUZU", "ELF", 5.2, LoadCapacity.N2));

        System.out.println("Грузовики в списке: ");
        Truck.trucksInTheList(trucks); // список грузовиков

        System.out.println();
        truck1.gas();  truck2.gas(); truck3.gas(); truck4.gas(); // начать движение
        truck1.brake(); truck2.brake(); truck3.brake(); truck4.brake(); // закончить движение

        System.out.println();
        System.out.println("Движение грузовых автомобилей: ");

        truck1.pitStop(); truck2.pitStop(); truck3.pitStop(); truck4.pitStop();
        truck1.bestLapTime();  truck2.bestLapTime();  truck3.bestLapTime();  truck4.bestLapTime();
        truck1.maxSpeed();  truck2.maxSpeed(); truck3.maxSpeed(); truck4.maxSpeed();

        System.out.println();
        Bus bus1 = new Bus("ЛиАЗ", "5256", 10.85, Capacity.SMALL);
        Bus bus2 = new Bus("ПАЗ", "3206", 4.25, Capacity.SMALL);
        Bus bus3 = new Bus("КАВЗ", "4235 АВРОРА", 10.3, Capacity.AVERAGE);
        Bus bus4 = new Bus("ГАЗ", "Вектор Next", 10.0, Capacity.ESPEC_SMALL);

        List<Bus> buses = new ArrayList<>(); // добавляю в список экземпляры с параметрами
        buses.add(new Bus("ЛиАЗ", "5256", 10.85, Capacity.SMALL));
        buses.add(new Bus("ПАЗ", "3206", 4.25, Capacity.SMALL));
        buses.add(new Bus("КАВЗ", "4235 АВРОРА", 10.3, Capacity.AVERAGE));
        buses.add(new Bus("ГАЗ", "Вектор Next", 10.0, Capacity.ESPEC_SMALL));

        System.out.println("Автобусы в списке: ");
        Bus.busesInTheList(buses); // список автобусов

        System.out.println();
        bus1.gas(); bus2.gas(); bus3.gas(); bus4.gas(); // начать движение
        bus1.brake();  bus2.brake();  bus3.brake(); bus4.brake(); // закончить движение

        System.out.println();
        System.out.println("Движение автобусов: ");
        bus1.pitStop(); bus2.pitStop(); bus3.pitStop(); bus4.pitStop();
        bus1.bestLapTime(); bus2.bestLapTime();  bus3.bestLapTime();  bus4.bestLapTime();
        bus1.maxSpeed(); bus2.maxSpeed(); bus3.maxSpeed();  bus4.maxSpeed();

        // общий список транспорта
        System.out.println();
        List<Transport> transports = new ArrayList<>();
        transports.add(car1); transports.add(car2); transports.add(car3);  transports.add(car4);
        transports.add(truck1); transports.add(truck2); transports.add(truck3);  transports.add(truck4);
        transports.add(bus1);  transports.add(bus2); transports.add(bus3); transports.add(bus4);

        System.out.println("Весь транспорт в списке: ");
        Transport.transportsInTheList(transports); // вывод списка транспорта

        System.out.println();
        System.out.println("Тип транспортного средства:");
        car1.printType();  car2.printType();  car3.printType();  car4.printType();
        truck1.printType(); truck2.printType(); truck3.printType();  truck4.printType();
        bus1.printType();  bus2.printType();  bus3.printType();  bus3.printType();

        System.out.println();
        // Водители:
        Driver<Car> driverB1 = new DriverB("Иванов Иван Иванович", true, 10.5, car1, CategoryDriverB.B);
        Driver<Car> driverB2 = new DriverB("Петров Петр Петрович", true, 11.0, car2, CategoryDriverB.B);
        Driver<Car> driverB3 = new DriverB("Иванов Петр Иванович", true, 10.5, car3, CategoryDriverB.B);
        Driver<Car> driverB4 = new DriverB("Петров Иван Петрович", true, 11.0, car4, CategoryDriverB.B);
        List<Driver<Car>> driversB = new ArrayList<>();
        driversB.add(driverB1);
        driversB.add(driverB2);
        driversB.add(driverB3);
        driversB.add(driverB4);
        System.out.println("Водители катгории 'B' в списке: ");
        DriverB.driversBInTheList(driversB);

        System.out.println();
        System.out.println("Водители катгории 'B' участвуют в автогонке: ");
        driverB1.drivingTruck();
        driverB2.drivingTruck();
        driverB3.drivingTruck();
        driverB4.drivingTruck();

        System.out.println();
        Driver<Truck> driverC1 = new DriverC("Сидоров Сидор Сидорович", true, 12.5, truck1, CategoryDriverC.C);
        Driver<Truck> driverC2 = new DriverC("Андреев Андрей Андреевич", true, 19.5, truck2, CategoryDriverC.C);
        Driver<Truck> driverC3 = new DriverC("Сидоров Андрей Сидорович", true, 12.5, truck3, CategoryDriverC.C);
        Driver<Truck> driverC4 = new DriverC("Андреев Сидор Андреевич", true, 19.5, truck4, CategoryDriverC.C);

        List<Driver<Truck>> driversC = new ArrayList<>();
        driversC.add(driverC1);
        driversC.add(driverC2);
        driversC.add(driverC3);
        driversC.add(driverC4);

        System.out.println("Водители катгории 'C' в списке: ");
        DriverC.driversCInTheList(driversC);

        System.out.println();
        System.out.println("Водители катгории 'C' участвуют в автогонке: ");
        driverC1.drivingTruck();
        driverC2.drivingTruck();
        driverC3.drivingTruck();
        driverC4.drivingTruck();

        System.out.println();
        Driver<Bus> driverD1 = new DriverD("Васильев Василий Васильевич", true, 17.5, bus1, CategoryDriverD.D);
        Driver<Bus> driverD2 = new DriverD("Михайлов Михаил Михайлович", true, 18.5, bus2, CategoryDriverD.D);
        Driver<Bus> driverD3 = new DriverD("Васильев Михаил Васильевич", true, 17.5, bus3, CategoryDriverD.D);
        Driver<Bus> driverD4 = new DriverD("Михайлов Василий Михайлович", true, 18.5, bus4, CategoryDriverD.D);

        List<Driver<Bus>> driversD = new ArrayList<>();
        driversD.add(driverD1);
        driversD.add(driverD2);
        driversD.add(driverD3);
        driversD.add(driverD4);

        System.out.println("Водители катгории 'D' в списке: ");
        DriverD.driversDInTheList(driversD);

        System.out.println();
        System.out.println("Водители катгории 'D' участвуют в автогонке: ");
        driverD1.drivingTruck();
        driverD2.drivingTruck();
        driverD3.drivingTruck();
        driverD4.drivingTruck();

        // Механики:
        System.out.println();
        System.out.println("Механики по ремонту автобусов в списке: ");

        Mechanics<Bus> mechanicBus1 = new Mechanics<>("Юрий", "Петров", "RVZ", bus1);
        Mechanics<Bus> mechanicBus2 = new Mechanics<>("Юрий", "Иванов", "RVZ", bus2);
        Mechanics<Bus> mechanicBus3 = new Mechanics<>("Юрий", "Ерохин", "RVZ", bus3);
        Mechanics<Bus> mechanicBus4 = new Mechanics<>("Юрий", "Смартов", "RVZ", bus4);

        List<Mechanics<Bus>> mechanicBus = new ArrayList<>();
        mechanicBus.add(mechanicBus1);
        mechanicBus.add(mechanicBus2);
        mechanicBus.add(mechanicBus3);
        mechanicBus.add(mechanicBus4);
        Mechanics.mechanicsBusInTheList(mechanicBus);

        System.out.println();
        System.out.println("Механики по ремонту легковых автомобилей в списке: ");

        Mechanics<Car> mechanicCar1 = new Mechanics<>("Роман", "Скворцов", "NPO", car1);
        Mechanics<Car> mechanicCar2 = new Mechanics<>("Роман", "Воронов", "NPO", car2);
        Mechanics<Car> mechanicCar3 = new Mechanics<>("Роман", "Галкин", "NPO", car3);
        Mechanics<Car> mechanicCar4 = new Mechanics<>("Роман", "Голубев", "NPO", car4);

        List<Mechanics<Car>> mechanicCar = new ArrayList<>();
        mechanicCar.add(mechanicCar1);
        mechanicCar.add(mechanicCar2);
        mechanicCar.add(mechanicCar3);
        mechanicCar.add(mechanicCar4);
        Mechanics.mechanicsCarInTheList(mechanicCar); // вывод на печать

        Mechanics<Truck> mechanicTruck1 = new Mechanics<>("Валерий", "Артемов", "NPG", truck1);
        Mechanics<Truck> mechanicTruck2 = new Mechanics<>("Валерий", "Кремов", "NPG", truck2);
        Mechanics<Truck> mechanicTruck3 = new Mechanics<>("Валерий", "Громов", "NPG", truck3);
        Mechanics<Truck> mechanicTruck4 = new Mechanics<>("Валерий", "Хромов", "NPG", truck4);

        System.out.println();
        System.out.println("Механики по ремонту грузовых автомобилей в списке: ");

        List<Mechanics<Truck>> mechanicTruck = new ArrayList<>();
        mechanicTruck.add(mechanicTruck1);
        mechanicTruck.add(mechanicTruck2);
        mechanicTruck.add(mechanicTruck3);
        mechanicTruck.add(mechanicTruck4);
        Mechanics.mechanicsTruckInTheList(mechanicTruck);

        System.out.println();
        System.out.println("Механики по ремонту: ");
        mechanicBus1.performMaintenance();
        mechanicBus2.performMaintenance();
        mechanicBus3.performMaintenance();
        mechanicBus4.performMaintenance();
        mechanicCar1.performMaintenance();
        mechanicCar2.performMaintenance();
        mechanicCar3.performMaintenance();
        mechanicCar4.performMaintenance();
        mechanicTruck1.performMaintenance();
        mechanicTruck2.performMaintenance();
        mechanicTruck3.performMaintenance();
        mechanicTruck4.performMaintenance();

        System.out.println("");

        Map<Transport, Mechanics> transportMechanicsHashMap = new HashMap<>();

        transportMechanicsHashMap.put(car1, mechanicCar1);
        transportMechanicsHashMap.put(bus1, mechanicBus1);
        transportMechanicsHashMap.put(truck1, mechanicTruck1);

        System.out.println("Мапы: " + transportMechanicsHashMap);

        System.out.println();
        STO sto = new STO();
        sto.addTransport(car1); sto.addTransport(car2); sto.addTransport(car3); sto.addTransport(car4);
        sto.addTransport(truck1); sto.addTransport(truck2); sto.addTransport(truck3); sto.addTransport(truck4);
        sto.addTransport(bus1); sto.addTransport(bus2); sto.addTransport(bus3); sto.addTransport(bus4);

        System.out.println();
        System.out.println("Диагностика трансоорта: ");
        service( // Диагностика
                car1, car2, car3, car4,
                truck1, truck2, truck3, truck4,
                bus1, bus2, bus3, bus3
        );

    }


    // методо, который делает диагностику транспорта
    private static void service(Transport... transports) {
        for (Transport transport : transports) {
            serviceTransport(transport);
        }
    }

    private static void serviceTransport(Transport transport){
        try {
            if (!transport.service()) {
                throw new RuntimeException("Транспортное средство " + transport.getBrand() + " " + transport.getModel() + " не прошел диагностику");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

}