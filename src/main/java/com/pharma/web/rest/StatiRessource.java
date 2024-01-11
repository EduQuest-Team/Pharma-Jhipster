package com.pharma.web.rest;

import com.pharma.repository.PharmacieRepository;
import com.pharma.repository.ZoneRepository;
import com.pharma.service.dto.ZonePharmacieCountDTO;
import jakarta.transaction.Transactional;
import java.util.List;
import java.util.logging.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/stats")
@Transactional
public class StatiRessource {

    private final Logger logger = (Logger) LoggerFactory.getLogger(PharmacieResource.class);
    private static final String ENTITY_NAME = "stats";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final PharmacieRepository pharmacieRepository;
    private final ZoneRepository zoneRepository;

    public StatsResource(PharmacieRepository pharmacieRepository, ZoneRepository zoneRepository) {
        this.pharmacieRepository = pharmacieRepository;
        this.zoneRepository = zoneRepository;
    }

    @GetMapping("")
    public CountStatsDTO getCountStats() {
        return new CountStatsDTO(pharmacieRepository.count(), zoneRepository.count());
    }

    @GetMapping("/pharmacie-per-zone")
    public List<ZonePharmacieCountDTO> getPharmacieCountPerZone() {
        List<Object[]> result = zoneRepository.countPHaPerZone();
    }
}
