public class Hybrid implements Electric, InternalCombustion {

    @Override
    public String ChargeBattery() {
        String Battery = "charging battery ";
    
        return Battery;
    }
    
    @Override
    public String fillgas() {
        String Gas = "refueling gas ";
    
        
        return Gas;
        }
    }