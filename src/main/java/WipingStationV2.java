public class WipingStationV2 implements Wiping {

    @Override
    public void wipMirrors(Car c) {
        if (c.isHaveMirrors) {
            System.out.println("V2 Моем окна машине " + c.getMake());
        }
    }

    @Override
    public void wipWindShield(Car c) {
        if (c.isHaveWindShield) {
            System.out.println("V2 Моем дворники машине " + c.getMake());
        }
    }

    @Override
    public void wipHeadlights(Car c) {
        if (c.isHaveHeadlights) {
            System.out.println("V2 Моем фары машине " + c.getMake());
        }
    }
}
