package com.vitaly.dms.service;

import com.vitaly.dms.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getAll();

    Car add(Car car);
}
