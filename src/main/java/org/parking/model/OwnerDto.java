package org.parking.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OwnerDto {
	public Integer ownerID;
	public String name;
	public String surname;
	public LocalDate birthData;
}
