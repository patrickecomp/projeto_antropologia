/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Image;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa a instancia do jogo;
 * Vale salientar que essa classe implementa o padrão de projeto singleton;
 * @author gabrielantonio
 */
public class Quizz implements Serializable{
    private static Quizz instancia;
    private List<Pergunta> perguntas;
    private Jogador jogador;
    
    
    //============================================================
    /*
    implementação do singleton
    */
    private Quizz() {
        perguntas = new ArrayList<>();
    }
    
    public static Quizz getInstancia(){
        if(instancia == null)
            instancia = new Quizz();
        return instancia;
    }
    //============================================================
    
    
    public void addJogador(String nome){
        jogador = new Jogador(nome);
    }
    
    
    public void addPergunta(String pergunta, String[] respostas, int resposaCorreta, Image imagem){
        Pergunta temp = new Pergunta(pergunta);
        temp.setRespostas(respostas);
        temp.setCorreta(resposaCorreta);
        temp.setImagem(imagem);
        perguntas.add(temp);
    }
    
    
}
