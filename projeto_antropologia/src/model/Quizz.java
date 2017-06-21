/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
        
        try{
		

		FileOutputStream fout = new FileOutputStream("C:/Users/Patrick/Documents/GitHub/projeto_antropologia/projeto_antropologia/data/pergunta"+perguntas.size()+".dat");

                

		ObjectOutputStream oos = new ObjectOutputStream(fout);   

		oos.writeObject(temp);
		
		oos.close();
 
	   }catch(Exception ex){
		   ex.printStackTrace();
	   } 
    }


    public void carregarDados() {
            File file = new File("C:/Users/Patrick/Documents/GitHub/projeto_antropologia/projeto_antropologia/data");
            File afile[] = file.listFiles();
            int i = 0;
            for (int j = afile.length; i < j; i++) {
                File arquivos = afile[i];
                try{
		   
		   /*
		    * Responsável por carregar o arquivo address.ser
		    * */
		   FileInputStream fin = new FileInputStream("C:/Users/Patrick/Documents/GitHub/projeto_antropologia/projeto_antropologia/data/"+arquivos.getName());
		   
		   /*
		    * Responsável por ler o objeto referente ao arquivo
		    * */
		   ObjectInputStream ois = new ObjectInputStream(fin);
		   
		   /*
		    * Aqui a mágica é feita, onde os bytes presentes no arquivo address.ser
		    * são convertidos em uma instância de Address.
		    * */
		   Pergunta tagetPergunta = (Pergunta) ois.readObject();
		   ois.close();
 
                   perguntas.add(tagetPergunta);
                   
 
	   }catch(Exception ex){
		   ex.printStackTrace(); 
	   }
        }
    }
    
    
}
