/**
  * User: Nkem Ohanenye
  * Date: 4/14/18
  * Purpose: create the map and handle the numbers and car on the map
  */
package Final;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Map extends JPanel{

    // the variables
	public JPanel mapPanel;

	private JPanel bottom_wall;
	private JPanel bottomRight_wall;
	private JPanel middleBottomRight_wall;
	private JPanel middleTopRight_wall;
	private JPanel topMiddleBottomRight_wall;
    private JPanel topRight_wall;
    private JPanel topMddleTopRight_wall;
    private JPanel middleBottom_wall;
    private JPanel middleTop_wall;
    private JPanel topMiddleTop_wall;
    private JPanel topMiddleBottom_wall;

    private JPanel bottom_lineWall;
    private JPanel top_lineWall;
    private JPanel middle_lineWall;
    private JPanel topMiddle_lineWall;
    private JPanel topMiddleTop_lineWall;

    private JLabel house16;
    private JLabel house2;
    private JLabel house4;
    private JLabel house8;
    private JLabel house6;
    private JLabel house10;
    private JLabel house12;
    private JLabel house14;

    public JLabel zero;
    public JLabel one;
    public JLabel two;
    public JLabel three;
    public JLabel four;
    public JLabel five;
    public JLabel six;
    public JLabel seven;
    public JLabel eight;
    public JLabel nine;
    public JLabel ten;
    public JLabel eleven;
    public JLabel twelve;
    public JLabel thirteen;
    public JLabel fourteen;
    public JLabel fifteen;
    public JLabel sixteen;

    public JPanel car;

    // creates the map of the code
	public Map() {

	    Font font = new Font("",Font.PLAIN,30);

		mapPanel = new JPanel();            //uses JPanel as a variable
		mapPanel = this;
		mapPanel.setBackground(Color.BLACK);
		mapPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		mapPanel.setLayout(null);
		
		bottom_wall = new JPanel();
		bottom_wall.setBorder(new LineBorder(Color.CYAN));
		bottom_wall.setBounds(0, 424, 156, 49);
		bottom_wall.setBackground(Color.CYAN);
		mapPanel.add(bottom_wall);
		
		bottomRight_wall = new JPanel();
		bottomRight_wall.setBorder(new LineBorder(Color.CYAN));
		bottomRight_wall.setBounds(244, 424, 256, 49);
		bottomRight_wall.setBackground(Color.CYAN);
		mapPanel.add(bottomRight_wall);
		
		middleBottomRight_wall = new JPanel();
		middleBottomRight_wall.setBorder(new LineBorder(Color.CYAN));
		middleBottomRight_wall.setBounds(344, 318, 156, 49);
		middleBottomRight_wall.setBackground(Color.CYAN);
		mapPanel.add(middleBottomRight_wall);
		
		middleTopRight_wall = new JPanel();
		middleTopRight_wall.setBorder(new LineBorder(Color.CYAN));
		middleTopRight_wall.setBounds(344, 282, 156, 37);
		middleTopRight_wall.setBackground(Color.CYAN);
		mapPanel.add(middleTopRight_wall);
		
		topMiddleBottomRight_wall = new JPanel();
		topMiddleBottomRight_wall.setBorder(new LineBorder(Color.CYAN));
		topMiddleBottomRight_wall.setBounds(263, 130, 237, 59);
		topMiddleBottomRight_wall.setBackground(Color.CYAN);
		mapPanel.add(topMiddleBottomRight_wall);
		
		topRight_wall = new JPanel();
		topRight_wall.setBorder(new LineBorder(Color.CYAN));
		topRight_wall.setBounds(446, 43, 54, 42);
		topRight_wall.setBackground(Color.CYAN);
		mapPanel.add(topRight_wall);
		
		topMddleTopRight_wall = new JPanel();
		topMddleTopRight_wall.setBorder(new LineBorder(Color.CYAN));
		topMddleTopRight_wall.setBounds(263, 88, 121, 42);
		topMddleTopRight_wall.setBackground(Color.CYAN);
		mapPanel.add(topMddleTopRight_wall);
		
		middleBottom_wall = new JPanel();
		middleBottom_wall.setBorder(new LineBorder(Color.CYAN));
		middleBottom_wall.setBounds(50, 318, 237, 49);
		middleBottom_wall.setBackground(Color.CYAN);
		mapPanel.add(middleBottom_wall);
		
		middleTop_wall = new JPanel();
		middleTop_wall.setBorder(new LineBorder(Color.CYAN));
		middleTop_wall.setBounds(50, 282, 237, 37);
		middleTop_wall.setBackground(Color.CYAN);
		mapPanel.add(middleTop_wall);
		
		topMiddleTop_wall = new JPanel();
		topMiddleTop_wall.setBorder(new LineBorder(Color.CYAN));
		topMiddleTop_wall.setBounds(58, 88, 156, 42);
		topMiddleTop_wall.setBackground(Color.CYAN);
		mapPanel.add(topMiddleTop_wall);
		
		topMiddleBottom_wall = new JPanel();
		topMiddleBottom_wall.setBorder(new LineBorder(Color.CYAN));
		topMiddleBottom_wall.setBounds(58, 130, 156, 42);
		topMiddleBottom_wall.setBackground(Color.CYAN);
		mapPanel.add(topMiddleBottom_wall);
		
		bottom_lineWall = new JPanel();
		bottom_lineWall.setBorder(new LineBorder(Color.CYAN));
		bottom_lineWall.setBounds(0, 365, 50, 2);
		mapPanel.add(bottom_lineWall);
		
		top_lineWall = new JPanel();
		top_lineWall.setBorder(new LineBorder(Color.CYAN));
		top_lineWall.setBounds(0, 170, 58, 2);
		mapPanel.add(top_lineWall);
		
		middle_lineWall = new JPanel();
		middle_lineWall.setBorder(new LineBorder(Color.CYAN));
		middle_lineWall.setBounds(50, 236, 450, 2);
		mapPanel.add(middle_lineWall);
		
		topMiddle_lineWall = new JPanel();
		topMiddle_lineWall.setBorder(new LineBorder(Color.CYAN));
		topMiddle_lineWall.setBounds(382, 43, 2, 45);
		mapPanel.add(topMiddle_lineWall);
		
		topMiddleTop_lineWall = new JPanel();
		topMiddleTop_lineWall.setBorder(new LineBorder(Color.CYAN));
		topMiddleTop_lineWall.setBounds(58, 41, 326, 2);
		mapPanel .add(topMiddleTop_lineWall);
		
		house2 = new JLabel("H");
		house2.setBorder(new LineBorder(new Color(0, 0, 0)));
        house2.setFont(font);
        house2.setForeground(Color.GREEN);
		house2.setBounds(28, 380, 36, 32);
		mapPanel.add(house2);
		
		house4 = new JLabel("H");
		house4.setBorder(new LineBorder(new Color(0, 0, 0)));
        house4.setFont(font);
        house4.setForeground(Color.GREEN);
		house4.setBounds(452, 379, 36, 32);
		mapPanel.add(house4);
		
		house8 = new JLabel("H");
		house8.setBorder(new LineBorder(new Color(0, 0, 0)));
        house8.setFont(font);
        house8.setForeground(Color.GREEN);
		house8.setBounds(9, 318, 36, 32);
		mapPanel.add(house8);
		
		house6 = new JLabel("H");
		house6.setBorder(new LineBorder(new Color(0, 0, 0)));
        house6.setFont(font);
        house6.setForeground(Color.GREEN);
		house6.setBounds(450, 242, 36, 32);
		mapPanel.add(house6);
		
		house10 = new JLabel("H");
		house10.setBorder(new LineBorder(new Color(0, 0, 0)));
        house10.setFont(font);
        house10.setForeground(Color.GREEN);
		house10.setBounds(450, 195, 36, 32);
		mapPanel.add(house10);
		
		house12 = new JLabel("H");
		house12.setBorder(new LineBorder(new Color(0, 0, 0)));
        house12.setFont(font);
        house12.setForeground(Color.GREEN);
		house12.setBounds(334, 50, 36, 32);
		mapPanel.add(house12);
		
		house14 = new JLabel("H");
		house14.setBorder(new LineBorder(new Color(0, 0, 0)));
        house14.setFont(font);
        house14.setForeground(Color.GREEN);
		house14.setBounds(9, 130, 36, 32);
		mapPanel.add(house14);

        house16 = new JLabel("H");
        house16.setBorder(new LineBorder(new Color(0, 0, 0)));
        house16.setFont(font);
        house16.setForeground(Color.GREEN);
        house16.setBounds(450, 90, 36, 32);
        mapPanel.add(house16);

        zero = new JLabel("0");
        zero.setBorder(new LineBorder(Color.BLACK));
        zero.setFont(font);
        zero.setForeground(Color.GREEN);
        zero.setBounds(178, 424, 36, 37);
        mapPanel.add(zero);

        one = new JLabel("1");
        one.setBorder(new LineBorder(Color.BLACK));
        one.setFont(font);
        one.setForeground(Color.BLACK);
        one.setBounds(234, 385, 36, 32);
        mapPanel.add(one);

        two = new JLabel("2");
        two.setBorder(new LineBorder(Color.BLACK));
        two.setFont(font);
        two.setForeground(Color.RED);
        two.setBounds(72, 380, 36, 32);
        mapPanel.add(two);

        three = new JLabel("3");
        three.setBorder(new LineBorder(Color.BLACK));
        three.setFont(font);
        three.setForeground(Color.BLACK);
        three.setBounds(292, 318, 36, 32);
        mapPanel.add(three);

        four = new JLabel("4");
        four.setBorder(new LineBorder(Color.BLACK));
        four.setFont(font);
        four.setForeground(Color.RED);
        four.setBounds(413, 380, 36, 32);
        mapPanel.add(four);

        five = new JLabel("5");
        five.setBorder(new LineBorder(Color.BLACK));
        five.setFont(font);
        five.setForeground(Color.BLACK);
        five.setBounds(234, 242, 36, 32);
        mapPanel.add(five);

        six = new JLabel("6");
        six.setBorder(new LineBorder(Color.BLACK));
        six.setFont(font);
        six.setForeground(Color.RED);
        six.setBounds(413, 242, 36, 32);
        mapPanel.add(six);

        seven = new JLabel("7");
        seven.setBorder(new LineBorder(Color.BLACK));
        seven.setFont(font);
        seven.setForeground(Color.BLACK);
        seven.setBounds(39, 192, 36, 32);
        mapPanel.add(seven);

        eight = new JLabel("8");
        eight.setBorder(new LineBorder(Color.BLACK));
        eight.setFont(font);
        eight.setForeground(Color.RED);
        eight.setBounds(8, 282, 36, 32);
        mapPanel.add(eight);

        nine = new JLabel("9");
        nine.setBorder(new LineBorder(Color.BLACK));
        nine.setFont(font);
        nine.setForeground(Color.BLACK);
        nine.setBounds(223, 140, 36, 32);
        mapPanel.add(nine);

        ten = new JLabel("10");
        ten.setBorder(new LineBorder(Color.BLACK));
        ten.setFont(font);
        ten.setForeground(Color.RED);
        ten.setBounds(413, 192, 40, 32);
        mapPanel.add(ten);

        eleven = new JLabel("11");
        eleven.setFont(font);
        eleven.setForeground(Color.BLACK);
        eleven.setBorder(new LineBorder(Color.BLACK));
        eleven.setBounds(126, 53, 40, 32);
        mapPanel.add(eleven);

        twelve = new JLabel("12");
        twelve.setBorder(new LineBorder(Color.BLACK));
        twelve.setFont(font);
        twelve.setForeground(Color.RED);
        twelve.setBounds(295, 50, 40, 32);
        mapPanel.add(twelve);

        thirteen = new JLabel("13");
        thirteen.setBorder(new LineBorder(Color.BLACK));
        thirteen.setFont(font);
        thirteen.setForeground(Color.BLACK);
        thirteen.setBounds(40, 7, 40, 32);
        mapPanel.add(thirteen);

        fourteen = new JLabel("14");
        fourteen.setBorder(new LineBorder(Color.BLACK));
        fourteen.setFont(font);
        fourteen.setForeground(Color.RED);
        fourteen.setBounds(8, 90, 40, 32);
        mapPanel.add(fourteen);

        fifteen = new JLabel("15");
        fifteen.setBorder(new LineBorder(Color.BLACK));
        fifteen.setFont(font);
        fifteen.setForeground(Color.BLACK);
        fifteen.setBounds(446, 7, 40, 32);
        mapPanel.add(fifteen);

        sixteen = new JLabel("16");
        sixteen.setBorder(new LineBorder(Color.BLACK));
        sixteen.setFont(font);
        sixteen.setForeground(Color.RED);
        sixteen.setBounds(413, 86, 40, 32);
        mapPanel.add(sixteen);
		
		car = new JPanel();
		car.setBackground(Color.RED);
		car.setBounds(178, 424, 36, 37);
		mapPanel.add(car);
	}

	//allows the ability to repaint the main panel
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Other painting stuff
    }
}