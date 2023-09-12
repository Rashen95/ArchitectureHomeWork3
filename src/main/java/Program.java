/**
 * Доработать приложение, спроектированное на семинаре. Добавить тип, описывающий "автомойку".
 * Продемонстрировать работу получившейся программы, создать несколько типов автомобилей, загнать каждый автомобиль на заправку, а затем и на автомойку.
 */

public class Program {
    public static void main(String[] args) {
        Harvester harvester1 = new Harvester("A", "B", Color.BLACK, false, true, false, FuelType.Diesel);
        Harvester harvester2 = new Harvester("K", "D", Color.RED, true, true, true, FuelType.Diesel);
        Harvester harvester3 = new Harvester("C", "D", Color.RED, false, false, false, FuelType.Gasoline);
        PassengerCar passengerCar1 = new PassengerCar("1", "2", Color.BLACK, true, true, true, FuelType.Gasoline);
        PassengerCar passengerCar2 = new PassengerCar("5", "65", Color.RED, false, true, false, FuelType.Gasoline);
        PassengerCar passengerCar3 = new PassengerCar("121", "778", Color.BLUE, false, false, true, FuelType.Diesel);
        harvester1.setRefuelingStation(new RefuelingStation());
        harvester2.setRefuelingStation(new RefuelingStationV2());
        harvester3.setRefuelingStation(new RefuelingStationV2());
        passengerCar1.setRefuelingStation(new RefuelingStationV2());
        passengerCar2.setRefuelingStation(new RefuelingStation());
        passengerCar3.setRefuelingStation(new RefuelingStationV2());
        harvester1.wiping = new WipingStation();
        harvester2.wiping = new WipingStationV2();
        harvester3.wiping = new WipingStationV2();
        passengerCar1.wiping = new WipingStationV2();
        passengerCar2.wiping = new WipingStationV2();
        passengerCar3.wiping = new WipingStationV2();

        Car[] cars = {harvester1, harvester2, harvester3, passengerCar1, passengerCar2, passengerCar3};
        for (Car c : cars) {
            c.fuel();
            c.wipMirrors();
            c.wipHeadlights();
            c.wipWindShield();
            System.out.println();
        }
    }
}
