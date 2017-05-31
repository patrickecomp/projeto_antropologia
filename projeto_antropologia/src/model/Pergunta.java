/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Collection;
import java.util.List;

/**
 *
 * @author gabriel
 */
public class Pergunta {
    
     String texto;
     String [] respostas; 
     int correta;
     int atual;
     int tipo;

    public Pergunta(String _texto) {
        texto = _texto;
        int atual = 0;
        respostas = new String[4];
    }
    
    public void addResposta(String resp){
        
        if (atual <= 3) {
            respostas[atual] = resp;
            atual++;
        }
    }

    public void setCorreta(int correta) {
        this.correta = correta;
    }
    

    public String[] getRespostas() {
        return respostas;
    }

    public String getTexto() {
        return texto;
    }

    public int getCorreta() {
        return correta;
    }
    
    
    
    
    public void exibir(){};
    
}
