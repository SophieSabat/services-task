package com.example.servicestask.controllers;

import com.example.servicestask.dao.UserDAO;
import com.example.servicestask.models.Car;
import com.example.servicestask.models.Product;
import com.example.servicestask.models.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

    private UserDAO userDAO;

    @GetMapping("/get")
    public List<User> getAll() {
        return userDAO.findAll();
    }

    @GetMapping("/save")
    public void save() {
        User user = new User();
        user.setName("vasya");
        List<Product> products = new ArrayList<>();
        products.add(new Product("milk"));
        user.setProducts(products);
        userDAO.save(user);
    }

    @GetMapping("/userWithCars")
    public void userWithCars() {
        User user = new User("max");
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("mazda"));
        cars.add(new Car("suba"));
        user.setCars(cars);

        userDAO.save(user);
    }

}
