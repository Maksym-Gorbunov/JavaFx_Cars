package app;

public class Car {
    private String licensenumber;
    private String make;
    private String color;

    public Car(String licensenumber, String make, String color) {
        this.licensenumber = licensenumber;
        this.make = make;
        this.color = color;
    }

    @Override
    public String toString() {
        return "reg.number : " + licensenumber + "\n" +
               "make : " + make + "\n" +
               "color      : " + color + "\n";
    }

    public String getLicensenumber() {
        return licensenumber;
    }

    public void setLicensenumber(String licensenumber) {
        this.licensenumber = licensenumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
