package org.parking.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "parking_lots")
public class ParkingLotEntity {
	@Id
	public long parkingLotId;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "areaid")
	public AreaEntity areaEntity;
}
