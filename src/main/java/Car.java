public class Car {
    String brand;
    String model;
    String color;
    int yearOfManufacture;
    int speed;

    public Car(String brand, String model, String color, int year) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfManufacture = year;
        this.speed = 0;
    }
    public void start(){
        System.out.println("Car started");
    }
    public void accelerate(int increase) {
        speed += increase;
        System.out.println(brand + " " + model + " accelerate. Speed: " + speed + " km/h.");
    }
    public int getSpeed() {
        return speed;
    }
}
