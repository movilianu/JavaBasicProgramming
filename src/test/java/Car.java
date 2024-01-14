class Car {
    private String make;
    private String model;
    private int year;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getter methods
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    // Display information about the car
    public void displayCarInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("------------");
    }
}

class CarDealership {
    private final Car[] inventory;

    // Constructor
    public CarDealership() {
        this.inventory = new Car[5]; // Initialize the array with 5 elements
        initializeInventory(); // Optional: Initialize the cars in the inventory
    }

    // Initialize the cars in the inventory (optional)
    private void initializeInventory() {
        inventory[0] = new Car("Toyota", "Camry", 2022);
        inventory[1] = new Car("Honda", "Accord", 2021);
        inventory[2] = new Car("Ford", "Fusion", 2023);
        inventory[3] = new Car("Chevrolet", "Malibu", 2022);
        inventory[4] = new Car("Nissan", "Altima", 2020);
    }

    // Display information about all cars in the inventory
    public void displayInventory() {
        System.out.println("Car Dealership Inventory:");
        for (Car car : inventory) {
            car.displayCarInfo();
        }
    }

    public static void main(String[] args) {
        // Create an instance of CarDealership
        CarDealership dealership = new CarDealership();

        // Display information about all cars in the inventory
        dealership.displayInventory();
    }
}
