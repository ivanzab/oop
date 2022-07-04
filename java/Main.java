class Main {
    public static void main(String[] args) {
        System.out.println("hola mundo");

        UberX uberX = new UberX("AMQ123", new Account("Andres Herrera ", "AND324"), "Chevrolet", "Sonic");
        uberX.passenger = 4;
        uberX.printDataCar();

        /*
         * Car car2 = new Car("QWE567", new Account("Andrea Herrera", "ANDE213"));
         * car2.passenger = 3;
         * car2.printDataCar();
         */

    }
}