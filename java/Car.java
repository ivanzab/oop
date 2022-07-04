class Car {
    Integer id;
    String license;
    Account driver;
    private Integer passenger;

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }

    void printDataCar() {
        if (passenger != null) {
            System.out.println("Lincense " + license + " name Driver: " + driver.name + "Passengers: " + passenger);
        }

    }

    public Integer getPassenger() {
        return passenger;
    }

    public void setPassenger(Integer passenger) {

        if (passenger == 4) {
            this.passenger = passenger;
        } else {
            System.out.println("Necesitas asignar 4 pasajeros");
        }
    }
}
/*
 * el primer if hace que en caso de null no se muestre la informacion
 * 
 * ! el get hace que se lea el atributo, debido a que esta private (la idea es
 * que se pueda leer pero no modificar en otra clase)
 * 
 * ?el set modifica el atributo, esta en una funcion que tira error si los
 * passenger no son 4
 */