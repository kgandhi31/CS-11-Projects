package GUI_OOP_Project;

import java.util.ArrayList;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
    }

    public static ArrayList<StudentInfo> recordList = new ArrayList();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        AreyouTitleLabel1 = new javax.swing.JLabel();
        teacherButton = new javax.swing.JButton();
        studentButton = new javax.swing.JButton();
        borderPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Records");
        setBackground(new java.awt.Color(153, 153, 153));

        backgroundPanel.setBackground(new java.awt.Color(102, 0, 0));
        backgroundPanel.setMinimumSize(new java.awt.Dimension(700, 400));
        backgroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AreyouTitleLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        AreyouTitleLabel1.setForeground(new java.awt.Color(255, 255, 255));
        AreyouTitleLabel1.setText("Are you a...");
        backgroundPanel.add(AreyouTitleLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 85, -1, -1));

        teacherButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        teacherButton.setText("Teacher");
        teacherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherButtonActionPerformed(evt);
            }
        });
        backgroundPanel.add(teacherButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 186, -1, -1));

        studentButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        studentButton.setText("Student");
        studentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentButtonActionPerformed(evt);
            }
        });
        backgroundPanel.add(studentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 278, 137, -1));

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

    private void teacherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherButtonActionPerformed
        new TeacherLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_teacherButtonActionPerformed

    private void studentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentButtonActionPerformed
        new StudentsResult().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_studentButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AreyouTitleLabel1;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JPanel borderPanel;
    private javax.swing.JButton studentButton;
    private javax.swing.JButton teacherButton;
    // End of variables declaration//GEN-END:variables
}
