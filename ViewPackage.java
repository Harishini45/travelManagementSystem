package travel.management.system;
import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;


class ViewPackage extends JFrame implements ActionListener {
	String username;
	JLabel userlabel,idlabel,numfield,phonefield, pricefield,p,countfield;
	
	JButton back;
	
	ViewPackage(String username){
		this.username = username; 
		setBounds(350,150,850,500);
		setLayout(null);
		setVisible(true);
		getContentPane().setBackground(Color.white);
		JLabel title = new JLabel("VIEW PACKAGE DETAILS");
		  title.setBounds(90,17,350,30);
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
	  
	  JLabel pack = new JLabel("Select Package");
	  pack.setBounds(20,110,120,30);
	  pack.setFont(new Font("arial",Font.BOLD,15));
	  add(pack);
	  
	 JLabel p = new JLabel();
	  p.setBounds(180,110,200,30);
	  p.setFont(new Font("arial",Font.BOLD,15));
	  add(p);
	  JLabel persons = new JLabel("Total Persons");
	  persons.setBounds(20,160,100,30);
	  persons.setFont(new Font("arial",Font.BOLD,15));
	  add(persons);
	   countfield = new JLabel();
	  countfield.setBounds(180,160,200,30);
	  countfield.setFont(new Font("arial",Font.BOLD,15));
	  add(countfield);
	  JLabel name = new JLabel("ID");
	  name.setBounds(20,210,100,30);
	  name.setFont(new Font("arial",Font.BOLD,15));
	  add(name);
	 idlabel = new JLabel();
	  idlabel.setBounds(180,210,200,30);
	  idlabel.setFont(new Font("arial",Font.BOLD,15));
	  add(idlabel);
	  JLabel number = new JLabel("Number");
	  number.setBounds(20,260,100,30);
	  number.setFont(new Font("arial",Font.BOLD,15));
	  add(number);
	  
	   numfield = new JLabel();
	  numfield.setBounds(180,260,200,30);
	  numfield.setFont(new Font("arial",Font.BOLD,15));
	  add(numfield);
	  
	  JLabel phone = new JLabel("Phone");
	  phone.setBounds(20,310,100,30);
	  phone.setFont(new Font("arial",Font.BOLD,15));
	  add(phone);
	  phonefield = new JLabel();
	  phonefield.setBounds(180,310,200,30);
	  phonefield.setFont(new Font("arial",Font.BOLD,15));
	  add(phonefield);
	  
	  JLabel price = new JLabel("Total Price");
	  price.setBounds(20,360,100,30);
	  price.setFont(new Font("arial",Font.BOLD,15));
	  add(price);
	  pricefield = new JLabel();
	  pricefield.setBounds(180,360,200,30);
	  pricefield.setFont(new Font("arial",Font.BOLD,15));
	  add(pricefield);
	  back = new JButton("Back");
	  back.setBounds(360,400,150,30);
	  back.setFont(new Font("arial",Font.BOLD,15));
	  back.setBackground(Color.black);
	  back.setForeground(Color.white);
	  back.addActionListener(this);
	  add(back);
	  
	  ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/thekkady3.jpg"));
		Image i2 = i1.getImage().getScaledInstance(400,300,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image1 = new JLabel(i3);
		image1.setBounds(410,50,400,300);
		add(image1); 
		try {
			Conn con = new Conn();
			  String query = "select *from bookpackage where username = '"+username+"'";
			  ResultSet rs = con.s.executeQuery(query);
			  if(rs.next()) {
				  userlabel.setText(rs.getString("username"));
				  idlabel.setText(rs.getString("id"));
				  numfield.setText(rs.getString("number"));
				  phonefield.setText(rs.getString("phone"));
				  pricefield.setText(rs.getString("price"));
				  p.setText(rs.getString("package"));
				  countfield.setText(rs.getString("persons"));
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
		//new ViewPackage("");
	}
}
