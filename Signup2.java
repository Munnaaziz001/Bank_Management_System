package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {


    JComboBox comboBox, combox2,combox3,combox4,combobox5,combobox6;
    JTextField textpane,textadhar;
    JRadioButton r1,r2,e1,e2;
    JButton next;
    String formno;
    Signup2(String first){
        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);//that image is where visible
        add(image);
        this.formno = formno;

        JLabel l1 = new JLabel("Page 2:");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        l3.setBounds(100,120,100,30);
        add(l3);

        String religion [] = {"hindu","Muslim","sikh","Christian","Others"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);

        JLabel l4 = new JLabel("Category: ");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,170,100,30);
        add(l4);
        String Category [] = {"General","OBC","SC","ST","Others"};
        combox2 = new JComboBox(Category);
        combox2 .setBackground(new Color(252,208,76));
        combox2.setFont(new Font("Raleway",Font.BOLD,14));
        combox2.setBounds(350,170,320,30);
        add(combox2);

        JLabel l5 = new JLabel("Income : ");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);
        String Income [] = {"Null","<1,50,000","2,50,000","Upto 10,00,000","Above 10,00,000"};
        combox3 = new JComboBox(Income);
        combox3 .setBackground(new Color(252,208,76));
        combox3.setFont(new Font("Raleway",Font.BOLD,14));
        combox3.setBounds(350,220,320,30);
        add(combox3);

        JLabel l6 = new JLabel("Education: ");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(100,270,150,30);
        add(l6);
        String educational [] = {"Not-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        combox4 = new JComboBox(educational);
        combox4 .setBackground(new Color(252,208,76));
        combox4.setFont(new Font("Raleway",Font.BOLD,14));
        combox4.setBounds(350,270,320,30);
        add(combox4);

        JLabel l7 = new JLabel("Occupation: ");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        l7.setBounds(100,340,200,30);
        add(l7);
        String occupation [] = {"Self-Employed","Salaried","Business","Student","Others"};
        combobox5 = new JComboBox(occupation);
        combobox5 .setBackground(new Color(252,208,76));
        combobox5.setFont(new Font("Raleway",Font.BOLD,14));
        combobox5.setBounds(350,340,320,30);
        add(combobox5);

        JLabel l8 = new JLabel("Pan Number: ");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,390,150,30);
        add(l8);


        textpane = new JTextField();
        textpane.setFont(new Font("Raleway",Font.BOLD,18));
        textpane.setBounds(350,390,320,30);
        add(textpane);

        JLabel l9 = new JLabel("Aadhar Number: ");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(100,440,150,30);
        add(l9);


        textadhar = new JTextField();
        textadhar.setFont(new Font("Raleway",Font.BOLD,18));
        textadhar.setBounds(350,440,320,30);
        add(textadhar);


        JLabel l10 = new JLabel(" Senior Citizen: ");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        l10.setBounds(100,490,150,30);
        add(l10);
        r1 = new JRadioButton("yes");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(252,208,76));
        r1.setBounds(350,490,100,30);
        add(r1);
        r2 = new JRadioButton("no");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(252,208,76));
        r2.setBounds(460,490,100,30);
        add(r2);

        JLabel l11 = new JLabel(" Existing Account: ");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,540,180,30);
        add(l11);
        e1 = new JRadioButton("yes");
        e1.setFont(new Font("Raleway",Font.BOLD,14));
        e1.setBackground(new Color(252,208,76));
        e1.setBounds(350,540,100,30);
        add(e1);
        e2 = new JRadioButton("no");
        e2.setFont(new Font("Raleway",Font.BOLD,14));
        e2.setBackground(new Color(252,208,76));
        e2.setBounds(460,540,100,30);
        add(e2);

        JLabel l12 = new JLabel(" Form No: ");
        l12.setFont(new Font("Raleway",Font.BOLD,18));
        l12.setBounds(700,10,100,30);
        add(l12);


        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,18));
        l13.setBounds(760,10,30,30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,18));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);

        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,208,76));
        setLayout(null);

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) combox2.getSelectedItem();
        String inc = (String)combox3.getSelectedItem();
        String edu  = (String)combox4.getSelectedItem();
        String occ = (String)combobox5.getSelectedItem();
        String pan  = (String)textpane.getText();
        String aadhar = (String)textadhar.getText();

        String scitizen  = " ";
        if((r1.isSelected())){
            scitizen = "Yes";
        } else if (r2.isSelected()) {
            scitizen = "No";

        }
        String eAccount  = " ";
        if((r1.isSelected())){
            eAccount = "Yes";
        } else if (r2.isSelected()) {
            eAccount = "No";

        }
        try{
            if(textpane.getText().equals("") || textadhar.getText().equals("") ){
                JOptionPane.showMessageDialog(null, "Fill all the fields");

            }
            else{
                Con c1 = new Con();
                String q = "insert into signup_two values('"+formno+"','"+rel+"','"+cate+"','"+edu+"','"+inc+"','"+occ+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eAccount+"')";
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
//
            }

        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }




    public static void main(String[] args) {
        new Signup2("");

    }
}
