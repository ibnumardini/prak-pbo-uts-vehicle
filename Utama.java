import kendaraan.*;
import mesin.*;

public class Utama {
    public static void main(String[] args) {
        Mesin carEngine = new Mesin();
        carEngine.numberOfCylinders = 6;
        carEngine.cylinderCapacity = 3000;
        carEngine.stroke = 4;

        Mobil car = new Mobil();
        car.setFuel("RON 95");
        car.setEngine(carEngine);
        car.setBrand("Toyota Supra MK4");

        System.out.println("Mobil");
        System.out.println("Bahan bakar: " + car.getFuel());
        System.out.println("Merek: " + car.getBrand());
        System.out.println("Jumlah silinder: " + car.getEngine().numberOfCylinders);
        System.out.println("Kapasitas silinder: " + car.getEngine().cylinderCapacity);
        System.out.println("Stroke: " + car.getEngine().stroke);

        System.out.println();

        Mesin motocycleEngine = new Mesin();
        motocycleEngine.numberOfCylinders = 1   ;
        motocycleEngine.cylinderCapacity = 125;
        motocycleEngine.stroke = 4;

        SepedaMotor motorcycle = new SepedaMotor();
        motorcycle.setFuel("RON 92");
        motorcycle.setEngine(motocycleEngine);
        motorcycle.setBrand("Honda Supra X 125");

        System.out.println("Sepeda Motor");
        System.out.println("Bahan bakar: " + motorcycle.getFuel());
        System.out.println("Merek: " + motorcycle.getBrand());
        System.out.println("Jumlah silinder: " + motorcycle.getEngine().numberOfCylinders);
        System.out.println("Kapasitas silinder: " + motorcycle.getEngine().cylinderCapacity);
        System.out.println("Stroke: " + motorcycle.getEngine().stroke);
    }
}
