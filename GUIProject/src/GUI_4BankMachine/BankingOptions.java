package GUI_4BankMachine;

import GUI_OOP_Project.ExistingRecords;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class BankingOptions extends javax.swing.JFrame {

    public BankingOptions() throws IOException {
        initComponents();
        File loadFile = new File("balance.txt");
        try{
            FileReader fr = new FileReader(loadFile);
            BufferedReader br = new BufferedReader(fr);

            totalBalance = Double.parseDouble(br.readLine());
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExistingRecords.class.getName()).log(Level.SEVERE, null, ex);
        }
        showBalanceLabel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPannel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        questionLabel = new javax.swing.JLabel();
        TransitionScrollPane = new javax.swing.JScrollPane();
        successfulTransitionsTextArea = new javax.swing.JTextArea();
        successfulTransitionsLabel = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        optionsPanel = new javax.swing.JPanel();
        depositButton = new javax.swing.JButton();
        checkBalanceButton = new javax.swing.JButton();
        depositLabel = new javax.swing.JLabel();
        depositTextField = new javax.swing.JTextField();
        dollarsignLabel1 = new javax.swing.JLabel();
        withdrawLabel = new javax.swing.JLabel();
        withdrawButton = new javax.swing.JButton();
        withdrawTextField = new javax.swing.JTextField();
        dollarsignLabel2 = new javax.swing.JLabel();
        showBalanceLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundPannel.setBackground(new java.awt.Color(255, 204, 0));

        titleLabel.setFont(new java.awt.Font("Old English Text MT", 0, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 0, 0));
        titleLabel.setText("Scona Bank");

        questionLabel.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        questionLabel.setText("What would you like to do?");

        TransitionScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        TransitionScrollPane.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0), 2));

        successfulTransitionsTextArea.setEditable(false);
        successfulTransitionsTextArea.setColumns(20);
        successfulTransitionsTextArea.setFont(new java.awt.Font("MV Boli", 0, 13)); // NOI18N
        successfulTransitionsTextArea.setRows(5);
        successfulTransitionsTextArea.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TransitionScrollPane.setViewportView(successfulTransitionsTextArea);

        successfulTransitionsLabel.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        successfulTransitionsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        successfulTransitionsLabel.setText("Successful Transitions");

        logoutButton.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        depositButton.setBackground(new java.awt.Color(153, 204, 255));
        depositButton.setText("Deposit");
        depositButton.setBorder(null);
        depositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositButtonActionPerformed(evt);
            }
        });

        checkBalanceButton.setText("Check Balance");
        checkBalanceButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 255)));
        checkBalanceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBalanceButtonActionPerformed(evt);
            }
        });

        depositLabel.setText("Please enter the amount you want to deposit:");

        dollarsignLabel1.setText("$");

        withdrawLabel.setText("Please enter the amount you want to withdraw:");

        withdrawButton.setBackground(new java.awt.Color(153, 204, 255));
        withdrawButton.setText("Withdraw");
        withdrawButton.setBorder(null);
        withdrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawButtonActionPerformed(evt);
            }
        });

        dollarsignLabel2.setText("$");

        javax.swing.GroupLayout optionsPanelLayout = new javax.swing.GroupLayout(optionsPanel);
        optionsPanel.setLayout(optionsPanelLayout);
        optionsPanelLayout.setHorizontalGroup(
            optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(optionsPanelLayout.createSequentialGroup()
                        .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(depositLabel)
                            .addGroup(optionsPanelLayout.createSequentialGroup()
                                .addComponent(dollarsignLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(depositTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(depositButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(optionsPanelLayout.createSequentialGroup()
                        .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(checkBalanceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(withdrawLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(optionsPanelLayout.createSequentialGroup()
                        .addComponent(dollarsignLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(withdrawTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(withdrawButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        optionsPanelLayout.setVerticalGroup(
            optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(depositLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(depositTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dollarsignLabel1)
                    .addComponent(depositButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(withdrawLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(optionsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dollarsignLabel2)
                    .addComponent(withdrawTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(withdrawButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 18, Short.MAX_VALUE)
                .addComponent(checkBalanceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        showBalanceLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        showBalanceLabel.setText("Balance");

        javax.swing.GroupLayout backgroundPannelLayout = new javax.swing.GroupLayout(backgroundPannel);
        backgroundPannel.setLayout(backgroundPannelLayout);
        backgroundPannelLayout.setHorizontalGroup(
            backgroundPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPannelLayout.createSequentialGroup()
                .addGroup(backgroundPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPannelLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(backgroundPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(questionLabel)
                            .addGroup(backgroundPannelLayout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(titleLabel))
                            .addComponent(optionsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPannelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showBalanceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(backgroundPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPannelLayout.createSequentialGroup()
                        .addGroup(backgroundPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(successfulTransitionsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(TransitionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPannelLayout.createSequentialGroup()
                        .addComponent(logoutButton)
                        .addGap(76, 76, 76))))
        );
        backgroundPannelLayout.setVerticalGroup(
            backgroundPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPannelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(32, 32, 32)
                .addGroup(backgroundPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(successfulTransitionsLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(questionLabel))
                .addGap(18, 18, 18)
                .addGroup(backgroundPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPannelLayout.createSequentialGroup()
                        .addComponent(TransitionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(logoutButton))
                    .addGroup(backgroundPannelLayout.createSequentialGroup()
                        .addComponent(optionsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showBalanceLabel)))
                .addContainerGap(19, Short.MAX_VALUE))
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
                .addComponent(backgroundPannel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to logout?", "Logout", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            File saveFile = new File("balance.txt");
            try {
                FileWriter fw = new FileWriter(saveFile);
                BufferedWriter bw = new BufferedWriter(fw);

                bw.write("" + totalBalance);

                bw.close();
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(BankingOptions.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.dispose();
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void depositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositButtonActionPerformed
        withdrawTextField.setText("");
        String num1Temp = depositTextField.getText();
        if (!num1Temp.equals("")) {
            double num1 = Double.parseDouble(num1Temp);
            totalBalance += num1;
            showBalanceLabel.setVisible(true);
            showBalanceLabel.setText("Your total balance is $" + totalBalance + ".");
            successfulTransitionsTextArea.append("Deposit: $" + num1Temp + "\n");
        }
    }//GEN-LAST:event_depositButtonActionPerformed

    private void withdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawButtonActionPerformed
        depositTextField.setText("");
        String num1Temp = withdrawTextField.getText();
        if (!num1Temp.equals("")) {
            double num1 = Double.parseDouble(num1Temp);
            if ((num1 > totalBalance)) {
                showBalanceLabel.setVisible(true);
                showBalanceLabel.setText("Sorry, your balance is insufficient to withdraw the above amount.");
            } else {
                totalBalance -= num1;
                showBalanceLabel.setVisible(true);
                showBalanceLabel.setText("Your total balance is $" + totalBalance + ".");
                successfulTransitionsTextArea.append("Withdraw: $" + num1Temp + "\n");
            }
        }
    }//GEN-LAST:event_withdrawButtonActionPerformed

    private void checkBalanceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBalanceButtonActionPerformed
        depositTextField.setText("");
        withdrawTextField.setText("");
        showBalanceLabel.setVisible(true);
        showBalanceLabel.setText("Your total balance is $" + totalBalance + ".");
        successfulTransitionsTextArea.append("Balance: $" + totalBalance + "\n");
    }//GEN-LAST:event_checkBalanceButtonActionPerformed

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
//            java.util.logging.Logger.getLogger(BankingOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(BankingOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(BankingOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(BankingOptions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new BankingOptions().setVisible(true);
//            }
//        });
//    }
    
    double totalBalance;
    private JFrame frame;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane TransitionScrollPane;
    private javax.swing.JPanel backgroundPannel;
    private javax.swing.JButton checkBalanceButton;
    private javax.swing.JButton depositButton;
    private javax.swing.JLabel depositLabel;
    private javax.swing.JTextField depositTextField;
    private javax.swing.JLabel dollarsignLabel1;
    private javax.swing.JLabel dollarsignLabel2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel optionsPanel;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JLabel showBalanceLabel;
    private javax.swing.JLabel successfulTransitionsLabel;
    private javax.swing.JTextArea successfulTransitionsTextArea;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton withdrawButton;
    private javax.swing.JLabel withdrawLabel;
    private javax.swing.JTextField withdrawTextField;
    // End of variables declaration//GEN-END:variables
}
