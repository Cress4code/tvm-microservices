package com.omeganumeric.microcommerce.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Critere  extends  AuditModel{

    private String code;
    private String libelle;
    private String proprieteVehicule;


    public Critere() {
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getProprieteVehicule() {
        return proprieteVehicule;
    }

    public void setProprieteVehicule(String proprieteVehicule) {
        this.proprieteVehicule = proprieteVehicule;
    }



    @Override
    public String toString() {
        return "Critere{" +
                "code='" + code + '\'' +
                ", libelle='" + libelle + '\'' +
                ", proprieteVehicule='" + proprieteVehicule + '\'' +
                '}';
    }
}
