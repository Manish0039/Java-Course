
import java.awt.*; //  importing awt beacuse we are using image class.

import javax.swing.*;  // Swing packet comes from the  extended packet of java so here we use javax. Swing is used for creating desktop application.

public class Login extends JFrame{  // JFrame is a class of Swing. Here we are using the concept of inheritance by extending the class. 

    Login(){  
        setLayout(null);  // changing the layout position from default centre to null.
        setTitle("Automated Teller Machine");  // setTitle is used for writing the title 
        ImageIcon i1 = new ImageIcon(ClassLoader. getSystemResource("images/logo.jpeg"));  // giving the location of the image, but we cannot use the image directly on frame so we are using JLabel.
        Image i2 = i1.getImage().getScaledInstance(200, 150, Image.SCALE_DEFAULT);
        
        ImageIcon i3 = new ImageIcon(i2);  // here Converting the image into image icon. 
        JLabel label = new JLabel(i3); //  
        label.setBounds(50,10,200,150);  // setBound function is used to locate the label on the frame. we are making the custom layout by using setBounds.
        add(label);
        
        
        JLabel text = new JLabel("Welcome to the ATM"); // JLabel is mostly used for writing text.
        text.setFont(new Font("algerian",Font.BOLD,30)); // here we use function for the styling of font.
        text.setBounds(300,50,400,50);
        add(text);


        JLabel cardno = new JLabel("Card NO:"); // JLabel is mostly used for writing text.
        cardno.setFont(new Font("algerian",Font.BOLD,30)); // here we use function for the styling of font.
        cardno.setBounds(300,150,400,50);
        add(cardno);


        JLabel pin = new JLabel("Pin No:"); // JLabel is mostly used for writing text.
        pin.setFont(new Font("algerian",Font.BOLD,30)); // here we use function for the styling of font.
        pin.setBounds(300,250,400,50);
        add(pin);


        setSize(800,600);  // Dimension of the frame.
        setVisible(true);   //  by default visibility of ṇ frame is hidden from the user so to see the login page we make its visibility true.
        setLocation(300,150); // 
        getContentPane().setBackground(Color.WHITE); // changing the background color of the frame.

    }
    public static void main(String[] args) {
        new Login();  // anonymous object 
    }
   
}