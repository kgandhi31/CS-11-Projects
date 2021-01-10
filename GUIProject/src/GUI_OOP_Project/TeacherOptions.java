package GUI_OOP_Project;

public class TeacherOptions extends javax.swing.JFrame {

    public TeacherOptions() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        newRecordButton = new javax.swing.JButton();
        existingRecordsButton = new javax.swing.JButton();
        borderPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundPanel.setBackground(new java.awt.Color(102, 0, 0));
        backgroundPanel.setMinimumSize(new java.awt.Dimension(700, 400));
        backgroundPanel.setPreferredSize(new java.awt.Dimension(700, 400));
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        newRecordButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        newRecordButton.setText("Add New Record");
        newRecordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newRecordButtonActionPerformed(evt);
            }
        });
        backgroundPanel.add(newRecordButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 126, 383, -1));

        existingRecordsButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        existingRecordsButton.setText("View/ Edit Existing Records");
        existingRecordsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                existingRecordsButtonActionPerformed(evt);
            }
        });
        backgroundPanel.add(existingRecordsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 237, -1, -1));

        borderPanel.setBackground(new java.awt.Color(102, 0, 0));
        borderPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 204, 204)));

        javax.swing.GroupLayout borderPanelLayout = new javax.swing.GroupLayout(borderPanel);
        borderPanel.setLayout(borderPanelLayout);
        borderPanelLayout.setHorizontalGroup(
            borderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 676, Short.MAX_VALUE)
        );
        borderPanelLayout.setVerticalGroup(
            borderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );

        backgroundPanel.add(borderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 680, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newRecordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newRecordButtonActionPerformed
        new NewRecord().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_newRecordButtonActionPerformed

    private void existingRecordsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_existingRecordsButtonActionPerformed
        new ExistingRecords().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_existingRecordsButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
//            java.util.logging.Logger.getLogger(TeacherOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TeacherOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TeacherOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TeacherOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new TeacherOptions().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JPanel borderPanel;
    private javax.swing.JButton existingRecordsButton;
    private javax.swing.JButton newRecordButton;
    // End of variables declaration//GEN-END:variables
}
