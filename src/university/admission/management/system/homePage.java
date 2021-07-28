package university.admission.management.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.io.*;
class About{
    About(){
         JFrame frame=new JFrame("University Admission Management System");
       ImageIcon background = new ImageIcon("C:\\Users\\Asus\\Desktop\\Java Files\\University Admission Management System\\image\\MyTeam.png");
       Image image=background.getImage();
       image.getScaledInstance(500,320, 0);
       frame.setContentPane(new ImagePanel(image));
       JButton back=new JButton("Back");
       back.setBounds(78,460,80,30);
       back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                frame.dispose();
            }
        });
       frame.add(back);
       frame.setSize(920, 553);
       frame.setVisible(true);
       frame.setLayout(null);
       frame.setLocationRelativeTo(null);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
}
class front{
     front(String datapass){
        JFrame frame=new JFrame("Bangladesh Institue of Technology");
        ImageIcon background = new ImageIcon("C:\\Users\\Asus\\Desktop\\Java Files\\University Admission Management System\\image\\bitHome.png");
        Image image=background.getImage();
        image.getScaledInstance(400,300, 0);
        frame.setContentPane(new ImagePanel(image));
        ImageIcon icon=new ImageIcon("C:\\Users\\Asus\\Desktop\\Java Files\\University Admission Management System\\image\\BIT_Logo.png");
        frame.setIconImage(icon.getImage());
        JButton admin=new JButton("Admin Portal");
        JButton student=new JButton("Student Portal");
        JButton info=new JButton("About");
        JLabel power=new JLabel("Powered by Dept. of  CSE, BIT-Dhaka");
        Font font=new Font("Arial",Font.BOLD,15);
        power.setForeground(Color.WHITE);
        power.setFont(font);
        power.setBounds(300,430,400,100);
        admin.setBounds(30,240,150, 30);
        student.setBounds(30,290,150, 30);
        info.setBounds(30,340,150, 30);
        info.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                 new About();
            }
        });
        admin.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new AdminPortal(datapass);
            }
        });
        student.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new StudentPortal(datapass);
            }
        });
        frame.setSize(920,550);
        frame.add(admin);
        frame.add(student);
        frame.add(info);
        frame.add(power);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
}
public class homePage {
   homePage(String datapass){
       new front(datapass);
   }
}