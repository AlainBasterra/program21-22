/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;


public class View extends javax.swing.JFrame {
    
    public View() {
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

        Gehitu = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldHitzaEuskaraz = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldHitzaGazteleraz = new javax.swing.JTextField();
        jButtonHizkiaGehitu = new javax.swing.JButton();
        Ezabatu = new javax.swing.JDialog();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldHitzaEzabatuID = new javax.swing.JTextField();
        jButtonHitzaEzabatu = new javax.swing.JButton();
        Lista = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTerminoenTabla = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        Jokoa = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabelHitzaGazteleraz = new javax.swing.JLabel();
        jLabelHitzaEuskaraz1 = new javax.swing.JLabel();
        jLabelHitzaEuskaraz2 = new javax.swing.JLabel();
        jLabelHitzaEuskaraz3 = new javax.swing.JLabel();
        jTextFieldErantzuna = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jButtonBidali = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonGehitu = new javax.swing.JButton();
        jButtonJokoa = new javax.swing.JButton();
        jLabelMezua = new javax.swing.JLabel();
        jButtonEzabatu = new javax.swing.JButton();
        jButtonLista = new javax.swing.JButton();

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setText("HIZKIA GEHITU");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Euskaraz:");

        jTextFieldHitzaEuskaraz.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldHitzaEuskaraz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHitzaEuskarazActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Gazteleraz:");

        jTextFieldHitzaGazteleraz.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldHitzaGazteleraz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHitzaGaztelerazActionPerformed(evt);
            }
        });

        jButtonHizkiaGehitu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonHizkiaGehitu.setText("HITZA GEHITU");
        jButtonHizkiaGehitu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHizkiaGehituActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GehituLayout = new javax.swing.GroupLayout(Gehitu.getContentPane());
        Gehitu.getContentPane().setLayout(GehituLayout);
        GehituLayout.setHorizontalGroup(
            GehituLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GehituLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(GehituLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GehituLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(GehituLayout.createSequentialGroup()
                        .addGroup(GehituLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(GehituLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldHitzaGazteleraz, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(GehituLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldHitzaEuskaraz, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonHizkiaGehitu)
                        .addContainerGap())))
        );
        GehituLayout.setVerticalGroup(
            GehituLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GehituLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(GehituLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldHitzaEuskaraz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(GehituLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldHitzaGazteleraz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonHizkiaGehitu))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel7.setText("HIZKIA EZABATU");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Hitzaren ID zenbakia:");

        jTextFieldHitzaEzabatuID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldHitzaEzabatuID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHitzaEzabatuIDActionPerformed(evt);
            }
        });

        jButtonHitzaEzabatu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonHitzaEzabatu.setText("HITZA EZABATU");

        javax.swing.GroupLayout EzabatuLayout = new javax.swing.GroupLayout(Ezabatu.getContentPane());
        Ezabatu.getContentPane().setLayout(EzabatuLayout);
        EzabatuLayout.setHorizontalGroup(
            EzabatuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EzabatuLayout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(EzabatuLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldHitzaEzabatuID, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jButtonHitzaEzabatu)
                .addGap(34, 34, 34))
        );
        EzabatuLayout.setVerticalGroup(
            EzabatuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EzabatuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(EzabatuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldHitzaEzabatuID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonHitzaEzabatu))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jTableTerminoenTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Euskaraz", "Gazteleraz"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableTerminoenTabla);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel9.setText("TERMINOEN LISTA");

        javax.swing.GroupLayout ListaLayout = new javax.swing.GroupLayout(Lista.getContentPane());
        Lista.getContentPane().setLayout(ListaLayout);
        ListaLayout.setHorizontalGroup(
            ListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListaLayout.createSequentialGroup()
                .addGroup(ListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ListaLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ListaLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel9)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        ListaLayout.setVerticalGroup(
            ListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel10.setText("JOKOA");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("zein da hurrengoko itzaren itzulpen zuzena?");

        jLabelHitzaGazteleraz.setText("HITZA GAZTELERAZ");

        jLabelHitzaEuskaraz1.setText("HITZA EUSKARAZ 1");

        jLabelHitzaEuskaraz2.setText("HITZA EUSKARAZ 2");

        jLabelHitzaEuskaraz3.setText("HITZA EUSKARAZ 3");

        jTextFieldErantzuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldErantzunaActionPerformed(evt);
            }
        });

        jLabel14.setText("Erantzuna:");

        jButtonBidali.setText("BIDALI");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Behean agertzen diren hitzetatik,");

        javax.swing.GroupLayout JokoaLayout = new javax.swing.GroupLayout(Jokoa.getContentPane());
        Jokoa.getContentPane().setLayout(JokoaLayout);
        JokoaLayout.setHorizontalGroup(
            JokoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JokoaLayout.createSequentialGroup()
                .addGroup(JokoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(JokoaLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(JokoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JokoaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonBidali))
                            .addGroup(JokoaLayout.createSequentialGroup()
                                .addGroup(JokoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelHitzaEuskaraz2)
                                    .addComponent(jLabelHitzaEuskaraz1)
                                    .addComponent(jLabelHitzaEuskaraz3))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JokoaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(JokoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(JokoaLayout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addComponent(jLabel10))
                            .addGroup(JokoaLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addGroup(JokoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jTextFieldErantzuna, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelHitzaGazteleraz))))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        JokoaLayout.setVerticalGroup(
            JokoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JokoaLayout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JokoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabelHitzaGazteleraz))
                .addGap(18, 18, 18)
                .addComponent(jLabelHitzaEuskaraz1)
                .addGap(30, 30, 30)
                .addComponent(jLabelHitzaEuskaraz2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JokoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelHitzaEuskaraz3)
                    .addGroup(JokoaLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldErantzuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(jButtonBidali)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        setResizable(false);

        jPanel2.setPreferredSize(new java.awt.Dimension(587, 378));

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel1.setText("MENUA");

        jButtonGehitu.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButtonGehitu.setText("GEHITU");
        jButtonGehitu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGehituActionPerformed(evt);
            }
        });

        jButtonJokoa.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButtonJokoa.setText("JOKOA");
        jButtonJokoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJokoaActionPerformed(evt);
            }
        });

        jButtonEzabatu.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButtonEzabatu.setText("EZABATU");
        jButtonEzabatu.setToolTipText("");
        jButtonEzabatu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEzabatuActionPerformed(evt);
            }
        });

        jButtonLista.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jButtonLista.setText("LISTA");
        jButtonLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonGehitu, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEzabatu, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonJokoa, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonLista, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelMezua, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGehitu)
                    .addComponent(jButtonLista))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelMezua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(109, 109, 109))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonJokoa)
                            .addComponent(jButtonEzabatu))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonJokoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJokoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonJokoaActionPerformed

    private void jButtonGehituActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGehituActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGehituActionPerformed

    private void jTextFieldHitzaEuskarazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHitzaEuskarazActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHitzaEuskarazActionPerformed

    private void jTextFieldHitzaGaztelerazActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHitzaGaztelerazActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHitzaGaztelerazActionPerformed

    private void jButtonHizkiaGehituActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHizkiaGehituActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonHizkiaGehituActionPerformed

    private void jButtonEzabatuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEzabatuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEzabatuActionPerformed

    private void jButtonListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonListaActionPerformed

    private void jTextFieldHitzaEzabatuIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHitzaEzabatuIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHitzaEzabatuIDActionPerformed

    private void jTextFieldErantzunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldErantzunaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldErantzunaActionPerformed
    
    public static View viewaSortuBistaratu() {
        View v = new View();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                v.setVisible(true);
            }
        });
        return v;
    }
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(HitzBerriakSartu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(HitzBerriakSartu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(HitzBerriakSartu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(HitzBerriakSartu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new HitzBerriakSartu().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDialog Ezabatu;
    public javax.swing.JDialog Gehitu;
    public javax.swing.JDialog Jokoa;
    public javax.swing.JDialog Lista;
    public javax.swing.JButton jButtonBidali;
    javax.swing.JButton jButtonEzabatu;
    javax.swing.JButton jButtonGehitu;
    public javax.swing.JButton jButtonHitzaEzabatu;
    public javax.swing.JButton jButtonHizkiaGehitu;
    javax.swing.JButton jButtonJokoa;
    javax.swing.JButton jButtonLista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLabel jLabelHitzaEuskaraz1;
    public javax.swing.JLabel jLabelHitzaEuskaraz2;
    public javax.swing.JLabel jLabelHitzaEuskaraz3;
    public javax.swing.JLabel jLabelHitzaGazteleraz;
    private javax.swing.JLabel jLabelMezua;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTableTerminoenTabla;
    public javax.swing.JTextField jTextFieldErantzuna;
    public javax.swing.JTextField jTextFieldHitzaEuskaraz;
    public javax.swing.JTextField jTextFieldHitzaEzabatuID;
    public javax.swing.JTextField jTextFieldHitzaGazteleraz;
    // End of variables declaration//GEN-END:variables
}
