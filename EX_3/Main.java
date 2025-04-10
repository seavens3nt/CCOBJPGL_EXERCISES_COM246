public class Main {

    public static void main(String[] args) throws Exception {

        HybridVehicle car1 = new HybridSedan();
        car1.carName = "Hyundai Tucson";

        HybridVehicle car2 = new HybridPickup();
         car2.carName = "Prius Corolla";

        CarWash carwash = new CarWash(); 

        System.out.println(car1.fillgas() + "for " + car1.carName);
        System.out.println(car1.ChargeBattery() + "for " + car1.carName);
        System.out.println(carwash.Wash() + car1.carName);

        System.out.println();

        System.out.println(car2.fillgas() + "for " + car2.carName);
        System.out.println(car2.ChargeBattery() + "for " + car2.carName);
        System.out.println(carwash.Wash() + car2.carName);
        System.out.println();

        System.out.println();
      
    }
}