package app;

import javafx.beans.property.SimpleStringProperty;

public class Car {
    private final SimpleStringProperty licensenumber;
    private final SimpleStringProperty make;
    private final SimpleStringProperty color;

    public Car(String licensenumber, String make, String color) {
        this.licensenumber = new SimpleStringProperty(licensenumber);
        this.make = new SimpleStringProperty(make);
        this.color = new SimpleStringProperty(color);
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