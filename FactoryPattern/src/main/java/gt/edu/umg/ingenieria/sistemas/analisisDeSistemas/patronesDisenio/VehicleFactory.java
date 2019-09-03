package gt.edu.umg.ingenieria.sistemas.analisisDeSistemas.patronesDisenio;

public class VehicleFactory {

    public Vehicle getVehicle(String vehicleType) {
        switch (vehicleType.toUpperCase()) {
            case "CAR" : return new Car();
            case "BUS" : return new Bus();
            case "TRUCK" : return new Truck();
            default : return null;
        }
    }
    
}
