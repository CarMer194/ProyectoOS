/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.table.DefaultTableModel;
import proyectoso.Proceso;

/**
 *
 * @author Fer 
 */
public class Simulacion extends javax.swing.JPanel {

    /**
     * Creates new form Simulacion
     */
    ArrayList<Proceso> ListaProcesos = new ArrayList<Proceso>();
     ArrayList<Proceso> ListaProcesos2 = new ArrayList<Proceso>();
    int total_papeletas=0;
    int idProceso=1;
    float tiempo_listo;
    DefaultTableModel modelo;
    int iteracion = 0;
    boolean flagsorteo=true;
    boolean flagejecutar=true;
    public Simulacion() {
        initComponents();
    }
    boolean atras=false;
   
    public boolean isAtras() {
        return atras;
    }

    public void setAtras(boolean atras) {
        this.atras = atras;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inicio = new javax.swing.JButton();
        p3 = new javax.swing.JLabel();
        error = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        next = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        error2 = new javax.swing.JLabel();
        tiempoListo = new javax.swing.JTextField();
        nuevoProceso = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        numticket = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        numProceso = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        p5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        inicio.setText("Agregar a cola");
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });

        jLabel4.setText("SIMULACION LOTERIA");

        jLabel5.setText("IDPROCESO");

        jLabel6.setText("        NUMERO DE TICKETS");

        jLabel8.setText("SEGUNDO LISTO");

        next.setText("Sorteo");
        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextMouseClicked(evt);
            }
        });
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        jButton1.setText("Ejecutar proceso");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tiempoListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiempoListoActionPerformed(evt);
            }
        });

        nuevoProceso.setText("Nuevo Proceso");
        nuevoProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoProcesoActionPerformed(evt);
            }
        });

        jLabel1.setText("Ticket Ganador:");

        jLabel2.setText("Proceso Ganador:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Proceso", "Proceso", "Proceso", "Proceso", "Proceso"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setText("Cola de Procesos Listos");

        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(148, 148, 148)
                                    .addComponent(inicio)
                                    .addGap(18, 18, 18)
                                    .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(34, 34, 34)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(numticket, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(51, 51, 51)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(error2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(136, 136, 136)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(numProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)
                        .addGap(140, 140, 140)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(p1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                            .addComponent(p2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(p5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(nuevoProceso))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(tiempoListo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(26, 26, 26)
                .addComponent(tiempoListo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nuevoProceso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(numProceso, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addGap(73, 73, 73))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(error2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(inicio)
                                    .addComponent(next)
                                    .addComponent(jButton1)))))
                    .addComponent(numticket, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        if (iteracion<ListaProcesos.size()){
            modelo = (DefaultTableModel) jTable1.getModel();
            int mili_an=0;
            //for(int i = 0;i<ListaProcesos.size();i++){
                int id = ListaProcesos.get(iteracion).getaIdentificador();
                int num = ListaProcesos.get(iteracion).getaNroPapeletas();
                float mili = ListaProcesos.get(iteracion).getaTInicio();
                // delaySegundo(mili-mili_an);
                //mili_an = ListaProcesos.get(i).getaTInicio();
                modelo.setValueAt(id, 0, iteracion);
                modelo.setValueAt(num, 1, iteracion);
                modelo.setValueAt(mili, 2,iteracion);
                iteracion++;}
            else{
                error2.setText("no hay mas procesos que agregar");
            }
            //}
        /*for(int i = 0;i<ListaProcesos.size()+1;i++){
            ganador();
            liberar();
        }*/
    }//GEN-LAST:event_inicioActionPerformed

    private void nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nextMouseClicked

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        if (flagsorteo == true){
            ganador();
            flagsorteo=false;
            flagejecutar=true;
            error2.setText("");
        }else{
            error2.setText("ejecute primero");
        }
    }//GEN-LAST:event_nextActionPerformed
                        
    int cont=0;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cont++;
        if (flagejecutar==true){
            liberar();
            flagsorteo=true;
            flagejecutar=false;
            error2.setText("");
        }
        else {
            error2.setText("necesita otro ganador");
        }

        if(cont == ListaProcesos.size()){
            try {
                p1.setText("Proceso 1: tiempo de respuesta: "+ ListaProcesos2.get(0).getaTInicio()+" tiempo de retorno: "+alea());
            } catch (Exception e) {
            }
            try {
                p2.setText("Proceso 2: tiempo de respuesta: "+ ListaProcesos2.get(1).getaTInicio()+" tiempo de retorno: "+alea());
            } catch (Exception e) {
            }
            try {
                p3.setText("Proceso 3: tiempo de respuesta: "+ ListaProcesos2.get(2).getaTInicio()+" tiempo de retorno: "+alea());
            } catch (Exception e) {
            }
            try {
                p4.setText("Proceso 4: tiempo de respuesta: "+ ListaProcesos2.get(3).getaTInicio()+" tiempo de retorno: "+alea());
            } catch (Exception e) {
            }
            try {
                p5.setText("Proceso 5: tiempo de respuesta: "+ ListaProcesos2.get(4).getaTInicio()+" tiempo de retorno: "+alea());
            } catch (Exception e) {
            }

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    public int alea(){
        Random rn= new Random();
        return rn.nextInt(5)+1;
    }
    
    public void ganador(){
         Random num = new Random();
        int aleatorio= num.nextInt(total_papeletas)+1;
        int temp = 0;
        for(int i = 0;i<ListaProcesos.size();i++){
        temp += ListaProcesos.get(i).getaNroPapeletas();
        if(aleatorio>(temp-ListaProcesos.get(i).getaNroPapeletas())&&aleatorio<=temp){
            numticket.setText(String.valueOf(aleatorio));
            numProceso.setText(String.valueOf(ListaProcesos.get(i).aIdentificador));
             total_papeletas-=ListaProcesos.get(i).aNroPapeletas;
        }
        }
       
    }
    
    public void liberar(){
        for(int i = 0;i<ListaProcesos.size();i++){
            try{
            if((Integer)modelo.getValueAt(0, i)==Integer.parseInt(numProceso.getText())){
                modelo.setValueAt("", 0, i);
                modelo.setValueAt("", 1, i);
                modelo.setValueAt("", 2, i); 
            }}catch(Exception e){
            }
        }
        //ListaProcesos.remove(Integer.parseInt(numProceso.getText())-1);
        ListaProcesos.set(Integer.parseInt(numProceso.getText())-1, new Proceso(0,0,0));
    }
    
    public void crearProceso(){
        tiempo_listo = Float.parseFloat(tiempoListo.getText());
        int cant_papeletas = numeroPapeletas();
        Proceso nuevoProceso = new Proceso(idProceso,cant_papeletas,tiempo_listo);
        ListaProcesos.add(nuevoProceso);
        ListaProcesos2.add(nuevoProceso);
        total_papeletas +=cant_papeletas;
        idProceso++;

    }

    public int numeroPapeletas(){
        Random num = new Random();
        int aleatorio= num.nextInt(20)+1;
        return aleatorio;
    }
    
    private void tiempoListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiempoListoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tiempoListoActionPerformed

    private void nuevoProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoProcesoActionPerformed
        if(ListaProcesos.size()<5){
            try {
                crearProceso();
                tiempoListo.setText("");
                error.setText("");
            }catch (Exception e){
                error.setText("valor no valido");
            }
        }
        else{
            error.setText("Lista LLena");
        }

    }//GEN-LAST:event_nuevoProcesoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        atras=true;
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel error;
    private javax.swing.JLabel error2;
    private javax.swing.JButton inicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton next;
    private javax.swing.JButton nuevoProceso;
    private javax.swing.JLabel numProceso;
    private javax.swing.JLabel numticket;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel p4;
    private javax.swing.JLabel p5;
    private javax.swing.JTextField tiempoListo;
    // End of variables declaration//GEN-END:variables
}
