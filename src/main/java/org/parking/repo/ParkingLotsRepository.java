package org.parking.repo;

import org.parking.entities.ParkingLotEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ParkingLotsRepository extends JpaRepository<ParkingLotEntity, Long> {
	
	@Query(value = """
			SELECT *
			FROM areas
			JOIN parking_lots ON areas.areaid = parking_lots.areaid
			WHERE parking_lots.parking_lot_id = :parkingID
			""", nativeQuery = true)
	byte [] getParkingLotInfo(long parkingID);

}
