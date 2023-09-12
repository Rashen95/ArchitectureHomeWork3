public class WipingStation implements Wiping {
    @Override
    public void wipMirrors(Car c) {
        if (c.isHaveMirrors) {
            System.out.println("Моем окна машине " + c.getMake());
        }
    }

    @Override
    public void wipWindShield(Car c) {
        if (c.isHaveWindShield) {
            System.out.println("Моем дворники машине " + c.getMake());
        }
    }

    @Override
    public void wipHeadlights(Car c) {
        if (c.isHaveHeadlights) {
            System.out.println("Моем фары машине " + c.getMake());
        }
    }
}
