package com.example.jeffe.agendacontatos;

import java.util.ArrayList;

/**
 * Created by jeffe on 13/10/2016.
 */

public class Agenda extends ArrayList<Contato>{

    private static final long serialVersionUID = 1L;

    public void inserir(String Nome, String Fone) {

        this.add(new Contato(Nome, Fone));

    }


    public boolean editar(String aNome, String aFone) {

        for (Contato c : this) {
            if(c.getNome().equals(aNome)) {
                c.SetFone(aFone);
                return true;
            }
        }

        return false;

    }


    public boolean excluir(String aNome, String aFone) {

        for (Contato c : this){

            if(c.getNome().equals(aNome)) {
                this.remove(c);
                return true;
            }

        }
        return false;
    }

    @Override
    public String toString() {

        String result = "";
        for (Contato c : this) {
            result += c.toString() + "\n";
        }
        return result;
    }

}
