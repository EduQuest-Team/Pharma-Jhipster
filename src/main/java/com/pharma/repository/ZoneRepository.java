package com.pharma.repository;

import com.pharma.domain.Zone;
import java.util.List;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the Zone entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ZoneRepository extends JpaRepository<Zone, Long> {
    @Query("SELECT  ph.id , COUNT(zone) FROM Pharmacie ph JOIN ph.zone zone GROUP BY ph.id")
    List<Object[]> countPHaPerZone();
}
