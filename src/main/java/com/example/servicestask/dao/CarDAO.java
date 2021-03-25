package com.example.servicestask.dao;

import com.example.servicestask.models.Car;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;


@AllArgsConstructor
@Repository
public class CarDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void save(Car car) {
        entityManager.persist(car);
    }

    public List<Car> findAll() {
        return entityManager.createQuery("select c from Car c", Car.class).getResultList();
    }
}
