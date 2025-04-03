class Car {
    private InternalCombustionEngine gasEngine;
    private ElectricEngine electricEngine;

    public Car(InternalCombustionEngine gasEngine, ElectricEngine electricEngine) {
        this.gasEngine = gasEngine;
        this.electricEngine = electricEngine;
    }

    public void displaySpecs() {
        System.out.println("Hybrid Car Specifications:");
        if (gasEngine != null) {
            System.out.println(" - Gas: " + gasEngine.isGas());
            System.out.println(" - Cylinders: " + gasEngine.getCylinders());
        }
        if (electricEngine != null) {
            System.out.println(" - Electric: " + electricEngine.isElectric());
            System.out.println(" - Battery Capacity: " + electricEngine.getBatteryCapacity() + " kWh");
        }
    }
}