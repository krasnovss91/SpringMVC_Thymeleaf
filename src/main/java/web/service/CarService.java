package web.service;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    List<Car> cars = new ArrayList<>();
  /*  public List<User> getAllUsers() {
        return new ArrayList<>(dataBase.values());
    }
     public void deleteAllUser() {
        dataBase.clear();
    }
        public boolean addUser(User user) {
        if (isExistsThisUser(user)) {
            return false;
        } else {
            user.setId(maxId.getAndIncrement());
            dataBase.put(user.getId(), user);
            return true;
        }
    }

    public Car getCars(){
       // return  cars;
        // for (User user : users) {
        for (Car car : cars){
            return car;
        }

    } */

    public void addCar(Car car){
        cars.add(car);
    }
}
