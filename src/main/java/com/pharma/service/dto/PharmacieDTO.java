package com.pharma.service.dto;

import com.pharma.domain.Pharmacie;
import com.pharma.domain.User;
import com.pharma.domain.Zone;

public class PharmacieDTO extends AdminUserDTO {

    private Long id;
    private String nom;
    private byte[] image;
    private Double latitude;
    private Double longitude;
    private Boolean status;

    public PharmacieDTO() {
        super();
    }

    public PharmacieDTO(User user, Pharmacie pharmacie) {
        super(user);
        this.id = pharmacie.getId();
        this.nom = pharmacie.getNom();
        this.image = pharmacie.getImage();
        this.latitude = pharmacie.getLatitude();
        this.longitude = pharmacie.getLongitude();
        this.status = pharmacie.getStatus();
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
