package com.company;

import java.util.Objects;

public class Unternehmen {
    private Long id;
    private String name;
    private Enum unternehmensgrosse;
    private int anzahlMitarbeiter;
    private int einkommenKunde;
    private String ort;

    public Unternehmen(Long id, String name, Enum unternehmensgrosse, int anzahlMitarbeiter, int einkommenKunde, String ort) {
        this.id = id;
        this.name = name;
        this.unternehmensgrosse = unternehmensgrosse;
        this.anzahlMitarbeiter = anzahlMitarbeiter;
        this.einkommenKunde = einkommenKunde;
        this.ort = ort;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enum getUnternehmensgrosse() {
        return unternehmensgrosse;
    }

    public void setUnternehmensgrosse(Enum unternehmensgrosse) {
        this.unternehmensgrosse = unternehmensgrosse;
    }

    public int getAnzahlMitarbeiter() {
        return anzahlMitarbeiter;
    }

    public void setAnzahlMitarbeiter(int anzahlMitarbeiter) {
        this.anzahlMitarbeiter = anzahlMitarbeiter;
    }

    public int getEinkommenKunde() {
        return einkommenKunde;
    }

    public void setEinkommenKunde(int einkommenKunde) {
        this.einkommenKunde = einkommenKunde;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Unternehmen kunde = (Unternehmen) o;
        return anzahlMitarbeiter == kunde.anzahlMitarbeiter && einkommenKunde == kunde.einkommenKunde && Objects.equals(id, kunde.id) && Objects.equals(name, kunde.name) && unternehmensgrosse == kunde.unternehmensgrosse && Objects.equals(ort, kunde.ort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, unternehmensgrosse, anzahlMitarbeiter, einkommenKunde, ort);
    }

    @Override
    public String toString() {
        return "Kunde{" + "id=" + id + ", name='" + name + '\'' + ", unternehmensgrosse=" + unternehmensgrosse +
                ", anzahlMitarbeiter=" + anzahlMitarbeiter + ", einkommenKunde=" + einkommenKunde +
                ", ort='" + ort + '\'' + '}';
    }
}