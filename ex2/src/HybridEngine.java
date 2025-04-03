class HybridEngine implements Engine {
    private final Engine gasEngine;
    private final Engine electricEngine;

    public HybridEngine(Engine gasEngine, Engine electricEngine) {
        this.gasEngine = gasEngine;
        this.electricEngine = electricEngine;
    }

    @Override
    public boolean isGas() {
        return gasEngine.isGas() || electricEngine.isGas();
    }

    @Override
    public boolean isElectric() {
        return gasEngine.isElectric() || electricEngine.isElectric();
    }

    @Override
    public String getType() {
        return "Hybrid";
    }
}