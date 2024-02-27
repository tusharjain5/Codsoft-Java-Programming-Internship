package com.student.management;
import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class Dashboard extends JFrame implements ActionListener {

	JButton addstudent,searchstudent,removestudent,viewstudent,updatestudentdetails,teacher,classroom,events,notepad,calculator,logout,about,science,complabs;
	String username;
	Dashboard(String username)
	
	{
		this.username=username;
		setIconImage(Toolkit.getDefaultToolkit().getImage(Dashboard.class.getResource("/Gallery/icon.png")));
		setTitle("DashBoard");
		setResizable(false);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLayout(null);
		
		JPanel p1=new JPanel();
		p1.setLayout(null);
		p1.setBackground(Color.yellow);
		p1.setBounds(0,0,1600,125);
		add(p1);
		
		
		ImageIcon i1 = new ImageIcon(Dashboard.class.getResource("/Gallery/school.png"));
		Image i2=i1.getImage().getScaledInstance(125,125,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
	    JLabel icon=new JLabel(i3);
		icon.setBounds(5,0,125,125);
        p1.add(icon);
		
		JLabel heading=new JLabel("DashBoard");
		heading.setBounds(130,80,300,40);
		heading.setForeground(Color.black);
		heading.setFont(new Font("Tahoma",Font.BOLD,30));
		p1.add(heading);
        
        JLabel superheading=new JLabel("Student Management System");
        superheading.setBounds(480,35,850,55);
        superheading.setForeground(Color.blue);
        superheading.setFont(new Font("Times New Roman",Font.BOLD,50));
		p1.add(superheading);
			
		JPanel p2=new JPanel();
		p2.setLayout(null);
		p2.setBackground(Color.yellow);
		p2.setBounds(0, 65, 310, 980);
		add(p2);
		
		addstudent=new JButton("Add Students");
		addstudent.setBounds(5, 60, 300, 35);
		addstudent.setBackground(Color.black);
		addstudent.setForeground(Color.white);
		addstudent.setFont(new Font("Tahoma",Font.BOLD,18));
		addstudent.setBorder(new LineBorder(Color.white));
		addstudent.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		addstudent.addActionListener(this);
		p2.add(addstudent);
		
		updatestudentdetails=new JButton("Update Students Details");
		updatestudentdetails.setBounds(5, 107, 300, 35);
		updatestudentdetails.setBackground(Color.black);
		updatestudentdetails.setForeground(Color.white);
		updatestudentdetails.setFont(new Font("Tahoma",Font.BOLD,18));
		updatestudentdetails.setBorder(new LineBorder(Color.white));
		updatestudentdetails.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		updatestudentdetails.addActionListener(this);
		p2.add(updatestudentdetails);
		
		
		viewstudent=new JButton("View All Students");
		viewstudent.setBounds(5, 154, 300, 35);
		viewstudent.setBackground(Color.black);
		viewstudent.setForeground(Color.white);
		viewstudent.setFont(new Font("Tahoma",Font.BOLD,18));
		viewstudent.setBorder(new LineBorder(Color.white));
		viewstudent.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		viewstudent.addActionListener(this);
		p2.add(viewstudent);
		
		
		searchstudent=new JButton("Search Students");
		searchstudent.setBounds(5, 201, 300, 35);
		searchstudent.setBackground(Color.black);
		searchstudent.setForeground(Color.white);
		searchstudent.setFont(new Font("Tahoma",Font.BOLD,18));
		searchstudent.setBorder(new LineBorder(Color.white));
		searchstudent.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		searchstudent.addActionListener(this);
		p2.add(searchstudent);
		
		removestudent=new JButton("Remove Students");
		removestudent.setBounds(5, 248, 300, 35);
		removestudent.setBackground(Color.black);
		removestudent.setForeground(Color.white);
		removestudent.setFont(new Font("Tahoma",Font.BOLD,18));
		removestudent.setBorder(new LineBorder(Color.white));
		removestudent.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		removestudent.addActionListener(this);
		p2.add(removestudent);
		
		teacher=new JButton("Teachers Details");
		teacher.setBounds(5, 295, 300, 35);
		teacher.setBackground(Color.black);
		teacher.setForeground(Color.white);
		teacher.setFont(new Font("Tahoma",Font.BOLD,18));
		teacher.setBorder(new LineBorder(Color.white));
		teacher.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		teacher.addActionListener(this);
		p2.add(teacher);
		
		
	    classroom=new JButton("Classrooms");
	    classroom.setBounds(5, 342, 300, 35);
	    classroom.setBackground(Color.black);
	    classroom.setForeground(Color.white);
	    classroom.setFont(new Font("Tahoma",Font.BOLD,18));
	    classroom.setBorder(new LineBorder(Color.white));
	    classroom.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    classroom.addActionListener(this);
		p2.add(classroom);
		

		science=new JButton("Science Lab");
		science.setBounds(5, 389, 300, 35);
		science.setBackground(Color.black);
		science.setForeground(Color.white);
		science.setFont(new Font("Tahoma",Font.BOLD,18));
		science.setBorder(new LineBorder(Color.white));
		science.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		science.addActionListener(this);
		p2.add(science);
		
		complabs=new JButton("Computer Lab");
		complabs.setBounds(5, 436, 300, 35);
		complabs.setBackground(Color.black);
		complabs.setForeground(Color.white);
		complabs.setFont(new Font("Tahoma",Font.BOLD,18));
		complabs.setBorder(new LineBorder(Color.white));
		complabs.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		complabs.addActionListener(this);
		p2.add(complabs);
		
		events=new JButton("Events");
		events.setBounds(5, 483, 300, 35);
		events.setBackground(Color.black);
		events.setForeground(Color.white);
		events.setFont(new Font("Tahoma",Font.BOLD,18));
		events.setBorder(new LineBorder(Color.white));
		events.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		events.addActionListener(this);
		p2.add(events);
		
		calculator=new JButton("Calculator");
		calculator.setBounds(5, 530, 300, 35);
		calculator.setBackground(Color.black);
		calculator.setForeground(Color.white);
		calculator.setFont(new Font("Tahoma",Font.BOLD,18));
		calculator.setBorder(new LineBorder(Color.white));
		calculator.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		calculator.addActionListener(this);
		p2.add(calculator);
				
		 
        notepad=new JButton("Notepad");
        notepad.setBounds(5, 577, 300, 35);
        notepad.setBackground(Color.black);
        notepad.setForeground(Color.white);
        notepad.setFont(new Font("Tahoma",Font.BOLD,18));
        notepad.setBorder(new LineBorder(Color.white));
        notepad.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        notepad.addActionListener(this);
		p2.add(notepad);
				
		logout=new JButton("Log Out");
		logout.addActionListener(this);
		logout.setBounds(5, 671, 300, 30);
		logout.setBackground(Color.black);
		logout.setForeground(Color.white);
		logout.setFont(new Font("Tahoma",Font.BOLD,18));
		logout.setBorder(new LineBorder(Color.white));
		logout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		p2.add(logout);
		
		about=new JButton("About Us");
		about.setBounds(5, 624, 300, 35);
		about.setBackground(Color.black);
		about.setForeground(Color.white);
		about.setFont(new Font("Tahoma",Font.BOLD,18));
		about.setBorder(new LineBorder(Color.white));
		about.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		about.addActionListener(this);
		p2.add(about);
		
		ImageIcon i4 = new ImageIcon(Dashboard.class.getResource("/Gallery/dashboard.jpg"));
		Image i5=i4.getImage().getScaledInstance(1650,1000,Image.SCALE_DEFAULT);
	    ImageIcon i6=new ImageIcon(i5);
		JLabel image=new JLabel(i6);
		image.setBounds(0,0,1650,1000);
        add(image);
		
		
		
		
        setUndecorated(true);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                  new Dashboard("");
	}


	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==addstudent) {
			  new Addstudent();  		  	
		}
		
		else if(e.getSource()==viewstudent) {
		       new Viewallstudents ();
		
		}
		else if(e.getSource()==searchstudent) {
			new  Searchstudents();
		}
		
		else if(e.getSource()==updatestudentdetails) {
			   new updatestudentdetails();
		}
		
		else if(e.getSource()==classroom) {
			new Classrooms();
		}
		
		else if(e.getSource()==science) {
			new Sciencelabs();
		}
		
		else if(e.getSource()==events) {
			 new Events();
		}

		else if(e.getSource()==complabs) {
			   new computerlabs();
		}
		
		else if(e.getSource()==calculator) {
			try {
				Runtime.getRuntime().exec("calc.exe");
			}
			catch(Exception e1) {
				e1.printStackTrace();
			}
		}

		else if(e.getSource()==notepad) {
			try {
				Runtime.getRuntime().exec("notepad.exe");
			}
			catch(Exception e1) {
				e1.printStackTrace();
			}
		}
		
		else if(e.getSource()==logout) {
			System.exit(0);
		}
		
		else if(e.getSource()==about) {
			  new About();
		}
		
		else if(e.getSource()==teacher) {
			new teacherdetails();
		}
		
		else if(e.getSource()==removestudent) {
			   new removestudents();
		}

	}

}
