package com.student.management;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Addstudent extends JFrame implements ActionListener {

	JTextField tfname,tffather,tfmother,tfdob,tfrollno,tfbloodgroup,tfreligion,tfnationality,tfemail,tfphone;
	JTextArea tfaddress;
	@SuppressWarnings("rawtypes")
	JComboBox combo1;
	JButton add,back;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	Addstudent(){
		 setIconImage(Toolkit.getDefaultToolkit().getImage(Addstudent.class.getResource("/Gallery/icon.png")));
		 getContentPane().setBackground(Color.green);
		 setResizable(false);
		 setLayout(null);
		
		 JLabel title=new JLabel("Add Student");
		 title.setForeground(Color.blue);
		 title.setBounds(410,15,200,50);
		 title.setFont(new Font("Tahoma",Font.BOLD,30));
		 add(title);
		 
		 JLabel name=new JLabel("Name");
		 name.setForeground(Color.black);
		 name.setBounds(60,80,200,50);
		 name.setFont(new Font("Times New Roman",Font.BOLD,25));
		 add(name);
		 
		 JLabel phone=new JLabel("Phone Number");
		 phone.setForeground(Color.black);
		 phone.setBounds(550,80,200,50);
		 phone.setFont(new Font("Times New Roman",Font.BOLD,25));
		 add(phone);
		  
		 tfphone=new JTextField();
		 tfphone.setBounds(780,80,200,35);
		 tfphone.setBorder(BorderFactory.createEmptyBorder());
		 tfphone.setFont(new Font("Eras Bold ITC",Font.PLAIN,17));
		 add(tfphone);
		 
		 
		 JLabel father=new JLabel("Father's Name");
		 father.setForeground(Color.black);
		 father.setBounds(60,130,200,50);
		 father.setFont(new Font("Times New Roman",Font.BOLD,25));
		 add(father); 
		 
		 JLabel address=new JLabel("Address");
		 address.setForeground(Color.black);
		 address.setBounds(550,130,200,50);
		 address.setFont(new Font("Times New Roman",Font.BOLD,25));
		 add(address); 
		 
		 tfaddress=new JTextArea();
		 tfaddress.setBounds(780,130,200,80);
		 tfaddress.setBorder(BorderFactory.createEmptyBorder());
		 tfaddress.setFont(new Font("Eras Bold ITC",Font.PLAIN,17));
		 add(tfaddress);
		 
		 
		 JLabel mother=new JLabel("Mother's Name");
		 mother.setForeground(Color.black);
		 mother.setBounds(60,180,200,50);
		 mother.setFont(new Font("Times New Roman",Font.BOLD,25));
		 add(mother); 
		  
		 JLabel dob=new JLabel("Date of Birth");
		 dob.setForeground(Color.black);
		 dob.setBounds(60,230,200,50);
		 dob.setFont(new Font("Times New Roman",Font.BOLD,25));
		 add(dob); 
		  
		 JLabel gender=new JLabel("Gender");
		 gender.setForeground(Color.black);
		 gender.setBounds(60,280,200,50);
		 gender.setFont(new Font("Times New Roman",Font.BOLD,25));
		 add(gender); 
		  
		 JLabel rollno=new JLabel("Roll No");
		 rollno.setForeground(Color.black);
		 rollno.setBounds(60,330,200,50);
		 rollno.setFont(new Font("Times New Roman",Font.BOLD,25));
		 add(rollno); 
		 
		 JLabel bloodgroup=new JLabel("Blood Group");
		 bloodgroup.setForeground(Color.black);
		 bloodgroup.setBounds(60,380,200,50);
		 bloodgroup.setFont(new Font("Times New Roman",Font.BOLD,25));
		 add(bloodgroup); 
		 
		 JLabel religion=new JLabel("Religion");
		 religion.setForeground(Color.black);
		 religion.setBounds(60,430,200,50);
		 religion.setFont(new Font("Times New Roman",Font.BOLD,25));
		 add(religion); 
		 
		 JLabel nationality=new JLabel("Nationality");
		 nationality.setForeground(Color.black);
		 nationality.setBounds(60,480,200,50);
		 nationality.setFont(new Font("Times New Roman",Font.BOLD,25));
		 add(nationality); 
		 
		 JLabel email=new JLabel("Email");
		 email.setForeground(Color.black);
		 email.setBounds(60,530,200,50);
		 email.setFont(new Font("Times New Roman",Font.BOLD,25));
		 add(email); 
		 
		 
		 tfname=new JTextField();
		 tfname.setBounds(300,80,200,35);
		 tfname.setBorder(BorderFactory.createEmptyBorder());
		 tfname.setFont(new Font("Eras Bold ITC",Font.PLAIN,17));
		 add(tfname);
		 
		 tffather=new JTextField();
		 tffather.setBounds(300,130,200,35);
		 tffather.setBorder(BorderFactory.createEmptyBorder());
		 tffather.setFont(new Font("Eras Bold ITC",Font.PLAIN,17));
		 add(tffather);
		 
		 tfmother=new JTextField();
		 tfmother.setBounds(300,180,200,35);
		 tfmother.setBorder(BorderFactory.createEmptyBorder());
		 tfmother.setFont(new Font("Eras Bold ITC",Font.PLAIN,17));
		 add(tfmother);
		 
		 tfdob=new JTextField();
		 tfdob.setBounds(300,230,200,35);
		 tfdob.setBorder(BorderFactory.createEmptyBorder());
		 tfdob.setFont(new Font("Eras Bold ITC",Font.PLAIN,17));
		 add(tfdob);
		 
		 String genderoption[]= {"Male","Female","Other","Not Specified"};
		 combo1=new JComboBox(genderoption);
		 combo1.setBounds(300,280,200,35);
		 combo1.setFont(new Font("Tahoma",Font.PLAIN,17));
		 combo1.setBorder(BorderFactory.createEmptyBorder());
		 add(combo1);
		 
		 tfrollno=new JTextField();
		 tfrollno.setBounds(300,330,200,35);
		 tfrollno.setBorder(BorderFactory.createEmptyBorder());
		 tfrollno.setFont(new Font("Eras Bold ITC",Font.PLAIN,17));
		 add(tfrollno);
		 
		 tfbloodgroup=new JTextField();
		 tfbloodgroup.setBounds(300,380,200,35);
		 tfbloodgroup.setBorder(BorderFactory.createEmptyBorder());
		 tfbloodgroup.setFont(new Font("Eras Bold ITC",Font.PLAIN,17));
		 add(tfbloodgroup);
		 

		 tfreligion=new JTextField();
		 tfreligion.setBounds(300,430,200,35);
		 tfreligion.setBorder(BorderFactory.createEmptyBorder());
		 tfreligion.setFont(new Font("Eras Bold ITC",Font.PLAIN,17));
		 add(tfreligion);
		 
		 tfnationality=new JTextField();
		 tfnationality.setBounds(300,480,200,35);
		 tfnationality.setBorder(BorderFactory.createEmptyBorder());
		 tfnationality.setFont(new Font("Eras Bold ITC",Font.PLAIN,17));
		 add(tfnationality);
		 		 
		 tfemail=new JTextField();
		 tfemail.setBounds(300,530,200,35);
		 tfemail.setBorder(BorderFactory.createEmptyBorder());
		 tfemail.setFont(new Font("Eras Bold ITC",Font.PLAIN,17));
		 add(tfemail);
		 
		 add=new JButton("Add");
		 add.setBounds(550, 530, 200, 40);
		 add.setBackground(Color.red);
		 add.setForeground(Color.white);
		 add.setFont(new Font("Tahoma",Font.BOLD,20));
		 add.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		 add.setBorder(BorderFactory.createEmptyBorder());
		 add.addActionListener(this);
	     add(add);
			
		 back=new JButton("Back");
		 back.setBounds(780, 530, 200, 40);
		 back.setBackground(Color.black);
		 back.setForeground(Color.white);
		 back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		 back.setBorder(BorderFactory.createEmptyBorder());
		 back.setFont(new Font("Tahoma",Font.BOLD,20));
		 back.addActionListener(this);
		 add(back);
		 
		 ImageIcon i1 = new ImageIcon(Addstudent.class.getResource("/Gallery/addstudent.jpg"));
		 Image i2=i1.getImage().getScaledInstance(430,290,Image.SCALE_DEFAULT);
		 ImageIcon i3=new ImageIcon(i2);
		 JLabel image=new JLabel(i3);
		 image.setBounds(550,230,430,290);
		 add(image);
		 
		 
		setUndecorated(true);
		setBounds(325,165,1020,580);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  new Addstudent();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==add) {
			String name=tfname.getText();
			String fathersname=tffather.getText();
			String mothersname=tfmother.getText();
			String dob=tfdob.getText();
			String gender=(String) combo1.getSelectedItem();
			String rollno=tfrollno.getText();
			String blood=tfbloodgroup.getText();
			String religion=tfreligion.getText();
			String nation=tfnationality.getText();
			String email=tfemail.getText();
			String contact=tfphone.getText();
			String address=tfaddress.getText();
			
			if(name.equals("")) {
				JOptionPane.showMessageDialog(null,"Name Should not be Empty");
				return;
			}
			if(fathersname.equals("")) {
				JOptionPane.showMessageDialog(null,"Father's Name Should not be Empty");
				return;
			}
			if(mothersname.equals("")) {
				JOptionPane.showMessageDialog(null,"Mother's Name Should not be Empty");
				return;
			}
			if(dob.equals("")) {
				JOptionPane.showMessageDialog(null,"Date of Birth Should not be Empty");
				return;
			}
			if(rollno.equals("")) {
				JOptionPane.showMessageDialog(null,"Roll No Should not be Empty");
				return;
			}
			if(blood.equals("")) {
				JOptionPane.showMessageDialog(null,"Blood Group Should not be Empty");
				return;
			}
			if(religion.equals("")) {
				JOptionPane.showMessageDialog(null,"Religion Should not be Empty");
				return;
			}
			if(nation.equals("")) {
				JOptionPane.showMessageDialog(null,"Nationality Should not be Empty");
				return;
			}
			if(email.equals("")) {
				JOptionPane.showMessageDialog(null,"Email Should not be Empty");
				return;
			}
			if(contact.equals("")) {
				JOptionPane.showMessageDialog(null,"Phone Number not be Empty");
				return;
			}
			if(address.equals("")) {
				JOptionPane.showMessageDialog(null,"Address not be Empty");
				return;
			}
			
			try {
				Conn conn=new Conn();
				String query="insert into addstudent values('"+name+"','"+fathersname+"','"+mothersname+"','"+dob+"','"+gender+"','"+rollno+"','"+blood+"','"+religion+"','"+nation+"','"+email+"','"+contact+"','"+address+"')";
				conn.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null,"Student Added Sucessfully");
			       setVisible(false);
				
			}
			catch(Exception e1) {
				e1.printStackTrace();
			}
			
			
					}
		if(e.getSource()==back) {
			setVisible(false);
		}
	}

}
