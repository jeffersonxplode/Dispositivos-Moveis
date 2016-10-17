package com.example.jeffe.agendacontatos;

/**
 * Created by jeffe on 13/10/2016.
 */

public class Contato {

    private String nome, fone;

    public Contato(String anome, String afone) {
        nome = anome;
        fone = afone;
    }

    public String getNome(){ return nome;}

    public void SetFone(String afone){
        fone = afone;
    }

    @Override
    public String toString (){

        return nome + "-" +fone;
    }
}
