package GUI_OOP_Project;

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
import javax.swing.table.DefaultTableModel;

public class ExistingRecords extends javax.swing.JFrame {

    public ExistingRecords() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundPanel = new javax.swing.JPanel();
        deleterowtButton = new javax.swing.JButton();
        loadButton = new javax.swing.JButton();
        existingrecordsPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        recordTable = new javax.swing.JTable();
        saveandexitButton = new javax.swing.JButton();
        forseparatorPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundPanel.setBackground(new java.awt.Color(102, 0, 0));
        backgroundPanel.setPreferredSize(new java.awt.Dimension(1380, 1172));

        deleterowtButton.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        deleterowtButton.setText("Delete Row");
        deleterowtButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleterowtButtonActionPerformed(evt);
            }
        });

        loadButton.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        loadButton.setText("Load All Records");
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        existingrecordsPanel.setBackground(new java.awt.Color(102, 0, 0));
        existingrecordsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 4), "Existing Records", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        recordTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        recordTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        recordTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student_ID", "Course_Code", "English", "Social", "Math", "Biology", "Chemistry", "Physics", "Computing", "Gym", "Total_Score", "Average", "Ranking"
            }
        ));
        jScrollPane2.setViewportView(recordTable);

        javax.swing.GroupLayout existingrecordsPanelLayout = new javax.swing.GroupLayout(existingrecordsPanel);
        existingrecordsPanel.setLayout(existingrecordsPanelLayout);
        existingrecordsPanelLayout.setHorizontalGroup(
            existingrecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(existingrecordsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        existingrecordsPanelLayout.setVerticalGroup(
            existingrecordsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(existingrecordsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        saveandexitButton.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        saveandexitButton.setText("Save & Exit");
        saveandexitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveandexitButtonActionPerformed(evt);
            }
        });

        forseparatorPanel.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout forseparatorPanelLayout = new javax.swing.GroupLayout(forseparatorPanel);
        forseparatorPanel.setLayout(forseparatorPanelLayout);
        forseparatorPanelLayout.setHorizontalGroup(
            forseparatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        forseparatorPanelLayout.setVerticalGroup(
            forseparatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loadButton)
                .addGap(130, 130, 130)
                .addComponent(deleterowtButton)
                .addGap(130, 130, 130)
                .addComponent(saveandexitButton)
                .addGap(153, 153, 153))
            .addComponent(forseparatorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(existingrecordsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(existingrecordsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loadButton)
                    .addComponent(deleterowtButton)
                    .addComponent(saveandexitButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(forseparatorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleterowtButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleterowtButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) recordTable.getModel();
        if (recordTable.getSelectedRow() == -1) {
            if (recordTable.getSelectedRow() == 0) {
                JOptionPane.showMessageDialog(null, "No data to delete", "Error", JOptionPane.OK_OPTION);
            } else {
                JOptionPane.showMessageDialog(null, "Select a row to delete", "Error", JOptionPane.OK_OPTION);
            }
        } else {
            model.removeRow(recordTable.getSelectedRow());
        }
    }//GEN-LAST:event_deleterowtButtonActionPerformed

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadButtonActionPerformed
        File loadFile = new File("allrecords.txt");
        try {
            FileReader fr = new FileReader(loadFile);
            BufferedReader br = new BufferedReader(fr);

            DefaultTableModel model = (DefaultTableModel) recordTable.getModel();
            Object[] lines = br.lines().toArray();

            for (int i = 0; i < lines.length; i++) {
                String[] row = lines[i].toString().split(",");
                model.addRow(row);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ExistingRecords.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loadButtonActionPerformed

    private void saveandexitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveandexitButtonActionPerformed
        frame = new JFrame("Save & Exit");
        if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to save all records and exit?", "Save and Exit Window", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            File saveFile = new File("allrecords.txt");
            try {
                FileWriter fw = new FileWriter(saveFile);
                BufferedWriter bw = new BufferedWriter(fw);

                for (int i = 0; i < recordTable.getRowCount(); i++) {
                    for (int j = 0; j < recordTable.getColumnCount(); j++) {
                        bw.write(recordTable.getModel().getValueAt(i, j).toString() + ",");

                    }
                    bw.newLine();
                }
                bw.close();
                fw.close();

            } catch (IOException ex) {
                Logger.getLogger(NewRecord.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
        }
    }//GEN-LAST:event_saveandexitButtonActionPerformed

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
//            java.util.logging.Logger.getLogger(ExistingRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ExistingRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ExistingRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ExistingRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ExistingRecords().setVisible(true);
//            }
//        });
//    }

    public JFrame frame;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JButton deleterowtButton;
    private javax.swing.JPanel existingrecordsPanel;
    private javax.swing.JPanel forseparatorPanel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton loadButton;
    private javax.swing.JTable recordTable;
    private javax.swing.JButton saveandexitButton;
    // End of variables declaration//GEN-END:variables
}
