package e11;

public class App {
    public static void main(String[] args) {
        HDMIconnector oldConnector = new HDMIconnector();
        VGAconnector connector = new VGAtoHDMIconnector(oldConnector);

        Monitor monitor = new Monitor();
        monitor.connect(connector);
    }
}