/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author gabriel
 */
public class CriarPerguntas extends javax.swing.JFrame {

    /**
     * Creates new form Jogo
     */
    public CriarPerguntas() {
        initComponents();
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
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        check_imagem = new javax.swing.JRadioButton();
        check_texto = new javax.swing.JRadioButton();
        botao_salvar_fechar = new javax.swing.JButton();
        botao_nova_pergunta = new javax.swing.JButton();
        panel_selecionar_imagem = new view.SelecionarImagem();
        painel_selecionar_texto = new view.SelecionarTexto();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Pergunta:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 32, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 32, 561, -1));

        jLabel2.setText("tipo de resposta:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 136, -1, -1));

        check_imagem.setText("imagem");
        check_imagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_imagemActionPerformed(evt);
            }
        });
        getContentPane().add(check_imagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 136, -1, -1));

        check_texto.setText("texto");
        check_texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_textoActionPerformed(evt);
            }
        });
        getContentPane().add(check_texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 136, -1, -1));

        botao_salvar_fechar.setText("Salvar e Fechar");
        botao_salvar_fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_salvar_fecharActionPerformed(evt);
            }
        });
        getContentPane().add(botao_salvar_fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, -1, -1));

        botao_nova_pergunta.setText("criar nova pergunta");
        botao_nova_pergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_nova_perguntaActionPerformed(evt);
            }
        });
        getContentPane().add(botao_nova_pergunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, -1, -1));

        panel_selecionar_imagem.setVisible(false);
        getContentPane().add(panel_selecionar_imagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 171, 660, 300));

        painel_selecionar_texto.setVisible(false);
        getContentPane().add(painel_selecionar_texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 660, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void check_imagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_imagemActionPerformed
        check_texto.setSelected(false);
        painel_selecionar_texto.setVisible(false);
        panel_selecionar_imagem.setVisible(true);
    }//GEN-LAST:event_check_imagemActionPerformed

    private void botao_salvar_fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_salvar_fecharActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botao_salvar_fecharActionPerformed

    private void botao_nova_perguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_nova_perguntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botao_nova_perguntaActionPerformed

    private void check_textoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_textoActionPerformed
        check_imagem.setSelected(false);
        panel_selecionar_imagem.setVisible(false);
        painel_selecionar_texto.setVisible(true);
        
    }//GEN-LAST:event_check_textoActionPerformed

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
    private javax.swing.JButton botao_nova_pergunta;
    private javax.swing.JButton botao_salvar_fechar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton check_imagem;
    private javax.swing.JRadioButton check_texto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private view.SelecionarTexto painel_selecionar_texto;
    private view.SelecionarImagem panel_selecionar_imagem;
    // End of variables declaration//GEN-END:variables
}
