package gt.edu.umg.ingenieria.sistemas.analisisDeSistemas.patronesDisenio;

public class FactoryApp {

    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle car = vehicleFactory.getVehicle("Car");
        car.moveForward();
        
        Vehicle bus = vehicleFactory.getVehicle("Bus");
        bus.moveForward();
        
        Vehicle truck = vehicleFactory.getVehicle("Truck");
        truck.moveForward();
    }
}
