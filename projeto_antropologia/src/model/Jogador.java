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
    private int acertos;
    private int erros;

    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return acertos;
    }

    public int getErros(){
        return erros;
    }
    
    public Jogador(String nome) {
        this.nome = nome;
        acertos = 0;
        erros = 0;
    }
    
    protected void novoAcerto(){
        acertos++;
    }
    
    protected void novoErro(){
        erros++;
    }
    


    
    
}
