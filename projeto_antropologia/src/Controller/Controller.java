/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.Image;
import model.Quizz;

/**
 *
 * @author gabrielantonio
 */
public class Controller {

    private Quizz quizz;
    private static Controller instancia;
    
    private Controller(){
        quizz = Quizz.getInstancia();
    }
    
    public static Controller getInstancia(){
        if(instancia == null)
            instancia = new Controller();
        return instancia;
    }
    
    public void addJogador(String nome){
        quizz.addJogador(nome);
    }
    
    
    public void addPergunta(String pergunta, String[] respostas, int resposaCorreta, Image imagem){
        quizz.addPergunta(pergunta, respostas, resposaCorreta, imagem);
    }

 

    public void initDados() {
        quizz.carregarDados();
    }

    
    
}
