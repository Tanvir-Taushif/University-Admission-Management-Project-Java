package university.admission.management.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class sure{
    sure(String datapass,String name,String phoneNum,String sub1,String sub2,String sub3,String sub4,String sub5
    ,String ver1,String ver2,String ver3,String ver4,String ver5){
        JFrame frame=new JFrame("Bangladesh Institue of Technology");
        ImageIcon icon=new ImageIcon("C:\\Users\\Asus\\Desktop\\Java Files\\University Admission Management System\\image\\BIT_Logo.png");
        frame.setIconImage(icon.getImage());
        JButton confirm=new JButton("Confirm");
        JButton back=new JButton("Back");
        frame.setSize(400,220);
        back.setBounds(250, 110,80, 30);
        confirm.setBounds(50, 110, 80, 30);
        Font font2=new Font("Arial",Font.BOLD,15);
        JLabel Label=new JLabel("Are you sure?");
        Label.setBounds(40, 50, 250, 30);
        Label.setForeground(Color.BLUE);
        Label.setFont(font2);
        confirm.setForeground(Color.red);
        back.setForeground(Color.blue);
        confirm.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               String url="jdbc:mysql://localhost:3306/University_Management";
                String password=datapass;
                String user="root";
                String sql;
                try(Connection conn = DriverManager.getConnection(url,user,password);
                Statement stmt = conn.createStatement();
                ) {
                     sql="create table "+phoneNum+"Sub "
                             + "(No int,"
                             + "Dept_Name varchar(40));";
                     stmt.executeUpdate(sql); 
                     sql="insert into "+phoneNum+"Sub "
                             + "values"
                             + "("+1+",'"+sub1+"'),"
                             + "("+2+",'"+sub2+"'),"
                             + "("+3+",'"+sub3+"'),"
                             + "("+4+",'"+sub4+"'),"
                             + "("+5+",'"+sub5+"')";
                     stmt.executeUpdate(sql);
                     sql="create table "+phoneNum+"Uni "
                             + "(No int,"
                             + "Uni_name varchar(40));";
                     stmt.executeUpdate(sql);
                     sql="insert into "+phoneNum+"Uni "
                             + "values"
                             + "("+1+",'"+ver1+"'),"
                             + "("+2+",'"+ver2+"'),"
                             + "("+3+",'"+ver3+"'),"
                             + "("+4+",'"+ver4+"'),"
                             + "("+5+",'"+ver5+"')";
                     stmt.executeUpdate(sql);
                     JOptionPane.showMessageDialog(null,"Your Response in Submitted.You can't submit again.");
                     frame.dispose();
                    }catch (Exception x) {
                      JOptionPane.showMessageDialog(null,"Error 404 not found");
                     x.printStackTrace();
                }
            }
        });
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                frame.dispose();
            }
        });
        frame.add(Label);
        frame.add(confirm);
        frame.add(back);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
}
class selectUni{
    static JComboBox c1,c2,c3,c4,c5,de1,de2,de3,de4,de5;
    static JLabel num1,num2,num3,num4,num5,num6,
            num7,num8,num9,num10;
    String sub1="",sub2="",sub3="",sub4="",sub5="",ver1="",ver2="",ver3="",ver4="",ver5="";
    selectUni(String datapass,String name,String phoneNum){
        JFrame frame=new JFrame("Bangladesh Institue of Technology (Student Portal)");
        ImageIcon background = new ImageIcon("C:\\Users\\Asus\\Desktop\\Java Files\\University Admission Management System\\image\\select.png");
       Image image=background.getImage();
       image.getScaledInstance(500,320, 0);
       frame.setContentPane(new ImagePanel(image));
        ImageIcon icon=new ImageIcon("C:\\Users\\Asus\\Desktop\\Java Files\\University Admission Management System\\image\\BIT_Logo.png");
        frame.setIconImage(icon.getImage());
        JButton submit=new JButton("Submit");
        Font font=new Font("Arial",Font.BOLD,13);
        Font font2=new Font("Arial",Font.BOLD,18);
        JLabel subLabel=new JLabel("Select Subject Choice List");
        subLabel.setForeground(Color.white);
        subLabel.setFont(font2);
        JLabel uniLabel=new JLabel("Select Campus Choice List");
        uniLabel.setForeground(Color.white);
        uniLabel.setFont(font2);
        subLabel.setBounds(10,110,400,30);
        uniLabel.setBounds(10,360,400,30);
        JLabel power=new JLabel("Powered by Dept. of  CSE, BIT-Dhaka");
        JButton back=new JButton("Back");
        power.setFont(font);
        power.setForeground(Color.white);
        power.setBounds(420,450,400,100);
        back.setBounds(820, 440,80, 30);
        submit.setBounds(820,400, 80, 30);
        String s1[] = {"Select Your Choice", "Computer Science & Engineering", "Electrical & Electronics Engineering", "Mechanical Engineering",
            "Civil Engineering", "Chemical Engineering" };
        c1=new JComboBox(s1);
         c1.addItemListener(new ItemListener(){
             public void itemStateChanged(ItemEvent e)
              {
                  if (e.getSource() == c1) {
                  sub1=c1.getSelectedItem().toString();
              }
            }
         });
         num1=new JLabel("1.");
         num1.setFont(font2);
         JPanel dept1=new JPanel();
         num1.setForeground(Color.blue);
         dept1.add(num1);
         dept1.add(c1);
         dept1.setBounds(380,20,300, 35);
         c2=new JComboBox(s1);
         c2.addItemListener(new ItemListener(){
             public void itemStateChanged(ItemEvent e)
              {
                  if (e.getSource() == c2) {
                  sub2=c2.getSelectedItem().toString();
              }
            }
         });
         num2=new JLabel("2.");
         num2.setFont(font2);
         JPanel dept2=new JPanel();
         num2.setForeground(Color.blue);
         dept2.add(num2);
         dept2.add(c2);
         dept2.setBounds(380,60,300,35);
         c3=new JComboBox(s1);
         c3.addItemListener(new ItemListener(){
             public void itemStateChanged(ItemEvent e)
              {
                  if (e.getSource() == c3) {
                  sub3=c3.getSelectedItem().toString();
              }
            }
         });
         num3=new JLabel("3.");
         num3.setFont(font2);
         JPanel dept3=new JPanel();
         num3.setForeground(Color.blue);
         dept3.add(num3);
         dept3.add(c3);
         dept3.setBounds(380,100,300,35);
         c4=new JComboBox(s1);
         c4.addItemListener(new ItemListener(){
             public void itemStateChanged(ItemEvent e)
              {
                  if (e.getSource() == c4) {
                  sub4=c4.getSelectedItem().toString();
              }
            }
         });
         num4=new JLabel("4.");
         num4.setFont(font2);
         JPanel dept4=new JPanel();
         num4.setForeground(Color.blue);
         dept4.add(num4);
         dept4.add(c4);
         dept4.setBounds(380,140,300,35);
         c5=new JComboBox(s1);
         c5.addItemListener(new ItemListener(){
             public void itemStateChanged(ItemEvent e)
              {
                  if (e.getSource() == c5) {
                  sub5=c5.getSelectedItem().toString();
              }
            }
         });
         num5=new JLabel("5.");
         num5.setFont(font2);
         JPanel dept5=new JPanel();
         num5.setForeground(Color.blue);
         dept5.add(num5);
         dept5.add(c5);
         dept5.setBounds(380,180,300,35);
         String s2[]={"Select Your Choice","BIT,Dhaka","BIT,Khulna","BIT,Rajshahi","BIT,Sylhet","BIT,Chittagong"};
         de1=new JComboBox(s2);
         de1.addItemListener(new ItemListener(){
             public void itemStateChanged(ItemEvent e)
              {
                  if (e.getSource() == de1) {
                  ver1=de1.getSelectedItem().toString();
              }
            }
         });
         num6=new JLabel("1.");
         num6.setFont(font2);
         JPanel uni1=new JPanel();
         num6.setForeground(Color.blue);
         uni1.add(num6);
         uni1.add(de1);
         uni1.setBounds(420,260,200,35);
         de2=new JComboBox(s2);
         de2.addItemListener(new ItemListener(){
             public void itemStateChanged(ItemEvent e)
              {
                  if (e.getSource() == de2) {
                  ver2=de2.getSelectedItem().toString();
              }
            }
         });
         num7=new JLabel("2.");
         num7.setFont(font2);
         JPanel uni2=new JPanel();
         num7.setForeground(Color.blue);
         uni2.add(num7);
         uni2.add(de2);
         uni2.setBounds(420,300,200,35);
         de3=new JComboBox(s2);
         de3.addItemListener(new ItemListener(){
             public void itemStateChanged(ItemEvent e)
              {
                  if (e.getSource() == de3) {
                  ver3=de3.getSelectedItem().toString();
              }
            }
         });
         num8=new JLabel("3.");
         num8.setFont(font2);
         JPanel uni3=new JPanel();
         num8.setForeground(Color.blue);
         uni3.add(num8);
         uni3.add(de3);
         uni3.setBounds(420,340,200,35);
         de4=new JComboBox(s2);
         de4.addItemListener(new ItemListener(){
             public void itemStateChanged(ItemEvent e)
              {
                  if (e.getSource() == de4) {
                  ver4=de4.getSelectedItem().toString();
              }
            }
         });
         num9=new JLabel("4.");
         num9.setFont(font2);
         JPanel uni4=new JPanel();
         num9.setForeground(Color.blue);
         uni4.add(num9);
         uni4.add(de4);
         uni4.setBounds(420,380,200,35);
         de5=new JComboBox(s2);
         de5.addItemListener(new ItemListener(){
             public void itemStateChanged(ItemEvent e)
              {
                  if (e.getSource() == de5) {
                  ver5=de5.getSelectedItem().toString();
              }
            }
         });
         num10=new JLabel("5.");
         num10.setFont(font2);
         JPanel uni5=new JPanel();
         num10.setForeground(Color.blue);
         uni5.add(num10);
         uni5.add(de5);
         uni5.setBounds(420,420,200,35);
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                frame.dispose();
            }
        });
        submit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new sure(datapass,name,phoneNum,sub1,sub2,sub3,sub4,sub5,ver1,ver2,ver3,ver4,ver5);
          }
        });
        frame.add(dept1);
        frame.add(dept2);
        frame.add(dept3);
        frame.add(dept4);
        frame.add(dept5);
        frame.add(uni1);
        frame.add(uni2);
        frame.add(uni3);
        frame.add(uni4);
        frame.add(uni5);
        frame.add(subLabel);
        frame.add(uniLabel);
        frame.add(submit);
        frame.add(back);
        frame.add(power);
        frame.setSize(930,550);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
}
class resultShow{
    resultShow(String name,String datapass){
        JFrame frame=new JFrame("Bangladesh Institue of Technology (Student Portal)");
        ImageIcon background = new ImageIcon("C:\\Users\\Asus\\Desktop\\Java Files\\University Admission Management System\\image\\stures.png");
       Image image=background.getImage();
       image.getScaledInstance(500,320, 0);
       frame.setContentPane(new ImagePanel(image));
        ImageIcon icon=new ImageIcon("C:\\Users\\Asus\\Desktop\\Java Files\\University Admission Management System\\image\\BIT_Logo.png");
        frame.setIconImage(icon.getImage());
        String url="jdbc:mysql://localhost:3306/University_Management";
        String password=datapass;
        String user="root";
        String Campus="",Department="",sql;
        JLabel one=new JLabel("Congratulations");
        JLabel two=new JLabel("Sorry,You were not selected");
        JLabel uni,dept,p;
        Font font=new Font("Arial",Font.BOLD,25);
        Font f2=new Font("Arial",Font.BOLD,16);
        one.setBounds(330, 100, 200, 60);
        one.setFont(font);
        one.setForeground(Color.green);
        two.setBounds(260, 230, 400, 60);
        two.setFont(font);
        two.setForeground(Color.red);
        JButton back=new JButton("Back");
        back.setBounds(420,460, 80, 30);
        int pos=0;
        try(Connection conn = DriverManager.getConnection(url,user,password);
            Statement stmt = conn.createStatement();
            ) {
                ResultSet rs;
                sql="select Position,Campus,Department from result where Name='"+name+"';";
                rs=stmt.executeQuery(sql);
                while(rs.next()){
                    pos=rs.getInt("Position");
                    Campus=rs.getString("Campus");
                    Department=rs.getString("Department");
                }
            if(!(Campus.equals("BIT,Dhaka")|| Campus.equals("BIT,Chittagong")||Campus.equals("BIT,Khulna")||Campus.equals("BIT,Sylhet")||Campus.equals("BIT,Rajshahi"))){
            frame.add(two);
        }
        else{
                uni=new JLabel("You have been selected in "+Campus);
                dept=new JLabel("Department of "+Department);
                p=new JLabel("Merit Position: "+pos);
                Font f3=new Font("Arial",Font.BOLD,20);
                Font f4=new Font("Arial",Font.BOLD,17);
             p.setForeground(Color.white);
            frame.add(one);
            uni.setFont(f3);
            p.setFont(f4);
            dept.setFont(f4);
            uni.setBounds(180,200,400,50);
            uni.setForeground(Color.white);
            dept.setBounds(180,250,400,50);
            p.setBounds(180, 300, 400, 50);
            dept.setForeground(Color.white);
            frame.add(uni);
            frame.add(dept);
            frame.add(p);
        }
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                frame.dispose();
            }
        });
        frame.add(back);
        frame.setSize(930, 550);
        frame.setLayout(null);
        frame.setVisible(true);  
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
             }catch (Exception x) {
                JOptionPane.showMessageDialog(null,"Result is not Published yet");
                x.printStackTrace();
                }
    }
}
class studentPanel{
    studentPanel(String datapass,String name,String stuPass){
        JFrame frame=new JFrame("Bangladesh Institue of Technology (Student Portal)");
        ImageIcon background = new ImageIcon("C:\\Users\\Asus\\Desktop\\Java Files\\University Admission Management System\\image\\student.png");
       Image image=background.getImage();
       image.getScaledInstance(500,320, 0);
       frame.setContentPane(new ImagePanel(image));
        ImageIcon icon=new ImageIcon("C:\\Users\\Asus\\Desktop\\Java Files\\University Admission Management System\\image\\BIT_Logo.png");
        frame.setIconImage(icon.getImage());
        JLabel power=new JLabel("Powered by Dept. of  CSE, BIT-Dhaka");
        JButton back=new JButton("Back");
        JLabel n=new JLabel(name);
        Font font=new Font("Arial",Font.BOLD,13);
        power.setFont(font);
        power.setForeground(Color.white);
        power.setBounds(350,440,400,100);
        frame.setSize(930,550);
        back.setBounds(770,470, 100, 30);
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                frame.dispose();
            }
        });
        String url="jdbc:mysql://localhost:3306/University_Management";
        String password=datapass;
        String user="root";
        String sql,u_mail="",u_board="";
        int num=0;
        float sGpa=0,hGpa=0;
        try(Connection conn = DriverManager.getConnection(url,user,password);
            Statement stmt = conn.createStatement();
            ) {
                ResultSet rs;
                sql="select *from student_info where name='"
                        +name+"' and password='"+stuPass+"';";
                rs=stmt.executeQuery(sql);
                while(rs.next()){
                    u_mail=rs.getString("Email");
                    u_board=rs.getString("Board");
                    sGpa=rs.getFloat("GPA_SSC");
                    hGpa=rs.getFloat("GPA_HSC");
                    num=rs.getInt("MobileNumber");
                }
             }catch (Exception x) {
                JOptionPane.showMessageDialog(null,"Error 404 not found");
                x.printStackTrace();
                }
        String phoneNum=String.valueOf(num);
        JLabel sMail=new JLabel(u_mail);
        JLabel sBoard=new JLabel(u_board);
        Font nameFont=new Font("Arial",Font.BOLD,20);
        JLabel sName=new JLabel(name);
        sName.setForeground(Color.white);
        sName.setFont(nameFont);
        sName.setBounds(250,70,300,50);
        JLabel sNum=new JLabel("0"+String.valueOf(num));
        JLabel ssGpa=new JLabel(String.valueOf(sGpa));
        JLabel shGpa=new JLabel(String.valueOf(hGpa));
        JLabel nMail=new JLabel("E-Mail: ");
        JLabel nNum=new JLabel("Phone Number: ");
        JLabel nBoard=new JLabel("Board: ");
        JLabel nsGpa=new JLabel("SSC GPA: ");
        JLabel nhGpa=new JLabel("HSC GPA: ");
        JPanel nbPanel=new JPanel();
        JLabel nbLabel=new JLabel("NB: Enter your University and Subject Choice List Before"
                + " the Closing Date.");
        nbPanel.setBounds(230, 410,500,50);
        nbPanel.setBackground(Color.red);
        Font nfont=new Font("Arial",Font.BOLD,16);
        Font nbfont=new Font("Arial",Font.BOLD,13);
        nbLabel.setFont(nbfont);
        nbLabel.setForeground(Color.white);
        nbPanel.add(nbLabel);
        nMail.setBounds(250,310,100,30);
        nMail.setForeground(Color.white);
        nMail.setFont(nfont);
        sMail.setBounds(320, 310, 250, 30);
        sMail.setForeground(Color.white);
        sMail.setFont(nfont);
        nBoard.setBounds(250,150,100,30);
        nBoard.setFont(nfont);
        nBoard.setForeground(Color.white);
        sBoard.setBounds(320,150,250,30);
        sBoard.setForeground(Color.white);
        sBoard.setFont(nfont);
        nsGpa.setBounds(250,190,100,30);
        nsGpa.setFont(nfont);
        nsGpa.setForeground(Color.white);
        ssGpa.setBounds(340,190,250,30);
        ssGpa.setForeground(Color.white);
        ssGpa.setFont(nfont);
        nhGpa.setBounds(250,230,100,30);
        nhGpa.setFont(nfont);
        nhGpa.setForeground(Color.white);
        shGpa.setBounds(340,230,250,30);
        shGpa.setForeground(Color.white);
        shGpa.setFont(nfont);
        nNum.setBounds(250,270,150,30);
        nNum.setFont(nfont);
        nNum.setForeground(Color.white);
        sNum.setBounds(380,270,250,30);
        sNum.setForeground(Color.white);
        sNum.setFont(nfont);
        JButton choice=new JButton("Selection Panel");
        JButton viewResult=new JButton("View Result");
        choice.setBounds(30,200,150,30);
        viewResult.setBounds(30,260,150,30);
       choice.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               new selectUni(datapass,name,phoneNum);
           }
       });
       viewResult.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               new resultShow(name,datapass);
           }
       });
        frame.add(choice);
        frame.add(viewResult);
        frame.add(nbPanel);
        frame.add(sNum);
        frame.add(nNum);
        frame.add(nhGpa);
        frame.add(shGpa);
        frame.add(nsGpa);
        frame.add(ssGpa);
        frame.add(sBoard);
        frame.add(nBoard);
        frame.add(sName);
        frame.add(sMail);
        frame.add(nMail);
        frame.add(back);
        frame.add(power);
        frame.setLayout(null);
        frame.setVisible(true);  
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
}
class Registration{
    JLabel l1, l2, l3, l4, l5, l6, l7, l8,l9,l10,l11;  
    JTextField tf1, tf2, tf5, tf6, tf7,tf8,tf9;  
    JButton btn1, btn2,btn3;  
    JPasswordField p1, p2;  
    Registration(String datapass)  
    {  
        JFrame frame=new JFrame("Bangladesh Institute of Technology (Student Registration)");
        ImageIcon icon=new ImageIcon("C:\\Users\\Asus\\Desktop\\Java Files\\University Admission Management System\\image\\BIT_Logo.png");
        frame.setIconImage(icon.getImage());
        frame.setVisible(true);  
        frame.setSize(600, 600);  
        frame.setLayout(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
        l1 = new JLabel("New Student Registration:");  
        JLabel power=new JLabel("Powered by Dept. of  CSE, BIT-Dhaka");
        power.setForeground(Color.BLUE);
        power.setBounds(160,490,400,100);
        l1.setForeground(Color.blue);  
        l1.setFont(new Font("Serif", Font.BOLD, 20));  
        l2 = new JLabel("Name:");  
        l3 = new JLabel("Email-ID:");  
        l4 = new JLabel("Create Passowrd:");  
        l5 = new JLabel("Confirm Password:");  
        l6 = new JLabel("District:");  
        l7 = new JLabel("Board:");  
        l8 = new JLabel("Phone No:"); 
        l9=new JLabel("SSC GPA: ");
        l10=new JLabel("HSC GPA: ");
        tf1 = new JTextField();  
        tf2 = new JTextField();  
        p1 = new JPasswordField();  
        p2 = new JPasswordField();  
        tf5 = new JTextField();  
        tf6 = new JTextField();  
        tf7 = new JTextField();  
        tf8=new JTextField();
        tf9=new JTextField();
        btn1 = new JButton("Submit");  
        btn2 = new JButton("Clear"); 
        btn3=new JButton("Back");
        l1.setBounds(100, 30, 400, 30);  
        l2.setBounds(80, 70, 200, 30);  
        l3.setBounds(80, 110, 200, 30);  
        l4.setBounds(80, 150, 200, 30);  
        l5.setBounds(80, 190, 200, 30);  
        l6.setBounds(80, 230, 200, 30);  
        l7.setBounds(80, 270, 200, 30);  
        l8.setBounds(80, 310, 200, 30); 
        l9.setBounds(80,350,200,30);
        l10.setBounds(80,390,200,30);
        tf1.setBounds(300, 70, 200, 30);  
        tf2.setBounds(300, 110, 200, 30);  
        p1.setBounds(300, 150, 200, 30);  
        p2.setBounds(300, 190, 200, 30);  
        tf5.setBounds(300, 230, 200, 30);  
        tf6.setBounds(300, 270, 200, 30);  
        tf7.setBounds(300, 310, 200, 30); 
        tf8.setBounds(300,350,200,30);
        tf9.setBounds(300,390,200,30);
        btn1.setBounds(200, 450, 100, 30);  
        btn2.setBounds(80, 450, 100, 30); 
        btn3.setBounds(397, 450, 100, 30);
        btn3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                frame.dispose();
            }
        });
        btn2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tf1.setText("");
                tf2.setText("");
                tf5.setText("");
                tf6.setText("");
                tf7.setText("");
                tf8.setText("");
                tf9.setText("");
            }
        });
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                char[] s3 = p1.getPassword();  
                char[] s4 = p2.getPassword();   
                String pword = new String(s3);  
                String passwordCheck = new String(s4);
                if(!(pword.equals(passwordCheck))){
                    JOptionPane.showMessageDialog(null,"Password didn't Match");
                }
                else{
                    String name = tf1.getText();  
                    String email = tf2.getText();    
                    String district = tf5.getText();  
                    String board = tf6.getText();  
                    String phone = tf7.getText(); 
                    String ssc=tf8.getText();
                    Float ssc_gpa = Float.valueOf(ssc).floatValue();
                    String hsc=tf9.getText();
                    Float hsc_gpa = Float.valueOf(hsc).floatValue();
                    String url="jdbc:mysql://localhost:3306/University_Management";
                    String password=datapass;
                    String user="root";
                    String sql;
                    try(Connection conn = DriverManager.getConnection(url,user,password);
                        Statement stmt = conn.createStatement();
                        ) {
                          sql="insert into student_info "
                                  + "values"
                                  + "('"+name+"','"+
                                  pword+"','"+board+"',"+hsc_gpa+
                                  ","+ssc_gpa+","+(hsc_gpa+ssc_gpa)+","+"'"+district+"',"
                                  +phone+",'"+email+"')";
                          stmt.executeUpdate(sql);
                          JOptionPane.showMessageDialog(null,"Profile Created.");
                          frame.dispose();
                        }catch (Exception x) {
                          JOptionPane.showMessageDialog(null,"Error 404 not found");
                          x.printStackTrace();
                        }
                }
            }
        });
        frame.add(l1);  
        frame.add(l2);  
        frame.add(tf1);  
        frame.add(l3);  
        frame.add(tf2);  
        frame.add(l4);  
        frame.add(p1);  
        frame.add(l5);  
        frame.add(p2);  
        frame.add(l6);  
        frame.add(tf5);  
        frame.add(l7);  
        frame.add(tf6);  
        frame.add(l8);  
        frame.add(tf7);
        frame.add(l9);
        frame.add(tf8);
        frame.add(l10);
        frame.add(tf9);
        frame.add(btn1);  
        frame.add(btn2); 
        frame.add(btn3);
        frame.add(power);
        frame.setLocationRelativeTo(null);
    }  
}

class studentLogIn{
    String name="admin",password="admin",nameCont,passCont;
    studentLogIn(String datapass){
        JFrame frame=new JFrame("Bangladesh Institue of Technology");
        JTextField field=new JTextField(30);
        field.setBounds(160, 100, 150, 20);
        JButton login,back,newAcc;
        login=new JButton("Log in");
        back=new JButton("Back");
        newAcc=new JButton("Create new Profile");
        login.setBounds(120,170,70,25);
        login.setBackground(Color.cyan);
        back.setBounds(180,220,70,25);
        back.setBackground(Color.cyan);
        newAcc.setBounds(200, 170, 150, 25);
        newAcc.setBackground(Color.cyan);
        JPasswordField pass=new JPasswordField(30);
         pass.setBounds(160, 130, 150, 20);
         pass.setEchoChar('*');
        ImageIcon icon=new ImageIcon("C:\\Users\\Asus\\Desktop\\Java Files\\University Admission Management System\\image\\BIT_Logo.png");
        frame.setIconImage(icon.getImage());
        frame.setSize(450,300);
        Font font=new Font("Arial",Font.BOLD,13);
        JLabel labeluser=new JLabel("Student's Name:");
        labeluser.setFont(font);
        JLabel labelpass=new JLabel("Password:");
        labelpass.setFont(font);
        labeluser.setBounds(50,100,120, 20);
        labelpass.setBounds(80, 130, 80, 20);
        frame.add(labeluser);
        frame.add(back);
        frame.add(newAcc);
        frame.add(login);
        frame.add(pass);
        frame.add(labelpass);
        frame.add(field);
        login.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                nameCont=field.getText();
                char[] op=pass.getPassword();
                passCont=new String(op);
                String url="jdbc:mysql://localhost:3306/University_Management";
                    String password=datapass;
                    String user="root";
                    String sql;
                    String n="default",p="default";
                    try(Connection conn = DriverManager.getConnection(url,user,password);
                        Statement stmt = conn.createStatement();
                        ) {
                          ResultSet rs;
                          sql="select Name,password from student_info where name='"+
                                  nameCont+"'and password='"+passCont+"'";
                          rs=stmt.executeQuery(sql);
                          while(rs.next()){
                              n=rs.getString("Name");
                              p=rs.getString("password");
                          }
                          if(nameCont.equals(n) && passCont.equals(p)){
                              JOptionPane.showMessageDialog(null,"Log in Successful.");
                              frame.dispose();
                              new studentPanel(datapass,nameCont,passCont);
                          }
                          else{
                              JOptionPane.showMessageDialog(null,"No Profile Found!");    
                          }
                        }catch (Exception x) {
                          JOptionPane.showMessageDialog(null,"Error 404 not found");
                          x.printStackTrace();
                        }
            }
        });
        newAcc.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new Registration(datapass);
            }
        });
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                frame.dispose();
            }
        });
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public class StudentPortal {
    StudentPortal(String datapass){
        new studentLogIn(datapass);
    }
}
