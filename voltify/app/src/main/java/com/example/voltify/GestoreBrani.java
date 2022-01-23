package com.example.voltify;
import java.util.ArrayList;

public class GestoreBrani {
    ArrayList<Brano> ListaBrani;
    public GestoreBrani(){
        ListaBrani = new ArrayList<Brano>();
    }
    public void addBrano(Brano b){

        ListaBrani.add(b);
    }

    public String toString(Brano b){
        return b.getTitolo()+" "+b.getAutore()+" "+b.getDurata()+" "+b.getGenere();
    }

    public String ListaBrani()
    {
        StringBuilder s = new StringBuilder();
        for (Brano b : ListaBrani)
        {
            s.append(b.getTitolo());
            s.append(b.getAutore());
            s.append(b.getDurata());
            s.append(b.getGenere());
            s.append("\n");
        }
        return s.toString();
    }
}
