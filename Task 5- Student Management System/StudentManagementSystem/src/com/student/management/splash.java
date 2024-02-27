package com.student.management;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


@SuppressWarnings("serial")
public class splash extends JFrame implements Runnable {

	Thread thread;
	splash(){
		setTitle("Welcome to the Student Management System");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(splash.class.getResource("/Gallery/icon.png")));
		ImageIcon i1 = new ImageIcon(splash.class.getResource("/Gallery/splash.jpg"));
	    Image i2=i1.getImage().getScaledInstance(1200,600,Image.SCALE_DEFAULT);
      	ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0,0,1200,600);
	    add(image);
	    
	    thread=new Thread(this);
	    
	    thread.start();
		
	    setUndecorated(true);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       splash frame=new splash();
       int x=1;
       for(int i=1;i<=500;x+=7,i+=6) {
		frame.setLocation(750-(x+i)/2,400-(i/2));
		frame.setSize(x+i,i);
		try {
			Thread.sleep(10);
		}
		catch(Exception e) {
		
		}
       }
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(3000);
			setVisible(false);
		       new Login();
		}
		catch(Exception e) {
			
		}
		
	}

}
