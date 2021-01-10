/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_3QuizProgram;

/**
 *
 * @author Krish
 */
public class GetStartedMain extends javax.swing.JFrame {

    /**
     * Creates new form GetStarted
     */
    public GetStartedMain() {
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

        backgroundPannel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        GetStartedButton = new javax.swing.JButton();
        Pic1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundPannel.setBackground(new java.awt.Color(51, 153, 255));

        titleLabel.setFont(new java.awt.Font("Elephant", 1, 26)); // NOI18N
        titleLabel.setText("Chemistry Quiz");

        GetStartedButton.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 18)); // NOI18N
        GetStartedButton.setText("Start The Quiz");
        GetStartedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GetStartedButtonActionPerformed(evt);
            }
        });

        Pic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI_3QuizProgram/chemPic1.jpg"))); // NOI18N

        javax.swing.GroupLayout backgroundPannelLayout = new javax.swing.GroupLayout(backgroundPannel);
        backgroundPannel.setLayout(backgroundPannelLayout);
        backgroundPannelLayout.setHorizontalGroup(
            backgroundPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPannelLayout.createSequentialGroup()
                .addGap(333, 333, 333)
                .addComponent(GetStartedButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPannelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Pic1)
                .addGap(232, 232, 232))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPannelLayout.createSequentialGroup()
                .addContainerGap(319, Short.MAX_VALUE)
                .addComponent(titleLabel)
                .addGap(318, 318, 318))
        );
        backgroundPannelLayout.setVerticalGroup(
            backgroundPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addComponent(Pic1)
                .addGap(28, 28, 28)
                .addComponent(GetStartedButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backgroundPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backgroundPannel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GetStartedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GetStartedButtonActionPerformed
        new Quiz().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GetStartedButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GetStartedMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GetStartedMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GetStartedMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GetStartedMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GetStartedMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GetStartedButton;
    private javax.swing.JLabel Pic1;
    private javax.swing.JPanel backgroundPannel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
