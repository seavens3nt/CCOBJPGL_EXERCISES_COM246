public class Main {
    public static void main(String[] args) {
        InternalCombustionEngine gasEngine = new InternalCombustionEngine(true, 6);
        ElectricEngine electricEngine = new ElectricEngine(true, 10);

        Car myCar = new Car(gasEngine, electricEngine);

        System.out.println("My car has " + gasEngine.getCylinders() + " cylinders and " +
                electricEngine.getBatteryCapacity() + " kWh battery.");
    }
}
