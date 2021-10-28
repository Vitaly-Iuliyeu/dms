package com.vitaly.dms.service;

import com.vitaly.dms.model.Car;
import com.vitaly.dms.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarRepository carRepository;

    @Override
    public List<Car> getAll() {
        return carRepository.findAll();
    }
    @Override
    public Car add(Car car) {
        return carRepository.save(car);
    }
}
