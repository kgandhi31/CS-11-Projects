package GUI_OOP_Project;

import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NewRecord extends javax.swing.JFrame {

    public NewRecord() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        studentrecordsPanel = new javax.swing.JPanel();
        studentIDLabel = new javax.swing.JLabel();
        studentIDTextField = new javax.swing.JTextField();
        firstnameTextField = new javax.swing.JTextField();
        firstnameLabel = new javax.swing.JLabel();
        surnameLabel = new javax.swing.JLabel();
        surnameTextField = new javax.swing.JTextField();
        totalscoreTextField = new javax.swing.JTextField();
        totalscoreLabel = new javax.swing.JLabel();
        averageTextField = new javax.swing.JTextField();
        averageLabel = new javax.swing.JLabel();
        rankingTextField = new javax.swing.JTextField();
        rankingLabel = new javax.swing.JLabel();
        englishTextField = new javax.swing.JTextField();
        socialTextField = new javax.swing.JTextField();
        mathTextField = new javax.swing.JTextField();
        englishLabel = new javax.swing.JLabel();
        socialLabel = new javax.swing.JLabel();
        mathLabel = new javax.swing.JLabel();
        biologyTextField = new javax.swing.JTextField();
        biologyLabel = new javax.swing.JLabel();
        chemistryLabel = new javax.swing.JLabel();
        chemistryTextField = new javax.swing.JTextField();
        computingLabel = new javax.swing.JLabel();
        physicsTextField = new javax.swing.JTextField();
        physicsLabel = new javax.swing.JLabel();
        computingTextField = new javax.swing.JTextField();
        gymTextField = new javax.swing.JTextField();
        gymLabel = new javax.swing.JLabel();
        coursecodeLabel = new javax.swing.JLabel();
        coursecodeComboBox = new javax.swing.JComboBox<>();
        toplineSeparator = new javax.swing.JSeparator();
        gradesPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        transcriptTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        recordTable = new javax.swing.JTable();
        bottomlineSeparator = new javax.swing.JSeparator();
        forseparatorPanel = new javax.swing.JPanel();
        backgroundPanel = new javax.swing.JPanel();
        saveandexitButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        transcriptButton = new javax.swing.JButton();
        recordButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Record");
        setBackground(new java.awt.Color(102, 0, 0));
        setMinimumSize(new java.awt.Dimension(1385, 750));
        setPreferredSize(new java.awt.Dimension(1385, 750));
        setResizable(false);
        setSize(new java.awt.Dimension(1385, 750));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentrecordsPanel.setBackground(new java.awt.Color(102, 0, 0));
        studentrecordsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 4), "New Record", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 36), new java.awt.Color(255, 255, 255))); // NOI18N
        studentrecordsPanel.setForeground(new java.awt.Color(153, 153, 153));
        studentrecordsPanel.setPreferredSize(new java.awt.Dimension(1380, 800));
        studentrecordsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        studentIDLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        studentIDLabel.setForeground(new java.awt.Color(204, 255, 255));
        studentIDLabel.setText("Student_ID:");
        studentrecordsPanel.add(studentIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 60, -1, -1));

        studentIDTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        studentrecordsPanel.add(studentIDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 57, 250, -1));

        firstnameTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        studentrecordsPanel.add(firstnameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 110, 250, -1));

        firstnameLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        firstnameLabel.setForeground(new java.awt.Color(153, 255, 255));
        firstnameLabel.setText("First Name:");
        studentrecordsPanel.add(firstnameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 113, -1, -1));

        surnameLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        surnameLabel.setForeground(new java.awt.Color(153, 255, 255));
        surnameLabel.setText("Surname:");
        studentrecordsPanel.add(surnameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 166, -1, -1));

        surnameTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        studentrecordsPanel.add(surnameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 163, 250, -1));

        totalscoreTextField.setEditable(false);
        totalscoreTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        studentrecordsPanel.add(totalscoreTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 322, 250, -1));

        totalscoreLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        totalscoreLabel.setForeground(new java.awt.Color(102, 255, 204));
        totalscoreLabel.setText("Total Score:");
        studentrecordsPanel.add(totalscoreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 325, -1, -1));

        averageTextField.setEditable(false);
        averageTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        studentrecordsPanel.add(averageTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 375, 250, -1));

        averageLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        averageLabel.setForeground(new java.awt.Color(102, 255, 204));
        averageLabel.setText("Average:");
        studentrecordsPanel.add(averageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 378, -1, -1));

        rankingTextField.setEditable(false);
        rankingTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        studentrecordsPanel.add(rankingTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 428, 250, -1));

        rankingLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        rankingLabel.setForeground(new java.awt.Color(102, 255, 204));
        rankingLabel.setText("Ranking:");
        studentrecordsPanel.add(rankingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 431, -1, -1));

        englishTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        englishTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                englishTextFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                englishTextFieldKeyTyped(evt);
            }
        });
        studentrecordsPanel.add(englishTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 57, 200, -1));

        socialTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        socialTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                socialTextFieldKeyTyped(evt);
            }
        });
        studentrecordsPanel.add(socialTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 110, 200, -1));

        mathTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        mathTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mathTextFieldKeyTyped(evt);
            }
        });
        studentrecordsPanel.add(mathTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 163, 200, -1));

        englishLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        englishLabel.setForeground(new java.awt.Color(153, 255, 255));
        englishLabel.setText("English:");
        studentrecordsPanel.add(englishLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 60, -1, -1));

        socialLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        socialLabel.setForeground(new java.awt.Color(153, 255, 255));
        socialLabel.setText("Social:");
        studentrecordsPanel.add(socialLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 113, -1, -1));

        mathLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        mathLabel.setForeground(new java.awt.Color(153, 255, 255));
        mathLabel.setText("Math:");
        studentrecordsPanel.add(mathLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 166, -1, -1));

        biologyTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        biologyTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                biologyTextFieldKeyTyped(evt);
            }
        });
        studentrecordsPanel.add(biologyTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 216, 200, -1));

        biologyLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        biologyLabel.setForeground(new java.awt.Color(153, 255, 255));
        biologyLabel.setText("Biology:");
        studentrecordsPanel.add(biologyLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 219, -1, -1));

        chemistryLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        chemistryLabel.setForeground(new java.awt.Color(153, 255, 255));
        chemistryLabel.setText("Chemistry:");
        studentrecordsPanel.add(chemistryLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 272, -1, -1));

        chemistryTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        chemistryTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                chemistryTextFieldKeyTyped(evt);
            }
        });
        studentrecordsPanel.add(chemistryTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 269, 200, -1));

        computingLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        computingLabel.setForeground(new java.awt.Color(153, 255, 255));
        computingLabel.setText("Computing:");
        studentrecordsPanel.add(computingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 378, -1, -1));

        physicsTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        physicsTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                physicsTextFieldKeyTyped(evt);
            }
        });
        studentrecordsPanel.add(physicsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 322, 200, -1));

        physicsLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        physicsLabel.setForeground(new java.awt.Color(153, 255, 255));
        physicsLabel.setText("Physics:");
        studentrecordsPanel.add(physicsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 325, -1, -1));

        computingTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        computingTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                computingTextFieldKeyTyped(evt);
            }
        });
        studentrecordsPanel.add(computingTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 375, 200, -1));

        gymTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        gymTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                gymTextFieldKeyTyped(evt);
            }
        });
        studentrecordsPanel.add(gymTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(664, 428, 200, -1));

        gymLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        gymLabel.setForeground(new java.awt.Color(153, 255, 255));
        gymLabel.setText("Gym:");
        studentrecordsPanel.add(gymLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(506, 431, -1, -1));

        coursecodeLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        coursecodeLabel.setForeground(new java.awt.Color(153, 255, 255));
        coursecodeLabel.setText("Course Code:");
        studentrecordsPanel.add(coursecodeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 219, -1, -1));

        coursecodeComboBox.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        coursecodeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C98123", "C98234", "C98345", "C98456" }));
        studentrecordsPanel.add(coursecodeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 216, 250, -1));

        toplineSeparator.setBackground(new java.awt.Color(204, 204, 204));
        toplineSeparator.setForeground(new java.awt.Color(204, 204, 204));
        toplineSeparator.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        studentrecordsPanel.add(toplineSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 440, 10));

        getContentPane().add(studentrecordsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 880, 480));

        gradesPanel.setBackground(new java.awt.Color(102, 0, 0));
        gradesPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 4), "Grades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        transcriptTextArea.setEditable(false);
        transcriptTextArea.setColumns(20);
        transcriptTextArea.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        transcriptTextArea.setRows(5);
        jScrollPane1.setViewportView(transcriptTextArea);

        javax.swing.GroupLayout gradesPanelLayout = new javax.swing.GroupLayout(gradesPanel);
        gradesPanel.setLayout(gradesPanelLayout);
        gradesPanelLayout.setHorizontalGroup(
            gradesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                .addContainerGap())
        );
        gradesPanelLayout.setVerticalGroup(
            gradesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gradesPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(gradesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, 470, 470));

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

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 1360, 130));

        bottomlineSeparator.setBackground(new java.awt.Color(204, 204, 204));
        bottomlineSeparator.setForeground(new java.awt.Color(204, 204, 204));
        bottomlineSeparator.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(bottomlineSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 710, 1340, 10));

        forseparatorPanel.setBackground(new java.awt.Color(102, 0, 0));

        javax.swing.GroupLayout forseparatorPanelLayout = new javax.swing.GroupLayout(forseparatorPanel);
        forseparatorPanel.setLayout(forseparatorPanelLayout);
        forseparatorPanelLayout.setHorizontalGroup(
            forseparatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1380, Short.MAX_VALUE)
        );
        forseparatorPanelLayout.setVerticalGroup(
            forseparatorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(forseparatorPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 720, 1380, 20));

        backgroundPanel.setBackground(new java.awt.Color(102, 0, 0));

        saveandexitButton.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        saveandexitButton.setText("Save &Exit");
        saveandexitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveandexitButtonActionPerformed(evt);
            }
        });

        resetButton.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        deleteButton.setText("Delete Row");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        transcriptButton.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        transcriptButton.setText("Transcript");
        transcriptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transcriptButtonActionPerformed(evt);
            }
        });

        recordButton.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        recordButton.setText("Record");
        recordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundPanelLayout = new javax.swing.GroupLayout(backgroundPanel);
        backgroundPanel.setLayout(backgroundPanelLayout);
        backgroundPanelLayout.setHorizontalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(recordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(transcriptButton)
                .addGap(35, 35, 35)
                .addComponent(deleteButton)
                .addGap(35, 35, 35)
                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(saveandexitButton)
                .addGap(56, 56, 56))
        );
        backgroundPanelLayout.setVerticalGroup(
            backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundPanelLayout.createSequentialGroup()
                .addContainerGap(643, Short.MAX_VALUE)
                .addGroup(backgroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveandexitButton)
                    .addComponent(resetButton)
                    .addComponent(deleteButton)
                    .addComponent(transcriptButton)
                    .addComponent(recordButton))
                .addGap(54, 54, 54))
        );

        getContentPane().add(backgroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        studentIDTextField.setText("");
        firstnameTextField.setText("");
        surnameTextField.setText("");
        englishTextField.setText("");
        socialTextField.setText("");
        mathTextField.setText("");
        biologyTextField.setText("");
        chemistryTextField.setText("");
        physicsTextField.setText("");
        computingTextField.setText("");
        gymTextField.setText("");
        totalscoreTextField.setText("");
        averageTextField.setText("");
        rankingTextField.setText("");
        transcriptTextArea.setText("");
    }//GEN-LAST:event_resetButtonActionPerformed

    private void saveandexitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveandexitButtonActionPerformed
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Are you sure you want to save all records and exit?", "Students Record", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            File saveFile = new File("allrecords.txt");
            try {
                FileWriter fw = new FileWriter(saveFile.getAbsoluteFile(), true);
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

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) recordTable.getModel();
        if (recordTable.getSelectedRow() == -1) {
            if (recordTable.getSelectedRow() == 0) {
                JOptionPane.showMessageDialog(null, "No data to delete", "Students Record", JOptionPane.OK_OPTION);
            } else {
                JOptionPane.showMessageDialog(null, "Select a row to delete", "Students Record", JOptionPane.OK_OPTION);
            }
        } else {
            model.removeRow(recordTable.getSelectedRow());
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void recordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordButtonActionPerformed
        Main.recordList.add(new StudentInfo(studentIDTextField.getText(), coursecodeComboBox.getSelectedItem().toString(), Integer.parseInt(englishTextField.getText()), Integer.parseInt(socialTextField.getText()), Integer.parseInt(mathTextField.getText()),
                Integer.parseInt(biologyTextField.getText()), Integer.parseInt(chemistryTextField.getText()), Integer.parseInt(physicsTextField.getText()), Integer.parseInt(computingTextField.getText()), Integer.parseInt(gymTextField.getText())));

        //get totalscore
        for (int i = 0; i < Main.recordList.size(); i++) {
            if (studentIDTextField.getText().equals(Main.recordList.get(i).studentID)) {
                totalscoreTextField.setText(Main.recordList.get(i).getTotalScore());
                break;
            }
        }

        //get average
        for (int i = 0; i < Main.recordList.size(); i++) {
            if (studentIDTextField.getText().equals(Main.recordList.get(i).studentID)) {
                averageTextField.setText(Main.recordList.get(i).getAverage());
                break;
            }
        }

        //get ranking
        for (int i = 0; i < Main.recordList.size(); i++) {
            if (studentIDTextField.getText().equals(Main.recordList.get(i).studentID)) {
                rankingTextField.setText(Main.recordList.get(i).getRanking());
                break;
            }
        }

        //get transcript
        DefaultTableModel model = (DefaultTableModel) recordTable.getModel();
        model.addRow(new Object[]{
            studentIDTextField.getText(),
            coursecodeComboBox.getSelectedItem(),
            englishTextField.getText(),
            socialTextField.getText(),
            mathTextField.getText(),
            biologyTextField.getText(),
            chemistryTextField.getText(),
            physicsTextField.getText(),
            computingTextField.getText(),
            gymTextField.getText(),
            totalscoreTextField.getText(),
            averageTextField.getText(),
            rankingTextField.getText(),});
    }//GEN-LAST:event_recordButtonActionPerformed

    private void englishTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_englishTextFieldKeyPressed

    }//GEN-LAST:event_englishTextFieldKeyPressed

    private void englishTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_englishTextFieldKeyTyped
        char iNumber = evt.getKeyChar();
        if (!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) || (iNumber == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_englishTextFieldKeyTyped

    private void socialTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_socialTextFieldKeyTyped
        char iNumber = evt.getKeyChar();
        if (!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) || (iNumber == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_socialTextFieldKeyTyped

    private void mathTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mathTextFieldKeyTyped
        char iNumber = evt.getKeyChar();
        if (!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) || (iNumber == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_mathTextFieldKeyTyped

    private void biologyTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_biologyTextFieldKeyTyped
        char iNumber = evt.getKeyChar();
        if (!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) || (iNumber == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_biologyTextFieldKeyTyped

    private void chemistryTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_chemistryTextFieldKeyTyped
        char iNumber = evt.getKeyChar();
        if (!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) || (iNumber == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_chemistryTextFieldKeyTyped

    private void physicsTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_physicsTextFieldKeyTyped
        char iNumber = evt.getKeyChar();
        if (!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) || (iNumber == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_physicsTextFieldKeyTyped

    private void computingTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_computingTextFieldKeyTyped
        char iNumber = evt.getKeyChar();
        if (!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) || (iNumber == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_computingTextFieldKeyTyped

    private void gymTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gymTextFieldKeyTyped
        char iNumber = evt.getKeyChar();
        if (!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) || (iNumber == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_gymTextFieldKeyTyped

    private void transcriptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transcriptButtonActionPerformed
        transcriptTextArea.append("Transcript for " + surnameTextField.getText() + ", " + firstnameTextField.getText()
                + "\n=============================\n"
                + "\nEnglish:\t\t" + englishTextField.getText()
                + "\nSocial:\t\t" + socialTextField.getText()
                + "\nMath:\t\t" + mathTextField.getText()
                + "\nBiology:\t\t" + biologyTextField.getText()
                + "\nChemistry:\t\t" + chemistryTextField.getText()
                + "\nPhysics:\t\t" + physicsTextField.getText()
                + "\nComputing:\t\t" + computingTextField.getText()
                + "\nGym:\t\t" + gymTextField.getText()
                + "\n=============================\n"
                + "\nTotal Score:\t\t" + totalscoreTextField.getText()
                + "\nAverage:\t\t" + averageTextField.getText()
                + "\nRanking:\t\t" + rankingTextField.getText()
                + "\n"
        );
    }//GEN-LAST:event_transcriptButtonActionPerformed

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
//            java.util.logging.Logger.getLogger(NewRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(NewRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(NewRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(NewRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new NewRecord().setVisible(true);
//            }
//        });
//    }
    private JFrame frame;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel averageLabel;
    private javax.swing.JTextField averageTextField;
    private javax.swing.JPanel backgroundPanel;
    private javax.swing.JLabel biologyLabel;
    private javax.swing.JTextField biologyTextField;
    private javax.swing.JSeparator bottomlineSeparator;
    private javax.swing.JLabel chemistryLabel;
    private javax.swing.JTextField chemistryTextField;
    private javax.swing.JLabel computingLabel;
    private javax.swing.JTextField computingTextField;
    private javax.swing.JComboBox<String> coursecodeComboBox;
    private javax.swing.JLabel coursecodeLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel englishLabel;
    private javax.swing.JTextField englishTextField;
    private javax.swing.JLabel firstnameLabel;
    private javax.swing.JTextField firstnameTextField;
    private javax.swing.JPanel forseparatorPanel;
    private javax.swing.JPanel gradesPanel;
    private javax.swing.JLabel gymLabel;
    private javax.swing.JTextField gymTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel mathLabel;
    private javax.swing.JTextField mathTextField;
    private javax.swing.JLabel physicsLabel;
    private javax.swing.JTextField physicsTextField;
    private javax.swing.JLabel rankingLabel;
    private javax.swing.JTextField rankingTextField;
    private javax.swing.JButton recordButton;
    private javax.swing.JTable recordTable;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton saveandexitButton;
    private javax.swing.JLabel socialLabel;
    private javax.swing.JTextField socialTextField;
    private javax.swing.JLabel studentIDLabel;
    private javax.swing.JTextField studentIDTextField;
    private javax.swing.JPanel studentrecordsPanel;
    private javax.swing.JLabel surnameLabel;
    private javax.swing.JTextField surnameTextField;
    private javax.swing.JSeparator toplineSeparator;
    private javax.swing.JLabel totalscoreLabel;
    private javax.swing.JTextField totalscoreTextField;
    private javax.swing.JButton transcriptButton;
    private javax.swing.JTextArea transcriptTextArea;
    // End of variables declaration//GEN-END:variables
}
