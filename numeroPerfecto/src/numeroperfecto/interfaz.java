/*Un número perfecto es un entero positivo, que es igual a
la suma de todos los enteros positivos (excluido el mismo) que
son divisores del número.*/
package numeroperfecto;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 * @author Anijodz Academy
 */
public class interfaz extends javax.swing.JFrame {

    public interfaz() {
        initComponents();

        setTitle("Numero Perfectirigillo");
        setLocationRelativeTo(null);

        setResizable(false);

        Toolkit t = Toolkit.getDefaultToolkit();
        setIconImage(t.getImage(getClass().getResource("/btns/java.png")));

        NumeroPerfecto.SNumeros(TxtPerfecto);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FrmNumeroPerfecto = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtcalculos = new javax.swing.JTextArea();
        TxtPerfecto = new javax.swing.JTextField();
        CmdNuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FrmNumeroPerfecto.setBorder(javax.swing.BorderFactory.createTitledBorder("Numero Perfectirigillo"));

        txtcalculos.setEditable(false);
        txtcalculos.setColumns(20);
        txtcalculos.setRows(5);
        jScrollPane1.setViewportView(txtcalculos);

        javax.swing.GroupLayout FrmNumeroPerfectoLayout = new javax.swing.GroupLayout(FrmNumeroPerfecto);
        FrmNumeroPerfecto.setLayout(FrmNumeroPerfectoLayout);
        FrmNumeroPerfectoLayout.setHorizontalGroup(
            FrmNumeroPerfectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrmNumeroPerfectoLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                .addContainerGap())
        );
        FrmNumeroPerfectoLayout.setVerticalGroup(
            FrmNumeroPerfectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FrmNumeroPerfectoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        TxtPerfecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TxtPerfectoMousePressed(evt);
            }
        });
        TxtPerfecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPerfectoActionPerformed(evt);
            }
        });
        TxtPerfecto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtPerfectoKeyPressed(evt);
            }
        });

        CmdNuevo.setBackground(new java.awt.Color(0, 0, 102));
        CmdNuevo.setForeground(new java.awt.Color(255, 255, 255));
        CmdNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btns/nuevo.png"))); // NOI18N
        CmdNuevo.setText("Nueno");
        CmdNuevo.setToolTipText("Nuevo");
        CmdNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(TxtPerfecto, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(CmdNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(FrmNumeroPerfecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(TxtPerfecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FrmNumeroPerfecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CmdNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void CmdNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdNuevoActionPerformed
        TxtPerfecto.setText("");
        txtcalculos.setText("");
        TxtPerfecto.requestFocus();
    }//GEN-LAST:event_CmdNuevoActionPerformed

    private void TxtPerfectoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPerfectoKeyPressed

    }//GEN-LAST:event_TxtPerfectoKeyPressed

    private void TxtPerfectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPerfectoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPerfectoActionPerformed

    private void TxtPerfectoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxtPerfectoMousePressed

        if (TxtPerfecto.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Rellene todos los campos de texto: ", "Error",
                    JOptionPane.WARNING_MESSAGE);

        } else {
            int suma, numero, divisor;
            numero = Integer.parseInt(TxtPerfecto.getText().trim());
            txtcalculos.setText("Sus divisores son:");
            suma = 0;
            for (divisor = 1; divisor <= numero; divisor++) {
                if (numero % divisor == 0) {
                    suma += divisor;
                    txtcalculos.append(divisor + ", ");
                }
            }
            txtcalculos.append("\n La suma de sus divisores Excepto el " + numero + " es: " + (suma - numero));
            if ((suma - numero) == numero) {
                txtcalculos.append("\n El numero " + numero + " Es perfecto");
            } else {
                txtcalculos.append("\n El numero" + numero + " No es Perfecto");
            }
        }
    }//GEN-LAST:event_TxtPerfectoMousePressed

    

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CmdNuevo;
    private javax.swing.JPanel FrmNumeroPerfecto;
    private javax.swing.JTextField TxtPerfecto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtcalculos;
    // End of variables declaration//GEN-END:variables
}
