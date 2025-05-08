package e11;

class VGAtoHDMIconnector implements VGAconnector {
    private HDMIconnector hdmIconnector;

    public VGAtoHDMIconnector(HDMIconnector hdmIconnector) {
        this.hdmIconnector = hdmIconnector;
    }

    @Override
    public void connectWithVGA() {
        System.out.println("Adapting VGA to HDMI...");
        hdmIconnector.connectWithHDMI();
    }
}
