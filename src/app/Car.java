package app;

import javafx.beans.property.SimpleStringProperty;

public class Car {
    private final SimpleStringProperty licensenumber;
    private final SimpleStringProperty make;
    private final SimpleStringProperty color;
    public static final long serialVersionUID = 11L;

    public Car(String licensenumber, String make, String color) {
        this.licensenumber = new SimpleStringProperty(licensenumber);
        this.make = new SimpleStringProperty(make);
        this.color = new SimpleStringProperty(color);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Car obj2 = (Car) obj;
        return getLicensenumber().equals(obj2.getLicensenumber());
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(getLicensenumber());
    }
    @Override
    public String toString() {
        return "licensenumber: "+getLicensenumber()+"\n"+
               "make: "+getMake()+"\n"+
               "color: "+getColor();
    }

    // Getters & Setters
    public String getLicensenumber() {
        return licensenumber.get();
    }
    public void setLicensenumber(String licensenumber) {
        this.licensenumber.set(licensenumber);
    }

    public String getMake() {
        return make.get();
    }
    public void setMake(String make) {
        this.make.set(make);
    }

    public String getColor() {
        return color.get();
    }
    public void setColor(String color) {
        this.color.set(color);
    }
}