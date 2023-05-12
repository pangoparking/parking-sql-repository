package org.parking.entities;

import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "owners")
public class OwnerEntity {
	@Id
	public long ownerID;
	@Column
	public String name;
	@Column
	public String surname;
	@Column
	public Date birthData;
}
