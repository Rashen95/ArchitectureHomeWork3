import java.awt.*;

public abstract class Car {

    //region Constructors

    public Car(String make, String model, Color color, boolean isHaveMirrors, boolean isHaveWindShield, boolean isHaveHeadlights, FuelType fuelType) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.fuelType = fuelType;
        this.isHaveMirrors = isHaveMirrors;
        this.isHaveWindShield = isHaveWindShield;
        this.isHaveHeadlights = isHaveHeadlights;
    }


    //endregion

    //region Public Methods
    // Движение
    public abstract void movement();

    public void setRefuelingStation(Refueling refuelingStation) {
        this.refueling = refuelingStation;
    }

    // Обслуживание
    public abstract void maintenance();

    // Переключение передач
    public abstract boolean gearShifting();

    // Включение фар
    public abstract boolean switchHeadlights();

    // Включение дворников
    public abstract boolean switchWipers();

    public boolean switchFogLights() {
        fogLights = !fogLights;
        return fogLights;
    }

    protected void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }

    protected String getMake() {
        return  this.make;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void wipMirrors() {
        if (wiping != null) {
            wiping.wipMirrors(this);
        }
    }

    public void wipWindShield() {
        if (wiping != null) {
            wiping.wipWindShield(this);
        }
    }

    public void wipHeadlights() {
        if (wiping != null) {
            wiping.wipHeadlights(this);
        }
    }

    public void fuel() {
        if (refueling != null) {
            refueling.fuel(fuelType);
        }
    }
    //endregion

    //region Private Fields
    protected Refueling refueling;
    protected Wiping wiping;
    // Марка автомобиля
    private String make;

    // Модель
    private String model;

    // Цвет
    private Color color;

    // Тип
    protected CarType type;

    // Число колес
    private int wheelsCount;

    // Тип топлива
    protected FuelType fuelType;

    // Тип коробки передач
    private GearboxType gearboxType;

    // Объем двигателя
    private double engineCapacity;

    // Наличие зеркал
    protected boolean isHaveMirrors;

    // Наличие дворников
    protected boolean isHaveWindShield;

    // Наличие фар
    protected boolean isHaveHeadlights;

    // Состояние противотуманных фар
    private boolean fogLights = false;
    //endregion
}