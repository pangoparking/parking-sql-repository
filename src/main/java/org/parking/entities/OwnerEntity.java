package org.parking.entities;

import java.time.LocalDate;
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
	public String email;
	@Column
	public LocalDate birthData;
}
