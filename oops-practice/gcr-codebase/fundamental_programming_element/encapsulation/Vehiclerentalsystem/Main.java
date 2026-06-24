public class Main {

    public static void main(String[] args) {

        Car car =
                new Car("MP04AB1234",
                        "Car",
                        200);

        Bike bike =
                new Bike("MP04XY5678",
                         "Bike",
                         500);

        Truck truck =
                new Truck("MP04TR1111",
                          "Truck",
                          3000,
                          1500);

        int days = 5;

        System.out.println("===== CAR =====");
        car.displayDetails();
        System.out.println(
                "Rental Cost : "
                        + car.calculateRentalCost(days));

        System.out.println();

        System.out.println("===== BIKE =====");
        bike.displayDetails();
        System.out.println(
                "Rental Cost : "
                        + bike.calculateRentalCost(days));

        System.out.println();

        System.out.println("===== TRUCK =====");
        truck.displayDetails();
        System.out.println(
                "Rental Cost : "
                        + truck.calculateRentalCost(days));
    }
}