package com.student.management;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.awt.*;

@SuppressWarnings("serial")
public class updatestudentdetails extends JFrame implements ActionListener {
       JTextField tfphone,tfname,tffather,tfmother,tfdob,tfgender,tfblood,tfreligion,tfnation,tfemail;
       JTextArea tfaddress;
	JButton check,update,back;
	Choice tfrollno;
	
	updatestudentdetails(){
		 setIconImage(Toolkit.getDefaultToolkit().getImage(updatestudentdetails.class.getResource("/Gallery/icon.png")));
		 getContentPane().setBackground(Color.green);
		 setResizable(false);
		 setLayout(null);
		
		 JLabel title=new JLabel("Update Student Details");
		 title.setForeground(Color.blue);
		 title.setBounds(320,15,400,50);
		 title.setFont(new Font("Tahoma",Font.BOLD,30));
		 add(title);
		 
		 JLabel rollno=new JLabel("Roll No");
		 rollno.setForeground(Color.black);
		 rollno.setBounds(60,80,200,50);
		 rollno.setFont(new Font("Times New Roman",Font.BOLD,25));
		 add(rollno);
		 
		 tfrollno=new Choice();
		 tfrollno.setBounds(300,80,200,35);
		 tfrollno.setFont(new Font("Eras Bold ITC",Font.PLAIN,17));
		 add(tfrollno);
		 
			try {
				Conn c=new Conn();
				ResultSet rs=c.s.executeQuery("Select * from addstudent");
				while(rs.next()) {
					tfrollno.add(rs.getString("rollno"));
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		
		 
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
		 
		 JLabel name=new JLabel("Name");
		 name.setForeground(Color.black);
		 name.setBounds(60,130,200,50);
		 name.setFont(new Font("Times New Roman",Font.BOLD,25));
		 add(name); 
		 
		 JLabel father=new JLabel("Father's Name");
		 father.setForeground(Color.black);
		 father.setBounds(60,180,200,50);
		 father.setFont(new Font("Times New Roman",Font.BOLD,25));
		 add(father);
		 
		  
		 JLabel mother=new JLabel("Mother's Name");
		 mother.setForeground(Color.black);
		 mother.setBounds(60,230,200,50);
		 mother.setFont(new Font("Times New Roman",Font.BOLD,25));
		 add(mother); 
		  
		 JLabel dob=new JLabel("Date of Birth");
		 dob.setForeground(Color.black);
		 dob.setBounds(60,280,200,50);
		 dob.setFont(new Font("Times New Roman",Font.BOLD,25));
		 add(dob); 
		  
		 JLabel gender=new JLabel("Gender");
		 gender.setForeground(Color.black);
		 gender.setBounds(60,330,200,50);
		 gender.setFont(new Font("Times New Roman",Font.BOLD,25));
		 add(gender); 
		 
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
		 tfname.setBounds(300,130,200,35);
		 tfname.setBorder(BorderFactory.createEmptyBorder());
		 tfname.setFont(new Font("Eras Bold ITC",Font.PLAIN,17));
		 add(tfname);
		 
		 tffather=new JTextField();
		 tffather.setBounds(300,180,200,35);
		 tffather.setBorder(BorderFactory.createEmptyBorder());
		 tffather.setFont(new Font("Eras Bold ITC",Font.PLAIN,17));
		 add(tffather);
		 
		 tfmother=new JTextField();
		 tfmother.setBounds(300,230,200,35);
		 tfmother.setBorder(BorderFactory.createEmptyBorder());
		 tfmother.setFont(new Font("Eras Bold ITC",Font.PLAIN,17));
		 add(tfmother);
		 
		 tfdob=new JTextField();
		 tfdob.setBounds(300,280,200,35);
		 tfdob.setBorder(BorderFactory.createEmptyBorder());
		 tfdob.setFont(new Font("Eras Bold ITC",Font.PLAIN,17));
		 add(tfdob);
		 
		 tfgender=new JTextField();
		 tfgender.setBounds(300,330,200,35);
		 tfgender.setBorder(BorderFactory.createEmptyBorder());
		 tfgender.setFont(new Font("Eras Bold ITC",Font.PLAIN,17));
		 add(tfgender);
		 
		 tfblood=new JTextField();
		 tfblood.setBounds(300,380,200,35);
		 tfblood.setBorder(BorderFactory.createEmptyBorder());
		 tfblood.setFont(new Font("Eras Bold ITC",Font.PLAIN,17));
		 add(tfblood);
		 
		 tfreligion=new JTextField();
		 tfreligion.setBounds(300,430,200,35);
		 tfreligion.setBorder(BorderFactory.createEmptyBorder());
		 tfreligion.setFont(new Font("Eras Bold ITC",Font.PLAIN,17));
		 add(tfreligion);
		 
		 tfnation=new JTextField();
		 tfnation.setBounds(300,480,200,35);
		 tfnation.setBorder(BorderFactory.createEmptyBorder());
		 tfnation.setFont(new Font("Eras Bold ITC",Font.PLAIN,17));
		 add(tfnation);
		 
		 tfemail=new JTextField();
		 tfemail.setBounds(300,530,200,35);
		 tfemail.setBorder(BorderFactory.createEmptyBorder());
		 tfemail.setFont(new Font("Eras Bold ITC",Font.PLAIN,17));
		 add(tfemail);
		 
		 check=new JButton("Check");
		 check.setBounds(550, 530, 120, 40);
		 check.setBackground(Color.black);
		 check.setForeground(Color.white);
		 check.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		 check.setBorder(BorderFactory.createEmptyBorder());
		 check.setFont(new Font("Tahoma",Font.BOLD,20));
		 check.addActionListener(this);
		 add(check);
		 
		 update=new JButton("Update");
		 update.setBounds(700, 530, 150, 40);
		 update.setBackground(Color.red);
		 update.setForeground(Color.white);
		 update.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		 update.setBorder(BorderFactory.createEmptyBorder());
		 update.setFont(new Font("Tahoma",Font.BOLD,20));
		 update.addActionListener(this);
		 add(update);
		 
		 
		 
		 
		 back=new JButton("Back");
		 back.setBounds(880, 530, 100, 40);
		 back.setBackground(Color.black);
		 back.setForeground(Color.white);
		 back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		 back.setBorder(BorderFactory.createEmptyBorder());
		 back.setFont(new Font("Tahoma",Font.BOLD,20));
		 back.addActionListener(this);
		 add(back);
		 
		 
		 ImageIcon i1 = new ImageIcon(updatestudentdetails.class.getResource("/Gallery/updatestudent.jpg"));
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
      new updatestudentdetails();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	      if(e.getSource()==back) {
             setVisible(false);		
	}
	      else if(e.getSource()==check) {
	    	  String rollno=tfrollno.getSelectedItem();
	    	  String query="select * from addstudent where rollno='"+rollno+"'";
	    	  try {
	    		  Conn c=new Conn();
	    		  ResultSet rs=c.s.executeQuery(query);
					while(rs.next()) {
						tfname.setText(rs.getString("name"));
						tffather.setText(rs.getString("father"));
						tfmother.setText(rs.getString("mother"));
						tfdob.setText(rs.getString("dob"));
						tfgender.setText(rs.getString("gender"));
						tfblood.setText(rs.getString("bloodgroup"));
						tfreligion.setText(rs.getString("religion"));
						tfnation.setText(rs.getString("nationality"));
						tfemail.setText(rs.getString("email"));
						tfphone.setText(rs.getString("phonenumber"));
						tfaddress.setText(rs.getString("address"));
					     
					}
	    	  }
	    	  catch(Exception e1) {
	    		  e1.printStackTrace();
	    	  }
	    	  
	      }
	      else if(e.getSource()==update) {
	    	  String rollno=tfrollno.getSelectedItem();
	    	  String name=tfname.getText();
				String fathersname=tffather.getText();
				String mothersname=tfmother.getText();
				String dob=tfdob.getText();
				String gender=tfgender.getText();
				String blood=tfblood.getText();
				String religion=tfreligion.getText();
				String nation=tfnation.getText();
				String email=tfemail.getText();
				String contact=tfphone.getText();
				String address=tfaddress.getText();
				
				try {
					Conn c=new Conn();
	            	c.s.executeUpdate("update addstudent set name='"+name+"',father='"+fathersname+"',mother='"+mothersname+"',dob='"+dob+"',gender='"+gender+"',bloodgroup='"+blood+"',religion='"+religion+"',nationality='"+nation+"',email='"+email+"',phonenumber='"+contact+"',address='"+address+"' where rollno ='"+rollno+"'");
	            JOptionPane.showMessageDialog(null,"Data Sucessfully Updated");
	            setVisible(false);
				}
				catch(Exception e1) {
					e1.printStackTrace();
				}
				
				
	      }

}
}
