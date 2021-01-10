package Notepad;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class NotepadGUI extends JFrame implements ActionListener {

    JPanel innerWindow = new JPanel();
    JButton read = new JButton("Load File");
    JButton write = new JButton("Write Frile");
    JTextField fileField = new JTextField(15);
    JTextArea textArea = new JTextArea(40,20);
    JLabel label = new JLabel("File name: ");
    
    public NotepadGUI(){
        super("Notepad-- Scona Version 2.5.5");
        
        innerWindow.setLayout(new GridLayout(2,2));
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add("North",innerWindow);
        this.getContentPane().add( new JScrollPane(textArea)  );
        this.getContentPane().add( "Center",textArea); 
        
        //this.add(innerWindow);
        innerWindow.add(read);
        innerWindow.add(write);
        innerWindow.add(label);
        innerWindow.add(fileField);
        //innerWindow.add(textArea);
        
        read.addActionListener(this);
        write.addActionListener(this);
        
        innerWindow.setBackground(Color.GREEN);
        textArea.setBackground(Color.YELLOW);        
        textArea.setForeground(Color.BLUE);        
        Font mainFont = new Font("ravie", Font.ITALIC,20);        
        textArea.setFont(mainFont);
                
                
    }
    
    
    private void readTextFile(JTextArea textArea, String fileName) {
        try {
            BufferedReader inStream = new BufferedReader(new FileReader(fileName)); // Open the stream
            String line = inStream.readLine();            // Read one line
            while (line != null) {                        // While more text
                textArea.append(line + "\n");              // textArea a line
                line = inStream.readLine();               // Read next line
            }
            inStream.close();                             // Close the stream
        } catch (FileNotFoundException e) {
            textArea.setText("IOERROR: File NOT Found: " + fileName + "\n");
            e.printStackTrace();
        } catch (IOException e) {
            textArea.setText("IOERROR: " + e.getMessage() + "\n");
            e.printStackTrace();
        }
    } // end readTextFile

    //writes to a text file.  Netbeans will look for it at the Project Folder level. 
    private void writeTextFile(JTextArea textArea, String fileName) {
        try {
            FileWriter outStream = new FileWriter(fileName);
            outStream.write(textArea.getText());
            outStream.close();
        } catch (IOException e) {
            textArea.setText("IOERROR: " + e.getMessage() + "\n");
            e.printStackTrace();
        }
    } // end writeTextFile()

//watches the button and waits until it is clicked    
    public void actionPerformed(ActionEvent evt) {
        String fileName = fileField.getText();
        if (evt.getSource() == read) {
            textArea.setText("");
            readTextFile(textArea, fileName);
        } else {
            writeTextFile(textArea, fileName);
        }

    }//end actionPerformed()

}
