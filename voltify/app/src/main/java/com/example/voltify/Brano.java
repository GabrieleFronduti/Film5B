package com.example.voltify;

import java.util.Date;

public class Brano {
    private String titolo;
    private int durata;
    private String autore;
    private Date dataCreazione;

    public Brano(String titolo){
        this.titolo = titolo;
        this.durata=durata;
        this.autore=autore;
        this.dataCreazione=dataCreazione;
    }
    public String getTitolo(){
        return this.titolo;
    }
    public String getAutore(){
        return this.autore;
    }
    public int getDurata(){
        return this.durata;
    }
    public Date getdataCreazione(){
        return this.dataCreazione;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public void setDataCreazione(Date dataCreazione) {
        this.dataCreazione = dataCreazione;
    }
}

