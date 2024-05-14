package travel.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.*;

public class ViewHotel extends JFrame implements ActionListener {
	String username;
	JLabel userlabel,idlabel,numfield,phonefield, pricefield;
	
	JButton back;
	JLabel countfield,daysfield,p,acfield,foodfield;
	ViewHotel(String username){
		this.username = username; 
		setBounds(150,0,900,700);
		setLayout(null);
		setVisible(true);
		getContentPane().setBackground(Color.white);
		JLabel title = new JLabel("VIEW HOTEL DETAILS");
		  title.setBounds(90,17,230,30);
		  title.setFont(new Font("arial",Font.BOLD,25));
		  add(title);
	  JLabel user = new JLabel("Username");
	  user.setBounds(20,50,100,30);
	  user.setFont(new Font("arial",Font.BOLD,15));
	  add(user);
	   userlabel = new JLabel(username);
	  userlabel.setBounds(180,50,200,30);
	  userlabel.setFont(new Font("arial",Font.BOLD,15));
	  add(userlabel);
	  
	  JLabel pack = new JLabel("Select Hotel");
	  pack.setBounds(20,110,120,30);
	  pack.setFont(new Font("arial",Font.BOLD,15));
	  add(pack);
	 
	  
	  p = new JLabel();
	  p.setBounds(180,110,200,30);
	  p.setFont(new Font("arial",Font.BOLD,15));
	  add(p);
	  JLabel persons = new JLabel("Total Persons");
	  persons.setBounds(20,160,100,30);
	  persons.setFont(new Font("arial",Font.BOLD,15));
	  add(persons);
	   countfield = new JLabel("1");
	  countfield.setBounds(180,160,200,30);
	  countfield.setFont(new Font("arial",Font.BOLD,15));
	  add(countfield);
	  JLabel days = new JLabel("No of Days");
	  days.setBounds(20,210,100,30);
	  days.setFont(new Font("arial",Font.BOLD,15));
	  add(days);
	   daysfield = new JLabel();
	  daysfield.setBounds(180,210,200,30);
	  daysfield.setFont(new Font("arial",Font.BOLD,15));
	  add(daysfield);
	  JLabel ac = new JLabel("Ac/Non-Ac");
	  ac.setBounds(20,260,100,30);
	  ac.setFont(new Font("arial",Font.BOLD,15));
	  add(ac);
	 
	   acfield = new JLabel();
	  acfield.setBounds(180,260,200,30);
	  acfield.setFont(new Font("arial",Font.BOLD,15));
	  add(acfield);
	  JLabel food = new JLabel("Food Included");
	  food.setBounds(20,310,150,30);
	  food.setFont(new Font("arial",Font.BOLD,15));
	  add(food);

	   foodfield = new JLabel();
	  foodfield.setBounds(180,310,200,30);
	  foodfield.setFont(new Font("arial",Font.BOLD,15));
	  add(foodfield);
	  
	  
	  JLabel name = new JLabel("ID");
	  name.setBounds(20,360,100,30);
	  name.setFont(new Font("arial",Font.BOLD,15));
	  add(name);
	 idlabel = new JLabel();
	  idlabel.setBounds(180,360,200,30);
	  idlabel.setFont(new Font("arial",Font.BOLD,15));
	  add(idlabel);
	  JLabel number = new JLabel("Number");
	  number.setBounds(20,410,100,30);
	  number.setFont(new Font("arial",Font.BOLD,15));
	  add(number);
	  
	   numfield = new JLabel();
	  numfield.setBounds(180,410,200,30);
	  numfield.setFont(new Font("arial",Font.BOLD,15));
	  add(numfield);
	  
	  JLabel phone = new JLabel("Phone");
	  phone.setBounds(20,460,100,30);
	  phone.setFont(new Font("arial",Font.BOLD,15));
	  add(phone);
	  phonefield = new JLabel();
	  phonefield.setBounds(180,460,200,30);
	  phonefield.setFont(new Font("arial",Font.BOLD,15));
	  add(phonefield);
	  
	  JLabel price = new JLabel("Total Price");
	  price.setBounds(20,510,100,30);
	  price.setFont(new Font("arial",Font.BOLD,15));
	  add(price);
	  pricefield = new JLabel();
	  pricefield.setBounds(180,510,200,30);
	  pricefield.setFont(new Font("arial",Font.BOLD,15));
	  add(pricefield);
	  
	  ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/hotel6.jpg"));
		Image i2 = i1.getImage().getScaledInstance(420,450,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image1 = new JLabel(i3);
		image1.setBounds(410,80,420,450);
		add(image1);
		
		  back = new JButton("Back");
		  back.setBounds(360,570,150,30);
		  back.setFont(new Font("arial",Font.BOLD,15));
		  back.setBackground(Color.blue);
		  back.setForeground(Color.white);
		  back.addActionListener(this);
		  add(back);
		  try {
			  Conn con = new Conn();
			  String query = "select *from bookhotel where username = '"+username+"'";
			  ResultSet rs = con.s.executeQuery(query);
			  if(rs.next()) {
			
				  userlabel.setText(rs.getString(1));
				  idlabel.setText(rs.getString(7));
				  numfield.setText(rs.getString(8));
				 phonefield.setText(rs.getString(9));
				 pricefield.setText(rs.getString(10));
				 countfield.setText(rs.getString(3));
				 daysfield.setText(rs.getString(4));
				  p.setText(rs.getString(2));
				 acfield.setText(rs.getString(5));
				 foodfield.setText(rs.getString(6));
				
				 
			  }
		  }
		  catch(Exception e) {
			  e.printStackTrace();
		  }
		
	}
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource() == back) {
			setVisible(false);
		}
	}


	public static void main(String[] args) {
		//new ViewHotel("");
	}
	
	}



