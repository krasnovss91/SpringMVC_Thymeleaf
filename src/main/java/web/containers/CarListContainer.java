package web.containers;

import web.models.Car;

import java.util.List;

public class CarListContainer {
    private List<Car> cars;

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
