package com.student.management;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class teacherdetails extends JFrame implements ActionListener {

	JTable table;
	JButton back;
	
	teacherdetails (){
		 setIconImage(Toolkit.getDefaultToolkit().getImage(teacherdetails.class.getResource("/Gallery/icon.png")));
		 getContentPane().setBackground(Color.green);
		 setResizable(false);
		 setLayout(null);
		
		 JLabel title=new JLabel("View Teacher Details");
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
			 String query="Select * from teacher";
			 ResultSet rs=c.s.executeQuery(query);
			 ResultSetMetaData rsmd=rs.getMetaData();
			 DefaultTableModel model=  (DefaultTableModel) table.getModel();
			 int cols=rsmd.getColumnCount();
			 String [] colName=new String[cols];
			 for(int i=0;i<cols;i++)
			 colName[i]=rsmd.getColumnName(i+1);
			 model.setColumnIdentifiers(colName);
			 

			 String name,age,department,dateofjoin,gender,salary,email,phonenumber,address;
			 
			 while(rs.next()) {
				name=rs.getString(1);
				age=rs.getString(2);
				department=rs.getString(3);
			    dateofjoin=rs.getString(4);
				gender=rs.getString(5);
				salary=rs.getString(6);
				email=rs.getString(7);
				phonenumber=rs.getString(8);
				address=rs.getString(9);
				
		
				String[] row= {name,age,department,dateofjoin,gender,salary,email,phonenumber,address};
				model.addRow(row);
			 }
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		
		 JLabel tfname=new JLabel("Name");
		 tfname.setBounds(33, 25, 100, 30);
		 tfname.setForeground(Color.black);
		 tfname.setFont(new Font("Tahoma",Font.BOLD,10));
		 add(tfname);
		 
		 JLabel tfage=new JLabel("Age");
		 tfage.setBounds(153, 25, 100, 30);
		 tfage.setForeground(Color.black);
		 tfage.setFont(new Font("Tahoma",Font.BOLD,10));
		 add(tfage);
		  
		 JLabel tfdepartment=new JLabel("Department");
		 tfdepartment.setBounds(250, 25, 100, 30);
		 tfdepartment.setForeground(Color.black);
		 tfdepartment.setFont(new Font("Tahoma",Font.BOLD,10));
		 add(tfdepartment);
		 
		 JLabel tfdoj=new JLabel("Date of Joining");
		 tfdoj.setBounds(350, 25, 100, 30);
		 tfdoj.setForeground(Color.black);
		 tfdoj.setFont(new Font("Tahoma",Font.BOLD,10));
		 add(tfdoj);
		 
		 JLabel tfgender=new JLabel("Gender");
		 tfgender.setBounds(485, 25, 100, 30);
		 tfgender.setForeground(Color.black);
		 tfgender.setFont(new Font("Tahoma",Font.BOLD,10));
		 add(tfgender);
		 
		 
		 JLabel tfsalary=new JLabel("Salary");
		 tfsalary.setBounds(600, 25, 100, 30);
		 tfsalary.setForeground(Color.black);
		 tfsalary.setFont(new Font("Tahoma",Font.BOLD,10));
		 add(tfsalary);
		 
		 JLabel tfemail=new JLabel("Email");
		 tfemail.setBounds(710, 25, 100, 30);
		 tfemail.setForeground(Color.black);
		 tfemail.setFont(new Font("Tahoma",Font.BOLD,10));
		 add(tfemail);
		 
		 JLabel tfcontact=new JLabel("Phone Number");
		 tfcontact.setBounds(810, 25, 100, 30);
		 tfcontact.setForeground(Color.black);
		 tfcontact.setFont(new Font("Tahoma",Font.BOLD,10));
		 add(tfcontact);
		 
		 JLabel tfaddress=new JLabel("Address");
		 tfaddress.setBounds(930, 25, 100, 30);
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
                   new teacherdetails();
                   
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==back) {
			setVisible(false);
		}
	}

}
