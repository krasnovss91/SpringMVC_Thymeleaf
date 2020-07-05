package web.controller;

import web.models.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CarsController {
    @GetMapping(value = "cars")
    public String printCars(ModelMap model) {

        List<Car> cars = new ArrayList<>();

        Car car1 = new Car("car1", 11);
        Car car2 = new Car("car2", 12);
        Car car3 = new Car("ca3", 13);
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        model.addAllAttributes(cars);
        return "cars";
    }
}
