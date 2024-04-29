package com.copilot.booking.car.api.repository;

import com.copilot.booking.car.api.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    Car findByCarID(String carID);

    List<Car> findByCarNameContaining(String query);
}