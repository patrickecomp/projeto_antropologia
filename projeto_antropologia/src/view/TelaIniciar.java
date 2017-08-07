/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Paty
 */
public class TelaIniciar {
    protected JFrame janela;
    private JButton inciar;
    private JButton cadastrar;
    private JLabel imagem;

    public void iniciar() {
        janela = new JFrame("Teste");
        inciar = new JButton("INICIAR");
        cadastrar = new JButton("CADASTRAR PERGUNTAS");
        
        //Definições da janela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(new Dimension(700, 600));
        janela.setResizable(false);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);

        //Pegando imagem.
        ImageIcon icon2 = new ImageIcon(getClass().getResource("TelaInicio_1.JPG"));
        imagem = new JLabel(icon2);

        //Container para imagem
        Container ima = new JPanel();
        ima.setLayout(new BorderLayout());
        ima.add(imagem);

        //Container para botão
        Container buton = new JPanel();
        buton.setLayout(new FlowLayout());
        inciar.setPreferredSize(new Dimension(100, 50));
        cadastrar.setPreferredSize(new Dimension(200, 50));
        
        buton.add(inciar);
        buton.add(cadastrar);
        inciar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }

            private void cadastrarActionPerformed(ActionEvent evt) {
                janela.dispose();
                new CriarPerguntas().setVisible(true);
            }
        });        
      
        //Container Principal
        Container c = janela.getContentPane();
        //c.setLayout(new FlowLayout());
       // c.add(ima);
       // c.add(buton);
        
        
        c.add(BorderLayout.NORTH, ima);
        c.add(BorderLayout.CENTER, buton);   
    }

        private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {                                                 
             janela.dispose();
            new Jogo().setVisible(true);
           
            
    }  
     

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                TelaIniciar ti = new TelaIniciar();
                ti.iniciar();
            }
        });
    }
}
