package com.pharma.service.dto;

public class CountStatsDTO {

    private Long PharmacieCount;
    private Long ZoneCount;

    public CountStatsDTO(Long pharmacieCount, Long zoneCount) {
        PharmacieCount = pharmacieCount;
        ZoneCount = zoneCount;
    }

    public Long getPharmacieCount() {
        return PharmacieCount;
    }

    public void setPharmacieCount(Long pharmacieCount) {
        PharmacieCount = pharmacieCount;
    }

    public Long getZoneCount() {
        return ZoneCount;
    }

    public void setZoneCount(Long zoneCount) {
        ZoneCount = zoneCount;
    }
}
