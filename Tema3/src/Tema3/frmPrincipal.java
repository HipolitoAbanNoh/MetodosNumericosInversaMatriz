
package Tema3;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.AbstractTableModel;


public class frmPrincipal extends javax.swing.JFrame {
    DefaultTableModel md;//sirve para implementar un modelo a la tabla
    String data[][] = {};//se crea una matriz contenido de la tabla Ejemplo
    String cabeza[] = {"x", "x", "x"};//Emcabezado
    
    public frmPrincipal() {
        initComponents();
        md = new DefaultTableModel(data, cabeza);//se le pasa el contenido = matriz y el encabezado 
        TablaInversa.setModel(md);//A la tabla original 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtFilas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtColumnas = new javax.swing.JTextField();
        BotonGenerar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMatrizEntrada = new javax.swing.JTable();
        jbtnCalcular = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMatrizInversa = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaInversa = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Metodos numericos");
        setBackground(new java.awt.Color(51, 0, 0));

        jLabel1.setText("Filas");

        txtFilas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFilasActionPerformed(evt);
            }
        });

        jLabel2.setText("Columnas");

        txtColumnas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColumnasActionPerformed(evt);
            }
        });

        BotonGenerar.setText("Generar Matriz");
        BotonGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGenerarActionPerformed(evt);
            }
        });

        tblMatrizEntrada.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 51), new java.awt.Color(0, 255, 0), new java.awt.Color(51, 255, 51), new java.awt.Color(153, 255, 51)));
        tblMatrizEntrada.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "A", "B", "C"
            }
        ));
        tblMatrizEntrada.setSelectionBackground(new java.awt.Color(0, 204, 204));
        jScrollPane1.setViewportView(tblMatrizEntrada);

        jbtnCalcular.setText("Calcular");

        tblMatrizInversa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, ""},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "A", "B", "C"
            }
        ));
        jScrollPane2.setViewportView(tblMatrizInversa);
        if (tblMatrizInversa.getColumnModel().getColumnCount() > 0) {
            tblMatrizInversa.getColumnModel().getColumn(0).setResizable(false);
            tblMatrizInversa.getColumnModel().getColumn(2).setResizable(false);
        }

        TablaInversa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 51, 51), new java.awt.Color(255, 153, 102), new java.awt.Color(153, 51, 0), new java.awt.Color(255, 51, 51)));
        TablaInversa.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaInversa.setSelectionBackground(new java.awt.Color(0, 204, 204));
        jScrollPane3.setViewportView(TablaInversa);

        jLabel3.setText("Matriz Inverza");

        jLabel4.setText("Datos de entrada");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jbtnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFilas, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(BotonGenerar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFilas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtColumnas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonGenerar))
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtColumnasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColumnasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColumnasActionPerformed

    private void BotonGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGenerarActionPerformed
        int fila = 0, columna = 0;
        try {
            fila = Integer.parseInt(txtFilas.getText());
            columna = Integer.parseInt(txtColumnas.getText());
            int matrix[][] = new int[fila][columna];
            this.mostrarMatriz(matrix, fila, columna);
        } catch (Exception e) {
            if (fila > 0 && columna > 0) {
                JOptionPane.showMessageDialog(rootPane, "Valores aceptados");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Solo esta permitido ingresar valores enteros");
            }
        }
    }//GEN-LAST:event_BotonGenerarActionPerformed

    private void txtFilasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFilasActionPerformed
        
    }//GEN-LAST:event_txtFilasActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }
    public void mostrarMatriz(int matriz[][], int fila, int columna) {
        DefaultTableModel model = (DefaultTableModel) tblMatrizEntrada.getModel();
        model.setRowCount(fila);//filas
        model.setColumnCount(columna);//columnas
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                tblMatrizEntrada.setValueAt(matriz[fila][columna], fila, columna);
            }
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonGenerar;
    private javax.swing.JTable TablaInversa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbtnCalcular;
    private javax.swing.JTable tblMatrizEntrada;
    private javax.swing.JTable tblMatrizInversa;
    private javax.swing.JTextField txtColumnas;
    private javax.swing.JTextField txtFilas;
    // End of variables declaration//GEN-END:variables
}
