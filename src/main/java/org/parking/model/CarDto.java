package org.parking.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class CarDto {
	public Integer carID;
	public Integer carNumber;
	public Integer ownerID;
}
