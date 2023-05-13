package org.parking.repo;

import org.parking.entities.ParkingLotEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingLotsRepository extends JpaRepository<ParkingLotEntity, Long> {

}
