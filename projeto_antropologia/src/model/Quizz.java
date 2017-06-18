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
        if(instancia == null){
            File file = new File("C:/Users/Patrick/Documents/GitHub/projeto_antropologia/projeto_antropologia/data");
            File afile[] = file.listFiles();
            int i = 0;
            for (int j = afile.length; i < j; i++) {
                File arquivos = afile[i];
                if(arquivos.getName().equals("perguntas.dat")){
                    try
                    {
                        //Carrega o arquivo
                        FileInputStream arquivoLeitura = new FileInputStream("C:/Users/Patrick/Documents/GitHub/projeto_antropologia/projeto_antropologia/data/perguntas.dat");
                        //Classe responsavel por recuperar os objetos do arquivo
                        ObjectInputStream objLeitura = new ObjectInputStream(arquivoLeitura);
                        if(objLeitura.readObject() instanceof Quizz){
                            instancia = (Quizz) objLeitura.readObject();
                        }
                        objLeitura.close();
                        arquivoLeitura.close();
                    }
                    catch( Exception e ){
                        e.printStackTrace( );
                    }
                }
            }
            if(instancia == null)
                instancia = new Quizz();
            
        }
        return instancia;
    }
    //============================================================
    
    
    public void addJogador(String nome){
        jogador = new Jogador(nome);
    }
    
    public void listPerguntas(){
        for(int i = 0; i < perguntas.size();i++){
            System.out.println(perguntas.get(i).getTexto());
        }
    }
    
    public void addPergunta(String pergunta, String[] respostas, int resposaCorreta, Image imagem){
        Pergunta temp = new Pergunta(pergunta);
        temp.setRespostas(respostas);
        temp.setCorreta(resposaCorreta);
        temp.setImagem(imagem);
        perguntas.add(temp);
        listPerguntas();
    }

    public void salvarEstado() {
                // Cria o objeto serializado
        try
        {
            //Gera o arquivo para armazenar o objeto
            FileOutputStream arquivoGrav = new FileOutputStream("C:/Users/Patrick/Documents/GitHub/projeto_antropologia/projeto_antropologia/data/perguntas.dat");
            //Classe responsavel por inserir os objetos 
            ObjectOutputStream objGravar = new ObjectOutputStream(arquivoGrav);
            //Grava o objeto cliente no arquivo
            objGravar.writeObject(this);
            objGravar.flush();
            objGravar.close();
            arquivoGrav.flush();
            arquivoGrav.close();
            System.out.println("Objeto gravado com sucesso!");

        }

        catch( Exception e ){

                e.printStackTrace( );

        }
    }
    
    
}
