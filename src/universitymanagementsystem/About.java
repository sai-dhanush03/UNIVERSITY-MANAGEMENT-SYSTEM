//
//package universitymanagementsystem;
//
//import javax.swing.*;
//import java.awt.*;
//
//public class About extends JFrame {
//    
//    About(){
//        setSize(700,500);
//        setLocation(400,150);
//        getContentPane().setBackground(Color.WHITE);
//        setLayout(null);
//        
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/about.jpg"));
//        Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel image = new JLabel(i3);
//        image.setBounds(350, 0, 300, 200);
//        add(image);
//        
//        JLabel heading = new JLabel("<html>University<br/>Management System</html>");
//        heading.setBounds(70, 20, 300, 130);
//        heading.setFont(new Font("Tahoma", Font.BOLD, 30));
//        add(heading);
//        
//        JLabel name = new JLabel("Developed By: Sai Dhanush");
//        name.setBounds(70, 220, 550, 40);
//        name.setFont(new Font("Tahoma", Font.BOLD, 30));
//        add(name);
//        
//        JLabel rollno = new JLabel("Roll number: 21BCE0145");
//        rollno.setBounds(70, 280, 550, 40);
//        rollno.setFont(new Font("Tahoma", Font.PLAIN, 30));
//        add(rollno);
//        
//        JLabel contact = new JLabel("Contact: kasamsettysaidhanush03@gmail.com");
//        contact.setBounds(70, 340, 550, 40);
//        contact.setFont(new Font("Tahoma", Font.PLAIN, 20));
//        add(contact);
//        
//        setVisible(true);
//    }
//    public static void main(String[] args){
//        new About();
//    
//    }
//
//
//}


////*************************************************************
   
package universitymanagementsystem;

import javax.swing.*;
import java.awt.*;

public class About extends JFrame {
    
    About() {
        setSize(800, 600);
        setLocation(350, 100);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/OIG3.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(351, 351, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400, 100, 350, 250);
        add(image);
        
        JLabel heading = new JLabel("<html>University Management System</html>");
        heading.setBounds(50, 20, 350, 130);
        heading.setFont(new Font("Serif", Font.BOLD, 28));
        add(heading);
        
        JLabel description = new JLabel("<html><div style='text-align: justify;'>This innovative Java project streamlines university operations by centralizing student, faculty, and administrative data, offering seamless functionalities to add, view, and update information with ease.</div></html>");
        description.setBounds(50, 160, 350, 100); // Adjusted width
        description.setFont(new Font("SansSerif", Font.PLAIN, 16));
        add(description);
        
        JLabel techUsed = new JLabel("<html><b>Technologies Used:</b> Core Java (Swing & AWT)</html>");
        techUsed.setBounds(50, 240, 350, 80); // Adjusted width
        techUsed.setFont(new Font("SansSerif", Font.PLAIN, 16));
        add(techUsed);
        
        JLabel dbUsed = new JLabel("<html><b>Database Used:</b> MySQL</html>");
        dbUsed.setBounds(50, 280, 350, 40); // Adjusted width
        dbUsed.setFont(new Font("SansSerif", Font.PLAIN, 16));
        add(dbUsed);
        
        JLabel name = new JLabel("Developed By: Sai Dhanush");
        name.setBounds(50, 340, 350, 40); // Adjusted width
        name.setFont(new Font("SansSerif", Font.BOLD, 22));
        add(name);
        
        JLabel rollno = new JLabel("Roll Number: 21BCE0145");
        rollno.setBounds(50, 380, 350, 40); // Adjusted width
        rollno.setFont(new Font("SansSerif", Font.PLAIN, 20));
        add(rollno);
        
        JLabel contact = new JLabel("Contact: kasamsettysaidhanush03@gmail.com");
        contact.setBounds(50, 420, 400, 40); // Adjusted width
        contact.setFont(new Font("SansSerif", Font.PLAIN, 18));
        add(contact);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        new About();
    }
}
