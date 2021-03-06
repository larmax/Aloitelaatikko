package Tietovarastopakkaus;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author haaar
 */
public class Kayttaja {

    private Tietovarasto varasto = new Tietovarasto();
    private int kayttajaID;
    private String etunimi;
    private String sukunimi;
    private String email;
    private String kayttajatunnus;
    private String salasana;
    private String puhelin;
    private String luontipaivays;
    private int ryhmaID;
    private String Aktiivinen;

    public Kayttaja(int kayttajaID, String etunimi, String sukunimi, String email,
            String kayttajatunnus, String salasana, String puhelin, String luontipaivays, int ryhmaID, String Aktiivinen) {
        this.kayttajaID = kayttajaID;
        this.etunimi = etunimi;
        this.sukunimi = sukunimi;
        this.email = email;
        this.kayttajatunnus = kayttajatunnus;
        this.salasana = salasana;
        this.puhelin = puhelin;
        this.luontipaivays = luontipaivays;
        this.ryhmaID = ryhmaID;
        this.Aktiivinen = Aktiivinen;
    }

    public Kayttaja(String ktunnus, String salis) {
        this.kayttajatunnus = ktunnus;
        this.salasana = salis;
    }

    public int getKayttajaID() {
        return kayttajaID;
    }

    public String getEtunimi() {
        return etunimi;
    }

    public String getSukunimi() {
        return sukunimi;
    }

    public String getEmail() {
        return email;
    }

    public String getKayttajaTunnus() {
        return kayttajatunnus;
    }

    public String getSalasana() {
        return salasana;
    }

    public String getPuhelin() {
        return puhelin;
    }

    public String getLuontipaivays() {
        return luontipaivays;
    }

    public int getRyhmaID() {
        return ryhmaID;
    }

    public String getAktiivinen() {
        return Aktiivinen;
    }

    public String toString() {
        return kayttajaID + "," + etunimi + "," + sukunimi + "," + email + "," + kayttajatunnus + "," + salasana + "," + puhelin + "," + luontipaivays;
    }

    public void setVarasto(Tietovarasto varasto) {
        this.varasto = varasto;
    }

    public void setKayttajaID(int kayttajaID) {
        this.kayttajaID = kayttajaID;
    }

    public void setEtunimi(String etunimi) {
        this.etunimi = etunimi;
    }

    public void setSukunimi(String sukunimi) {
        this.sukunimi = sukunimi;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setKayttajatunnus(String kayttajatunnus) {
        this.kayttajatunnus = kayttajatunnus;
    }

    public void setSalasana(String salasana) {
        this.salasana = salasana;
    }

    public void setPuhelin(String puhelin) {
        this.puhelin = puhelin;
    }

    public void setLuontipaivays(String luontipaivays) {
        this.luontipaivays = luontipaivays;
    }

    public void setRyhmaID(int ryhmaID) {
        this.ryhmaID = ryhmaID;
    }

    public void setAktiivinen(String Aktiivinen) {
        this.Aktiivinen = Aktiivinen;
    }

}
