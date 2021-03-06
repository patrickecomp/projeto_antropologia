/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author gabriel
 */

public class SelecionarTexto extends javax.swing.JPanel {

    String imagem_diretorio;
    ImageIcon image;
    
    public void limpar(){
        correta_resposta_1.setSelected(true);
        correta_resposta_2.setSelected(false);
        correta_resposta_3.setSelected(false);
        correta_resposta_4.setSelected(false);
        
        resposta_1.setText("");
        resposta_2.setText("");
        resposta_3.setText("");
        resposta_4.setText("");
        
        seleciona_imagem.setText("selecione");
        image = null;
    }
    public int respostaCorreta(){
        if(correta_resposta_1.isSelected())
            return 0;
        else if(correta_resposta_2.isSelected())
            return 1;
        else if(correta_resposta_3.isSelected())
            return 2;
        else 
            return 3;
    }
    
    public String[] respostas(){
        String [] a = new String[4];
        a[0] = resposta_1.getText();
        a[1] = resposta_2.getText();
        a[2] = resposta_3.getText();
        a[3] = resposta_4.getText();
        return a;
    }
    
    /**
     * Creates new form SelecionarImagens
     */
    public SelecionarTexto() {
        initComponents();
        limpar();
        seletor_imagem.setDialogTitle("Escolha a imagem que deseja adicionar");
        seletor_imagem.setFileFilter(new FileNameExtensionFilter("Images", "jpg", "png", "bmp", "jpeg"));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seletor_imagem = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resposta_1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        resposta_3 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        resposta_4 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        resposta_2 = new javax.swing.JTextArea();
        correta_resposta_1 = new javax.swing.JCheckBox();
        correta_resposta_2 = new javax.swing.JCheckBox();
        correta_resposta_3 = new javax.swing.JCheckBox();
        correta_resposta_4 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        seleciona_imagem = new javax.swing.JButton();

        jLabel1.setText("Digite aqui a resposta 1.");

        jLabel2.setText("Digite aqui a resposta 2.");

        jLabel3.setText("Digite aqui a resposta 3.");

        jLabel4.setText("Digite aqui a resposta 4.");

        resposta_1.setColumns(20);
        resposta_1.setRows(5);
        jScrollPane1.setViewportView(resposta_1);

        resposta_3.setColumns(20);
        resposta_3.setRows(5);
        jScrollPane2.setViewportView(resposta_3);

        resposta_4.setColumns(20);
        resposta_4.setRows(5);
        jScrollPane3.setViewportView(resposta_4);

        resposta_2.setColumns(20);
        resposta_2.setRows(5);
        jScrollPane4.setViewportView(resposta_2);

        correta_resposta_1.setText("é a correta");
        correta_resposta_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correta_resposta_1ActionPerformed(evt);
            }
        });

        correta_resposta_2.setText("é a correta");
        correta_resposta_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correta_resposta_2ActionPerformed(evt);
            }
        });

        correta_resposta_3.setText("é a correta");
        correta_resposta_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correta_resposta_3ActionPerformed(evt);
            }
        });

        correta_resposta_4.setText("é a correta");
        correta_resposta_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correta_resposta_4ActionPerformed(evt);
            }
        });

        jLabel5.setText("Se você deseja exibir uma imagem em sua questão selecione ela clicando no botão ao lado.");

        seleciona_imagem.setText("imagem");
        seleciona_imagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seleciona_imagemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(correta_resposta_4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(correta_resposta_1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(correta_resposta_2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(correta_resposta_3)))
                        .addGap(103, 103, 103))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(seleciona_imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3))
                        .addGap(0, 17, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seleciona_imagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(correta_resposta_1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(correta_resposta_2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(correta_resposta_3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(correta_resposta_4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void correta_resposta_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correta_resposta_1ActionPerformed
        correta_resposta_2.setSelected(false);
        correta_resposta_3.setSelected(false);
        correta_resposta_4.setSelected(false);
    }//GEN-LAST:event_correta_resposta_1ActionPerformed

    private void correta_resposta_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correta_resposta_4ActionPerformed

        correta_resposta_1.setSelected(false);
        correta_resposta_2.setSelected(false);
        correta_resposta_3.setSelected(false);
    }//GEN-LAST:event_correta_resposta_4ActionPerformed

    private void seleciona_imagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seleciona_imagemActionPerformed
    JFileChooser fileChooser = seletor_imagem;
    int returnVal = fileChooser.showOpenDialog(this);
    if (returnVal == JFileChooser.APPROVE_OPTION) {
        try {
            File file = fileChooser.getSelectedFile();
            imagem_diretorio = file.getAbsolutePath();
            seleciona_imagem.setText("OK");
            BufferedImage k = ImageIO.read(file);
            BufferedImage resizedImage = new BufferedImage(257, 272, k.getType());
            Graphics2D g = resizedImage.createGraphics();
            g.drawImage(k, 0, 0, 257, 272, null);
            image = new ImageIcon(resizedImage);
            
//    JFrame frame = new JFrame();
//    JLabel label = new JLabel(new ImageIcon(image));
//    frame.getContentPane().add(label, BorderLayout.CENTER);
//    frame.pack();
//    frame.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(SelecionarTexto.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    } else {
        System.out.println("File access cancelled by user.");
    }
    }//GEN-LAST:event_seleciona_imagemActionPerformed

    private void correta_resposta_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correta_resposta_2ActionPerformed
        correta_resposta_1.setSelected(false);
        correta_resposta_3.setSelected(false);
        correta_resposta_4.setSelected(false);
    }//GEN-LAST:event_correta_resposta_2ActionPerformed

    private void correta_resposta_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correta_resposta_3ActionPerformed
       correta_resposta_1.setSelected(false);
        correta_resposta_2.setSelected(false);
        correta_resposta_4.setSelected(false);
    }//GEN-LAST:event_correta_resposta_3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox correta_resposta_1;
    private javax.swing.JCheckBox correta_resposta_2;
    private javax.swing.JCheckBox correta_resposta_3;
    private javax.swing.JCheckBox correta_resposta_4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea resposta_1;
    private javax.swing.JTextArea resposta_2;
    private javax.swing.JTextArea resposta_3;
    private javax.swing.JTextArea resposta_4;
    private javax.swing.JButton seleciona_imagem;
    private javax.swing.JFileChooser seletor_imagem;
    // End of variables declaration//GEN-END:variables
}
