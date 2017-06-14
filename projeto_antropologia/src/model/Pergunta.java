/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Image;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author gabriel
 */
public class Pergunta implements Serializable{
    
     String texto;
     String [] respostas; 
     int correta;
     int atual;
     Image imagem; 
    
     public Pergunta(String _texto) {
        texto = _texto;
        int atual = 0;
        respostas = new String[4];
    }
    
    
    public void setRespostas(String[] respostas){
        
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
    
    public void setImagem(Image i){
        imagem = i;
    }
    
    
}
