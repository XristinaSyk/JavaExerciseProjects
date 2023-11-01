// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Car BMW = new Car("is an auto");
        runRace(BMW);
    }

    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}