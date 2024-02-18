import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Homeframe extends JFrame implements ActionListener {
    private Container c;
    private  JButton home ,nstd,hfee,dcpln,fmenu,logout;
    private ImageIcon icon,img;
    private JLabel image,headline,headline1,welcome;
    private JPanel panel,panel1;

    private Font f1,f2,f3,f4,f5;
    Homeframe(){
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setBounds(0, 0, 1500, 1000);
       setTitle("Home Page");
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


        icon=new ImageIcon("Untitled(1).png");
        setIconImage(icon.getImage());
        img=new ImageIcon("gub.png");
        image=new JLabel(img);
        image.setBounds(100,0,100,100);
        panel.add(image);

        headline=new JLabel();
        headline.setText("Green");
        headline.setBounds(240,35,100,40);
        headline.setFont(f3);
        headline.setForeground(new Color(6,161,11));
        panel.add(headline);

        headline1=new JLabel();
        headline1.setText("University of Bangladesh");
        headline1.setBounds(350,35,400,40);
        headline1.setFont(f3);
        headline1.setForeground(new Color(0,204,204));
        panel.add(headline1);


        welcome=new JLabel();
        welcome.setText("Welcome to GUB Student Portal");
        welcome.setBounds(500,150,500,30);
        welcome.setFont(f4);
        welcome.setForeground(Color.BLACK);
        c.add(welcome);



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
        //logout.setForeground(Color.WHITE);
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


    }


    public static void main(String[] args) {
        Homeframe frame1 =new Homeframe();
        frame1.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
