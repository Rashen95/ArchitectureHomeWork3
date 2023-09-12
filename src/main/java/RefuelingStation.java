public class RefuelingStation implements Refueling {
    @Override
    public void fuel(FuelType fuelType) {
        switch (fuelType) {
            case Diesel:
                System.out.println("Заправка дизельным топливом");
                break;
            case Gasoline:
                System.out.println("Заправка бензином");
                break;
        }
    }
}
