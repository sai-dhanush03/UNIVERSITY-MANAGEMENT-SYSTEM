
package universitymanagementsystem;


import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;


public class Marks extends JFrame implements ActionListener {
    String rollno;
    String sem;
    JButton cancel;
    
    Marks(String rollno, String sem){
        this.rollno=rollno;
        this.sem=sem;
        
        setSize(500,600);
        setLocation(500, 100);
        setLayout(null);
        
         getContentPane().setBackground(Color.WHITE);
        
        JLabel heading = new JLabel("Vellore Institute of Technology");
        heading.setBounds(100, 10, 500, 25);
        heading.setFont(new Font("Tahoma", Font.BOLD, 20));
        add(heading);
        
        JLabel subheading = new JLabel("Result of Examination 2024");
        subheading.setBounds(130, 50, 500, 20);
        subheading.setFont(new Font("Tahoma", Font.BOLD, 18));
        add(subheading);
        
        JLabel lblrollno = new JLabel("Roll Number " + rollno);
        lblrollno.setBounds(60, 100, 500, 20);
        lblrollno.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(lblrollno);
        
        JLabel lblsemester = new JLabel();
        lblsemester.setBounds(60, 130, 500, 20);
        lblsemester.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(lblsemester);
        
        JLabel sub1 = new JLabel();
        sub1.setBounds(100, 200, 500, 20);
        sub1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub1);
        
        JLabel sub2 = new JLabel();
        sub2.setBounds(100, 230, 500, 20);
        sub2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub2);
        
        JLabel sub3 = new JLabel();
        sub3.setBounds(100, 260, 500, 20);
        sub3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub3);
        
        JLabel sub4 = new JLabel();
        sub4.setBounds(100, 290, 500, 20);
        sub4.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub4);
        
        JLabel sub5 = new JLabel();
        sub5.setBounds(100, 320, 500, 20);
        sub5.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(sub5);
        
        
        
        try {
            Conn c = new Conn();
            
            ResultSet rs1 = c.s.executeQuery("select * from subject where rollno = '"+rollno+"' and semester = '"+sem+"'");
            while(rs1.next()) {
                sub1.setText(rs1.getString("subject1"));
                sub2.setText(rs1.getString("subject2"));
                sub3.setText(rs1.getString("subject3"));
                sub4.setText(rs1.getString("subject4"));
                sub5.setText(rs1.getString("subject5"));
            }
            
            ResultSet rs2 = c.s.executeQuery("select * from marks where rollno = '"+rollno+"' and semester = '"+sem+"'" );
            while(rs2.next()) {
                sub1.setText(sub1.getText() + "------------" + rs2.getString("marks1"));
                sub2.setText(sub2.getText() + "------------" + rs2.getString("marks2"));
                sub3.setText(sub3.getText() + "------------" + rs2.getString("marks3"));
                sub4.setText(sub4.getText() + "------------" + rs2.getString("marks4"));
                sub5.setText(sub5.getText() + "------------" + rs2.getString("marks5"));
                lblsemester.setText("Semester " + rs2.getString("semester"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        cancel = new JButton("Back");
        cancel.setBounds(250, 500, 120, 25);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new ExaminationDetails();
    }
    
    public static void main(String[] args){
        new Marks("","");
        
       
    }
    
}

//**********************************************************************
//Table way of displaying marks



//package universitymanagementsystem;
//import java.awt.*;
//import javax.swing.*;
//import java.sql.*;
//
//public class Marks extends JFrame {
//    String rollno;
//    
//    Marks(String rollno){
//        this.rollno = rollno;
//        
//        setSize(500, 600);
//        setLocation(500, 100);
//        setLayout(null);
//        
//        getContentPane().setBackground(Color.WHITE);
//        
//        JLabel heading = new JLabel("Vellore Institute of Technology");
//        heading.setBounds(100, 10, 500, 25);
//        heading.setFont(new Font("Tahoma", Font.BOLD, 20));
//        add(heading);
//        
//        JLabel subheading = new JLabel("Result of Examination 2024");
//        subheading.setBounds(130, 50, 500, 20);
//        subheading.setFont(new Font("Tahoma", Font.BOLD, 18));
//        add(subheading);
//        
//        JLabel lblrollno = new JLabel("Roll Number: " + rollno);
//        lblrollno.setBounds(60, 100, 500, 20);
//        lblrollno.setFont(new Font("Tahoma", Font.PLAIN, 18));
//        add(lblrollno);
//        
//        JLabel lblsemester = new JLabel();
//        lblsemester.setBounds(60, 130, 500, 20);
//        lblsemester.setFont(new Font("Tahoma", Font.PLAIN, 18));
//        add(lblsemester);
//        
//        String[] columnNames = {"Subject", "Marks"};
//        String[][] data = new String[5][2];
//        
//        try {
//            Conn c = new Conn();
//            
//            ResultSet rs1 = c.s.executeQuery("select * from subject where rollno = '"+rollno+"'");
//            if(rs1.next()) {
//                data[0][0] = rs1.getString("subject1");
//                data[1][0] = rs1.getString("subject2");
//                data[2][0] = rs1.getString("subject3");
//                data[3][0] = rs1.getString("subject4");
//                data[4][0] = rs1.getString("subject5");
//            }
//            
//            ResultSet rs2 = c.s.executeQuery("select * from marks where rollno = '"+rollno+"'");
//            if(rs2.next()) {
//                data[0][1] = rs2.getString("marks1");
//                data[1][1] = rs2.getString("marks2");
//                data[2][1] = rs2.getString("marks3");
//                data[3][1] = rs2.getString("marks4");
//                data[4][1] = rs2.getString("marks5");
//                lblsemester.setText("Semester: " + rs2.getString("semester"));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        
//        JTable table = new JTable(data, columnNames);
//        table.setBounds(60, 180, 380, 100);
//        table.setFont(new Font("Tahoma", Font.PLAIN, 18));
//        
//        table.getColumnModel().getColumn(0).setPreferredWidth(230); // Subject column
//        table.getColumnModel().getColumn(1).setPreferredWidth(180);
//        add(table);
//        
//        JScrollPane sp = new JScrollPane(table);
//        sp.setBounds(60, 180, 380, 100);
//        add(sp);
//        
//        setVisible(true);
//    }
//    
//    public static void main(String[] args){
//        new Marks("");  // Pass the roll number here
//    }
//}
