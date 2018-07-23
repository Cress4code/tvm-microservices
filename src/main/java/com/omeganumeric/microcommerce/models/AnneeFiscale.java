package com.omeganumeric.microcommerce.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Entity
public class AnneeFiscale extends AuditModel {


    @Column(name = "start_Date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;

    @Column(name = "ref_annne_fiscale", nullable = false)
    private String referenceAnneeFiscale;

    @Column(name = "end_Date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;

    @Column(name = "annee", length = 4)
    private int annee;

    public AnneeFiscale() {
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getReferenceAnneeFiscale() {
        return referenceAnneeFiscale;
    }

    public void setReferenceAnneeFiscale(String referenceAnneeFiscale) {
        this.referenceAnneeFiscale = referenceAnneeFiscale;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }
}
