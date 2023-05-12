package org.parking.repo;

import org.parking.entities.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarsRepository extends JpaRepository<CarEntity, Long> {

}
