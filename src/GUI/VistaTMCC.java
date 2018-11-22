/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.text.NumberFormat;
import proyectoso.AlgoritmoTMCC;

/**
 *
 * @author Ale Campos
 */
public class VistaTMCC extends javax.swing.JPanel {
    AlgoritmoTMCC tMCC;
    float[] fTemp;
    boolean atras=false;
   
    public boolean isAtras() {
        return atras;
    }

    public void setAtras(boolean atras) {
        this.atras = atras;
    }
    
    public VistaTMCC() {
        
        tMCC= new AlgoritmoTMCC();
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

        jLe2 = new javax.swing.JLabel();
        jLretorno0 = new javax.swing.JLabel();
        jBAtras = new javax.swing.JButton();
        jLespera0 = new javax.swing.JLabel();
        jLListo = new javax.swing.JLabel();
        jLrespuesta0 = new javax.swing.JLabel();
        jLespera1 = new javax.swing.JLabel();
        jLlA = new javax.swing.JLabel();
        jLrespuesta1 = new javax.swing.JLabel();
        jCBnProceso = new javax.swing.JComboBox<>();
        jLretorno1 = new javax.swing.JLabel();
        jLestimacion = new javax.swing.JLabel();
        jLespera2 = new javax.swing.JLabel();
        jTFestimacion = new javax.swing.JFormattedTextField(NumberFormat.getNumberInstance());
        jLrespuesta2 = new javax.swing.JLabel();
        jFTA = new javax.swing.JFormattedTextField();
        jLretorno2 = new javax.swing.JLabel();
        jLtRafaga = new javax.swing.JLabel();
        jLa = new javax.swing.JLabel();
        jTFRafaga = new javax.swing.JFormattedTextField(NumberFormat.getNumberInstance());
        jFTListo = new javax.swing.JFormattedTextField();
        jLCContext = new javax.swing.JLabel();
        jBPlay = new javax.swing.JButton();
        jLtiempoConmutacion = new javax.swing.JLabel();
        jLe0 = new javax.swing.JLabel();
        jFTCon = new javax.swing.JFormattedTextField();
        jLe1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLe2.setText("Estimacion: 0");

        jLretorno0.setText("Tiempo de retorno: 0");

        jBAtras.setText("Atras");
        jBAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAtrasActionPerformed(evt);
            }
        });

        jLespera0.setText("Tiempo de espera: 0");

        jLListo.setText("Instante en que esta listo:");

        jLrespuesta0.setText("Tiempo de respuesta: 0");

        jLespera1.setText("Tiempo de espera: 0");

        jLlA.setText("valor de a:");

        jLrespuesta1.setText("Tiempo de respuesta: 0");

        jCBnProceso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Proceso 1", "Proceso 2", "Proceso 3"}));
        jCBnProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBnProcesoActionPerformed(evt);
            }
        });

        jLretorno1.setText("Tiempo de retorno: 0");

        jLestimacion.setText("Estimacion inicial:");

        jLespera2.setText("Tiempo de espera: 0");

        jTFestimacion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jTFestimacion.setText("0.0");
        jTFestimacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFestimacionActionPerformed(evt);
            }
        });

        jLrespuesta2.setText("Tiempo de respuesta: 0");

        jFTA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jFTA.setText("1.0");
        jFTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTAActionPerformed(evt);
            }
        });

        jLretorno2.setText("Tiempo de retorno: 0");

        jLtRafaga.setText("Tiempo de rafaga:");

        jLa.setText("a: 1.0");

        jTFRafaga.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jTFRafaga.setText("0.0");
        jTFRafaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFRafagaActionPerformed(evt);
            }
        });

        jFTListo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jFTListo.setText("0.0");
        jFTListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTListoActionPerformed(evt);
            }
        });

        jLCContext.setText("Cambios de contexto: 0");

        jBPlay.setText("Empezar");
        jBPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPlayActionPerformed(evt);
            }
        });

        jLtiempoConmutacion.setText("Tiempo de conmutación:");

        jLe0.setText("Estimacion: 0");

        jFTCon.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jFTCon.setText("0.0");
        jFTCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTConActionPerformed(evt);
            }
        });

        jLe1.setText("Estimacion: 0");

        jTable1.setModel(tMCC);
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLlA)
                                                .addGap(11, 11, 11))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jBAtras)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLCContext)
                                                    .addComponent(jLtiempoConmutacion))))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(jFTCon, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLa)
                                            .addComponent(jFTA, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(156, 156, 156)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLe0)
                                                .addGap(69, 69, 69)
                                                .addComponent(jLe1))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLrespuesta0)
                                                    .addComponent(jLespera0)
                                                    .addComponent(jLretorno0))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLrespuesta1)
                                                    .addComponent(jLespera1)
                                                    .addComponent(jLretorno1))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLrespuesta2)
                                            .addComponent(jLespera2)
                                            .addComponent(jLretorno2)
                                            .addComponent(jLe2))))
                                .addGap(22, 22, 22)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBPlay)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLListo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFTListo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCBnProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLestimacion)
                                    .addComponent(jLtRafaga))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFestimacion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jTFRafaga, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(66, 66, 66))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAtras)
                    .addComponent(jCBnProceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLtiempoConmutacion)
                    .addComponent(jFTCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLlA)
                    .addComponent(jFTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLListo)
                    .addComponent(jFTListo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLestimacion)
                    .addComponent(jTFestimacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLtRafaga)
                    .addComponent(jTFRafaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPlay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLCContext)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLretorno0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLespera0)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLrespuesta0))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLretorno1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLespera1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLrespuesta1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLretorno2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLespera2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLrespuesta2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLe2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLe0)
                        .addComponent(jLe1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAtrasActionPerformed
        // TODO add your handling code here:
        atras=true;
    }//GEN-LAST:event_jBAtrasActionPerformed

    private void jCBnProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBnProcesoActionPerformed
        jTFestimacion.setText(String.valueOf(tMCC.getEstimacion(jCBnProceso.getSelectedIndex())));
        jFTListo.setText(String.valueOf(tMCC.getListoEn(jCBnProceso.getSelectedIndex())));
    }//GEN-LAST:event_jCBnProcesoActionPerformed

    private void jTFestimacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFestimacionActionPerformed
        tMCC.setEstimacion(Float.valueOf(jTFestimacion.getText()), jCBnProceso.getSelectedIndex());
        switch(jCBnProceso.getSelectedIndex()){
            case 0:
            jLe0.setText("Estimacion: "+ jTFestimacion.getText());
            break;
            case 1:
            jLe1.setText("Estimacion: "+ jTFestimacion.getText());
            break;
            case 2:
            jLe2.setText("Estimacion: "+ jTFestimacion.getText());
            break;
        }
    }//GEN-LAST:event_jTFestimacionActionPerformed

    private void jFTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTAActionPerformed
        tMCC.setA(Float.valueOf(jFTA.getText()));
        jLa.setText("a: "+Float.valueOf(jFTA.getText()));
    }//GEN-LAST:event_jFTAActionPerformed

    private void jTFRafagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFRafagaActionPerformed
        tMCC.addRafaga(jCBnProceso.getSelectedIndex(), Float.valueOf(jTFRafaga.getText()));
    }//GEN-LAST:event_jTFRafagaActionPerformed

    private void jFTListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTListoActionPerformed
        tMCC.setEstimacion(Float.valueOf(jFTListo.getText()), jCBnProceso.getSelectedIndex());
    }//GEN-LAST:event_jFTListoActionPerformed

    private void jBPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPlayActionPerformed
        jBPlay.setText("Siguiente");
        if(tMCC.simular())
        jLCContext.setText("Cambios de contexto: " +tMCC.getContador());

        jLe0.setText("Estimacion: "+String.format("%.3f", tMCC.getEstimacion(0)));
        jLe1.setText("Estimacion: "+String.format("%.3f", tMCC.getEstimacion(1)));
        jLe2.setText("Estimacion: "+String.format("%.3f", tMCC.getEstimacion(2)));

        fTemp =tMCC.getTiempos(0);
        jLretorno0.setText("Tiempo de retorno:"+ String.format("%.1f", fTemp[0]));
        jLespera0.setText("Tiempo de espera:"+  String.format("%.1f", fTemp[1]));
        jLrespuesta0.setText("Tiempo de respuesta:"+  String.format("%.1f", fTemp[2]));

        fTemp =tMCC.getTiempos(1);
        jLretorno1.setText("Tiempo de retorno:"+  String.format("%.1f", fTemp[0]));
        jLespera1.setText("Tiempo de espera:"+  String.format("%.1f", fTemp[1]));
        jLrespuesta1.setText("Tiempo de respuesta:"+  String.format("%.1f", fTemp[2]));

        fTemp =tMCC.getTiempos(2);
        jLretorno2.setText("Tiempo de retorno:"+  String.format("%.1f", fTemp[0]));
        jLespera2.setText("Tiempo de espera:"+  String.format("%.1f", fTemp[1]));
        jLrespuesta2.setText("Tiempo de respuesta:"+  String.format("%.1f", fTemp[2]));
    }//GEN-LAST:event_jBPlayActionPerformed

    private void jFTConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTConActionPerformed
        tMCC.setConmutacion(Float.valueOf(jFTCon.getText()));
    }//GEN-LAST:event_jFTConActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAtras;
    private javax.swing.JButton jBPlay;
    private javax.swing.JComboBox<String> jCBnProceso;
    private javax.swing.JFormattedTextField jFTA;
    private javax.swing.JFormattedTextField jFTCon;
    private javax.swing.JFormattedTextField jFTListo;
    private javax.swing.JLabel jLCContext;
    private javax.swing.JLabel jLListo;
    private javax.swing.JLabel jLa;
    private javax.swing.JLabel jLe0;
    private javax.swing.JLabel jLe1;
    private javax.swing.JLabel jLe2;
    private javax.swing.JLabel jLespera0;
    private javax.swing.JLabel jLespera1;
    private javax.swing.JLabel jLespera2;
    private javax.swing.JLabel jLestimacion;
    private javax.swing.JLabel jLlA;
    private javax.swing.JLabel jLrespuesta0;
    private javax.swing.JLabel jLrespuesta1;
    private javax.swing.JLabel jLrespuesta2;
    private javax.swing.JLabel jLretorno0;
    private javax.swing.JLabel jLretorno1;
    private javax.swing.JLabel jLretorno2;
    private javax.swing.JLabel jLtRafaga;
    private javax.swing.JLabel jLtiempoConmutacion;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JFormattedTextField jTFRafaga;
    private javax.swing.JFormattedTextField jTFestimacion;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}