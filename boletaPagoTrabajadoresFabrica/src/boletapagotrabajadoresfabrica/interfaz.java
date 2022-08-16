package boletapagotrabajadoresfabrica;

/*import permite agregar a nuestro proyecto una o varias clases (paquete) 
según lo necesitemos.*/
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * * @author Anijodz Academy
 */
public class interfaz extends javax.swing.JFrame {

    //llamamo al metodo de limpiar.
    Principal limpiar = new Principal();

    public interfaz() {
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);

        setTitle("Boleta de Pagos");

        setResizable(false);
        //ponemos un icono al formulario.        
        setIconImage(new ImageIcon(getClass().getResource("/btns/java.png")).getImage());

        // llamamos a la Funcion de Solo Letras.
        Principal.Letras(TxtTrabajador);

        // llamamos a la Funcion de Solo Numeros.
        Principal.Numeros(TxtHorasExtras);

        // llamamos a la Funcion de Solo Numeros con Punto.
        Principal.Decimales(TxtSueldoBasico);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        CmdAceptar = new javax.swing.JButton();
        CmdLimpiar = new javax.swing.JButton();
        CmdSalir = new javax.swing.JButton();
        panell = new javax.swing.JPanel();
        LblPagoHoraExtra = new javax.swing.JLabel();
        LblTrabajador = new javax.swing.JLabel();
        LblSueldoBasico = new javax.swing.JLabel();
        LblHorasExtras = new javax.swing.JLabel();
        TxtTrabajador = new javax.swing.JTextField();
        TxtSueldoBasico = new javax.swing.JTextField();
        TxtHorasExtras = new javax.swing.JTextField();
        TxtPagoHoraExtra = new javax.swing.JTextField();
        JPdescuento = new javax.swing.JPanel();
        ChkRenta = new javax.swing.JCheckBox();
        ChkFonavi = new javax.swing.JCheckBox();
        ChkAFP = new javax.swing.JCheckBox();
        TxtRenta = new javax.swing.JTextField();
        TxtFonavi = new javax.swing.JTextField();
        TxtAFP = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        OptDiurno = new javax.swing.JRadioButton();
        OptNocturno = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        LblSueldoNeto = new javax.swing.JLabel();
        TxtSueldoNetoS = new javax.swing.JTextField();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CmdAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btns/aceptar.png"))); // NOI18N
        CmdAceptar.setToolTipText("Aceptar");
        CmdAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdAceptarActionPerformed(evt);
            }
        });

        CmdLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btns/nuevo.png"))); // NOI18N
        CmdLimpiar.setToolTipText("Nuevo");
        CmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdLimpiarActionPerformed(evt);
            }
        });

        CmdSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/btns/salir.png"))); // NOI18N
        CmdSalir.setToolTipText("Salir");
        CmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmdSalirActionPerformed(evt);
            }
        });

        LblPagoHoraExtra.setText("Pago hora extra S/.");

        LblTrabajador.setText("Trabaj ador :");

        LblSueldoBasico.setText("Sueldo Bruto S/.");

        LblHorasExtras.setText("Horas extras :");

        TxtPagoHoraExtra.setEditable(false);

        javax.swing.GroupLayout panellLayout = new javax.swing.GroupLayout(panell);
        panell.setLayout(panellLayout);
        panellLayout.setHorizontalGroup(
            panellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panellLayout.createSequentialGroup()
                .addGroup(panellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panellLayout.createSequentialGroup()
                        .addComponent(LblHorasExtras)
                        .addGap(39, 39, 39)
                        .addComponent(TxtHorasExtras))
                    .addGroup(panellLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panellLayout.createSequentialGroup()
                                .addComponent(LblSueldoBasico)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panellLayout.createSequentialGroup()
                                .addComponent(LblTrabajador)
                                .addGap(37, 37, 37)))
                        .addGroup(panellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxtTrabajador)
                            .addComponent(TxtSueldoBasico, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panellLayout.createSequentialGroup()
                        .addComponent(LblPagoHoraExtra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtPagoHoraExtra)))
                .addContainerGap())
        );
        panellLayout.setVerticalGroup(
            panellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panellLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblTrabajador)
                    .addComponent(TxtTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblSueldoBasico)
                    .addComponent(TxtSueldoBasico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(panellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LblHorasExtras)
                    .addComponent(TxtHorasExtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(panellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblPagoHoraExtra)
                    .addComponent(TxtPagoHoraExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JPdescuento.setBorder(javax.swing.BorderFactory.createTitledBorder("Descuentos: "));

        ChkRenta.setText("Renta");

        ChkFonavi.setText("Fonavi");

        ChkAFP.setText("AFP");

        TxtRenta.setEditable(false);

        TxtFonavi.setEditable(false);

        TxtAFP.setEditable(false);

        javax.swing.GroupLayout JPdescuentoLayout = new javax.swing.GroupLayout(JPdescuento);
        JPdescuento.setLayout(JPdescuentoLayout);
        JPdescuentoLayout.setHorizontalGroup(
            JPdescuentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPdescuentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPdescuentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JPdescuentoLayout.createSequentialGroup()
                        .addComponent(ChkAFP)
                        .addGap(18, 18, 18)
                        .addComponent(TxtAFP))
                    .addGroup(JPdescuentoLayout.createSequentialGroup()
                        .addComponent(ChkRenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtRenta, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPdescuentoLayout.createSequentialGroup()
                        .addComponent(ChkFonavi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtFonavi, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        JPdescuentoLayout.setVerticalGroup(
            JPdescuentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPdescuentoLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(JPdescuentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkRenta)
                    .addComponent(TxtRenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(JPdescuentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkFonavi)
                    .addComponent(TxtFonavi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPdescuentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChkAFP)
                    .addComponent(TxtAFP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Turno"));

        OptDiurno.setText("Diurno");
        OptDiurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptDiurnoActionPerformed(evt);
            }
        });

        OptNocturno.setText("Nocturno");
        OptNocturno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptNocturnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(OptDiurno)
                    .addComponent(OptNocturno))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OptDiurno)
                .addGap(18, 18, 18)
                .addComponent(OptNocturno)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        LblSueldoNeto.setText("Sueldo neto S/.");

        TxtSueldoNetoS.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblSueldoNeto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtSueldoNetoS, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtSueldoNetoS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblSueldoNeto))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JPdescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CmdSalir)
                    .addComponent(CmdLimpiar)
                    .addComponent(CmdAceptar))
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(panell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(panell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPdescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CmdAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CmdLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CmdSalir)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void CmdAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdAceptarActionPerformed
// evitar que se ingrese campos vacios.
// si el texto esta vacio O el texto esta vacio.
//trim:sirve para quitar los espacios a la cadena.
        if (TxtTrabajador.getText().trim().isEmpty() || TxtSueldoBasico.getText().trim().isEmpty()
                || TxtHorasExtras.getText().trim().isEmpty()) {

// enviar un mensaje de error.
//JOptionPane: Es una librería que nos permite mostrar mensajes de forma gráfica en una aplicación. 
//showMessageDialog: Este tipo de mensajes son utilizados para informar al usuario algo.
            JOptionPane.showMessageDialog(null, "Rellene todos los campos de texto: ", "Error",
                    JOptionPane.WARNING_MESSAGE);

// caso contrario.
        } else {

            // declaracion de variables.
            //double: representa valores que contienen parte fraccionaria.
            double SueldoBasico, PagoHoraExtra = 0, Renta, Fonavi, AFP, Ingresos, Egresos, SueldoNeto;
            //int: representa valores que contienen parte entera.
            int HorasExtras;

            //Double.parseDouble: Convierte una cadena de texto en un número decimal. 
            //Integer.parseInt: Convierte una cadena de texto en un número entero.
            //getText: Permite obtener el texto introducido en el cuadro de texto. 
            SueldoBasico = Double.parseDouble(TxtSueldoBasico.getText());
            HorasExtras = Integer.parseInt(TxtHorasExtras.getText());

//Los descuentos a aplicar son sobre el sueldo básico y se obtienen de la siguiente manera: .
//La sentencia if es la declaración de toma de decisiones más simple. 
//Se usa para decidir si una determinada declaración o bloque de enunciados se ejecutará o no; 
//es decir, si una determinada condición es verdadera (true), 
//se ejecutará un bloque de enunciado y, de ser falsa (false), no.
            if (OptDiurno.isSelected() == true) {
                PagoHoraExtra = 10;
            }

            if (OptNocturno.isSelected() == true) {
                PagoHoraExtra = 15;
            }

//La declaración if solo nos dice que, si una condición es verdadera ejecutará un bloque 
//de instrucciones y si la condición es falsa, no lo hará. Pero, 
//¿y si queremos hacer otra cosa cuando la condición sea falsa? 
//Aquí viene la declaración else. Podemos usar la instrucción else con la instrucción if 
//para ejecutar un bloque de código cuando la condición es falsa.
            if (ChkRenta.isSelected()) {
                Renta = SueldoBasico * 0.1;
            } else {
                Renta = 0;
            }

            if (ChkFonavi.isSelected()) {
                Fonavi = SueldoBasico * 0.07;
            } else {
                Fonavi = 0;
            }

            if (ChkAFP.isSelected()) {
                AFP = SueldoBasico * 0.03;
            } else {
                AFP = 0;
            }

            //Finalmente el sueldo neto del trabajador se calcula
//mediante las siguientes expresiones: .
            Ingresos = SueldoBasico + HorasExtras * PagoHoraExtra;
            Egresos = Renta + Fonavi + AFP;
            SueldoNeto = Ingresos - Egresos;

            /*Paramostrar el cálculo se utiliza el método setText del cuadro de texto Txt,
que permite visualizar el contenido de la variable, a la variable se le aplica el
método valueOf de la clase String para convertir el dato, en cadena de caracteres.
El método devuelve una cadena formateada utilizando la configuración regional, 
la cadena de formato y los argumentos especificados con 2decimales.*/
            TxtPagoHoraExtra.setText(String.format(Locale.US, "%.2f", PagoHoraExtra));
            TxtRenta.setText(String.format(Locale.US, "%.2f", Renta));
            TxtFonavi.setText(String.format(Locale.US, "%.2f", Fonavi));
            TxtAFP.setText(String.format(Locale.US, "%.2f", AFP));
            TxtSueldoNetoS.setText(String.format(Locale.US, "%.2f", SueldoNeto));
        }
    }//GEN-LAST:event_CmdAceptarActionPerformed

    private void CmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdLimpiarActionPerformed
//se llama la funcion que se encarga de limpiar las cajas de texto 
//que se enccuentran en los distintos paneles.
        limpiar.Texto(panell);
        limpiar.Texto(JPdescuento);
        limpiar.Texto(jPanel2);
        limpiar.Texto(jPanel3);

//y con el método requestFocus() se pasa el cursor al objeto de control Txt.
        TxtTrabajador.requestFocus();
    }//GEN-LAST:event_CmdLimpiarActionPerformed

    private void CmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmdSalirActionPerformed
        int op = JOptionPane.showConfirmDialog(null, "¿Desea terminar la aplicación?", "Salir",
                JOptionPane.YES_NO_OPTION);
        if (op == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {
        }
    }//GEN-LAST:event_CmdSalirActionPerformed

    private void OptDiurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptDiurnoActionPerformed
        OptNocturno.setSelected(false);//desactivar la opcion        
    }//GEN-LAST:event_OptDiurnoActionPerformed

    private void OptNocturnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptNocturnoActionPerformed
        OptDiurno.setSelected(false);//desactivar la opcion            
    }//GEN-LAST:event_OptNocturnoActionPerformed

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
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ChkAFP;
    private javax.swing.JCheckBox ChkFonavi;
    private javax.swing.JCheckBox ChkRenta;
    private javax.swing.JButton CmdAceptar;
    private javax.swing.JButton CmdLimpiar;
    private javax.swing.JButton CmdSalir;
    private javax.swing.JPanel JPdescuento;
    private javax.swing.JLabel LblHorasExtras;
    private javax.swing.JLabel LblPagoHoraExtra;
    private javax.swing.JLabel LblSueldoBasico;
    private javax.swing.JLabel LblSueldoNeto;
    private javax.swing.JLabel LblTrabajador;
    private javax.swing.JRadioButton OptDiurno;
    private javax.swing.JRadioButton OptNocturno;
    private javax.swing.JTextField TxtAFP;
    private javax.swing.JTextField TxtFonavi;
    private javax.swing.JTextField TxtHorasExtras;
    private javax.swing.JTextField TxtPagoHoraExtra;
    private javax.swing.JTextField TxtRenta;
    private javax.swing.JTextField TxtSueldoBasico;
    private javax.swing.JTextField TxtSueldoNetoS;
    private javax.swing.JTextField TxtTrabajador;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panell;
    // End of variables declaration//GEN-END:variables
}
