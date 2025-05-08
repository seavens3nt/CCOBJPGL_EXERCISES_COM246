package e11;

class Monitor {
    public void connect(VGAconnector charger) {
        System.out.println("Monitor expecting VGA connector...");
        charger.connectWithVGA();
        System.out.println("Monitor connected.");
    }
}
