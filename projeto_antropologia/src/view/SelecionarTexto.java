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
public class SelecionarTexto extends javax.swing.JPanel {

    /**
     * Creates new form SelecionarImagens
     */
    public SelecionarTexto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        correta_respota_1 = new javax.swing.JCheckBox();
        correta_resposta_2 = new javax.swing.JCheckBox();
        correta_resposta_3 = new javax.swing.JCheckBox();
        correta_resposta_4 = new javax.swing.JCheckBox();

        jLabel1.setText("Resposta 1");

        jLabel2.setText("Resposta 2");

        jLabel3.setText("Reposta 3");

        jLabel4.setText("Resposta 4");

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

        correta_respota_1.setText("é a correta");
        correta_respota_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correta_respota_1ActionPerformed(evt);
            }
        });

        correta_resposta_2.setText("é a correta");

        correta_resposta_3.setText("é a correta");

        correta_resposta_4.setText("é a correta");
        correta_resposta_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correta_resposta_4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(correta_resposta_4))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(correta_respota_1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(correta_resposta_2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(correta_resposta_3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(correta_respota_1))
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

    private void correta_respota_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correta_respota_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correta_respota_1ActionPerformed

    private void correta_resposta_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correta_resposta_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correta_resposta_4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox correta_resposta_2;
    private javax.swing.JCheckBox correta_resposta_3;
    private javax.swing.JCheckBox correta_resposta_4;
    private javax.swing.JCheckBox correta_respota_1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea resposta_1;
    private javax.swing.JTextArea resposta_2;
    private javax.swing.JTextArea resposta_3;
    private javax.swing.JTextArea resposta_4;
    // End of variables declaration//GEN-END:variables
}