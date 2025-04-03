class InternalCombustionEngine implements Engine {
    private boolean gas;
    private int cylinders;

    public InternalCombustionEngine(boolean gas, int cylinders) {
        this.gas = gas;
        this.cylinders = cylinders;
    }

    @Override
    public boolean isGas() {
        return gas;
    }

    @Override
    public boolean isElectric() {
        return false;
    }

    public int getCylinders() {
        return cylinders;
    }
}