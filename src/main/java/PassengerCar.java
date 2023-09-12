public class PassengerCar extends Car implements Fueling, Washable {


    public PassengerCar(String make, String model, Color color, boolean isHaveMirrors, boolean isHaveWindShield, boolean isHaveHeadlights, FuelType fuelType) {
        super(make, model, color, isHaveMirrors, isHaveWindShield, isHaveHeadlights, fuelType);
    }

    @Override
    public void movement() {

    }

    @Override
    public void maintenance() {

    }

    @Override
    public boolean gearShifting() {
        return false;
    }

    @Override
    public boolean switchHeadlights() {
        return false;
    }

    @Override
    public boolean switchWipers() {
        return false;
    }
}
