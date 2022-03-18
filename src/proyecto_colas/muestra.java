package proyecto_colas;
public class muestra extends javax.swing.JFrame {
    fifo A=new fifo();
    fifo B=new fifo();
    fifo C=new fifo();
    fifo U=new fifo();
    fifo R=new fifo();
    String a;
    public muestra() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        AMB = new javax.swing.JButton();
        BMA = new javax.swing.JButton();
        AB = new javax.swing.JButton();
        AMC = new javax.swing.JButton();
        CMA = new javax.swing.JButton();
        BMC = new javax.swing.JButton();
        CMB = new javax.swing.JButton();
        TA = new javax.swing.JButton();
        TB = new javax.swing.JButton();
        TC = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        BA = new javax.swing.JButton();
        AC = new javax.swing.JButton();
        ET = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        txtA = new javax.swing.JTextField();
        btndatoA = new javax.swing.JButton();
        txtB = new javax.swing.JTextField();
        txtC = new javax.swing.JTextField();
        btndatoB = new javax.swing.JButton();
        btndatoC = new javax.swing.JButton();
        txtR = new javax.swing.JTextField();
        aub = new javax.swing.JButton();
        re = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtU = new javax.swing.JTextField();
        btndatoU = new javax.swing.JButton();
        TU = new javax.swing.JButton();
        error = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(255, 204, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("A");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("B");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("C");

        jLabel4.setFont(new java.awt.Font("Perpetua Titling MT", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 0));
        jLabel4.setText("OPERACIONES DE CONJUNTOS");

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setText("A U C");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setText("B U C");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 0));
        jButton3.setText("A ∩ B");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 0));
        jButton4.setText("A ∩ C");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 0));
        jButton5.setText("B ∩ C");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        AMB.setBackground(new java.awt.Color(255, 255, 0));
        AMB.setText("A − B");
        AMB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AMBActionPerformed(evt);
            }
        });

        BMA.setBackground(new java.awt.Color(255, 255, 0));
        BMA.setText("B − A");
        BMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMAActionPerformed(evt);
            }
        });

        AB.setBackground(new java.awt.Color(255, 255, 0));
        AB.setText("A ∆ B");
        AB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ABActionPerformed(evt);
            }
        });

        AMC.setBackground(new java.awt.Color(255, 255, 0));
        AMC.setText("A − C");
        AMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AMCActionPerformed(evt);
            }
        });

        CMA.setBackground(new java.awt.Color(255, 255, 0));
        CMA.setText("C − A");
        CMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMAActionPerformed(evt);
            }
        });

        BMC.setBackground(new java.awt.Color(255, 255, 0));
        BMC.setText("B − C");
        BMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMCActionPerformed(evt);
            }
        });

        CMB.setBackground(new java.awt.Color(255, 255, 0));
        CMB.setText("C − B");
        CMB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMBActionPerformed(evt);
            }
        });

        TA.setBackground(new java.awt.Color(255, 0, 0));
        TA.setForeground(new java.awt.Color(255, 255, 255));
        TA.setText("GUARDAR");
        TA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TAActionPerformed(evt);
            }
        });

        TB.setBackground(new java.awt.Color(255, 0, 0));
        TB.setForeground(new java.awt.Color(255, 255, 255));
        TB.setText("GUARDAR");
        TB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TBActionPerformed(evt);
            }
        });

        TC.setBackground(new java.awt.Color(255, 0, 0));
        TC.setForeground(new java.awt.Color(255, 255, 255));
        TC.setText("GUARDAR");
        TC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TCActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel5.setText("AGREGA LOS VALORES UNO A UNO PARA LOS CONJUNTOS A,B,C , PULSA GUARDAR PARA FINALIZAR Y MOSTRAR EL CONJUNTO");

        btnSalir.setBackground(new java.awt.Color(0, 0, 255));
        btnSalir.setFont(new java.awt.Font("Copperplate Gothic Light", 3, 11)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        BA.setBackground(new java.awt.Color(255, 255, 51));
        BA.setText("B ∆ C");
        BA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAActionPerformed(evt);
            }
        });

        AC.setBackground(new java.awt.Color(255, 255, 51));
        AC.setText("A ∆ C");
        AC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACActionPerformed(evt);
            }
        });

        ET.setBackground(new java.awt.Color(0, 153, 51));
        ET.setText("(A U B U C)  -  ((A ∩ B) U (B ∩ C) U (C ∩  A))");
        ET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ETActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 153, 51));
        jButton6.setText("(A - B - C) U ((B  ∩  C) - A)");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        btndatoA.setBackground(new java.awt.Color(51, 51, 255));
        btndatoA.setForeground(new java.awt.Color(255, 255, 255));
        btndatoA.setText("AGREGAR");
        btndatoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndatoAActionPerformed(evt);
            }
        });

        btndatoB.setBackground(new java.awt.Color(51, 51, 255));
        btndatoB.setForeground(new java.awt.Color(255, 255, 255));
        btndatoB.setText("AGREGAR");
        btndatoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndatoBActionPerformed(evt);
            }
        });

        btndatoC.setBackground(new java.awt.Color(51, 51, 255));
        btndatoC.setForeground(new java.awt.Color(255, 255, 255));
        btndatoC.setText("AGREGAR");
        btndatoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndatoCActionPerformed(evt);
            }
        });

        txtR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRActionPerformed(evt);
            }
        });

        aub.setBackground(new java.awt.Color(255, 255, 0));
        aub.setText("A U B");
        aub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aubActionPerformed(evt);
            }
        });

        re.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        re.setText("operacion");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("universo U");

        btndatoU.setBackground(new java.awt.Color(51, 51, 255));
        btndatoU.setForeground(new java.awt.Color(255, 255, 255));
        btndatoU.setLabel("AGREGAR");
        btndatoU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndatoUActionPerformed(evt);
            }
        });

        TU.setBackground(new java.awt.Color(255, 0, 0));
        TU.setForeground(new java.awt.Color(255, 255, 255));
        TU.setText("GUARDAR");
        TU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TUActionPerformed(evt);
            }
        });

        error.setText("...");

        jButton7.setBackground(new java.awt.Color(0, 153, 51));
        jButton7.setText("(A - B - C) U ((B  ∩  C) - A)´");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel7.setText("RECUERDA QUE SI NO ESTAN EN U NO PUEDEN ESTAR EN LOS DEMAS");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel9.setText("Andres Fernando Mogollon");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4)
                                    .addComponent(jButton5))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(aub)
                                    .addComponent(jButton1)
                                    .addComponent(jButton2)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtB, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtA, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtC)
                                            .addComponent(txtU, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
                                        .addGap(76, 76, 76)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btndatoA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btndatoB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btndatoC, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                                            .addComponent(btndatoU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(51, 51, 51)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(TA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(TC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(TU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(txtR, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSalir))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(AMB)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(100, 100, 100)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BMC)
                                            .addComponent(CMA)
                                            .addComponent(CMB)))
                                    .addComponent(AMC)
                                    .addComponent(BMA))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BA, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                    .addComponent(AB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ET, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(11, 11, 11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addComponent(re))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel5)))
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(10, 10, 10)
                .addComponent(jLabel5)
                .addGap(4, 4, 4)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndatoU)
                    .addComponent(TU)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndatoA)
                    .addComponent(TA)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndatoB)
                    .addComponent(TB)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndatoC)
                    .addComponent(TC)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(error)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aub)
                    .addComponent(AMB)
                    .addComponent(BMC)
                    .addComponent(AB)
                    .addComponent(ET))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton1)
                    .addComponent(AMC)
                    .addComponent(CMA)
                    .addComponent(BA)
                    .addComponent(jButton6))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BMA)
                    .addComponent(jButton2)
                    .addComponent(jButton5)
                    .addComponent(CMB)
                    .addComponent(AC)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(re)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnSalir))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtR, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel5.getAccessibleContext().setAccessibleName("AGREGA LOS VALORES UNO A UNO PARA LOS CONJUNTOS U,A,B,C , PULSA GUARDAR PARA FINALIZAR Y MOSTRAR EL CONJUNTO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void aubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aubActionPerformed
        R=A.union(B);
        txtR.setText("{" +R.imprimir()+"}");
        re.setText("R = A"+ " U " +"B");
    }//GEN-LAST:event_aubActionPerformed

    private void txtRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRActionPerformed

    private void btndatoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndatoCActionPerformed
       if(U.existe(txtC.getText()))
       {
            a=C.adicionar(txtC.getText());
            txtC.setText(null);
            txtC.requestFocus();
            error.setText(a);
       }
       else
       {
           error.setText("ERROR...NO EXISTE EN UNIVERSO");
       }
    }//GEN-LAST:event_btndatoCActionPerformed

    private void TCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TCActionPerformed
        txtC.setText(txtC.getText()+C.imprimir());
        txtC.setText("{"+txtC.getText()+"}");
        btndatoC.setEnabled(false);
        TC.setEnabled(false);
    }//GEN-LAST:event_TCActionPerformed

    private void TBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TBActionPerformed
        txtB.setText(txtB.getText()+B.imprimir());
        txtB.setText("{"+txtB.getText()+"}");
        btndatoB.setEnabled(false);
        TB.setEnabled(false);
    }//GEN-LAST:event_TBActionPerformed

    private void TAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TAActionPerformed
        txtA.setText(txtA.getText()+A.imprimir());
        txtA.setText("{"+txtA.getText()+"}");
        btndatoA.setEnabled(false);
        TA.setEnabled(false);
    }//GEN-LAST:event_TAActionPerformed

    private void CMBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMBActionPerformed
        R=C.diferen(B);
        txtR.setText("{" +R.imprimir()+"}");
        re.setText("R = C − B");
    }//GEN-LAST:event_CMBActionPerformed

    private void btndatoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndatoBActionPerformed
       if(U.existe(txtB.getText()))
       {
            a=B.adicionar(txtB.getText());
            txtB.setText(null);
            txtB.requestFocus();
            error.setText(a);
       }
       else
       {
           error.setText("ERROR...NO EXISTE EN UNIVERSO");
       }
    }//GEN-LAST:event_btndatoBActionPerformed

    private void btndatoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndatoAActionPerformed
       if(U.existe(txtA.getText()))
       {
            a=A.adicionar(txtA.getText());
            txtA.setText(null);
            txtA.requestFocus();
            error.setText(a);
       }
       else
       {
           error.setText("ERROR...NO EXISTE EN UNIVERSO");
       }
    }//GEN-LAST:event_btndatoAActionPerformed

    private void BMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMCActionPerformed
        R=B.diferen(C);
        txtR.setText("{" +R.imprimir()+"}");
        re.setText("R = B − C");
    }//GEN-LAST:event_BMCActionPerformed

    private void CMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMAActionPerformed
        R=C.diferen(A);
        txtR.setText("{" +R.imprimir()+"}");
        re.setText("R = C − A");
    }//GEN-LAST:event_CMAActionPerformed

    private void AMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AMCActionPerformed
        R=A.diferen(C);
        txtR.setText("{" +R.imprimir()+"}");
        re.setText("R = A − C");
    }//GEN-LAST:event_AMCActionPerformed

    private void ABActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ABActionPerformed
        R=A.difesime(B);
        txtR.setText("{" +R.imprimir()+"}");
        re.setText("R = A ∆ B");
    }//GEN-LAST:event_ABActionPerformed

    private void BMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMAActionPerformed
        R=B.diferen(A);
        txtR.setText("{" +R.imprimir()+"}");
        re.setText("R = B − A");
    }//GEN-LAST:event_BMAActionPerformed

    private void AMBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AMBActionPerformed
        R=A.diferen(B);
        txtR.setText("{" +R.imprimir()+"}");
        re.setText("R = A − B");
    }//GEN-LAST:event_AMBActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        R=B.inter(C);
        txtR.setText("{" +R.imprimir()+"}");
        re.setText("R = B"+ " ∩ " +"C");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        R=A.inter(C);
        txtR.setText("{" +R.imprimir()+"}");
        re.setText("R = A"+ " ∩ " +"C");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        R=A.inter(B);
        txtR.setText("{" +R.imprimir()+"}");
        re.setText("R = A"+ " ∩ " +"B");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        R=B.union(C);
        txtR.setText("{" +R.imprimir()+"}");
        re.setText("R = B"+ " U " +"C");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        R=A.union(C);
        txtR.setText("{" +R.imprimir()+"}");
        re.setText("R = A"+ " U " +"C");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void BAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAActionPerformed
        R=B.difesime(C);
        txtR.setText("{" +R.imprimir()+"}");
        re.setText("R = B ∆ C");
    }//GEN-LAST:event_BAActionPerformed

    private void ACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACActionPerformed
        R=A.difesime(C);
        txtR.setText("{" +R.imprimir()+"}");
        re.setText("R = A ∆ C");
    }//GEN-LAST:event_ACActionPerformed

    private void ETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ETActionPerformed
        R=(A.union(B.union(C)).diferen((A.inter(B)).union(B.inter(C)).union(C.inter(A))));
        txtR.setText("{" +R.imprimir()+"}");
    }//GEN-LAST:event_ETActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        R=((A.diferen(B)).diferen(C)).union((B.inter(C)).diferen(A));
        txtR.setText("{" +R.imprimir()+"}");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btndatoUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndatoUActionPerformed
        a=U.adicionar(txtU.getText());
        txtU.setText(null);
        txtU.requestFocus();
        error.setText(a);
    }//GEN-LAST:event_btndatoUActionPerformed

    private void TUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TUActionPerformed
        txtU.setText(txtU.getText()+U.imprimir());
        txtU.setText("{"+txtU.getText()+"}");
        btndatoU.setEnabled(false);
        TU.setEnabled(false);
    }//GEN-LAST:event_TUActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        R=U.diferen(((A.diferen(B)).diferen(C)).union((B.inter(C)).diferen(A)));
        txtR.setText("{" +R.imprimir()+"}");
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(muestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(muestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(muestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(muestra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new muestra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AB;
    private javax.swing.JButton AC;
    private javax.swing.JButton AMB;
    private javax.swing.JButton AMC;
    private javax.swing.JButton BA;
    private javax.swing.JButton BMA;
    private javax.swing.JButton BMC;
    private javax.swing.JButton CMA;
    private javax.swing.JButton CMB;
    private javax.swing.JButton ET;
    private javax.swing.JButton TA;
    private javax.swing.JButton TB;
    private javax.swing.JButton TC;
    private javax.swing.JButton TU;
    private javax.swing.JButton aub;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btndatoA;
    private javax.swing.JButton btndatoB;
    private javax.swing.JButton btndatoC;
    private javax.swing.JButton btndatoU;
    private javax.swing.JLabel error;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel re;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtR;
    private javax.swing.JTextField txtU;
    // End of variables declaration//GEN-END:variables
}
