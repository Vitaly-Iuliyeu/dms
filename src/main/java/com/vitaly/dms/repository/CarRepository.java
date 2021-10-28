package com.vitaly.dms.repository;

import com.vitaly.dms.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long>{

}
