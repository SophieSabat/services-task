package com.example.servicestask.services.implementation;

import com.example.servicestask.dao.CarDAO;
import com.example.servicestask.models.Car;
import com.example.servicestask.services.CarService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@Service("s2")
public class CarServiceImplementationTwo implements CarService {

    private CarDAO carDAO;

    @Override
    public void save(Car car) {
        carDAO.save(car);
    }

    @Override
    public List<Car> findAll() {
        return carDAO.findAll();
    }
}
