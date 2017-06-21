/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controller.Controller;

/**
 *
 * @author gabriel
 */
public class CriarPerguntas extends javax.swing.JFrame {

    Controller controller;
    
    /**
     * Creates new form Jogo
     */
    public CriarPerguntas() {
        initComponents();
        controller = Controller.getInstancia();
        controller.initDados();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pergunta_texto = new javax.swing.JTextArea();
        botao_salvar_fechar = new javax.swing.JButton();
        descartar_alteracoes = new javax.swing.JButton();
        pergunta_frame = new view.SelecionarTexto();
        salvar_pergunta = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Pergunta:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pergunta_texto.setColumns(20);
        pergunta_texto.setRows(5);
        jScrollPane1.setViewportView(pergunta_texto);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 650, 90));

        botao_salvar_fechar.setText("salvar e fechar");
        botao_salvar_fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_salvar_fecharActionPerformed(evt);
            }
        });
        getContentPane().add(botao_salvar_fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 500, -1, -1));

        descartar_alteracoes.setText("descartar  alterçaões");
        descartar_alteracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descartar_alteracoesActionPerformed(evt);
            }
        });
        getContentPane().add(descartar_alteracoes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, -1, -1));
        getContentPane().add(pergunta_frame, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 660, -1));

        salvar_pergunta.setText("salvar e criar nova");
        salvar_pergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvar_perguntaActionPerformed(evt);
            }
        });
        getContentPane().add(salvar_pergunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 500, -1, -1));

        jToggleButton1.setText("apagar todas as perguntas");
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao_salvar_fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_salvar_fecharActionPerformed
      
        //verificar se os itens estão vazios antes de salvar
        controller.addPergunta(pergunta_texto.getText(), pergunta_frame.respostas(), 
              pergunta_frame.respostaCorreta(), null);
        //fechar janela 
     
    }//GEN-LAST:event_botao_salvar_fecharActionPerformed

    private void descartar_alteracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descartar_alteracoesActionPerformed
        
        //método basicamente limpa as paradas 
        pergunta_texto.setText("");
        pergunta_frame.limpar();
    }//GEN-LAST:event_descartar_alteracoesActionPerformed

    private void salvar_perguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvar_perguntaActionPerformed
        controller.addPergunta(pergunta_texto.getText(), pergunta_frame.respostas(), 
              pergunta_frame.respostaCorreta(), null);
        pergunta_texto.setText("");
        pergunta_frame.limpar();
        
        //exibir dialog "Pergunta salva com sucesso"; 
    }//GEN-LAST:event_salvar_perguntaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CriarPerguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriarPerguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriarPerguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriarPerguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CriarPerguntas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_salvar_fechar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton descartar_alteracoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private view.SelecionarTexto pergunta_frame;
    private javax.swing.JTextArea pergunta_texto;
    private javax.swing.JButton salvar_pergunta;
    // End of variables declaration//GEN-END:variables
}
