/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author gabrielantonio
 */
public class Jogador {
    private String nome;
    private int pontos;

    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return pontos;
    }

    
    
    public Jogador(String nome) {
        this.nome = nome;
        pontos = 0;
    }
    
    protected void novoAcerto(){
        pontos++;
    }
    
    


    
    
}
