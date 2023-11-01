public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Car-> startEngine");
    }
    public void drive(){
        System.out.println("Car-> driving, type is " + getClass().getSimpleName());
        runEngine();
    }
    protected void runEngine(){
        System.out.println("Car-> runEngine");
    }
}

class GasPoweredCar extends Car{

    private double avgKmPerLitre;
    private int cylinders;
    public GasPoweredCar(String description) {
        super(description);
    }
}


class ElectricCar extends Car{

    private double avgKmPerLitre;
    private int batterySize;
    public ElectricCar(String description) {
        super(description);
    }
}

class HybridCar extends Car{

    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;
    public HybridCar(String description) {
        super(description);
    }
}