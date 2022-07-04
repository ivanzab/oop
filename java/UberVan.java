import java.util.ArrayList;
import java.util.Map;

class UberVan extends Car {

    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberVan(String license, Account driver) {

        super(license, driver);
    }

    @Override
    public void setPassenger(Integer passenger) {
        if (passenger == 6) {
            super.passenger = passenger;
        } else {
            System.out.println("Necesitas asignar 6 pasajeros");
        }
    }
}
// aqui hay dudas sobre el super.passenger