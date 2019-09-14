/**
  * User: Nkem Ohanenye
  * Date: 4/13/18
  * Purpose: create the frame and initiate the button
  */
package Final;

import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Stage extends JFrame{          // the frame

    // the variables
    private JPanel inputPanel;
    private JTextField area;
    private JLabel label;
    private JButton playButton;

    private JLabel label2;              //prints the current number entered
    private Map map = new Map();                    //imports Map class
    public Stage(){

        // variable settings
        NumericEntry nE = new NumericEntry(NumericEntry.NUMERIC, 2);
        inputPanel = new JPanel();
        area = new JTextField(20);
        label = new JLabel("Enter House Location:");
        playButton = new JButton("Play");

        // frame settings
        setSize(500,535);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
        setLayout(new BorderLayout());

        area.setDocument(nE);           // sets that only numbers can be entered with the space of 2
        area.setBorder(BorderFactory.createLineBorder(Color.black));

        // panel settings
        inputPanel.setBackground(Color.WHITE);
        inputPanel.setLayout(new FlowLayout());
        inputPanel.add(label);
        inputPanel.add(area);
        inputPanel.add(playButton);
        label2 = new JLabel();
        inputPanel.add(label2);

        // methods
        ButtonSettings();

        // add to frame
        add(inputPanel, BorderLayout.NORTH);
        add(map.mapPanel);
        setVisible(true);
    }
    public void ButtonSettings(){
        playButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    int value = Integer.parseInt(area.getText());
                    area.setText(Integer.toString(value));
                    boolean even = (value & 1) == 0;
                    if (value <= 16 && value >= 1 && even) {   //only accepts values that are between 1-16 and are even
                        label2.setText(area.getText());
                        // to hardcode check the value of the text
                        // if the text was equal to that number
                        // to remove the car from the panel and
                        // repaint at vertex to display movement
                        // was meant to test movement
                        // later the code was to implement if it reached that number
                        // the car would go to the road it thinks is the answer
                        // if the car was wrong it would be sent back to 0
                        // and have to do it again
                        if (value == 2){
                            map.mapPanel.remove(map.car);
                            map.car.setBounds(72, 380, 36, 32);
                            map.mapPanel.add(map.car);
                            map.mapPanel.repaint();
                            repaintWindow();
                        }
                        if (value == 4){
                            map.mapPanel.remove(map.car);
                            map.car.setBounds(413, 380, 36, 32);
                            map.mapPanel.add(map.car);
                            map.mapPanel.repaint();
                            repaintWindow();
                        }
                        if (value == 6){
                            map.mapPanel.remove(map.car);
                            map.car.setBounds(413, 242, 36, 32);
                            map.mapPanel.add(map.car);
                            map.mapPanel.repaint();
                            repaintWindow();
                        }
                        if (value == 8){
                            map.mapPanel.remove(map.car);
                            map.car.setBounds(8, 282, 36, 32);
                            map.mapPanel.add(map.car);
                            map.mapPanel.repaint();
                            repaintWindow();
                        }
                        if (value == 10){
                            map.mapPanel.remove(map.car);
                            map.car.setBounds(413, 192, 40, 32);
                            map.mapPanel.add(map.car);
                            map.mapPanel.repaint();
                            repaintWindow();
                        }
                        if (value == 12){
                            map.mapPanel.remove(map.car);
                            map.car.setBounds(295, 50, 40, 32);
                            map.mapPanel.add(map.car);
                            map.mapPanel.repaint();
                            repaintWindow();
                        }
                        if (value == 14){
                            map.mapPanel.remove(map.car);
                            map.car.setBounds(8, 90, 40, 32);
                            map.mapPanel.add(map.car);
                            map.mapPanel.repaint();
                            repaintWindow();
                        }
                        if (value == 16){
                            map.mapPanel.remove(map.car);
                            map.car.setBounds(413, 86, 40, 32);
                            map.mapPanel.add(map.car);
                            map.mapPanel.repaint();
                            repaintWindow();
                        }

                    } else
                        // return error if number is wrong
                        JOptionPane.showMessageDialog(null,
                                "You must enter a valid value.",
                                "Error",
                                JOptionPane.ERROR_MESSAGE);
                    area.setText("");
                }catch (NumberFormatException e){
                    // return error if label is empty
                    JOptionPane.showMessageDialog(null,
                            "You must enter a valid value.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

            }
        });
    }

    public void repaintWindow() { //to repaint the map panel
        map.mapPanel.repaint();
    }

    class NumericEntry extends PlainDocument{

        //the variables
        private static final String NUMERIC = "0123456789";
        private String acceptedChars = null;
        private int limit;

        // makes it so only numbers can be inputted
        public NumericEntry(String acceptedchars, int lim) {
            acceptedChars = acceptedchars;
            limit = lim;
        }

        public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
            if (str == null) {
                return;
            }
            // takes index and limits the amount of characters able to be inputed, also loops for NumberEntry
            for (int i = 0; i < str.length(); i++) {
                if (acceptedChars.indexOf(str.valueOf(str.charAt(i))) == -1)
                    return;
                if ((getLength() + str.length()) <= limit){
                    str = str.toUpperCase();
                    super.insertString(offset,str,attr);
                }
            }
        }

    }
}