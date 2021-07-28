package university.admission.management.system;
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
class ImagePanel extends JComponent {
    private Image image;
    public ImagePanel(Image image) {
        this.image = image;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }
}
class mainFrame{
    String password;
    mainFrame(){
       JFrame frame=new JFrame("Bangladesh Institute of Technology");
       ImageIcon background = new ImageIcon("C:\\Users\\Asus\\Desktop\\Java Files\\University Admission Management System\\image\\First.png");
       Image image=background.getImage();
       image.getScaledInstance(500,320, 0);
       frame.setContentPane(new ImagePanel(image));
       ImageIcon icon=new ImageIcon("C:\\Users\\Asus\\Desktop\\Java Files\\University Admission Management System\\image\\BIT_Logo.png");
        frame.setIconImage(icon.getImage());
       frame.setSize(900,550);
       JPanel panel=new JPanel();
       JLabel label=new JLabel("Database Password:");
       Font font=new Font("Arial",Font.BOLD,18);
       panel.setBackground(Color.WHITE);
       panel.setBounds(230, 230, 200, 30);
       JPasswordField pass=new JPasswordField(30);
       pass.setBackground(Color.WHITE);
       pass.setEchoChar('*');
       pass.setBounds(440, 230, 200, 30);
       JButton setup=new JButton("Set Up");
       JButton refresh=new JButton("Refresh");
       JButton login=new JButton("Log In");
       login.setForeground(Color.blue);
       login.setBounds(390, 300, 80, 30);
       setup.setBounds(340, 460, 80, 30);
       setup.setForeground(Color.red);
       refresh.setBounds(430,460,80,30);
       refresh.setForeground(Color.red);
       label.setForeground(Color.BLUE);
       label.setFont(font);
       login.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               char[] op=pass.getPassword();
               password=new String(op);
               JOptionPane.showMessageDialog(null,"Server Connected");
               frame.dispose();
               new homePage(password);
           }
       });
       setup.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               int key=0;
               char[] op=pass.getPassword();
               password=new String(op);
               new setDatabase(password,key);
               frame.dispose();
           }
       });
       refresh.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               int key=1;
               char[] op=pass.getPassword();
               password=new String(op);
               new setDatabase(password,key);
               frame.dispose();
           }
       });
       panel.add(label);
       frame.add(panel);
       frame.add(setup);
       frame.add(setup);
       frame.add(refresh);
       frame.add(pass);
       frame.add(login);
       frame.setVisible(true);
       frame.setLayout(null);
       frame.setLocationRelativeTo(null);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
}
class setDatabase{
    String password;
    setDatabase(String password,int key){
        String url="jdbc:mysql://localhost:3306";
        String user="root";
        this.password=password;
        String sql;
        try(Connection conn = DriverManager.getConnection(url,user,password);
         Statement stmt = conn.createStatement();
      ) {
           if(key==1){
               sql="Create Database University_Management";
               stmt.executeUpdate(sql);
           }
           else{
           sql="drop database University_Management";
           stmt.executeUpdate(sql);
           sql ="Create Database University_Management";
           stmt.executeUpdate(sql);
           }
      } catch (SQLException e) {
         e.printStackTrace();
      }
      url="jdbc:mysql://localhost:3306/university_management";
      try(Connection conn = DriverManager.getConnection(url,user,password);
         Statement stmt = conn.createStatement();
      ) {
         sql="create table dept_gpa "
                 + "( student int,"
                 + "  gpa float);";
         stmt.executeUpdate(sql);
         sql="create table student_info "
                 + "( Name varchar(50),"
                 + "password varchar(30),"
                 + "Board varchar(10),"
                 + " GPA_HSC float,"
                 + "GPA_SSC float,"
                 +"GPA_Total float,"
                 + "District varchar(10),"
                 + "MobileNumber int(15),"
                 + "Email varchar(30));";
         stmt.executeUpdate(sql);
         JOptionPane.showMessageDialog(null,"Server Connected");
         new homePage(password);
      } catch (SQLException e) {
         JOptionPane.showMessageDialog(null,"Server Not Connected");
         e.printStackTrace();
      } 
    }
}
public class UniversityAdmissionManagementSystem {
    public static void main(String[] args) {
       new mainFrame();
    }  
}
