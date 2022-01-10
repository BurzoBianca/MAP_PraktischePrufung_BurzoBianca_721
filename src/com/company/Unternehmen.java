package com.company;

public class Unternehmen {

    private int id;
    private String unternehmensname;
    private Enum unternehmensgröße;
    private int anzahlMitarbeiter;
    private int einkommen_Kunde;
    private String ort;

    public Unternehmen(int id, String unternehmensname, Enum unternehmensgröße, int anzahlMitarbeiter, int einkommen_Kunde, String ort) {
        this.id = id;
        this.unternehmensname = unternehmensname;
        this.unternehmensgröße = unternehmensgröße;
        this.anzahlMitarbeiter = anzahlMitarbeiter;
        this.einkommen_Kunde = einkommen_Kunde;
        this.ort = ort;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUnternehmensname(String unternehmensname) {
        this.unternehmensname = unternehmensname;
    }

    public void setUnternehmensgröße(Enum unternehmensgröße) {
        this.unternehmensgröße = unternehmensgröße;
    }

    public void setAnzahlMitarbeiter(int anzahlMitarbeiter) {
        this.anzahlMitarbeiter = anzahlMitarbeiter;
    }

    public void setEinkommen_Kunde(int einkommen_Kunde) {
        this.einkommen_Kunde = einkommen_Kunde;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    @Override
    public String toString() {
        return "Unternehmen{" +
                "id='" + id + '\'' +
                "name='" + unternehmensname + '\'' +
                ", unternehmensgrosse='" + unternehmensgröße + '\'' +
                "anzahl Mitarbeiter='" + anzahlMitarbeiter + '\'' +
                "einkommen Kunden='" + einkommen_Kunde + '\'' +
                ", ort='" + ort + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getUnternehmensname() {
        return unternehmensname;
    }

    public Enum getUnternehmensgröße() {
        return unternehmensgröße;
    }

    public int getAnzahlMitarbeiter() {
        return anzahlMitarbeiter;
    }

    public int getEinkommen_Kunde() {
        return einkommen_Kunde;
    }

    public String getOrt() {
        return ort;
    }
}
