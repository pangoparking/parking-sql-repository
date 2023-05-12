package org.parking.repo;

import org.parking.entities.OwnerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnersRepository extends JpaRepository<OwnerEntity, Long> {

}
