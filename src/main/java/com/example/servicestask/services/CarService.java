package com.example.servicestask.services;

import com.example.servicestask.models.Car;

import java.util.List;


public interface CarService {

    void save(Car car);

    List<Car> findAll();
}
