package travel.management.system;

import java.awt.Color;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class ViewCustomer extends JFrame implements ActionListener {
	String username;
	JButton back;
	ViewCustomer(String username){
		this.username = username;
		setBounds(350,150,850,500);
		setLayout(null);
		setVisible(true);
		getContentPane().setBackground(Color.white);
	  JLabel user = new JLabel("Username");
	  user.setBounds(20,50,100,30);
	  user.setFont(new Font("arial",Font.BOLD,15));
	  add(user);
	  JLabel userlabel = new JLabel();
	  userlabel.setBounds(180,50,200,30);
	  userlabel.setBackground(Color.pink);
	  userlabel.setOpaque(true);
	  userlabel.setFont(new Font("arial",Font.BOLD,15));
	  add(userlabel);
	  
	  JLabel id = new JLabel("Id");
	  id.setBounds(20,110,100,30);
	  id.setFont(new Font("arial",Font.BOLD,15));
	  add(id);
	  JLabel idlabel = new JLabel();
	  idlabel.setBounds(180,110,200,30);
	  idlabel.setBackground(Color.pink);
	  idlabel.setOpaque(true);
	  idlabel.setFont(new Font("arial",Font.BOLD,15));
	  add(idlabel);
	  JLabel number = new JLabel("Number");
	  number.setBounds(20,160,100,30);
	  number.setFont(new Font("arial",Font.BOLD,15));
	  add(number);
	  JLabel numberlabel = new JLabel();
	  numberlabel.setBounds(180,160,200,30);
	  numberlabel.setBackground(Color.pink);
	  numberlabel.setOpaque(true);
	  numberlabel.setFont(new Font("arial",Font.BOLD,15));
	  add(numberlabel);
	  JLabel name = new JLabel("Name");
	  name.setBounds(20,210,100,30);
	  name.setFont(new Font("arial",Font.BOLD,15));
	  add(name);
	  JLabel namelabel = new JLabel();
	  namelabel.setBounds(180,210,200,30);
	  namelabel.setBackground(Color.pink);
	  namelabel.setOpaque(true);
	  namelabel.setFont(new Font("arial",Font.BOLD,15));
	  add(namelabel);
	  JLabel gender = new JLabel("Gender");
	  gender.setBounds(20,260,100,30);
	  gender.setFont(new Font("arial",Font.BOLD,15));
	  add(gender);
	  JLabel genderlabel = new JLabel();
	  genderlabel.setBounds(180,260,200,30);
	  genderlabel.setBackground(Color.pink);
	  genderlabel.setOpaque(true);
	  genderlabel.setFont(new Font("arial",Font.BOLD,15));
	  add(genderlabel);
	  JLabel country = new JLabel("Country");
	  country.setBounds(430,50,100,30);
	  country.setFont(new Font("arial",Font.BOLD,15));
	  add(country);
	  JLabel countrylabel = new JLabel();
	  countrylabel.setBounds(550,50,300,30);
	  countrylabel.setBackground(Color.pink);
	  countrylabel.setOpaque(true);
	  countrylabel.setFont(new Font("arial",Font.BOLD,15));
	  add(countrylabel);
	  JLabel address = new JLabel("Address");
	  address.setBounds(430,110,100,30);
	  address.setFont(new Font("arial",Font.BOLD,15));
	  add(address);
	  JLabel addresslabel = new JLabel();
	  addresslabel.setBounds(550,110,300,30);
	  addresslabel.setBackground(Color.pink);
	  addresslabel.setOpaque(true);
	  addresslabel.setFont(new Font("arial",Font.BOLD,12));
	  add( addresslabel);
	  
	  JLabel phone = new JLabel("Phone");
	  phone.setBounds(430,160,100,30);
	  phone.setFont(new Font("arial",Font.BOLD,15));
	  add(phone);
	  JLabel phonelabel = new JLabel();
	  phonelabel.setBounds(550,160,300,30);
	  phonelabel.setBackground(Color.pink);
	  phonelabel.setOpaque(true);
	  phonelabel.setFont(new Font("arial",Font.BOLD,15));
	  add(phonelabel);
	  JLabel email = new JLabel("Email");
	  email.setBounds(430,210,100,30);
	  email.setFont(new Font("arial",Font.BOLD,15));
	  add(email);
	  JLabel maillabel = new JLabel();
	  maillabel.setBounds(550,210,300,30);
	  maillabel.setBackground(Color.pink);
	  maillabel.setOpaque(true);
	  maillabel.setFont(new Font("arial",Font.BOLD,12));
	  add(maillabel);
	  back = new JButton("Back");
	  back.setBounds(430,270,100,30);
	  back.setFont(new Font("arial",Font.BOLD,15));
	  back.setBackground(Color.black);
	  back.setForeground(Color.white);
	  back.addActionListener(this);
	  add(back);
	  ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/customers.jpg"));
		Image i2 = i1.getImage().getScaledInstance(750,200,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0,300,750,200);
		add(image);
	   
	    	try {
				Conn con = new Conn();
                String query ="select *from customer where username ='"+username+"'";
                System.out.println(query);
              ResultSet rs =  con.s.executeQuery(query);
               // JOptionPane.showMessageDialog(null, "customer details added successfully");
                if(rs.next()) {
                	String uname = rs.getString(1);
                	String id1 = rs.getString(2);
                	String number1 = rs.getString(3);
                	String name1 = rs.getString(4);
                	String gender1 = rs.getString(5);
                	String country1 = rs.getString(6);
                	String address1 = rs.getString(7);
                	String phone1 = rs.getString(8);
                	String mail = rs.getString(9);
                	userlabel.setText(uname);
                	idlabel.setText(id1);
                	numberlabel.setText(number1);
                	namelabel.setText(name1);
                	genderlabel.setText(gender1);
                	countrylabel.setText(country1);
                	addresslabel.setText(address1);
                	phonelabel.setText(phone1);
                	maillabel.setText(mail);
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
		//new ViewCustomer("");

	}

}
