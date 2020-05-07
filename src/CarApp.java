
public class CarApp {
    public static void main(String[] args) {
        Car Audi = new Car("Audi", "white");
        Car Toyota = new Car("Toyota", "black");
        Audi.start();
        Toyota.start();
        Audi.acceleration();
        Toyota.acceleration();
        Audi.speed(70);
        Toyota.stop();
        String str1 = Audi.getColor() + " " + Audi.getBrand();
        String str2 = Toyota.getColor() + " " + Toyota.getBrand();
    }
}
