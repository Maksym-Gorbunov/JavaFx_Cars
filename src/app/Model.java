package app;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.util.ArrayList;
import java.util.List;

public class Model {
    private List <Car> cars = new ArrayList<>();
    private ObservableList <Car> carsObservable = FXCollections.observableList(cars);
    private DBHelper db = new DBHelper();

    public ObservableList<Car> getData(){
        populateCars();
        return carsObservable;
    }

    public void populateCars(){
        cars.clear();
        for(Car car : db.selectAll()){
            cars.add(car);
        }
    }

}

