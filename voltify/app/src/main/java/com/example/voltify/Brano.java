package com.example.voltify;



public class Brano {
    private String titolo;
    private String durata;
    private String autore;
    private String genere;


    public Brano(){
        this.titolo=titolo;
        this.durata=durata;
        this.autore=autore;
        this.genere=genere;

    }


    public String getTitolo(){
        return this.titolo;
    }
    public String getAutore(){
        return this.autore;
    }
    public String getDurata(){
        return this.durata;
    }
    public String getGenere() {
        return this.genere;
    }


    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setDurata(String durata) {
        this.durata = durata;
    }



    public void setGenere(String genere) {
        this.genere = genere;
    }
}

