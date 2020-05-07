public class Car extends Vehicle {
    private String brand;
    private String color;

    public Car() {
    }

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public void acceleration(){
        System.out.println("The " + getColor() + " " + getBrand() + " is accelerating.");
    }

    public void speed(int mph){
        System.out.println("The " + getColor() + " " + getBrand() + " is driving over " + mph + " mph");
    }

    public void start() {
        System.out.println("The " + getColor() + " " + getBrand() + " is starting");
    }
    public void stop() {
        System.out.println("The " + getColor() + " " + getBrand() + " is stopped");

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
