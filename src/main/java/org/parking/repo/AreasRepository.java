package org.parking.repo;

import org.parking.entities.AreaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AreasRepository extends JpaRepository<AreaEntity, Long> {

}
