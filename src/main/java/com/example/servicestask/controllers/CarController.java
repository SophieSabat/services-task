package com.example.servicestask.controllers;

import com.example.servicestask.models.Car;
import com.example.servicestask.services.CarService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CarController {

    private CarService carService;

    public CarController(@Qualifier("s1") @NonNull CarService carService) {
        this.carService = carService;
    }

    @PostMapping("/car/save")
    public void save() {
        carService.save(new Car("subaru"));
    }
}
