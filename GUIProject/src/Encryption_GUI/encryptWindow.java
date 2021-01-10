/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encryption_GUI;

/**
 *
 * @author k.gandhi
 */
public class encryptWindow extends javax.swing.JFrame {

    /**
     * Creates new form encryptWindow
     */
    public encryptWindow() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        englishField = new javax.swing.JTextField();
        shiftSlider = new javax.swing.JSlider();
        encryptButton = new javax.swing.JButton();
        cipherField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        shiftLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("English");

        englishField.setText("Enter English Here");
        englishField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                englishFieldMouseClicked(evt);
            }
        });

        shiftSlider.setMaximum(25);
        shiftSlider.setPaintLabels(true);
        shiftSlider.setToolTipText("");
        shiftSlider.setValue(3);
        shiftSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                shiftSliderStateChanged(evt);
            }
        });

        encryptButton.setText("Encrypt");
        encryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptButtonActionPerformed(evt);
            }
        });

        cipherField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cipherFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cipher Text");

        shiftLabel.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        shiftLabel.setForeground(new java.awt.Color(255, 255, 255));
        shiftLabel.setText("3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(shiftSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(shiftLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(encryptButton)
                                    .addComponent(jLabel2))
                                .addGap(51, 51, 51)
                                .addComponent(cipherField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(81, 81, 81)
                                .addComponent(englishField, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(341, 341, 341))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(englishField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addComponent(shiftSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(shiftLabel)
                        .addGap(79, 79, 79)))
                .addComponent(encryptButton)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cipherField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cipherFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cipherFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cipherFieldActionPerformed

    private void encryptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encryptButtonActionPerformed

        int shift = shiftSlider.getValue();
        String full = "abcdefghijklmnopqurstuvwxyz";
        String shifted = full.substring(shift) + full.substring(0, shift);
        System.out.println("Shifted: " + shifted);
        cipherAlphabet = shifted.split("");

        String englishTemp = englishField.getText();
        String cipherText = encrypt(englishTemp);
        cipherField.setText(cipherText);
    }//GEN-LAST:event_encryptButtonActionPerformed

    private void englishFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_englishFieldMouseClicked
        englishField.setText("");
    }//GEN-LAST:event_englishFieldMouseClicked

    private void shiftSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_shiftSliderStateChanged
        shiftLabel.setText("" + shiftSlider.getValue());
    }//GEN-LAST:event_shiftSliderStateChanged

    String[] alphabet = "abcdefghijklmnopqurstuvwxyz".split("");
    String[] cipherAlphabet = "defghijklmnopqurstuvwxyzabc".split("");

    public String encrypt(String english) {
        String code = "";
        for (int i = 0; i < english.length(); i++) {
            String letter = english.substring(i, i + 1);
            for (int j = 0; j < alphabet.length; j++) {
                // System.out.println("Debug:  the letter is: " + letter);
                if (letter.equalsIgnoreCase(alphabet[j])) {
                    code = code + cipherAlphabet[j];

                }

            }

        }
        return code;
    }//end encrypt


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cipherField;
    private javax.swing.JButton encryptButton;
    private javax.swing.JTextField englishField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel shiftLabel;
    private javax.swing.JSlider shiftSlider;
    // End of variables declaration//GEN-END:variables
}