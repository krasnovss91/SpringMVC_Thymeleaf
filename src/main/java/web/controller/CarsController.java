package web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import web.containers.CarListContainer;
import web.models.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CarsController {
    //@GetMapping(value = "cars")
    @RequestMapping(value = "cars",method = RequestMethod.GET)
    public String printCars(ModelMap model) throws Exception {
        List<Car> cars = getListOfCars();
        CarListContainer listContainer = new CarListContainer();
        listContainer.setCars(cars);
        model.addAttribute("Cars",listContainer);
        return "cars";
    }
    private List<Car> getListOfCars(){
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car("car1","model1",11));
        cars.add(new Car("car1","model2",21));
        cars.add(new Car("car2","model3",33));
        return cars;
    }
}
