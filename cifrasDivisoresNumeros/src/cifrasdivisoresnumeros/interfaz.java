/*Aplicación que permita el ingreso de un número entero y 
muestre en pantalla la siguiente información:
1) Cantidad de cifras, 
2) Suma de cifras impares, 
3) Suma de cifras pares, 
4) Suma total de cifras, 
5) Cifra mayor, 
6) Cifra menor y 
7) Divisores de dicho número.*/
package cifrasdivisoresnumeros;

import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 * * ** @author Anijodz Academy
 */
public class interfaz extends javax.swing.JFrame {

    CifrasDivisoresNumeros clean = new CifrasDivisoresNumeros();

    public interfaz() {
        initComponents();
        setTitle("Suscribete y Like");
        setLocationRelativeTo(null);
        setResizable(false);
        Toolkit t = Toolkit.getDefaultToolkit();
        setIconImage(t.getImage(getClass().getResource("/btns/java.png")));
        CifrasDivisoresNumeros.SNumeros(TxtNumero);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FraEntrada = new javax.swing.JPanel();
        LblNumero = new javax.swing.JLabel();
        TxtNumero = new javax.swing.JTextField();
        FraSalida = new javax.swing.JPanel();
        LblCantCifras = new javax.swing.JLabel();
        LblSumlmpares = new javax.swing.JLabel();
        LblSumPares = new javax.swing.JLabel();
        LblSumTotal = new javax.swing.JLabel();
        LblCifraMayor = new javax.swing.JLabel();
        LblCifraMenor = new javax.swing.JLabel();
        TxtCantCifras = new javax.swing.JTextField();
        TxtSumlmpares = new javax.swing.JTextField();
        TxtSumPares = new javax.swing.JTextField();
        TxtSumTotal = new javax.swing.JTextField();
        TxtCifraMayor = new javax.swing.JTextField();
        TxtCifraMenor = new javax.swing.JTextField();
        FraDivisores = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtDivisores = new javax.swing.JTextArea();
        FraSalir = new javax.swing.JPanel();
        CmdSalir = new javax.swing.JButton();
        CmdAceptar = new javax.swing.JButton();
        CmdNuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FraEntrada.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        LblNumero.setText("Ingrese un número:");

        javax.swing.GroupLayout FraEntradaLayout = new javax.swing.GroupLayout(FraEntrada);
        FraEntrada.setLayout(FraEntradaLayout);
        FraEntradaLayout.setHorizontalGroup(
            FraEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FraEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblNumero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtNumero)
                .addContainerGap())
        );
        FraEntradaLayout.setVerticalGroup(
            FraEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FraEntradaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FraEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblNumero)
                    .addComponent(TxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FraSalida.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        LblCantCifras.setText("Cantidad de cifras:");

        LblSumlmpares.setText("Suma de cifras impares:");

        LblSumPares.setText("Suma de cifras pares:");

        LblSumTotal.setText("Suma total de cifras:");

        LblCifraMayor.setText("Cifra mayor:");

        LblCifraMenor.setText("Cifra menor:");

        TxtCantCifras.setEditable(false);

        TxtSumlmpares.setEditable(false);

        TxtSumPares.setEditable(false);
        TxtSumPares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSumParesActionPerformed(evt);
            }
        });

        TxtSumTotal.setEditable(false);

        TxtCifraMayor.setEditable(false);

        TxtCifraMenor.setEditable(false);

        javax.swing.GroupLayout FraSalidaLayout = new javax.swing.GroupLayout(FraSalida);
        FraSalida.setLayout(FraSalidaLayout);
        FraSalidaLayout.setHorizontalGroup(
            FraSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FraSalidaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FraSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FraSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(FraSalidaLayout.createSequentialGroup()
                            .addGroup(FraSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(FraSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(FraSalidaLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(LblSumlmpares))
                                    .addComponent(LblSumPares, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblSumTotal, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(LblCifraMenor, javax.swing.GroupLayout.Alignment.LEADING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(FraSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(TxtSumlmpares, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                .addComponent(TxtSumPares)
                                .addComponent(TxtSumTotal)
                                .addComponent(TxtCifraMenor)
                                .addComponent(TxtCifraMayor, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGroup(FraSalidaLayout.createSequentialGroup()
                            .addComponent(LblCantCifras)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                            .addComponent(TxtCantCifras, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(LblCifraMayor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FraSalidaLayout.setVerticalGroup(
            FraSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FraSalidaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FraSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TxtCantCifras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblCantCifras))
                .addGap(9, 9, 9)
                .addGroup(FraSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TxtSumlmpares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblSumlmpares))
                .addGap(8, 8, 8)
                .addGroup(FraSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblSumPares)
                    .addComponent(TxtSumPares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FraSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtSumTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblSumTotal))
                .addGap(18, 18, 18)
                .addGroup(FraSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCifraMayor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblCifraMayor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FraSalidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCifraMenor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblCifraMenor))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FraDivisores.setBorder(javax.swing.BorderFactory.createTitledBorder("Divisores"));

        jScrollPane1.setWheelScrollingEnabled(false);

        TxtDivisores.setEditable(false);
        TxtDivisores.setColumns(20);
        TxtDivisores.setRows(5);
        jScrollPane1.setViewportView(TxtDivisores);

        javax.swing.GroupLayout FraDivisoresLayout = new javax.swing.GroupLayout(FraDivisores);
        FraDivisores.setLayout(FraDivisoresLayout);
        FraDivisoresLayout.setHorizontalGroup(
            FraDivisoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FraDivisoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        FraDivisoresLayout.setVerticalGroup(
            FraDivisoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FraDivisoresLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addContainerGap())
        );

        FraSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        CmdSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btns/salir.png"))); // NOI18N
        CmdSalir.setToolTipText("SALIR");
        CmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdSalirActionPerformed(evt);
            }
        });

        CmdAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btns/aceptar.png"))); // NOI18N
        CmdAceptar.setToolTipText("ACEPTAR");
        CmdAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdAceptarActionPerformed(evt);
            }
        });

        CmdNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btns/nuevo.png"))); // NOI18N
        CmdNuevo.setToolTipText("NUEVO");
        CmdNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FraSalirLayout = new javax.swing.GroupLayout(FraSalir);
        FraSalir.setLayout(FraSalirLayout);
        FraSalirLayout.setHorizontalGroup(
            FraSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FraSalirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CmdAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CmdNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CmdSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FraSalirLayout.setVerticalGroup(
            FraSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FraSalirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FraSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CmdNuevo)
                    .addGroup(FraSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(CmdSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CmdAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FraSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FraEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FraSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FraDivisores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(FraSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FraDivisores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(FraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(FraSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtSumParesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSumParesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSumParesActionPerformed

    private void CmdAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdAceptarActionPerformed
        if (TxtNumero.getText().trim().isEmpty()) {//si no ingresa numeros positivos
            JOptionPane.showMessageDialog(null, "Debe ingresar un número: ", "Error",
                    JOptionPane.WARNING_MESSAGE);//enviamos un mensaje
        } else {//caso contrario
            int SumaCifras, SumaPares = 0, SumaImpares, N, M, J = 1, CantidadCifras=0;
            String Divisores = ("");//Cadena para guardar todos los divisores del número
            M = N = Integer.parseInt(TxtNumero.getText());//Número a evaluar
            SumaCifras = SumaImpares = SumaImpares = 0;
/*un ciclo for es una estructura iterativa para ejecutar un mismo segmento de código una cantidad de veces deseada; 
            conociendo previamente un valor de inicio, 
                    un tamaño de paso y un valor final para el ciclo.*/
            for (J = 1; J <= N; J++) {//Cálculo de divisores
                if (N % J == 0) {
                    Divisores = (String.valueOf(Divisores + J + "\n"));
                }
            }//Fin del cálculo de divisores
            /*Un bucle while es una sentencia de control de flujo que permite que el código se ejecute 
            repetidamente en función de una condición booleana dada.*/
            while (N > 0) {//Cálculo de Suma de cifras, suma de cifras pares e impares y número de cifras
                if (((N % 10) % 2) == 0) {
                    SumaPares = SumaPares + (N % 10);//'Es cifra par
                } else {
                    SumaImpares = SumaImpares + (N % 10);//Es cifra impar
                }
                SumaCifras = (SumaCifras + (N % 10));//Suma cifras
                CantidadCifras = CantidadCifras + 1; //Cuenta cifras
                N = N / 10;//Quitamos última cifra al número
            }//'Fin cálculo de Suma de cifras, suma de cifras pares e impares y número de cifras
            int C_Mayor = M % 10;//Cálculo cifra mayor y menor
            int C_Menor = C_Mayor;//La cifra mayor y la menor es la ultima
            while (M > 0) {
                if (C_Mayor < M % 10) {
                    C_Mayor = M % 10;
                }
                if (C_Menor > M % 10) {
                    C_Menor = M % 10;
                }
                M = M / 10; //Quitamos última cifra al número
            }//Fin cálculo de cifra mayor y menor
            TxtCantCifras.setText(String.valueOf(CantidadCifras));
            TxtSumlmpares.setText(String.valueOf(SumaImpares));
            TxtSumPares.setText(String.valueOf(SumaPares));
            TxtSumTotal.setText(String.valueOf(SumaCifras));
            TxtCifraMayor.setText(String.valueOf(C_Mayor));
            TxtCifraMenor.setText(String.valueOf(C_Menor));
            TxtDivisores.setText(String.valueOf(Divisores));
        }
    }//GEN-LAST:event_CmdAceptarActionPerformed

    private void CmdNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdNuevoActionPerformed
  //   metodo clean de la funcion para limpiar los paneles con cajas de texto
        clean.Limpiar(FraEntrada);
        clean.Limpiar(FraSalida);
// Se limpian los cuadros de textos a través del método setText() 
        TxtDivisores.setText("");
//y con el método requestFocus() se pasa el cursor al objeto de control Txt.
        TxtNumero.requestFocus();
    }//GEN-LAST:event_CmdNuevoActionPerformed

    private void CmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdSalirActionPerformed
     /*  JOptionPane: Es una librería que nos permite mostrar mensajes de forma gráfica en una aplicación. 
showConfirmDialog, crea una ventana para que el usuario confirme una operación.*/       
        int op = JOptionPane.showConfirmDialog(null, "¿Desea terminar la aplicación?", "Salir",
                JOptionPane.YES_NO_OPTION);
        if (op == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
        }
    }//GEN-LAST:event_CmdSalirActionPerformed

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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CmdAceptar;
    private javax.swing.JButton CmdNuevo;
    private javax.swing.JButton CmdSalir;
    private javax.swing.JPanel FraDivisores;
    private javax.swing.JPanel FraEntrada;
    private javax.swing.JPanel FraSalida;
    private javax.swing.JPanel FraSalir;
    private javax.swing.JLabel LblCantCifras;
    private javax.swing.JLabel LblCifraMayor;
    private javax.swing.JLabel LblCifraMenor;
    private javax.swing.JLabel LblNumero;
    private javax.swing.JLabel LblSumPares;
    private javax.swing.JLabel LblSumTotal;
    private javax.swing.JLabel LblSumlmpares;
    private javax.swing.JTextField TxtCantCifras;
    private javax.swing.JTextField TxtCifraMayor;
    private javax.swing.JTextField TxtCifraMenor;
    private javax.swing.JTextArea TxtDivisores;
    private javax.swing.JTextField TxtNumero;
    private javax.swing.JTextField TxtSumPares;
    private javax.swing.JTextField TxtSumTotal;
    private javax.swing.JTextField TxtSumlmpares;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
