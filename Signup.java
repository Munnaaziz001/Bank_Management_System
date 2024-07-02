package Bank.Management.System;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textname.getText();
        String fname = textfname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender  = null;
        if(r1.isSelected())
        {
            gender = "Male";
        }
        else if (r2.isSelected()){
            gender = "Female";
        }
        String email = textEmail.getText();
        String marital = null;
        if(m1.isSelected())
        {
            marital = "married";
        } else if (m2.isSelected()) {
            marital = "Unmarried";

        }
        else if(m3.isSelected())
        {
            marital = "Other";
        }
        String address = textAdd.getText();
        String city = textcity.getText();
        String pincode = textpin.getText();
        String state = textstate.getText();
         try{
             if(textname.getText().equals(""))
             {
                 JOptionPane.showMessageDialog(null, "Please enter a name for the account");
             }
             else {
                 Con con1 = new Con();
                 String   q = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"', '"+dob+"', '"+gender+"','"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+pincode+"', '"+state+"')";
                 con1.statement.executeUpdate(q);          }
             new Signup2(first);
             setVisible(false);
         }
         catch (Exception ex)
         {
             ex.printStackTrace();
         }

    }

    JButton next;
    JRadioButton r1,r2,m1,m2,m3;
    JTextField textname, textfname, textEmail,textAdd,textcity, textpin ,textstate;
    Random random = new Random();
    JDateChooser dateChooser;
    long first4 = (random.nextLong() % 9000L) + 1000L;

    String first  = " " + Math.abs(first4);
    Signup(){
        super("APPLICATION FORM ");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);//that image is where visible
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO: "+first);
        label1.setBounds(160,20,600,40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        label2.setBounds(330,70,600,30);
        add(label2);


        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(290,90,600,30);
        add(label3);
                    //              Name of the person              //
        JLabel labelname = new JLabel("Name :");
        labelname.setFont(new Font("Raleway", Font.BOLD,20));
        labelname.setBounds(100,190,100,30);
        add(labelname);


        textname = new JTextField();
        textname.setFont(new Font("Raleway", Font.BOLD,14));
        textname.setBounds(300,190,400,25);
        add(textname);

        //              Name of the father              //
        JLabel labelname1 = new JLabel("Father's Name :");
        labelname1.setFont(new Font("Raleway", Font.BOLD,20));
        labelname1.setBounds(100,240,200,30);
        add(labelname1);


        textfname = new JTextField();
        textfname.setFont(new Font("Raleway", Font.BOLD,14));
        textfname.setBounds(300,240,400,25);
        add(textfname);

            //              DATE OF BIRTH             //
        JLabel DOB = new JLabel("DATE OF BIRTH:");
        DOB.setFont(new Font("Raleway", Font.BOLD,20));
        DOB.setBounds(100,340,200,30);
        add(DOB);


        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,25);
        add(dateChooser);

        JLabel labelg = new JLabel("Gender :");
        labelg.setFont(new Font("Raleway", Font.BOLD,20));
        labelg.setBounds(100,290,200,30);
        add(labelg);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,290,60,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,290,90,30);
        add(r2);

        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);

        JLabel labelEmail = new JLabel("Email Address:");
        labelEmail.setFont(new Font("Raleway", Font.BOLD,20));
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD,14));
        textEmail.setBounds(300,390,400,30);
        add(textEmail);

        JLabel labelMs = new JLabel("Marital Status :");
        labelMs.setFont(new Font("Raleway", Font.BOLD,20));
        labelMs.setBounds(100,440,200,30);
        add(labelMs);

        m1 = new JRadioButton("Married");
        m1.setBounds(300,440,200,30);
        m1.setBackground(new Color(222,255,228));
        m1.setFont(new Font("Raleway", Font.BOLD,14));
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setBounds(500,440,200,30);
        m2.setBackground(new Color(222,255,228));
        m2.setFont(new Font("Raleway", Font.BOLD,14));
        add( m2);

        m3 = new JRadioButton("Other");
        m3.setBounds(700,440,200,30);
        m3.setBackground(new Color(222,255,228));
        m3.setFont(new Font("Raleway", Font.BOLD,14));
        add( m3);

        ButtonGroup group2 = new ButtonGroup();
        group2.add(m1);
        group2.add(m2);
        group2.add(m3);

        JLabel labelAdd = new JLabel("Address :");
        labelAdd.setFont(new Font("Raleway", Font.BOLD,20));
        labelAdd.setBounds(100,490,200,30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway", Font.BOLD,14));
        textAdd.setBounds(300,490,400,30);
        add(textAdd);

        JLabel labelcity = new JLabel("City Name :");
        labelcity.setFont(new Font("Raleway", Font.BOLD,20));
        labelcity.setBounds(100,540,200,30);
        add(labelcity);

        textcity = new JTextField();
        textcity.setFont(new Font("Raleway", Font.BOLD,14));
        textcity.setBounds(300,540,400,30);
        add(textcity);

        JLabel labelpin = new JLabel("Pin Code :");
        labelpin.setFont(new Font("Raleway", Font.BOLD,20));
        labelpin.setBounds(100,590,200,30);
        add(labelpin);

        textpin = new JTextField();
        textpin.setFont(new Font("Raleway", Font.BOLD,14));
        textpin.setBounds(300,590,400,30);
        add(textpin);

        JLabel labelstate = new JLabel("State :");
        labelstate.setFont(new Font("Raleway", Font.BOLD,20));
        labelstate.setBounds(100,640,200,30);
        add(labelstate);

        textstate = new JTextField();
        textstate.setFont(new Font("Raleway", Font.BOLD,14));
        textstate.setBounds(300,640,400,30);
        add(textstate);

        next = new JButton("NEXT");
        next.setFont(new Font("Raleway", Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710,80,30);
        next.addActionListener(this);
        add(next);


        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Signup();

    }


}
