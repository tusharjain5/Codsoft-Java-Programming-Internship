package com.student.management;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.awt.*;


@SuppressWarnings("serial")
public class Searchstudents extends JFrame implements ActionListener {

	JTable table;
	JButton back,submit;
	Choice rolno;
	
	 Searchstudents(){
		 setIconImage(Toolkit.getDefaultToolkit().getImage(Searchstudents.class.getResource("/Gallery/icon.png")));
		 getContentPane().setBackground(Color.green);
		 setResizable(false);
		 setLayout(null);
		
		 JLabel title=new JLabel("Search Students");
		 title.setBounds(380, 25, 250, 30);
		 title.setFont(new Font("Times New Roman",Font.BOLD,30));
		 title.setForeground(Color.blue);
		 add(title);
		 
		
		 JLabel tfrollno1=new JLabel("Roll No");
		 tfrollno1.setBounds(60,70,150,20);
		 tfrollno1.setForeground(Color.black);
		 tfrollno1.setFont(new Font("Times New Roman",Font.BOLD, 25));
		 add(tfrollno1);
		 
		 rolno =new Choice();
		 rolno.setBounds(230,70,150,40);
		 add(rolno);
		 
		 
		 try {
		      Conn c=new Conn();
		      ResultSet rs=c.s.executeQuery("Select * from addstudent");
		      while(rs.next()) {
		    	  rolno.add(rs.getString("rollno"));
		      }
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		 
		 
		 table=new JTable();
		 table.setBounds(0,130,1020,380);
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
		 tfname.setBounds(23, 105, 100, 30);
		 tfname.setForeground(Color.white);
		 tfname.setFont(new Font("Tahoma",Font.BOLD,10));
		 add(tfname);
		 
		 JLabel tffathername=new JLabel("Father's Name");
		 tffathername.setBounds(87,105, 100, 30);
		 tffathername.setForeground(Color.white);
		 tffathername.setFont(new Font("Tahoma",Font.BOLD,10));
		 add(tffathername);
		  
		 JLabel tfmothername=new JLabel("Mother's Name");
		 tfmothername.setBounds(175, 105, 100, 30);
		 tfmothername.setForeground(Color.white);
		 tfmothername.setFont(new Font("Tahoma",Font.BOLD,10));
		 add(tfmothername);
		 
		 JLabel tfdob=new JLabel("Date of Birth");
		 tfdob.setBounds(260,105, 100, 30);
		 tfdob.setForeground(Color.white);
		 tfdob.setFont(new Font("Tahoma",Font.BOLD,10));
		 add(tfdob);
		 
		 JLabel tfgender=new JLabel("Gender");
		 tfgender.setBounds(355, 105, 100, 30);
		 tfgender.setForeground(Color.white);
		 tfgender.setFont(new Font("Tahoma",Font.BOLD,10));
		 add(tfgender);
		 
		 
		 JLabel tfrollno=new JLabel("Roll No");
		 tfrollno.setBounds(445, 105, 100, 30);
		 tfrollno.setForeground(Color.white);
		 tfrollno.setFont(new Font("Tahoma",Font.BOLD,10));
		 add(tfrollno);
		 

		 JLabel tfblood=new JLabel("Blood Group");
		 tfblood.setBounds(520, 105, 100, 30);
		 tfblood.setForeground(Color.white);
		 tfblood.setFont(new Font("Tahoma",Font.BOLD,10));
		 add(tfblood);
		 
		 JLabel tfreligion=new JLabel("Religion");
		 tfreligion.setBounds(610, 105, 100, 30);
		 tfreligion.setForeground(Color.white);
		 tfreligion.setFont(new Font("Tahoma",Font.BOLD,10));
		 add(tfreligion);
		 

		 JLabel tfnation=new JLabel("Nationality");
		 tfnation.setBounds(690, 105, 100, 30);
		 tfnation.setForeground(Color.white);
		 tfnation.setFont(new Font("Tahoma",Font.BOLD,10));
		 add(tfnation);
		 
		 JLabel tfemail=new JLabel("Email");
		 tfemail.setBounds(790, 105, 100, 30);
		 tfemail.setForeground(Color.white);
		 tfemail.setFont(new Font("Tahoma",Font.BOLD,10));
		 add(tfemail);
		 
		 JLabel tfcontact=new JLabel("Phone Number");
		 tfcontact.setBounds(855, 105, 100, 30);
		 tfcontact.setForeground(Color.white);
		 tfcontact.setFont(new Font("Tahoma",Font.BOLD,10));
		 add(tfcontact);
		 
		 JLabel tfaddress=new JLabel("Address");
		 tfaddress.setBounds(950, 105, 100, 30);
		 tfaddress.setForeground(Color.white);
		 tfaddress.setFont(new Font("Tahoma",Font.BOLD,10));
		 add(tfaddress);
		 
		 
		 
		 
		 submit=new JButton("Submit");
		 submit.setBounds(300, 530, 150, 40);
		 submit.setBackground(Color.red);
		 submit.setForeground(Color.white);
		 submit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		 submit.setBorder(BorderFactory.createEmptyBorder());
		 submit.setFont(new Font("Tahoma",Font.BOLD,20));
		 submit.addActionListener(this);
		 add(submit);
		 
		 
		 
		 
		 back=new JButton("Back");
		 back.setBounds(600, 530, 150, 40);
		 back.setBackground(Color.black);
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
           new  Searchstudents();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		 if(e.getSource()==back) {
			 setVisible(false);
		 }
		 
		 else if(e.getSource()==submit) {
			 try {
					String query1="Select * from addstudent where rollno='"+rolno.getSelectedItem()+"'";
					Conn c=new Conn();
					ResultSet rs=c.s.executeQuery(query1);
					 DefaultTableModel model = (DefaultTableModel) table.getModel();
			            model.setRowCount(0); 
					 
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
				catch(Exception e1) {
					e1.printStackTrace();
				}
		 }

}
}
