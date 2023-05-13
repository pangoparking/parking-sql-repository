package org.parking.entities;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@Entity
@Table(name = "cars")
public class CarEntity {
	public CarEntity(long carNumber, OwnerEntity ownerEntity) {
		this.carNumber = carNumber;
		this.ownerEntity = ownerEntity;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long carID;
	@Column(unique = true)
	public long carNumber;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "owner_id")
	public OwnerEntity ownerEntity;
}
