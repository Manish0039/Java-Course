
import javax.swing.*;  // Swing packet comes from the  extended packet of java so here we use javax. Swing is used for creating desktop application.

public class Login extends JFrame{  // JFrame is a class of Swing. Here we are using the concept of inheritance by extending the class. 

    Login(){  

        setTitle("Automated Teller Machine");  // setTitle is used for writing the title 
        ImageIcon i1 = new ImageIcon(ClassLoader. getSystemResource("images/logo.jpeg"));  // giving the location of the image, but we cannot use the image directly on frame so we are using JLabel.

        JLabel label = new JLabel(i1); // 
        add(label);
        



        setSize(800,600);  // Dimension
        setVisible(true);   //  by default visibility of ṇ frame is hidden from the user so to see the login page we make its visibility true.
        setLocation(300,150); // 
    }
    public static void main(String[] args) {
        new Login();  // anonymous object 
    }
   
}