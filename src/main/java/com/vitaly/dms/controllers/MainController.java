package com.vitaly.dms.controllers;

import com.vitaly.dms.model.Car;
import com.vitaly.dms.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {
    @Autowired
    private CarService carService;
    //private Date date = new Date(System.currentTimeMillis());

    @GetMapping("/allCar")
    public List<Car> getCar() {
        return carService.getAll();
    }

    @PostMapping("/addCar")
    public Car addCar(@RequestParam("name") String name){
        Car car = new Car();
        car.setModel(name);
        return carService.add(car);
    }
}
