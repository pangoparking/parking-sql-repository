package org.parking.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "areas")
public class AreaEntity {
	@Id
	public long areaID;
	@Column
	public long dailyFineCost;
}
