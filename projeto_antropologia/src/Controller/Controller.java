/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import exception.FimDeJogoException;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import model.Pergunta;
import model.Quizz;

/**
 *
 * @author gabrielantonio
 */
public class Controller {

    private Quizz quizz;
    private static Controller instancia;
    
    
    
   public Pergunta ProximaPergunta() throws FimDeJogoException{
       return quizz.sorteiaPergunta();
   }
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
    
    
    public void addPergunta(String pergunta, String[] respostas, int resposaCorreta, ImageIcon imagem){
        quizz.addPergunta(pergunta, respostas, resposaCorreta, imagem);
    }

 

    public void initDados() {
        quizz.carregarDados();
    }

    
    
}
