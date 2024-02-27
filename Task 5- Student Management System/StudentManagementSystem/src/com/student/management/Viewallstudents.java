package com.student.management;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;


@SuppressWarnings("serial")
public class Viewallstudents extends JFrame implements ActionListener {

	JTable table;
	JButton back;
	
	Viewallstudents (){
		 setIconImage(Toolkit.getDefaultToolkit().getImage(Addstudent.class.getResource("/Gallery/icon.png")));
		 getContentPane().setBackground(Color.green);
		 setResizable(false);
		 setLayout(null);
		
		 JLabel title=new JLabel("View Student Details");
		 title.setBounds(380, 8, 250, 30);
		 title.setFont(new Font("Times New Roman",Font.BOLD,20));
		 title.setForeground(Color.blue);
		 add(title);
		 
		 table=new JTable();
		 table.setBounds(0,50,1020,480);
		 table.setForeground(Color.black);
		 table.setBackground(Color.green);
		 add(table);
		 
		 try {
			 Conn c=new Conn();
			 String query="Select * from addstudent";
			 ResultSet rs=c.s.executeQuery(query);
			 ResultSetMetaData rsmd=rs.getMetaData();
			 DefaultTableModel model=  (DefaultTableModel) table.getModel();
			 int cols=rsmd.getColumnCount();
			 String [] colName=new String[cols];
			 for(int i=0;i<cols;i++)
			 colName[i]=rsmd.getColumnName(i+1);
			 model.setColumnIdentifiers(colName);
			 

			 String name,father,mother,dob,gender,rollno,bloodgroup,religion,nationality,email,phonenumber,address;
			 
			 while(rs.next()) {
				name=rs.getString(1);
				father=rs.getString(2);
				mother=rs.getString(3);
			    dob=rs.getString(4);
				gender=rs.getString(5);
				rollno=rs.getString(6);
				bloodgroup=rs.getString(7);
				religion=rs.getString(8);
				nationality=rs.getString(9);
				email=rs.getString(10);
				phonenumber=rs.getString(11);
				address=rs.getString(12);
				
		
				String[] row= {name,father,mother,dob,gender,rollno,bloodgroup,religion,nationality,email,phonenumber,address};
				model.addRow(row);
			 }
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		
		 JLabel tfname=new JLabel("Name");
		 tfname.setBounds(23, 25, 100, 30);
		 tfname.setForeground(Color.black);
		 tfname.setFont(new Font("Tahoma",Font.BOLD,10));
		 add(tfname);
		 
		 JLabel tffathername=new JLabel("Father's Name");
		 tffathername.setBounds(87, 25, 100, 30);
		 tffathername.setForeground(Color.black);
		 tffathername.setFont(new Font("Tahoma",Font.BOLD,10));
		 add(tffathername);
		  
		 JLabel tfmothername=new JLabel("Mother's Name");
		 tfmothername.setBounds(175, 25, 100, 30);
		 tfmothername.setForeground(Color.black);
		 tfmothername.setFont(new Font("Tahoma",Font.BOLD,10));
		 add(tfmothername);
		 
		 JLabel tfdob=new JLabel("Date of Birth");
		 tfdob.setBounds(260, 25, 100, 30);
		 tfdob.setForeground(Color.black);
		 tfdob.setFont(new Font("Tahoma",Font.BOLD,10));
		 add(tfdob);
		 
		 JLabel tfgender=new JLabel("Gender");
		 tfgender.setBounds(355, 25, 100, 30);
		 tfgender.setForeground(Color.black);
		 tfgender.setFont(new Font("Tahoma",Font.BOLD,10));
		 add(tfgender);
		 
		 
		 JLabel tfrollno=new JLabel("Roll No");
		 tfrollno.setBounds(445, 25, 100, 30);
		 tfrollno.setForeground(Color.black);
		 tfrollno.setFont(new Font("Tahoma",Font.BOLD,10));
		 add(tfrollno);
		 

		 JLabel tfblood=new JLabel("Blood Group");
		 tfblood.setBounds(520, 25, 100, 30);
		 tfblood.setForeground(Color.black);
		 tfblood.setFont(new Font("Tahoma",Font.BOLD,10));
		 add(tfblood);
		 
		 JLabel tfreligion=new JLabel("Religion");
		 tfreligion.setBounds(610, 25, 100, 30);
		 tfreligion.setForeground(Color.black);
		 tfreligion.setFont(new Font("Tahoma",Font.BOLD,10));
		 add(tfreligion);
		 

		 JLabel tfnation=new JLabel("Nationality");
		 tfnation.setBounds(690, 25, 100, 30);
		 tfnation.setForeground(Color.black);
		 tfnation.setFont(new Font("Tahoma",Font.BOLD,10));
		 add(tfnation);
		 
		 JLabel tfemail=new JLabel("Email");
		 tfemail.setBounds(790, 25, 100, 30);
		 tfemail.setForeground(Color.black);
		 tfemail.setFont(new Font("Tahoma",Font.BOLD,10));
		 add(tfemail);
		 
		 JLabel tfcontact=new JLabel("Phone Number");
		 tfcontact.setBounds(855, 25, 100, 30);
		 tfcontact.setForeground(Color.black);
		 tfcontact.setFont(new Font("Tahoma",Font.BOLD,10));
		 add(tfcontact);
		 
		 JLabel tfaddress=new JLabel("Address");
		 tfaddress.setBounds(950, 25, 100, 30);
		 tfaddress.setForeground(Color.black);
		 tfaddress.setFont(new Font("Tahoma",Font.BOLD,10));
		 add(tfaddress);
		 
		 
		 
		 
		 back=new JButton("Back");
		 back.setBounds(400, 530, 150, 40);
		 back.setBackground(Color.red);
		 back.setForeground(Color.white);
		 back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		 back.setBorder(BorderFactory.createEmptyBorder());
		 back.setFont(new Font("Tahoma",Font.BOLD,20));
		 back.addActionListener(this);
		 add(back);
		  
		 
		 
		setUndecorated(true);
		setBounds(325,165,1020,580);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                   new Viewallstudents ();
                   
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==back) {
			setVisible(false);
		}
	}

}
