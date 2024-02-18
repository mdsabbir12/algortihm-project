import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class hostelportal extends JFrame implements ActionListener{
    private Container c;
    private ImageIcon icon,img;
    private JLabel username,passward,border,image,headline,headline1,title;
    private JTextField uname;
    private JPasswordField pass;
    private Font f1,f2,f3,f4,f5;
    private JPanel panel;
    private  JButton login;

    hostelportal()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0, 0, 1500, 1000);
        setTitle("Login Page");
        initconponent();
    }
    public void initconponent()
    {

        c=getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);

        f1=new Font("Arial",Font.PLAIN,18);
        f2=new Font("Arial",Font.BOLD,20);
        f3=new Font("Arial",Font.BOLD+Font.ITALIC,28);
        f4=new Font("Arial",Font.ITALIC,34);
        f5=new Font("Arial",Font.ITALIC,34);


        icon=new ImageIcon("Untitled(1).png");
        setIconImage(icon.getImage());
        img=new ImageIcon("Untitled(1).png");
        image=new JLabel(img);
        image.setBounds(400,40,100,100);
        c.add(image);

        headline=new JLabel();
        headline.setText("Green");
        headline.setBounds(520,80,90,30);
        headline.setFont(f3);
        headline.setForeground(new Color(0,153,76));
        c.add(headline);

        headline1=new JLabel();
        headline1.setText("University of Bangladesh");
        headline1.setBounds(620,80,340,30);
        headline1.setFont(f3);
        headline1.setForeground(new Color(0,204,204));
        c.add(headline1);



        panel=new JPanel();
        panel.setBounds(430,170,500,350);
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);
        c.add(panel);

        Border b= BorderFactory.createBevelBorder(BevelBorder.LOWERED);
        Border a= BorderFactory.createBevelBorder(BevelBorder.RAISED);
        panel.setBorder(b);
        panel.setBorder(a);


        title=new JLabel();
        title.setBounds(210,15,100,100);
        title.setText("login");
        title.setFont(f4);
        panel.add(title);


        username=new JLabel();
        username.setBounds(40,95,75,75);
        username.setText("Name");
        username.setFont(f2);
        panel.add(username);

        passward=new JLabel();
        passward.setText("Password");
        passward.setBounds(40,170,100,50);
        passward.setFont(f2);
        panel.add(passward);

        uname=new JTextField();
        uname.setText("");
        uname.setBounds(150,115,290,35);
        uname.setToolTipText("Enter Your Name");
        uname.setBackground(new Color(255,255,153));
        uname.setFont(f1);
        panel.add(uname);

        pass=new JPasswordField();
        pass.setText("");
        pass.setBounds(150,180,290,35);
        pass.setBackground(new Color(255,255,153));
        pass.setToolTipText("Enter your Passward");
        pass.setFont(f1);
        panel.add(pass);

        login=new JButton();
        login.setText("LOG IN");
        login.setBounds(40,270,400,40);
        login.setForeground(new Color(0, 153, 76));
        login.setBackground( Color.GREEN);
        login.setFont(f2);
        panel.add(login);
       // login.setBackground(new Color(0,153,76));

        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String username= uname.getText();
               String passward=pass.getText();
               if(username.equals("Md.Sabbir Hossain")&&passward.equals("Sabbir"))
               {
                   dispose();
                   Homeframe frame1 =new Homeframe();
                   frame1.setVisible(true);
                   JOptionPane.showMessageDialog(null,"Logined Successfull");

               }
               else {
                   JOptionPane.showMessageDialog(null,"Invalid username or Passward");
               }
            }
        });


    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public static void main(String[] args) {
        hostelportal frame=new hostelportal();
        frame.setVisible(true);

    }

}
