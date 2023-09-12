public class Harvester extends Car implements Fueling, Washable {


    public Harvester(String make, String model, Color color, boolean isHaveMirrors, boolean isHaveWindShield, boolean isHaveHeadlights, FuelType fuelType) {
        super(make, model, color, isHaveMirrors, isHaveWindShield, isHaveHeadlights, fuelType);
    }



    public void setWiping(Wiping wiping) {
        this.wiping = wiping;
    }

    /**
     * Заправить автомобиль
     */

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

    public void sweeping() {
        System.out.println("Автомобиль метет улицу.");
    }

}
