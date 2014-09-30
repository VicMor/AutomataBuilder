/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package automatabuilder;

import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
 
/**
 *
 * @author menegeps
 */
public class BuilderInterface extends javax.swing.JFrame implements TableModelListener{
    DefaultTableModel modelo;
    /**
     * Creates new form BuilderInterface
     */
    public BuilderInterface() {
        initComponents();
        String[] cabecera={};
        String[][] datos = {};        
        modelo = new DefaultTableModel(datos, cabecera);
        tablaTransisiones.setModel(modelo);
        tablaTransisiones.getModel().addTableModelListener(this);        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTransisiones = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panelDatos = new javax.swing.JPanel();
        tfAlfabeto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        comboNoEstados = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        tfCadena = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Automata Builder  v1.0");
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);

        panelTabla.setBorder(javax.swing.BorderFactory.createTitledBorder("Digrama de transiciones"));

        tablaTransisiones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaTransisiones);

        jButton1.setText("Guardar datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Borrar datos");

        javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(panelTablaLayout);
        panelTablaLayout.setHorizontalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelTablaLayout.setVerticalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaLayout.createSequentialGroup()
                .addGroup(panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTablaLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelTablaLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addGap(0, 9, Short.MAX_VALUE))
        );

        panelDatos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tfAlfabeto.setToolTipText("Ingresa los simbolos del alfabeto separados por coma  (a,b,c)");
        tfAlfabeto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfAlfabetoFocusLost(evt);
            }
        });
        tfAlfabeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAlfabetoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel2.setText("∑:");

        jLabel1.setText("No. de estados:");

        comboNoEstados.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        comboNoEstados.setToolTipText("Número de estados del autómata");
        comboNoEstados.setEnabled(false);
        comboNoEstados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNoEstadosActionPerformed(evt);
            }
        });

        jLabel3.setText("Cadena:");

        tfCadena.setToolTipText("Ingresa la cadena que debera reconocer el autómata");
        tfCadena.setEnabled(false);
        tfCadena.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCadenaFocusLost(evt);
            }
        });
        tfCadena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCadenaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfAlfabeto, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboNoEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(tfCadena, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCadena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(comboNoEstados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(tfAlfabeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboNoEstadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNoEstadosActionPerformed
        numEstados = Integer.parseInt(comboNoEstados.getSelectedItem().toString());
        System.out.println("El número de estados es: "+numEstados);
        DefaultTableModel modeloActualizado = (DefaultTableModel) tablaTransisiones.getModel();
        for (int i = 0; i < numEstados; i++) {
            modeloActualizado.addRow(new Object[i]);
            tablaTransisiones.setValueAt(estados[i], i, 0);
        }
    }//GEN-LAST:event_comboNoEstadosActionPerformed

    private void tfAlfabetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAlfabetoActionPerformed
        String []alfabeto = tfAlfabeto.getText().split(",");
        String []cabecera = new String[alfabeto.length+1];
        cabecera[0] = "State/Input";
        for (int i = 0; i < alfabeto.length; i++) {
            cabecera[i+1]= alfabeto[i]; 
        }
        modelo.setColumnIdentifiers(cabecera);
        tablaTransisiones.setModel(modelo);       
        comboNoEstados.setEnabled(true);
    }//GEN-LAST:event_tfAlfabetoActionPerformed

    private void tfCadenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCadenaActionPerformed
        System.out.println("La cadena a reconocer es: "+ tfCadena.getText());        
    }//GEN-LAST:event_tfCadenaActionPerformed

    private void tfAlfabetoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfAlfabetoFocusLost
        String []alfabeto = tfAlfabeto.getText().split(",");
        String []cabecera = new String[alfabeto.length+1];
        cabecera[0] = "State/Input";
        for (int i = 0; i < alfabeto.length; i++) {
            cabecera[i+1]= alfabeto[i];
        }
        modelo.setColumnIdentifiers(cabecera);
        tablaTransisiones.setModel(modelo);       
        comboNoEstados.setEnabled(true);
    }//GEN-LAST:event_tfAlfabetoFocusLost

    private void tfCadenaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCadenaFocusLost
        System.out.println("La cadena a reconocer es: "+ tfCadena.getText());
    }//GEN-LAST:event_tfCadenaFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tfCadena.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private int numEstados;
    private String[] estados = {"q\u2081","q\u2082","q\u2083","q\u2084","q\u2085","q\u2086","q\u2087","q\u2088","q\u2089","q\u2081\u2080"};
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboNoEstados;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JTable tablaTransisiones;
    private javax.swing.JTextField tfAlfabeto;
    private javax.swing.JTextField tfCadena;
    // End of variables declaration//GEN-END:variables

    @Override
    public void tableChanged(TableModelEvent e) {
   /*     int row = e.getFirstRow();
        int column = e.getColumn();
        TableModel model = (TableModel)e.getSource();
        String columnName = model.getColumnName(column);
        Object data = model.getValueAt(row, column);        
        System.out.println("Los datos modificados son:"+ data.toString());*/
        System.out.println("La tabla ha sido modificiada");
    }
}
