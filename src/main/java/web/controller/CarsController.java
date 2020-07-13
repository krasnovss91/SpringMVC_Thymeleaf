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
import java.util.Locale;


@Controller
public class CarsController {
   // @GetMapping(value = "cars?locale")
    @GetMapping(value = "cars")
    public String printCars(ModelMap model) {
     //   Locale en = new Locale("en");
      //  Locale ru = new Locale("ru");
        String en = "CARS";
        String ru = "МАШИНЫ";

        Locale locale = new Locale("");

        //model.addAttribute("locale",locale);

        if (locale.equals("ru")){
            model.addAttribute(ru);
        }
        if(locale.equals("en")){
            model.addAttribute(en);
        }

        List<Car> cars = getListOfCars();
        CarListContainer listContainer = new CarListContainer();
        listContainer.setCars(cars);
        List<Car> cars1 = listContainer.getCars();
        model.addAttribute("cars",cars1);
        //model.addAttribute("cars",listContainer.getCars());
     //   model.addAttribute("cars",listContainer);
        //model.addAttribute("cars",getListOfCars());
        return "cars";
       // return "cars?locale";

    }
    private List<Car> getListOfCars(){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("car1","model1",11));
        cars.add(new Car("car1","model2",21));
        cars.add(new Car("car2","model3",33));
        return cars;
    }
}
