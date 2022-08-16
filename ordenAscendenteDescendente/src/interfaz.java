/*Elabore una aplicación que permita leer N números de tipo entero, y a 
continuación los visualice ordenados en forma ascendente o descendente.*/
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * * @author Anijodz Academy
 */
public class interfaz extends javax.swing.JFrame {


    public void Cerrar() {//crear un metodo para cerrar.
        String botones[] = {"SI", "NO"};//botones de opcion.
        int eleccion = JOptionPane.showOptionDialog(this, "¿Desea cerrar la aplicacion?",
                "Cerrar", 0, 0, null, botones, this);
        if (eleccion == JOptionPane.YES_OPTION) {
            this.dispose();
        } else if (eleccion == JOptionPane.NO_OPTION) {
        }
    }

    public int contador() {//metodo para limitar el ingreso de numeros.
        String caracteres = TxtNumero.getText().replaceAll("[' '\n]", "");
        int num = 5 - caracteres.length();//solo se podra ingresar 5 caracteres
        return num;
    }


    DefaultListModel lista = new DefaultListModel();
    DefaultListModel lista2 = new DefaultListModel();
    
    
    public interfaz() {
        initComponents();
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);//no haga nada el boton de cerrar.
        this.addWindowListener(new WindowAdapter() {//utilizar el evento creado
            @Override
            public void windowClosing(WindowEvent e) {//evento para cerrar.
                Cerrar();//llamar a la funcion de Cerrar.
            }
        });

        CmdOrdenar.setEnabled(false);

        setTitle("Anijodz Academy Suscribete y Like");

        setResizable(false);

        setLocationRelativeTo(null);

        Toolkit t = Toolkit.getDefaultToolkit();
        setIconImage(t.getImage(getClass().getResource("/btns/java.png")));

        Principal.soloNumeros(TxtNumero);
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TxtNumero = new javax.swing.JTextField();
        CmdAnnadir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        OptAscendente = new javax.swing.JRadioButton();
        OptDescendente = new javax.swing.JRadioButton();
        CmdOrdenar = new javax.swing.JButton();
        cmdNuevo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LstNumero = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        LstNumeroOrden = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingrese un nuevo número:"));

        TxtNumero.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TxtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNumeroActionPerformed(evt);
            }
        });
        TxtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtNumeroKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNumeroKeyTyped(evt);
            }
        });

        CmdAnnadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btns/suma.png"))); // NOI18N
        CmdAnnadir.setToolTipText("Agregar");
        CmdAnnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdAnnadirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TxtNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CmdAnnadir)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CmdAnnadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TxtNumero))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ordenar:"));

        OptAscendente.setText("Ascendente");
        OptAscendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptAscendenteActionPerformed(evt);
            }
        });

        OptDescendente.setText("Descendente");
        OptDescendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptDescendenteActionPerformed(evt);
            }
        });

        CmdOrdenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btns/aceptar.png"))); // NOI18N
        CmdOrdenar.setToolTipText("Ordenar");
        CmdOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdOrdenarActionPerformed(evt);
            }
        });

        cmdNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btns/nuevo.png"))); // NOI18N
        cmdNuevo.setToolTipText("NUEVO");
        cmdNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OptAscendente)
                    .addComponent(OptDescendente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CmdOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(OptAscendente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OptDescendente)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(CmdOrdenar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de números:"));

        LstNumero.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(LstNumero);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Orden:"));

        LstNumeroOrden.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {  };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(LstNumeroOrden);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CmdAnnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdAnnadirActionPerformed

        if (TxtNumero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese un numero: ", "Error",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            CmdOrdenar.setEnabled(true);//activar el boton
            LstNumero.setModel(lista);
            lista.addElement(TxtNumero.getText().trim());
            TxtNumero.setText("");
            TxtNumero.requestFocus();
        }
    }//GEN-LAST:event_CmdAnnadirActionPerformed
    private void CmdOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdOrdenarActionPerformed
        int[] N = new int[10];//Devuelve numero de elementos en el listbox
        for (int i = 0; i < LstNumero.getModel().getSize(); i++) {
            String S = LstNumero.getModel().getElementAt(i);
            N[i] = Integer.parseInt(S);
        }//fin for i 
//Ordenar los numeros
        for (int i = 0; i < N.length - 1; i++) {
            for (int j = 0; j < N.length - 1; j++) {
                if (N[j] < N[j + 1]) {
                    int tpm = N[j + 1];
                    N[j + 1] = N[j];
                    N[j] = tpm;
                }//fin if
            }//fin for j
        }//fin for i 
        if (OptAscendente.isSelected()) {//Ordenar de menor a mayor 
            lista2.removeAllElements(); //limpiar lista
            //  lista2.addElement("Ascendente"+"\n");
            for (int i = LstNumero.getModel().getSize() - 1; i >= 0; i--) {
                LstNumeroOrden.setModel(lista2);//Escribir los numeros ordenados
                lista2.addElement(N[i]);
            }//fin for i
        }//fin if
        if (OptDescendente.isSelected()) {//Ordenar de mayor a menor 
            lista2.removeAllElements();   //limpiar lista
            //  lista2.addElement("Descendente"+"\n");
            for (int i = 0; i < LstNumero.getModel().getSize(); i++) {
                LstNumeroOrden.setModel(lista2);//Escribir los numeros ordenados
                lista2.addElement(N[i]);
            }//fin for i
        }//fin if
    }//GEN-LAST:event_CmdOrdenarActionPerformed

    
    
    private void TxtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumeroKeyTyped
        if (contador() == 0) {//cuando el contador llege a 0
            evt.consume();// no permita el ingreso de mas caracteres
        }
    }//GEN-LAST:event_TxtNumeroKeyTyped

    private void TxtNumeroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumeroKeyPressed
    }//GEN-LAST:event_TxtNumeroKeyPressed

    private void OptAscendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptAscendenteActionPerformed
        OptDescendente.setSelected(false);//desactivar la opcion              
    }//GEN-LAST:event_OptAscendenteActionPerformed

    private void cmdNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoActionPerformed
        lista.removeAllElements();//limpiar las lista
        lista2.removeAllElements();//limpiar las lista2
        TxtNumero.setText("");//limpiar el texto
        TxtNumero.requestFocus();//poner el cursor
        OptAscendente.setSelected(false);//desactivar la opcion
        OptDescendente.setSelected(false);//desactivar la opcion
        CmdOrdenar.setEnabled(false);//desactivar el boton
    }//GEN-LAST:event_cmdNuevoActionPerformed

    private void TxtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNumeroActionPerformed

    }//GEN-LAST:event_TxtNumeroActionPerformed

    private void OptDescendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptDescendenteActionPerformed
        OptAscendente.setSelected(false);//desactivar la opcion 
    }//GEN-LAST:event_OptDescendenteActionPerformed

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
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CmdAnnadir;
    private javax.swing.JButton CmdOrdenar;
    private javax.swing.JList<String> LstNumero;
    private javax.swing.JList<String> LstNumeroOrden;
    private javax.swing.JRadioButton OptAscendente;
    private javax.swing.JRadioButton OptDescendente;
    private javax.swing.JTextField TxtNumero;
    private javax.swing.JButton cmdNuevo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
