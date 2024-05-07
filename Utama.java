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

        printVehicle("Mobil", car);

        System.out.println();

        Mesin motocycleEngine = new Mesin();
        motocycleEngine.numberOfCylinders = 1;
        motocycleEngine.cylinderCapacity = 125;
        motocycleEngine.stroke = 4;

        SepedaMotor motorcycle = new SepedaMotor();
        motorcycle.setFuel("RON 92");
        motorcycle.setEngine(motocycleEngine);
        motorcycle.setBrand("Honda Supra X 125");

        printVehicle("Sepeda Motor", motorcycle);
    }

    public static void printVehicle(String type, Vehicle vehicle) {
        System.out.println(type);
        System.out.println("Bahan bakar: " + vehicle.getFuel());
        System.out.println("Merek: " + vehicle.getBrand());
        System.out.println("Jumlah silinder: " + vehicle.getEngine().numberOfCylinders);
        System.out.println("Kapasitas silinder: " + vehicle.getEngine().cylinderCapacity);
        System.out.println("Stroke: " + vehicle.getEngine().stroke);
    }
}
