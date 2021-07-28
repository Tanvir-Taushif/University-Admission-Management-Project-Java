package university.admission.management.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class result{
    int cse,eee,civil,ch,mecha;
    int cseDhaka,eeeDhaka,civilDhaka,chDhaka,mechaDhaka,
        cseChit,eeeChit,civilChit,chChit,mechaChit,
        cseSyl,eeeSyl,civilSyl,chSyl,mechaSyl,
        cseKhul,eeeKhul,civilKhul,chKhul,mechaKhul,
        cseRaj,eeeRaj,civilRaj,chRaj,mechaRaj;
            String name="",number="",Department_Name="",Uni_name="";
            float gpa;
            String nameCont[]=new String[200];
            float gpaCont[]=new float[200];
            String numCont[]=new String[200];
            String deptCont[]=new String[5];
            String branchCont[]=new String[5];
            int i=0;
    String resultTable(String name,String[] dept,String[] branch,float gpa,int position){
        String selectDept="",selectBranch="";
       for(int k=0;k<5;k++){
           if(dept[k].equals("Computer Science & Engineering") && cse!=0){
               cse--;
               selectDept="Computer Science & Engineering";
               for(int j=0;j<5;j++){
                   if(branch[j].equals("BIT,Dhaka") && cseDhaka!=0){
                       cseDhaka--;
                       selectBranch="BIT,Dhaka";
                       break;
                   }
                   else if(branch[j].equals("BIT,Khulna") && cseKhul!=0){
                       cseKhul--;
                       selectBranch="BIT,Khulna";
                       break;
                   }
                   else if(branch[j].equals("BIT,Chittagong") && cseChit!=0){
                       cseChit--;
                       selectBranch="BIT,Chittagong";
                       break;
                   }
                   else if(branch[j].equals("BIT,Sylhet") && cseSyl!=0){
                       cseSyl--;
                       selectBranch="BIT,Sylhet";
                       break;
                   }
                   else if(branch[j].equals("BIT,Rajshahi") && cseRaj!=0){
                       cseRaj--;
                       selectBranch="BIT,Rajshahi";
                       break;
                   }
               }
               break;
           }
           else if(dept[k].equals("Electrical & Electronics Engineering") && eee!=0){
               eee--;
               selectDept="Electrical & Electronics Engineering";
               for(int j=0;j<5;j++){
                   if(branch[j].equals("BIT,Dhaka") && eeeDhaka!=0){
                       eeeDhaka--;
                       selectBranch="BIT,Dhaka";
                       break;
                   }
                   else if(branch[j].equals("BIT,Khulna") && eeeKhul!=0){
                       eeeKhul--;
                       selectBranch="BIT,Khulna";
                       break;
                   }
                   else if(branch[j].equals("BIT,Chittagong") && eeeChit!=0){
                       eeeChit--;
                       selectBranch="BIT,Chittagong";
                       break;
                   }
                   else if(branch[j].equals("BIT,Sylhet") && eeeSyl!=0){
                       eeeSyl--;
                       selectBranch="BIT,Sylhet";
                       break;
                   }
                   else if(branch[j].equals("BIT,Rajshahi") && eeeRaj!=0){
                       eeeRaj--;
                       selectBranch="BIT,Rajshahi";
                       break;
                   }
               }
               break;
           }
           else if(dept[k].equals("Mechanical Engineering") && mecha!=0){
               mecha--;
               selectDept="Mechanical Engineering";
               for(int j=0;j<5;j++){
                   if(branch[j].equals("BIT,Dhaka") && mechaDhaka!=0){
                       mechaDhaka--;
                       selectBranch="BIT,Dhaka";
                       break;
                   }
                   else if(branch[j].equals("BIT,Khulna") && mechaKhul!=0){
                       mechaKhul--;
                       selectBranch="BIT,Khulna";
                       break;
                   }
                   else if(branch[j].equals("BIT,Chittagong") && mechaChit!=0){
                       mechaChit--;
                       selectBranch="BIT,Chittagong";
                       break;
                   }
                   else if(branch[j].equals("BIT,Sylhet") && mechaSyl!=0){
                       mechaSyl--;
                       selectBranch="BIT,Sylhet";
                       break;
                   }
                   else if(branch[j].equals("BIT,Rajshahi") && mechaRaj!=0){
                       mechaRaj--;
                       selectBranch="BIT,Rajshahi";
                       break;
                   }
               }
               break;
           }
           else if(dept[k].equals("Civil Engineering") && civil!=0){
               civil--;
               selectDept="Civil Engineering";
               for(int j=0;j<5;j++){
                   if(branch[j].equals("BIT,Dhaka") && civilDhaka!=0){
                       civilDhaka--;
                       selectBranch="BIT,Dhaka";
                       break;
                   }
                   else if(branch[j].equals("BIT,Khulna") && civilKhul!=0){
                       civilKhul--;
                       selectBranch="BIT,Khulna";
                       break;
                   }
                   else if(branch[j].equals("BIT,Chittagong") && civilChit!=0){
                       civilChit--;
                       selectBranch="BIT,Chittagong";
                       break;
                   }
                   else if(branch[j].equals("BIT,Sylhet") && civilSyl!=0){
                       civilSyl--;
                       selectBranch="BIT,Sylhet";
                       break;
                   }
                   else if(branch[j].equals("BIT,Rajshahi") && civilRaj!=0){
                       civilRaj--;
                       selectBranch="BIT,Rajshahi";
                       break;
                   }
               }
               break;
           }
           else if(dept[k].equals("Chemical Engineering") && ch!=0){
               ch--;
               selectDept="Chemical Engineering";
               for(int j=0;j<5;j++){
                   if(branch[j].equals("BIT,Dhaka") && chDhaka!=0){
                       chDhaka--;
                       selectBranch="BIT,Dhaka";
                       break;
                   }
                   else if(branch[j].equals("BIT,Khulna") && chKhul!=0){
                       chKhul--;
                       selectBranch="BIT,Khulna";
                       break;
                   }
                   else if(branch[j].equals("BIT,Chittagong") && chChit!=0){
                       chChit--;
                       selectBranch="BIT,Chittagong";
                       break;
                   }
                   else if(branch[j].equals("BIT,Sylhet") && chSyl!=0){
                       chSyl--;
                       selectBranch="BIT,Sylhet";
                       break;
                   }
                   else if(branch[j].equals("BIT,Rajshahi") && chRaj!=0){
                       chRaj--;
                       selectBranch="BIT,Rajshahi";
                       break;
                   }
               }
               break;
           }
       } 
      return "insert into result "
              + "values "
              + "("+position+",'"+name+"',"+gpa+",'"+selectBranch+"','"+selectDept+"');";
    }
    result(String datapass,int num){
        cse=num;
        eee=num;
        civil=num;
        ch=num;
        mecha=num;
        cseDhaka=num/5;eeeDhaka=num/5;civilDhaka=num/5;chDhaka=num/5;mechaDhaka=num/5;
        cseChit=num/5;eeeChit=num/5;civilChit=num/5;chChit=num/5;mechaChit=num/5;
        cseSyl=num/5;eeeSyl=num/5;civilSyl=num/5;chSyl=num/5;mechaSyl=num/5;
        cseKhul=num/5;eeeKhul=num/5;civilKhul=num/5;chKhul=num/5;mechaKhul=num/5;
        cseRaj=num/5;eeeRaj=num/5;civilRaj=num/5;chRaj=num/5;mechaRaj=num/5;
        String url="jdbc:mysql://localhost:3306/University_Management";
        String password=datapass;
        String user="root",sql;
        String updates[]=new String[200];
        float gpagot=0;
        try(Connection conn = DriverManager.getConnection(url,user,password);
            Statement stmt = conn.createStatement();){
            sql="create table result "
                    + "(Position int,"
                    + " Name varchar(30), "
                    + "Total_GPA float, "
                    + "Campus varchar(20), "
                    + "Department varchar(50));";
            stmt.executeUpdate(sql);
            ResultSet rs;
            sql="select gpa from dept_gpa;";
            rs=stmt.executeQuery(sql);
            while(rs.next()){
                gpagot=rs.getFloat("gpa");
            }
            sql="select Name,GPA_Total,MobileNumber from student_info order by GPA_Total desc;";
            rs=stmt.executeQuery(sql);
            i=0;
            while(rs.next()){
                name=rs.getString("Name");
                gpa=rs.getFloat("GPA_Total");
                number=String.valueOf(rs.getInt("MobileNumber"));
                nameCont[i]=name;
                gpaCont[i]=gpa;
                numCont[i]=number;
                i++;
            }
            for(int x=0;x<i;x++){
                sql="select Dept_Name from "+numCont[x]+"sub;";
                rs=stmt.executeQuery(sql);
                int p=0;
                while(rs.next()){
                    Department_Name=rs.getString("Dept_Name");
                    deptCont[p]=Department_Name;
                    p++;
                }
                sql="select Uni_name from "+numCont[x]+"uni";
                rs=stmt.executeQuery(sql);
                int q=0;
                while(rs.next()){
                   Uni_name=rs.getString("Uni_name");
                   branchCont[q]=Uni_name;
                   q++;
                }
                if(gpaCont[x]>=gpagot){
                    sql=resultTable(nameCont[x],deptCont,branchCont,gpaCont[x],(x+1));
                   stmt.executeUpdate(sql);
                }
            }
            conn.close();
            JOptionPane.showMessageDialog(null,"Result Published");
            }catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Result already Published for this session");
                e.printStackTrace();
            }
    }
            
}
class Info{
    Info(String datapass){
        String[][] tableData=new String[200][5];
        String [][] resultData=new String[200][5];
        String column []={"Name","Board","Total Gpa","Email","Phone Number"};
        String resultColumn[]={"Positon","Name","Total GPA","Campus","Department"};
        JFrame frame=new JFrame("Bangladesh Institue of Technology-Admin Portal");
       ImageIcon background = new ImageIcon("C:\\Users\\Asus\\Desktop\\Java Files\\University Admission Management System\\image\\result2.png");
       Image image=background.getImage();
       image.getScaledInstance(500,320, 0);
       frame.setContentPane(new ImagePanel(image));
        frame.setSize(1067,628);
        ImageIcon icon=new ImageIcon("C:\\Users\\Asus\\Desktop\\Java Files\\University Admission Management System\\image\\BIT_Logo.png");
        frame.setIconImage(icon.getImage());
        Font font=new Font("Arial",Font.BOLD,22);
        Font font2=new Font("Arial",Font.BOLD,15);
        JLabel power=new JLabel("Powered by Dept. of  CSE, BIT-Dhaka");
        power.setForeground(Color.white);
        power.setBounds(360,510,400,100);
        power.setFont(font2);
        JButton back=new JButton("Back");
        back.setBounds(940, 520, 75, 30);
        JButton refresh=new JButton("Refresh");
        refresh.setBounds(928,470,100,30);
        JButton button=new JButton("Click to view Students' Information.");
        JButton button2=new JButton("Click to view Result");
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                frame.dispose();
            }
        });
        refresh.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                frame.dispose();
                new Info(datapass);
            }
        });
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
        String url="jdbc:mysql://localhost:3306/University_Management";
        String password=datapass;
        String user="root";
        String sql,name="",email="",board="";
        int phoneNumber;
        float totalGpa;
        try(Connection conn = DriverManager.getConnection(url,user,password);
            Statement stmt = conn.createStatement();
            ) {
                int x=0;
                ResultSet rs;
                sql="select *from student_info order by GPA_Total desc;";
                rs=stmt.executeQuery(sql);
                while(rs.next()){
                    name=rs.getString("Name");
                    email=rs.getString("Email");
                    board=rs.getString("Board");
                    phoneNumber=rs.getInt("MobileNumber");
                    totalGpa=rs.getFloat("GPA_Total");
                    tableData[x][0]=name;
                    tableData[x][1]=board;
                    tableData[x][2]=String.valueOf(totalGpa);
                    tableData[x][3]=email;
                    tableData[x][4]="0"+String.valueOf(phoneNumber);
                    x++;
                }
             }catch (Exception x) {
                JOptionPane.showMessageDialog(null,"Data not found");
                x.printStackTrace();
                }
                JTable jt=new JTable(tableData,column);
                jt.setBounds(83,200,780,320);
                JScrollPane sp=new JScrollPane(jt);    
                sp.setBounds(83, 200, 780, 320);
                frame.add(sp);
            }
        });
        button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
        String url="jdbc:mysql://localhost:3306/University_Management";
        String password=datapass;
        String user="root";
        String sql,name="",gpa="",position="",campus="",department="";
        float totalGpa;
        try(Connection conn = DriverManager.getConnection(url,user,password);
            Statement stmt = conn.createStatement();
            ) {
                int x=0;
                ResultSet rs;
                sql="select *from result;";
                rs=stmt.executeQuery(sql);
                while(rs.next()){
                    name=rs.getString("Name");
                    campus=rs.getString("Campus");
                    department=rs.getString("Department");
                    position=String.valueOf(rs.getInt("Position"));
                    totalGpa=rs.getFloat("Total_GPA");
                    resultData[x][0]=position;
                    resultData[x][1]=name;
                    resultData[x][2]=String.valueOf(totalGpa);
                    resultData[x][3]=campus;
                    resultData[x][4]=department;
                    x++;
                }
                JTable jt2=new JTable(resultData,resultColumn);
                jt2.setBounds(83,200,780,320);
                JScrollPane sp=new JScrollPane(jt2);    
                sp.setBounds(83,200,780,320);
                frame.add(sp);
             }catch (Exception p) {
                JOptionPane.showMessageDialog(null,"Result not published yet");
                p.printStackTrace();
                }
            }
        });
        button.setBounds(150, 100,300, 30);
        button2.setBounds(470,100,300,30);
        frame.add(button);
        frame.add(button2);
        frame.add(refresh);
        frame.add(back);
        frame.add(power);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class controlPanel{
    controlPanel(String datapass){
         JFrame frame=new JFrame("Bangladesh Institue of Technology-Admin Portal");
         ImageIcon background = new ImageIcon("C:\\Users\\Asus\\Desktop\\Java Files\\University Admission Management System\\image\\admin.png");
         Image image=background.getImage();
         image.getScaledInstance(500,320, 0);
         frame.setContentPane(new ImagePanel(image));
         frame.setSize(920,550);
         ImageIcon icon=new ImageIcon("C:\\Users\\Asus\\Desktop\\Java Files\\University Admission Management System\\image\\BIT_Logo.png");
         frame.setIconImage(icon.getImage());
         String s1[] = { "Select Branch","BIT,Dhaka", "BIT,Chittagong", "BIT,Khulna", "BIT,Rajshahi", "BIT,Sylhet" };
        JLabel gpa=new JLabel("Minimun required GPA: ");
        JLabel power=new JLabel("Powered by Dept. of  CSE, BIT-Dhaka");
        JTextField field=new JTextField(30);
        JButton update=new JButton("Update");
        JButton info=new JButton("Students' Information");
        JButton pub=new JButton("Publish Result");
        JButton back=new JButton("Back");
        back.setBounds(440, 430, 75, 30);
        power.setForeground(Color.white);
        power.setBounds(370,445,400,100);
        Font font=new Font("Arial",Font.BOLD,18);
        pub.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String url="jdbc:mysql://localhost:3306/University_Management";
                String password=datapass;
                String user="root",sql;
                int stu=0;
                try(Connection conn = DriverManager.getConnection(url,user,password);
                Statement stmt = conn.createStatement();
                ) {
                   sql="select student from dept_gpa";
                   ResultSet rs;
                   rs=stmt.executeQuery(sql);
                   while(rs.next()){
                       stu=rs.getInt("student");
                   }
             }catch (Exception x) {
                JOptionPane.showMessageDialog(null,"You have already updated");
                x.printStackTrace();
                }
                new result(datapass,stu);
            }
        });
        gpa.setFont(font);
        gpa.setForeground(Color.white);
        gpa.setBounds(260, 250, 300, 30);
        info.setBounds(43,225,180,30);
        pub.setBounds(43,300,180,30);
        JTextField field2=new JTextField(30);
        JLabel lab2=new JLabel("Student per Dept. :");
        lab2.setFont(font);
        lab2.setForeground(Color.white);
        lab2.setBounds(260,150, 200, 30);
        field2.setBounds(500,150,100,30);
        field.setBounds(500, 250, 100, 30);
        update.setBounds(440, 360, 75, 30);
        back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                frame.dispose();
            }
        });
        info.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new Info(datapass);
            }
        });
        update.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Float gp=Float.valueOf(field.getText().toString());
                int stu=5*Integer.valueOf(field2.getText().toString());
                String url="jdbc:mysql://localhost:3306/University_Management";
                String password=datapass;
                String user="root";
                String sql,name="",email="",board="";
                try(Connection conn = DriverManager.getConnection(url,user,password);
                Statement stmt = conn.createStatement();
                ) {
                   sql="insert into dept_gpa "
                           + "values"
                           + " ("+stu+","+gp+");";
                   stmt.executeUpdate(sql);
                   JOptionPane.showMessageDialog(null,"Updated");
             }catch (Exception x) {
                JOptionPane.showMessageDialog(null,"You have already updated");
                x.printStackTrace();
                }
            }
        });
        frame.add(lab2);
        frame.add(info);
        frame.add(field2);
        frame.add(pub);
        frame.add(back);
        frame.add(update);
        frame.add(field);
        frame.add(gpa);
        frame.add(power);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class LogIn{
    String name="admin",password="admin",nameCont,passCont;
    LogIn(String datapass){
        JFrame frame=new JFrame("Bangladesh Institue of Technology");
        JTextField field=new JTextField(30);
        field.setBounds(160, 100, 150, 20);
        JButton login,back;
        login=new JButton("Log in");
        back=new JButton("Back");
        login.setBounds(135,170,70,25);
        login.setBackground(Color.cyan);
        back.setBounds(240,170,70,25);
        back.setBackground(Color.cyan);
        JPasswordField pass=new JPasswordField(30);
         pass.setBounds(160, 130, 150, 20);
         pass.setEchoChar('*');
        ImageIcon icon=new ImageIcon("C:\\Users\\Asus\\Desktop\\Java Files\\University Admission Management System\\image\\BIT_Logo.png");
        frame.setIconImage(icon.getImage());
        frame.setSize(450,300);
        Font font=new Font("Arial",Font.BOLD,13);
        JLabel labeluser=new JLabel("User Name:");
        labeluser.setFont(font);
        JLabel labelpass=new JLabel("Password:");
        labelpass.setFont(font);
        labeluser.setBounds(80,100,80, 20);
        labelpass.setBounds(80, 130, 80, 20);
        frame.add(labeluser);
        frame.add(back);
        frame.add(login);
        frame.add(pass);
        frame.add(labelpass);
        frame.add(field);
        login.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                nameCont=field.getText();
                char[] op=pass.getPassword();
                passCont=new String(op);
                if(name.equals(nameCont) && password.equals(passCont)){
                    frame.dispose();
                    new controlPanel(datapass);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Wrong Input.");
                }
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
public class AdminPortal {
    AdminPortal(String datapass){
       new LogIn(datapass);
    }
}
