class ElectricEngine implements Engine {
    private boolean electric;
    private double batteryCapacity;

    public ElectricEngine(boolean electric, double batteryCapacity) {
        this.electric = electric;
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public boolean isGas() {
        return false;
    }

    @Override
    public boolean isElectric() {
        return electric;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }
}