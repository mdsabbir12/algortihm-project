import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

public class Newstudent extends JFrame implements ActionListener {
    private Container c;
    int flag=0;
    private JTextArea tr,tr1;
    private  JButton home ,nstd,hfee,dcpln,fmenu,logout;
    private ImageIcon icon,img;
    private JLabel image,headline,headline1,welcome;
    private JPanel panel,panel1,panel3,panel4;
    private JLabel title,username,passward,id,text1,text2;
    private JTextField pass,uname,idf;
    private JButton login;

    private Font f1,f2,f3,f4,f5,f6;
    Newstudent(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1500, 1000);
        setTitle("Course Advising");
        body();
    }

    public void body(){

        c=getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);

        panel=new JPanel();
        panel.setBounds(0,0,1500,110);
        panel.setBackground(new Color(221,255,255));
        panel.setLayout(null);
        c.add(panel);

        panel1=new JPanel();
        panel1.setBounds(20,130,200,550);
        panel1.setBackground(Color.lightGray);
        panel1.setLayout(null);
        c.add(panel1);




        f1=new Font("Arial",Font.PLAIN,18);
        f2=new Font("Arial",Font.PLAIN+Font.BOLD,18);
        f3=new Font("Arial",Font.BOLD+Font.ITALIC,32);
        f4=new Font("Arial",Font.ITALIC,34);
        f5=new Font("Arial",Font.ITALIC,34);
        f6=new Font("Arial",Font.PLAIN,30);

        icon=new ImageIcon("Untitled(1).png");
        setIconImage(icon.getImage());
        img=new ImageIcon("gub.png");
        image=new JLabel(img);
        image.setBounds(100,0,100,100);
        panel.add(image);

        headline=new JLabel();
        headline.setText("Green");
        headline.setBounds(240,35,100,30);
        headline.setFont(f3);
        headline.setForeground(new Color(6,161,11));
        panel.add(headline);

        headline1=new JLabel();
        headline1.setText("University of Bangladesh");
        headline1.setBounds(350,35,400,30);
        headline1.setFont(f3);
        headline1.setForeground(new Color(0,204,204));
        panel.add(headline1);


        panel3=new JPanel();
        panel3.setBounds(430,170,500,400);
        panel3.setBackground(Color.WHITE);
        panel3.setLayout(null);
        c.add(panel3);

        title=new JLabel();
        title.setBounds(150,15,230,100);
        title.setText("Course Advising");
        title.setFont(f6);
        panel3.add(title);


        username=new JLabel();
        username.setBounds(40,95,75,75);
        username.setText("Name");
        username.setFont(f2);
        panel3.add(username);

        id=new JLabel();
        id.setBounds(40,162,75,75);
        id.setText("Id");
        id.setFont(f2);
        panel3.add( id);

        passward=new JLabel();
        passward.setText("Semester");
        passward.setBounds(40,240,100,50);
        passward.setFont(f2);
        panel3.add(passward);

        panel4=new JPanel();
        panel4.setBounds(930,130,450,550);
        panel4.setBackground(Color.GRAY);
        panel4.setLayout(null);
        c.add(panel4);

        text1=new JLabel();
        text1.setBounds(150,30,150,50);
        text1.setText("Advising Course");
        text1.setForeground(Color.WHITE);
        text1.setFont(f2);
        panel4.add(text1);

        tr=new JTextArea();
        tr.setBounds(20,70,410,260);
        tr.setLineWrap(true);
        tr.setWrapStyleWord(true);
        tr.setBackground(Color.white);
        panel4.add(tr);

        text2=new JLabel();
        text2.setBounds(135,350,180,50);
        text2.setText("Pre-requisite Course");
        text2.setForeground(Color.WHITE);
        text2.setFont(f2);
        panel4.add(text2);

        tr1=new JTextArea();
        tr1.setBounds(20,390,410,130);
        tr1.setBackground(Color.white);
        //tr1.setBorder();
        panel4.add(tr1);



        uname=new JTextField();
        uname.setText("");
        uname.setBounds(150,115,290,35);
        uname.setToolTipText("Enter Your Name");
        uname.setBackground(new Color(255,255,153));
        uname.setFont(f1);
        panel3.add(uname);

        idf=new JTextField();
        idf.setText("");
        idf.setBounds(150,180,290,35);
        idf.setToolTipText("Enter Your Id");
        idf.setBackground(new Color(255,255,153));
        idf.setFont(f1);
        panel3.add(idf);

        pass=new JTextField();
        pass.setText("");
        pass.setBounds(150,245,290,35);
        pass.setBackground(new Color(255,255,153));
        pass.setToolTipText("Enter your Semester");
        pass.setFont(f1);
        panel3.add(pass);



        login=new JButton();
        login.setText("Submit");
        login.setBounds(40,330,400,40);
        login.setForeground(new Color(0,153,76));
        //login.setForeground(Color.WHITE);
        login.setFont(f2);
        panel3.add(login);



        JButton home =new JButton();
        home.setText("Home Page");
        home.setBounds(15,20,170,40);
        home.setForeground(new Color(0,153,76));
        //home.setForeground(Color.WHITE);
        home.setFont(f2);
        panel1.add(home);


        JButton nstd =new JButton();
        nstd.setText("Course Advising");
        nstd.setBounds(15,80,170,40);
        nstd.setForeground(new Color(0,153,76));
        //nstd.setForeground(Color.WHITE);
        nstd.setFont(f2);
        panel1.add(nstd);

        JButton hfee =new JButton();
        hfee.setText("Bill History");
        hfee.setBounds(15,140,170,40);
        hfee.setForeground(new Color(0,153,76));
        //hfee.setForeground(Color.WHITE);
        hfee.setFont(f2);
        panel1.add(hfee);

        JButton dcpln =new JButton();
        dcpln.setText("Result History");
        dcpln.setBounds(15,200,170,40);
        dcpln.setForeground(new Color(0,153,76));
        //dcpln.setForeground(Color.WHITE);
        dcpln.setFont(f2);
        panel1.add(dcpln);


        JButton fmenu =new JButton();
        fmenu.setText("Class Routing");
        fmenu.setBounds(15,260,170,40);
        fmenu.setForeground(new Color(0,153,76));
        //round(Color.GREEN);
        fmenu.setFont(f2);
        panel1.add(fmenu);

        logout=new JButton();
        logout.setText("Log Out");
        logout.setBounds(1200,35,100,40);
        logout.setFont(f2);
        logout.setForeground(Color.WHITE);
        logout.setForeground(new Color(0,153,76));
        panel.add(logout);

        home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Homeframe frame1 =new Homeframe();
                frame1.setVisible(true);
            }
        });
        nstd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Newstudent frame2 =new Newstudent();
                frame2.setVisible(true);
            }
        });


        logout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                hostelportal frame=new hostelportal();
                frame.setVisible(true);
            }
        });
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                tr.setText("");
                tr1.setText("");
                String name =uname.getText();
                int Id= Integer.parseInt(idf.getText());
                int sem = Integer.parseInt(pass.getText());
                Main bf=new Main();


                bf.bfs(0,12);
                db d=new db();
                db2 d1=new db2();
                for(int i=0;i<12;i++)
                {
                    //System.out.println("DDDDD");
                    if(bf.level[i]==sem) {

                        System.out.print(i + " ");


                        try {
                            String a= d1.conect(i);

                            tr.append("\n    "+i+".    "+a +"\n");

                        } catch (ClassNotFoundException ex) {
                            throw new RuntimeException(ex);
                        }

                    }
                }
                if(flag>=1)
                {
                    db dbb=new db();
                    try {
                        String ss=dbb.conect(Id);
                        tr1.append("\n   "+ss+"\n");
                    } catch (ClassNotFoundException ex) {
                        throw new RuntimeException(ex);
                    }
                }

                flag=1;

            }
        });



    }


    public static void main(String[] args) {
        Newstudent frame2 =new Newstudent();
        frame2.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
