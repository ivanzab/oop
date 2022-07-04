var car = new Car("AW476", new Account("Andres Herrera", "LKD231"));
car.passenger = 4;
car.printDataCar();

var uberX = new UberX(
  "ER876",
  new Account("Andrea Ferran", "KOD431"),
  "Chavrolet",
  "Spark"
);
uberX.passenger = 4;
uberX.printDataCar();
