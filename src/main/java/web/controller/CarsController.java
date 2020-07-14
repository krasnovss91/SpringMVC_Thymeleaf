package web.controller;

import org.springframework.web.bind.annotation.*;
import web.containers.CarListContainer;
import web.models.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


@Controller
public class CarsController {
    @GetMapping(value = "cars")
    public String printCars(@RequestParam Locale locale ,ModelMap model) {
        Locale en = new Locale("en");
        Locale ru = new Locale("ru");
    //    String en = "CARS";
     //   String ru = "МАШИНЫ";
        String lang;

     //   Locale locale = new Locale("");

        //model.addAttribute("locale",locale);

        if (locale.equals(ru)){
          //  model.addAttribute(ru);
            lang = "МАШИНЫ";
            model.addAttribute("lang",lang);
        }

        if(locale.equals(en)){
        //    model.addAttribute(en);
            lang = "CARS";
            model.addAttribute("lang",lang);
        }
      //  model.addAttribute("lang",lang);

        List<Car> cars = getListOfCars();
        CarListContainer listContainer = new CarListContainer();
        listContainer.setCars(cars);
        List<Car> cars1 = listContainer.getCars();
        model.addAttribute("cars",cars1);

        return "cars";
      //  return "lang","cars";

    }
    private List<Car> getListOfCars(){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("car1","model1",11));
        cars.add(new Car("car1","model2",21));
        cars.add(new Car("car2","model3",33));
        return cars;
    }
}
