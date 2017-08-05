/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import exception.FimDeJogoException;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 * Classe que representa a instancia do jogo;
 * Vale salientar que essa classe implementa o padrão de projeto singleton;
 * @author gabrielantonio
 */
public class Quizz implements Serializable{
    private static Quizz instancia;
    private List<Pergunta> perguntas;
    private Jogador jogador;
    private List<Pergunta> naoRespondidas;
    
    
    //============================================================
    /*
    implementação do singleton
    */
    private Quizz() {
        perguntas = new ArrayList<>();
        naoRespondidas = new ArrayList<>();
        jogador = new Jogador(null);
       

    }
    
    public static Quizz getInstancia(){
        if(instancia == null)
            instancia = new Quizz();
        return instancia;
    }
    //============================================================
    
    
    
    /***
     * Seta o jogador 
     * @param nome nome do jogador
     */
    public void addJogador(String nome){
        jogador = new Jogador(nome);
    }
    
    
    /**
     * Sorteia a pergunta;
     * Remove uma pergunta da lista de não respondidas e retorna para quem chamar; 
     * @return 
     */
    public Pergunta sorteiaPergunta() throws FimDeJogoException{
        //sorteia um número aleatório entre 0 e o tamanho da lista de não respondidas
        if(naoRespondidas.size() == 0)
            throw new FimDeJogoException();
        Random gerador = new Random();
        int i = gerador.nextInt(naoRespondidas.size());
        return naoRespondidas.remove(i); //index começa em 0 então vai até N - 1
    }
    
    public boolean respostaCerta(int resposta, Pergunta perguntaAtual){
        if(perguntaAtual.correta == resposta){
            jogador.novoAcerto();
            return true;
        }else{
            jogador.novoErro();
            return false;
        }
    }
    
    /***
     * Método responsável por zerar o jogo para nova jogatina
     */
    public void reinicia(){
        
        //zera as perguntas não respondidas
        naoRespondidas = new ArrayList<>();
        naoRespondidas.addAll(perguntas);
        jogador = new Jogador(null);
    }
    /***
     * Adiciona pergunta ao quizz 
     * @param pergunta texto das perguntas
     * @param respostas vetor de tamanho 4 contendo texto das respostas 
     * @param resposaCorreta indice da resposta correta no vetor 
     * @param imagem objeto imagem já carregada na memória
     */
    public void addPergunta(String pergunta, String[] respostas, int resposaCorreta, ImageIcon imagem){
        Pergunta temp = new Pergunta(pergunta);
        temp.setRespostas(respostas);
        temp.setCorreta(resposaCorreta);
        temp.setImagem(imagem);
        perguntas.add(temp);
       
        naoRespondidas.add(temp); //adiciona pergunta à lista de não respondidas 
        try{
		

		FileOutputStream fout = new FileOutputStream(new File("").getAbsolutePath()+File.separator+"data"+File.separator+"perguntas.dat");

		ObjectOutputStream oos = new ObjectOutputStream(fout);   

		oos.writeObject(perguntas);
		
		oos.close();
 
	   }catch(Exception ex){
		   ex.printStackTrace();
	   } 
    }


    public int getErros(){
        return jogador.getErros();
    }
    
    public int getAcertos(){
        return jogador.getPontos();
    }
    
    /***
     * Carrega as perguntas do Quizz para memória. 
     */
    public void carregarDados() {
                try{
		   
		   /*
		    * Responsável por carregar o arquivo address.ser
		    * */
		   FileInputStream fin = new FileInputStream(new File("").getAbsolutePath()+File.separator+"data"+File.separator+"perguntas.dat");
		   
		   /*
		    * Responsável por ler o objeto referente ao arquivo
		    * */
		   ObjectInputStream ois = new ObjectInputStream(fin);
		   
		   /*
		    * Aqui a mágica é feita, onde os bytes presentes no arquivo address.ser
		    * são convertidos em uma instância de Address.
		    * */
		   perguntas = (List<Pergunta>) ois.readObject();
		   ois.close();

                   
 
	   }catch(FileNotFoundException ex1){
		
               try{
		

		FileOutputStream fout = new FileOutputStream(new File("").getAbsolutePath()+File.separator+"data"+File.separator+"perguntas.dat");

		ObjectOutputStream oos = new ObjectOutputStream(fout);   

		oos.writeObject(perguntas);
		
		oos.close();
 
	   }catch(Exception ex){
		   ex.printStackTrace();
	   } 
	   }catch(Exception ex){
		   ex.printStackTrace(); 
	   }
                
                System.out.println("size: "+perguntas.size());
                naoRespondidas.addAll(perguntas);
    }
    
    
}
