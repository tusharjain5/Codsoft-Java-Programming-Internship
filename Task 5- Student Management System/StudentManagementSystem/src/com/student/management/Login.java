package com.student.management;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
@SuppressWarnings("serial")
public class Login extends JFrame implements ActionListener {
     JTextField tfusername;
     JPasswordField password;
	 JButton login,reset,exit;
	
	 Login(){
		 setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/Gallery/icon.png")));
		 getContentPane().setBackground(Color.black);
		 setResizable(false);
		 setLayout(null);
	
		 JLabel head1=new JLabel("Login");
		 head1.setForeground(Color.yellow);
		 head1.setBounds(130,20,100,50);
		 head1.setFont(new Font("Tahoma",Font.BOLD,30));
		 add(head1);
		 
		 
		JLabel user=new JLabel("Username");
		user.setForeground(Color.white);
		user.setBounds(40,90,100,30);
		user.setFont(new Font("Century Schoolbook",Font.BOLD,17));
		add(user);
		
		tfusername=new JTextField();
		tfusername.setBounds(150, 90, 150, 30);
		tfusername.setBorder(BorderFactory.createEmptyBorder());
		tfusername.setFont(new Font("Eras Bold ITC",Font.PLAIN,17));
		
		add(tfusername);
		
		
		JLabel pass=new JLabel("Password");
		pass.setForeground(Color.white);
		pass.setBounds(40,150,100,30);
		pass.setFont(new Font("Century Schoolbook",Font.BOLD,17));
		add(pass);
		
		password=new JPasswordField();
		password.setBounds(150, 150, 150, 30);
		password.setBorder(BorderFactory.createEmptyBorder());
		password.setFont(new Font("Eras Bold ITC",Font.PLAIN,17));
		add(password);
		
		login=new JButton("Login");
		login.setBounds(40, 210, 260, 30);
		login.setBackground(Color.red);
		login.setForeground(Color.white);
		login.setFont(new Font("Eras Bold ITC",Font.PLAIN,17));
		login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		login.setBorder(BorderFactory.createEmptyBorder());
		login.addActionListener(this);
		add(login);
		
		
		reset=new JButton("Back");
		reset.setBounds(40, 260, 120, 30);
		reset.setBackground(Color.green);
		reset.setForeground(Color.white);
		reset.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		reset.setBorder(BorderFactory.createEmptyBorder());
		reset.setFont(new Font("Eras Bold ITC",Font.PLAIN,17));
		reset.addActionListener(this);
		add(reset);
		
		exit=new JButton("Exit");
		exit.setBounds(180, 260, 120, 30);
		exit.setBackground(Color.green);
		exit.setForeground(Color.white);
		exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		exit.setBorder(BorderFactory.createEmptyBorder());
		exit.setFont(new Font("Eras Bold ITC",Font.PLAIN,17));
		exit.addActionListener(this);
		add(exit);
		
		
		
		
		ImageIcon i1 = new ImageIcon(Login.class.getResource("/Gallery/schoolkids.png"));
		Image i2=i1.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(340,0,300,300);
		add(image);
		
		setUndecorated(true);
		setBounds(380,230,600,300);
		setVisible(true);
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

            new Login();
	
	}




	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login) {
			String user=tfusername.getText();
			@SuppressWarnings("deprecation")
			String pass=password.getText();
		
		try {
			Conn c=new Conn();
			String query="Select * from login where username='"+user+"'and password='"+pass+"'";
			ResultSet rs=c.s.executeQuery(query);
			if(rs.next()) {
				setVisible(false);
				new Dashboard("");
			}
			else {
				JOptionPane.showMessageDialog(null,"Invalid Username and Passoword");
				
			}
		}
		catch(Exception e1) {
			e1.printStackTrace();
		}
	
		}
		else if(e.getSource()==exit) {
			System.exit(0);
			   
		}
		else if(e.getSource()==reset) {
			setVisible(false);

		}
		
		
	}

}
