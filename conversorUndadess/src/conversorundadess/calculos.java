
package conversorundadess;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextPane;

public class calculos extends javax.swing.JFrame {

    public calculos() {
        initComponents();

        TxtNumero.requestFocus();
        dMillas.setSelected(true);
        aMillas.setSelected(true);

        //establecemos un nombre al formulario.
        this.setTitle("Conversor de Unidades");

        //deshabilitar el botón maximizar.
        this.setResizable(false);

        //centrar el formulario.
        setLocationRelativeTo(null);

        //llamar a la funcion.
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        unidad = new javax.swing.JTextPane();
        cmdAceptar = new javax.swing.JButton();
        cmdNuevo = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        unidadTransformada = new javax.swing.JTextPane();
        cmdSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtNumero = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        dMillas = new javax.swing.JRadioButton();
        dKM = new javax.swing.JRadioButton();
        dMetros = new javax.swing.JRadioButton();
        dPies = new javax.swing.JRadioButton();
        dPulgadas = new javax.swing.JRadioButton();
        dCentimetros = new javax.swing.JRadioButton();
        dMilimetros = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        aMillas = new javax.swing.JRadioButton();
        aKM = new javax.swing.JRadioButton();
        aMetros = new javax.swing.JRadioButton();
        aPies = new javax.swing.JRadioButton();
        aPulgadas = new javax.swing.JRadioButton();
        aCentimetros = new javax.swing.JRadioButton();
        aMilimetros = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtResultado.setEditable(false);
        jScrollPane2.setViewportView(txtResultado);

        unidad.setEditable(false);
        jScrollPane3.setViewportView(unidad);

        cmdAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conversorunidades/btns/aceptar.png"))); // NOI18N
        cmdAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAceptarActionPerformed(evt);
            }
        });

        cmdNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conversorunidades/btns/nuevo.png"))); // NOI18N
        cmdNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdNuevoActionPerformed(evt);
            }
        });

        unidadTransformada.setEditable(false);
        jScrollPane4.setViewportView(unidadTransformada);

        cmdSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conversorunidades/btns/salir.png"))); // NOI18N
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });

        TxtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNumeroKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(TxtNumero);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Convertir de:"));

        dMillas.setText("Millas");
        dMillas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                dMillasStateChanged(evt);
            }
        });

        dKM.setText("KM");
        dKM.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                dKMStateChanged(evt);
            }
        });

        dMetros.setText("Metros");
        dMetros.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                dMetrosStateChanged(evt);
            }
        });

        dPies.setText("Pies");
        dPies.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                dPiesStateChanged(evt);
            }
        });

        dPulgadas.setText("Pulgadas");
        dPulgadas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                dPulgadasStateChanged(evt);
            }
        });

        dCentimetros.setText("Centimetros");
        dCentimetros.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                dCentimetrosStateChanged(evt);
            }
        });

        dMilimetros.setText("Milimetros");
        dMilimetros.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                dMilimetrosStateChanged(evt);
            }
        });
        dMilimetros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dMilimetrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dCentimetros)
                    .addComponent(dMilimetros)
                    .addComponent(dMillas)
                    .addComponent(dKM)
                    .addComponent(dMetros)
                    .addComponent(dPies)
                    .addComponent(dPulgadas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dMillas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dKM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dMetros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dPies)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dPulgadas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dCentimetros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dMilimetros)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("A:"));

        aMillas.setText("Millas");
        aMillas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                aMillasStateChanged(evt);
            }
        });

        aKM.setText("KM");
        aKM.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                aKMStateChanged(evt);
            }
        });
        aKM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aKMActionPerformed(evt);
            }
        });

        aMetros.setText("Metros");
        aMetros.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                aMetrosStateChanged(evt);
            }
        });

        aPies.setText("Pies");
        aPies.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                aPiesStateChanged(evt);
            }
        });

        aPulgadas.setText("Pulgadas");
        aPulgadas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                aPulgadasStateChanged(evt);
            }
        });

        aCentimetros.setText("Centimetros");
        aCentimetros.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                aCentimetrosStateChanged(evt);
            }
        });

        aMilimetros.setText("Milimetros");
        aMilimetros.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                aMilimetrosStateChanged(evt);
            }
        });
        aMilimetros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aMilimetrosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aMillas)
                    .addComponent(aKM)
                    .addComponent(aMetros)
                    .addComponent(aPies)
                    .addComponent(aPulgadas)
                    .addComponent(aCentimetros)
                    .addComponent(aMilimetros))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aMillas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aKM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aMetros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aPies)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aPulgadas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aCentimetros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(aMilimetros)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmdAceptar)
                                .addGap(18, 18, 18)
                                .addComponent(cmdNuevo)
                                .addGap(18, 18, 18)
                                .addComponent(cmdSalir))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdNuevo)
                    .addComponent(cmdAceptar)
                    .addComponent(cmdSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAceptarActionPerformed

        //segun la seleccion del usuario.
        // transformamos de Millas a: millas.
        if (dMillas.isSelected() == true && aMillas.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Mi");

            // transformamos de Millas a: kilometros.
        } else if (dMillas.isSelected() == true && aKM.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a * 1.6);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Km");

            // transformamos de Millas a: metros.
        } else if (dMillas.isSelected() == true && aMetros.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a * 1600);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Mt");

            // transformamos de Millas a: pies.
        } else if (dMillas.isSelected() == true && aPies.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a * 5280);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Ft");

            // transformamos de Millas a: pulgadas.
        } else if (dMillas.isSelected() == true && aPulgadas.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a * 63260);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("In");

            // transformamos de Millas a: centimetros.
        } else if (dMillas.isSelected() == true && aCentimetros.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a * 160934.4);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Cm");

            // transformamos de Millas a: milimetros.
        } else if (dMillas.isSelected() == true && aMilimetros.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a * 1600000);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Mil");

            // transformamos de Kilometros a: millas.
        } else if (dKM.isSelected() == true && aMillas.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a / 1.6);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Km");

            // transformamos de Kilometros a: kilometros.
        } else if (dKM.isSelected() == true && aKM.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Km");

            // transformamos de Kilometros a: metros.
        } else if (dKM.isSelected() == true && aMetros.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = a * 1000;
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Mt");

            // transformamos de Kilometros a: pies.
        } else if (dKM.isSelected() == true && aPies.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a * 3280.83);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Ft");

            // transformamos de Kilometros a: pulgadas.
        } else if (dKM.isSelected() == true && aPulgadas.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a * 39370.07);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("In");

            // transformamos de Kilometros a: centimetros.
        } else if (dKM.isSelected() == true && aCentimetros.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a * 100000);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Cm");

            // transformamos de Kilometros a: milimetros.
        } else if (dKM.isSelected() == true && aMilimetros.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a * 1000000);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Mil");

            // transformamos de Metros a: millas.
        } else if (dMetros.isSelected() == true && aMillas.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a / 1600);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Mi");

            // transformamos de Metros a: kilometros.
        } else if (dMetros.isSelected() == true && aKM.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a / 1000);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Km");

            // transformamos de Metros a: metros.
        } else if (dMetros.isSelected() == true && aMetros.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Mt");

            // transformamos de Metros a: pies.
        } else if (dMetros.isSelected() == true && aPies.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a * 3.281);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Ft");

            // transformamos de Metros a: pulgadas.
        } else if (dMetros.isSelected() == true && aPulgadas.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a * 39.37);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("In");

            // transformamos de Metros a: centimetros.
        } else if (dMetros.isSelected() == true && aCentimetros.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a * 100);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Cm");

            // transformamos de Metros a: milimetros.
        } else if (dMetros.isSelected() == true && aMilimetros.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a / 1000);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Mil");

            // transformamos de Pies a: millas.
        } else if (dPies.isSelected() == true && aMillas.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a / 5280);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Mil");

            // transformamos de Pies a: kilometros.
        } else if (dPies.isSelected() == true && aKM.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a / 3280.83);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Km");

            // transformamos de Pies a: metros.
        } else if (dPies.isSelected() == true && aMetros.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a / 3.281);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Mt");

            // transformamos de Pies a: pies.
        } else if (dPies.isSelected() == true && aPies.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Ft");

            // transformamos de Pies a: pulgadas.
        } else if (dPies.isSelected() == true && aPulgadas.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a * 12);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("In");

            // transformamos de Pies a: centimetros.
        } else if (dPies.isSelected() == true && aCentimetros.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a * 30.48);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Cm");

            // transformamos de Pies a: milimetros.
        } else if (dPies.isSelected() == true && aMilimetros.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a * 304.8);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Mil");

            // transformamos de Pulgadas a: millas.
        } else if (dPulgadas.isSelected() == true && aMillas.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a * 0.00001);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Mi");

// transformamos de Pulgadas a: kilometros.
        } else if (dPulgadas.isSelected() == true && aKM.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a * 0.00002);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Km");

            // transformamos de Pulgadas a: metros.
        } else if (dPulgadas.isSelected() == true && aMetros.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a * 0.0254);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Mt");

// transformamos de Pulgadas a: pies.
        } else if (dPulgadas.isSelected() == true && aPies.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a * 0.0833);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Ft");

// transformamos de Pulgadas a: pulgadas.
        } else if (dPulgadas.isSelected() == true && aPulgadas.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("In");

// transformamos de Pulgadas a: centimetros.
        } else if (dPulgadas.isSelected() == true && aCentimetros.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a * 2.54);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Cm");

// transformamos de Pulgadas a: milimetros.
        } else if (dPulgadas.isSelected() == true && aMilimetros.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a * 25.4);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Mil");

            // transformamos de Centimetros a: millas.
        } else if (dCentimetros.isSelected() == true && aMillas.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a * 0.000006);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Mi");

            // transformamos de Centimetros a: kilometros.
        } else if (dCentimetros.isSelected() == true && aKM.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a * 0.00001);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Km");

            // transformamos de Centimetros a: metros.
        } else if (dCentimetros.isSelected() == true && aMetros.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a * 0.01);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Mt");

            // transformamos de Centimetros a:pies
        } else if (dCentimetros.isSelected() == true && aPies.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a * 0.0328);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Ft");

            // transformamos de Centimetros a: pulgadas.
        } else if (dCentimetros.isSelected() == true && aPulgadas.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a * 0.3937);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("In");

            // transformamos de Centimetros a: centimetros.
        } else if (dCentimetros.isSelected() == true && aCentimetros.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Cm");

            // transformamos de Centimetros a: milimetros.
        } else if (dCentimetros.isSelected() == true && aMilimetros.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a * 10);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Mil");

            // transformamos de Milimetros a: millas.   
        } else if (dMilimetros.isSelected() == true && aMillas.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a * 0.0000001);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Mi");

            // transformamos de Milimetros a: kilometros. 
        } else if (dMilimetros.isSelected() == true && aKM.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a * 0.000001);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Km");

            // transformamos de Milimetros a: metros. 
        } else if (dMilimetros.isSelected() == true && aMetros.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a * 0.001);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Mt");

            // transformamos de Milimetros a: pies. 
        } else if (dMilimetros.isSelected() == true && aPies.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a * 0.0032);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Ft");

            // transformamos de Milimetros a: pulgadas. 
        } else if (dMilimetros.isSelected() == true && aPulgadas.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a * 0.0393);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("In");

            // transformamos de Milimetros a: centimetros. 
        } else if (dMilimetros.isSelected() == true && aCentimetros.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a * 0.1);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Cm");

            // transformamos de Milimetros a: milimetros. 
        } else if (dMilimetros.isSelected() == true && aMilimetros.isSelected() == true) {
            float a, b;
            a = Integer.parseInt(TxtNumero.getText());
            b = (float) (a);
            txtResultado.setText(String.valueOf(b));
            unidadTransformada.setText("Mil");

//caso contrario.
        } else if (dMillas.isSelected() == true && aMillas.isSelected() == false) {
            unidadTransformada.setText("Elija la unidad a convertir");
    }//GEN-LAST:event_cmdAceptarActionPerformed
    }
    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        // El método dispose(); permite descargar el formulario y terminar la ejecución de laaplicación.
        dispose();
    }//GEN-LAST:event_cmdSalirActionPerformed

    private void cmdNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdNuevoActionPerformed

        //con el método requestFocus() se pasa el cursor al objeto de control Txt.
        TxtNumero.requestFocus();

        //con setSelected(false) desactivamos las opciones.
        dKM.setSelected(false);
        dMetros.setSelected(false);
        dPies.setSelected(false);
        dPulgadas.setSelected(false);
        dCentimetros.setSelected(false);
        dMilimetros.setSelected(false);
        aKM.setSelected(false);
        aMetros.setSelected(false);
        aPies.setSelected(false);
        aPulgadas.setSelected(false);
        aCentimetros.setSelected(false);
        aMilimetros.setSelected(false);
        dMillas.setSelected(true);
        aMillas.setSelected(true);


    }//GEN-LAST:event_cmdNuevoActionPerformed

    private void dMilimetrosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_dMilimetrosStateChanged
        if (dMilimetros.isSelected()) {

            dKM.setSelected(false);
            dMetros.setSelected(false);
            dPies.setSelected(false);
            dPulgadas.setSelected(false);
            dCentimetros.setSelected(false);
            dMillas.setSelected(false);

            unidad.setText("Mil");
        }
    }//GEN-LAST:event_dMilimetrosStateChanged

    private void dCentimetrosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_dCentimetrosStateChanged
        if (dCentimetros.isSelected()) {

            dKM.setSelected(false);
            dMetros.setSelected(false);
            dPies.setSelected(false);
            dPulgadas.setSelected(false);
            dMilimetros.setSelected(false);
            dMillas.setSelected(false);

            unidad.setText("Cm");

        }
    }//GEN-LAST:event_dCentimetrosStateChanged

    private void dPulgadasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_dPulgadasStateChanged
        if (dPulgadas.isSelected()) {
            dKM.setSelected(false);
            dMetros.setSelected(false);
            dPies.setSelected(false);
            dCentimetros.setSelected(false);
            dMilimetros.setSelected(false);
            dMillas.setSelected(false);
            unidad.setText("In");

        }
    }//GEN-LAST:event_dPulgadasStateChanged

    private void dPiesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_dPiesStateChanged
        if (dPies.isSelected()) {
            dKM.setSelected(false);
            dMetros.setSelected(false);
            dPulgadas.setSelected(false);
            dCentimetros.setSelected(false);
            dMilimetros.setSelected(false);
            dMillas.setSelected(false);
            unidad.setText("Ft");
        }
    }//GEN-LAST:event_dPiesStateChanged

    private void dMetrosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_dMetrosStateChanged
        if (dMetros.isSelected()) {
            dKM.setSelected(false);
            dPies.setSelected(false);
            dPulgadas.setSelected(false);
            dCentimetros.setSelected(false);
            dMilimetros.setSelected(false);
            dMillas.setSelected(false);
            unidad.setText("Mt");
        }
    }//GEN-LAST:event_dMetrosStateChanged

    private void dMillasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_dMillasStateChanged
        if (dMillas.isSelected()) {
            dKM.setSelected(false);
            dMetros.setSelected(false);
            dPies.setSelected(false);
            dPulgadas.setSelected(false);
            dCentimetros.setSelected(false);
            dMilimetros.setSelected(false);

            unidad.setText("Mi");
        }
    }//GEN-LAST:event_dMillasStateChanged

    private void dMilimetrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dMilimetrosActionPerformed
        if (dMilimetros.isSelected()) {
            dKM.setSelected(false);
            dMetros.setSelected(false);
            dPies.setSelected(false);
            dPulgadas.setSelected(false);
            dCentimetros.setSelected(false);
            dMillas.setSelected(false);
            unidad.setText("");
        }
    }//GEN-LAST:event_dMilimetrosActionPerformed

    private void dKMStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_dKMStateChanged
        if (dKM.isSelected()) {
            dMetros.setSelected(false);
            dPies.setSelected(false);
            dPulgadas.setSelected(false);
            dCentimetros.setSelected(false);
            dMilimetros.setSelected(false);
            dMillas.setSelected(false);

            unidad.setText("Km");
        }
    }//GEN-LAST:event_dKMStateChanged

    private void aMillasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_aMillasStateChanged
        if (aMillas.isSelected()) {
            aKM.setSelected(false);
            aMetros.setSelected(false);
            aPies.setSelected(false);
            aPulgadas.setSelected(false);
            aCentimetros.setSelected(false);
            aMilimetros.setSelected(false);

            unidadTransformada.setText("Mi");
        }
    }//GEN-LAST:event_aMillasStateChanged

    private void aKMStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_aKMStateChanged
        if (aKM.isSelected()) {

            aMetros.setSelected(false);
            aPies.setSelected(false);
            aPulgadas.setSelected(false);
            aCentimetros.setSelected(false);
            aMilimetros.setSelected(false);
            aMillas.setSelected(false);

            unidadTransformada.setText("Km");
        }
    }//GEN-LAST:event_aKMStateChanged

    private void aKMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aKMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aKMActionPerformed

    private void aMetrosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_aMetrosStateChanged
        if (aMetros.isSelected()) {

            aKM.setSelected(false);
            aPies.setSelected(false);
            aPulgadas.setSelected(false);
            aCentimetros.setSelected(false);
            aMilimetros.setSelected(false);
            aMillas.setSelected(false);

            unidadTransformada.setText("Mt");
        }
    }//GEN-LAST:event_aMetrosStateChanged

    private void aPiesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_aPiesStateChanged
        if (aPies.isSelected()) {

            aMetros.setSelected(false);
            aKM.setSelected(false);
            aPulgadas.setSelected(false);
            aCentimetros.setSelected(false);
            aMilimetros.setSelected(false);
            aMillas.setSelected(false);

            unidadTransformada.setText("Ft");
        }
    }//GEN-LAST:event_aPiesStateChanged

    private void aPulgadasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_aPulgadasStateChanged
        if (aPulgadas.isSelected()) {

            aMetros.setSelected(false);
            aPies.setSelected(false);
            aKM.setSelected(false);
            aCentimetros.setSelected(false);
            aMilimetros.setSelected(false);
            aMillas.setSelected(false);

            unidadTransformada.setText("In");
        }
    }//GEN-LAST:event_aPulgadasStateChanged

    private void aCentimetrosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_aCentimetrosStateChanged
        if (aCentimetros.isSelected()) {
            aKM.setSelected(false);
            aMetros.setSelected(false);
            aPies.setSelected(false);
            aPulgadas.setSelected(false);
            aMilimetros.setSelected(false);
            aMillas.setSelected(false);

            unidadTransformada.setText("Cm");
        }
    }//GEN-LAST:event_aCentimetrosStateChanged

    private void aMilimetrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aMilimetrosActionPerformed
        if (aMilimetros.isSelected()) {
            aKM.setSelected(false);
            aMetros.setSelected(false);
            aPies.setSelected(false);
            aPulgadas.setSelected(false);
            aCentimetros.setSelected(false);
            aMillas.setSelected(false);

            unidadTransformada.setText("Mil");
        }
    }//GEN-LAST:event_aMilimetrosActionPerformed

    private void aMilimetrosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_aMilimetrosStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_aMilimetrosStateChanged

    private void TxtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNumeroKeyTyped
   //validar solo numeros.
        //El tipo de datos CHAR almacena datos de carácter en un campo de longitud fija.
        //El método getKeyChar siempre devuelve un carácter Unicode válido o CHAR_UNDEFINED.
        char c = evt.getKeyChar();

        //El operador ||  se obtiene en la mayoría de los teclados pulsando ALT GR + 1, es decir.
//si  c < 0 verdadero si c es menor que 0  o c > 9 verdadero si c es mayor que 9.
//Cada vez que el usuario presione una tecla, se generará este evento y lo que hacemos es sacar 
//el carácter que presiono el usuario que se almacena en la variable evt. 
//Luego, en un simple if decimos: si el carácter no esta entre 0 y 9 lo desechamos . 
//Y de esta manera logramos que el txt acepte sólo números.
        if (c < '0' || c > '9')
            evt.consume();     
    }//GEN-LAST:event_TxtNumeroKeyTyped

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
            java.util.logging.Logger.getLogger(calculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane TxtNumero;
    private javax.swing.JRadioButton aCentimetros;
    private javax.swing.JRadioButton aKM;
    private javax.swing.JRadioButton aMetros;
    private javax.swing.JRadioButton aMilimetros;
    private javax.swing.JRadioButton aMillas;
    private javax.swing.JRadioButton aPies;
    private javax.swing.JRadioButton aPulgadas;
    private javax.swing.JButton cmdAceptar;
    private javax.swing.JButton cmdNuevo;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JRadioButton dCentimetros;
    private javax.swing.JRadioButton dKM;
    private javax.swing.JRadioButton dMetros;
    private javax.swing.JRadioButton dMilimetros;
    private javax.swing.JRadioButton dMillas;
    private javax.swing.JRadioButton dPies;
    private javax.swing.JRadioButton dPulgadas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextPane txtResultado;
    private javax.swing.JTextPane unidad;
    private javax.swing.JTextPane unidadTransformada;
    // End of variables declaration//GEN-END:variables
}
