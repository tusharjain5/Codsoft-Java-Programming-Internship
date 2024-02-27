package com.student.management;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.event.*;
import java.awt.*;

@SuppressWarnings("serial")
public class About extends JFrame implements ActionListener{

	JButton back;
	
	About(){
		setIconImage(Toolkit.getDefaultToolkit().getImage(About.class.getResource("/Gallery/icon.png")));
		setTitle("About Us");
		setBounds(325,165,1020,580);
		getContentPane().setBackground(Color.black);
		setLayout(null);
		setResizable(false);
	
		JLabel title=new JLabel("About Us");
		title.setBounds(420, 25, 350, 30);
		title.setFont(new Font("Tahoma",Font.BOLD,28));
		title.setForeground(Color.white);
		add(title);
		
		
		
		String para=
                 
"At our Student Management System, we prioritize efficiency and effectiveness in handling student data, providing a streamlined platform for updating, adding, editing, and removing student and student details. Additionally, users can effortlessly navigate through various features such as viewing classrooms, computer labs, events, and science labs.\n"+
"\n"+
"Our Mission\n"+
"\n"+
"Our mission revolves around facilitating seamless management of student and teacher information, ensuring that educational institutions have the tools they need to thrive. By offering a user-friendly interface and comprehensive functionality, we aim to simplify administrative tasks and enhance overall productivity within educational environments.\n"+
"\n"+
"Our Team\n"+
"\n"+
"Behind our Student Management System is a dedicated team of developers and educational professionals committed to delivering top-notch solutions. With a deep understanding of both technological intricacies and educational requirements, our team is devoted to providing innovative systems that cater to the evolving needs of educational institutions.\n"+
"\n"+
"Contact Us\n"+
"\n"+
"Do you have questions, suggestions, or feedback? We're here to assist you! Feel free to reach out to us at jaint8648@gmail.com, and let's collaborate to optimize your educational management processes. Join us as we embark on a journey to transform educational administration for the better.\n"+
		"\n";
		
		TextArea area=new TextArea(para,10,40,Scrollbar.VERTICAL);
		area.setEditable(false);
		area.setFont(new Font("Times New Roman",Font.BOLD,18));
		area.setBackground(Color.black);
        area.setForeground(Color.white);
		area.setBounds(20, 70, 980, 470);
		add(area);
		
		
		back=new JButton("Back");
		back.setBounds(425, 545, 150, 30);
		back.setBackground(Color.black);
		back.setForeground(Color.white);
		back.setFont(new Font("Tahoma",Font.BOLD,18));
		back.setBorder(new LineBorder(Color.white));
		back.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		back.addActionListener(this);
		add(back);
		
		setUndecorated(true);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           new About();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	     if(e.getSource()==back) {
	    	 setVisible(false);
	     }
	}
	

}
