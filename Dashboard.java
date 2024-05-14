package travel.management.system;
import java.awt.Color;
import java.sql.*;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.LineBorder;

public class Dashboard extends JFrame implements ActionListener{
	String username;
	JButton personaldetails,updatepersonaldetails,viewdetails,deletepersonaldetails,checkpackage,bookpackage;
	JButton viewpackage,viewhotels,bookhotels,viewbookedhotel,destinations,payments,notepad,about,calculator;
	Dashboard(String username){
		this.username = username;
		//setExtendedState(JFrame.MAXIMIZED_BOTH);//to set the jframe for our 
		//systems full screen if we dont know the size
		setBounds(0,0,1366,768);
		setLayout(null);
		setVisible(true);
		JPanel p1 = new JPanel();
		p1.setBounds(0,0,1366,40);
		p1.setLayout(null);
		p1.setBackground(new Color(66,105,47));
		ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
		Image i5 = i4.getImage().getScaledInstance(30,30,Image.SCALE_DEFAULT);
		ImageIcon i6 = new ImageIcon(i5);
		JLabel image1 = new JLabel(i6);
		image1.setBounds(5,5,30,30);
		p1.add(image1);
		JLabel text = new JLabel("Dashboard");
		text.setBounds(60,5,150,30);
		text.setForeground(Color.white);
		text.setFont(new Font("Arial",Font.BOLD,18));
		p1.add(text);
		
		
		add(p1);
		
		JPanel p2 = new JPanel();
		p2.setBounds(0,40,300,738);
		p2.setBackground(Color.pink);
		p2.setLayout(null);
		add(p2);
		JPanel p3 = new JPanel();
		p3.setBounds(300,40,1066,738);
		p3.setBackground(new Color(66,105,47));
		add(p3);
		LineBorder b = new LineBorder(Color.white,2);
	 personaldetails = new JButton("Add Personal Details");
		personaldetails.setBounds(0,0,300,49);
		personaldetails.setBackground(new Color(66,105,47));
		personaldetails.setForeground(Color.white);
		personaldetails.setFont(new Font("Raleway",Font.BOLD,18));
	    personaldetails.setBorder(b);
	    personaldetails.addActionListener(this);
		p2.add(personaldetails);
		updatepersonaldetails = new JButton("Update Personal Details");
		updatepersonaldetails.setBounds(0,49,300,49);
		updatepersonaldetails.setBackground(new Color(66,105,47));
		updatepersonaldetails.setForeground(Color.white);
		updatepersonaldetails.setFont(new Font("Raleway",Font.BOLD,15));
		updatepersonaldetails.setBorder(b);
		updatepersonaldetails.addActionListener(this);
		p2.add(updatepersonaldetails);
		viewdetails = new JButton("View Details");
		viewdetails.setBounds(0,98,300,49);
		viewdetails.setBackground(new Color(66,105,47));
		viewdetails.setForeground(Color.white);
		viewdetails.setFont(new Font("Raleway",Font.BOLD,15));
	    viewdetails.setBorder(b);
	    viewdetails.addActionListener(this);
	    
		p2.add(viewdetails);
		 deletepersonaldetails = new JButton("Delete Personal Details");
		deletepersonaldetails.setBounds(0,147,300,49);
		deletepersonaldetails.setBackground(new Color(66,105,47));
		deletepersonaldetails.setForeground(Color.white);
		deletepersonaldetails.setFont(new Font("Raleway",Font.BOLD,15));
		deletepersonaldetails.setBorder(b);
		deletepersonaldetails.addActionListener(this);
		
		p2.add(deletepersonaldetails);
		 checkpackage = new JButton("Check Package");
		checkpackage.setBounds(0,196,300,49);
		checkpackage.setBackground(new Color(66,105,47));
		checkpackage.setForeground(Color.white);
		checkpackage.setFont(new Font("Raleway",Font.BOLD,15));
		checkpackage.setBorder(b);
		checkpackage.addActionListener(this);
		p2.add(checkpackage);
		 bookpackage = new JButton("Book Package");
		bookpackage.setBounds(0,245,300,49);
		bookpackage.setBackground(new Color(66,105,47));
		bookpackage.setForeground(Color.white);
		bookpackage.setFont(new Font("Raleway",Font.BOLD,15));
		bookpackage.setBorder(b);
		bookpackage.addActionListener(this);
		p2.add(bookpackage);
		viewpackage = new JButton("View Package");
		viewpackage.setBounds(0,294,300,49);
		viewpackage.setBackground(new Color(66,105,47));
		viewpackage.setForeground(Color.white);
		viewpackage.setFont(new Font("Raleway",Font.BOLD,15));
		viewpackage.setBorder(b);
		viewpackage.addActionListener(this);
		p2.add(viewpackage);
		viewhotels = new JButton("View Hotels");
		viewhotels.setBounds(0,343,300,49);
		viewhotels.setBackground(new Color(66,105,47));
		viewhotels.setForeground(Color.white);
		viewhotels.setFont(new Font("Raleway",Font.BOLD,15));
		viewhotels.setBorder(b);
		viewhotels.addActionListener(this);
		p2.add(viewhotels);
		 bookhotels = new JButton("Book Hotels");
		bookhotels.setBounds(0,392,300,49);
		bookhotels.setBackground(new Color(66,105,47));
		bookhotels.setForeground(Color.white);
		bookhotels.setFont(new Font("Raleway",Font.BOLD,15));
		bookhotels.setBorder(b);
		bookhotels.addActionListener(this);
		p2.add(bookhotels);
		viewbookedhotel = new JButton("View Booked Hotel");
		viewbookedhotel.setBounds(0,441,300,49);
		viewbookedhotel.setBackground(new Color(66,105,47));
		viewbookedhotel.setForeground(Color.white);
		viewbookedhotel.setFont(new Font("Raleway",Font.BOLD,15));
		viewbookedhotel.setBorder(b);
		viewbookedhotel.addActionListener(this);
		p2.add(viewbookedhotel);
		destinations = new JButton("Destinations");
		destinations.setBounds(0,490,300,49);
		destinations.setBackground(new Color(66,105,47));
		destinations.setForeground(Color.white);
		destinations.setFont(new Font("Raleway",Font.BOLD,15));
		destinations.setBorder(b);
		destinations.addActionListener(this);
		p2.add(destinations);
		 payments = new JButton("Payments");
		payments.setBounds(0,539,300,49);
		payments.setBackground(new Color(66,105,47));
		payments.setForeground(Color.white);
		payments.setFont(new Font("Raleway",Font.BOLD,15));
		payments.setBorder(b);
		payments.addActionListener(this);
		p2.add(payments);
		calculator = new JButton("Calculator");
		calculator.setBounds(0,588,300,49);
		calculator.setBackground(new Color(66,105,47));
		calculator.setForeground(Color.white);
		calculator.setFont(new Font("Raleway",Font.BOLD,15));
		calculator.setBorder(b);
		calculator.addActionListener(this);
		p2.add(calculator);
		notepad = new JButton("Notepad");
		notepad.setBounds(0,626,300,38);
		notepad.setBackground(new Color(66,105,47));
		notepad.setForeground(Color.white);
		notepad.setFont(new Font("Raleway",Font.BOLD,15));
		notepad.setBorder(b);
		notepad.addActionListener(this);
		p2.add(notepad);
		 about = new JButton("About");
		about.setBounds(0,666,300,35);
		about.setBackground(new Color(66,105,47));
		about.setForeground(Color.white);
		about.setFont(new Font("Raleway",Font.BOLD,15));
		about.setBorder(b);
		about.addActionListener(this);
		p2.add(about);
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/frontimage.jpg"));
		Image i2 = i1.getImage().getScaledInstance(1600,730,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0,0,1600,730);
		p3.add(image);
		JLabel text1 = new JLabel("Travel and Tourism Management System");
		text1.setBounds(150,5,600,30);
		p3.setLayout(null);
		p3.setBackground(Color.DARK_GRAY);
		text1.setForeground(new Color(66,105,47));
		text1.setFont(new Font("Arial",Font.BOLD,30));
		image.add(text1);
		
		
		
		
		
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == personaldetails ) {
			new AddCustomer(username);
			
		}
		else if(ae.getSource() == updatepersonaldetails ) {
			new UpdateCustomer(username);
			
		}
		else if(ae.getSource() == viewdetails ) {
	     new ViewCustomer(username);
}
		else if(ae.getSource() == deletepersonaldetails ) {
			try {
			 Conn con = new Conn();
			   String uname = username;
			
			   String query = "delete from account where username =+'"+uname+"'";
			   System.out.println(query);
			   int rs = con.s.executeUpdate(query);
			 
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		else if(ae.getSource() == checkpackage ) {
	     new CheckPackage();
}
		else if(ae.getSource() == bookpackage ) {
	     new BookPackage(username);
}
		else if(ae.getSource() == viewpackage ) {
		     new ViewPackage(username);
	}
		else if(ae.getSource() == viewhotels ) {
	new CheckHotels();
}
		else if(ae.getSource() == bookhotels ) {
	new BookHotel(username);
}
		else if(ae.getSource() == viewbookedhotel ) {
	new ViewHotel(username);
}
		else if(ae.getSource() == destinations ) {
	      new CheckHotels();
}
		else if(ae.getSource() == payments ) {
			
		}
	      
		else if(ae.getSource() == notepad ) {
			try {
				Runtime.getRuntime().exec("notepad.exe");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		else if(ae.getSource() == calculator) {
			try {
				Runtime.getRuntime().exec("calc.exe");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		else if(ae.getSource() == about ) {
			
		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//new Dashboard("");

	}

}
