package org.parking.repo;

import org.parking.entities.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CarsRepository extends JpaRepository<CarEntity, Long> {

	@Query(value = """
			SELECT *
			FROM cars
			WHERE cars.car_number = :parkingID
						""", nativeQuery = true)
	CarEntity getCarInfo(long parkingID);
}