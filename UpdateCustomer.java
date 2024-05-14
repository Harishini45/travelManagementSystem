package travel.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class UpdateCustomer extends JFrame implements ActionListener{
	String username;
	JButton update,back;
	JComboBox ids;
	JRadioButton male,female;
	JLabel namefield;
	JTextField numberfield,countryfield,addressfield,phonefield,mailfield;
	public UpdateCustomer(String username) {
		this.username = username;
		
		setBounds(350,150,850,500);
		setLayout(null);
		setVisible(true);
		getContentPane().setBackground(Color.white);
	  JLabel user = new JLabel("Username");
	  user.setBounds(20,50,100,30);
	  user.setFont(new Font("arial",Font.BOLD,15));
	  add(user);
	  JLabel userfield = new JLabel();
	  userfield.setBounds(140,50,100,30);
	  userfield.setFont(new Font("arial",Font.BOLD,15));
	  add(userfield);
	  
	  JLabel id = new JLabel("Id");
	  id.setBounds(20,90,100,30);
	  id.setFont(new Font("arial",Font.BOLD,15));
	  add(id);
	  String[] options = {"Passport","Aadhar Card","Pan Card","Ration Card"};
	   ids = new JComboBox(options);
	  ids.setBounds(140,90,250,30);
	  ids.setFont(new Font("arial",Font.BOLD,15));
	  add(ids);
	  JLabel number = new JLabel("Number");
	  number.setBounds(20,130,100,30);
	  number.setFont(new Font("arial",Font.BOLD,15));
	  add(number);
	  numberfield = new JTextField();
	  numberfield.setBounds(140,130,250,30);
	  numberfield.setFont(new Font("arial",Font.BOLD,15));
	  add(numberfield);
	  
	  JLabel name = new JLabel("Name");
	  name.setBounds(20,170,100,30);
	  name.setFont(new Font("arial",Font.BOLD,15));
	  add(name);
	   namefield = new JLabel();
	  namefield.setBounds(140,170,100,30);
	  namefield.setFont(new Font("arial",Font.BOLD,15));
	  add(namefield);
	  JLabel gender = new JLabel("Gender");
	  gender.setBounds(20,210,100,30);
	  gender.setFont(new Font("arial",Font.BOLD,15));
	  add(gender);
	  female = new JRadioButton("Female");
	  female.setBounds(140,210,80,30);
	  female.setFont(new Font("arial",Font.BOLD,15));
	  female.setBackground(Color.white);
	  add(female);
	   male = new JRadioButton("Male");
	 male.setBounds(250,210,80,30);
	 male.setBackground(Color.white);
	  male.setFont(new Font("arial",Font.BOLD,15));
	  add(male);
	ButtonGroup grp = new ButtonGroup();
	  grp.add(male);
	  grp.add(female);
	  JLabel country = new JLabel("Country");
	  country.setBounds(20,250,100,30);
	  country.setFont(new Font("arial",Font.BOLD,15));
	  add(country);
	   countryfield = new JTextField();
	  countryfield.setBounds(140,250,250,30);
	  countryfield.setFont(new Font("arial",Font.BOLD,15));
	  add(countryfield);
	  JLabel address = new JLabel("Address");
	  address.setBounds(20,290,100,30);
	  address.setFont(new Font("arial",Font.BOLD,15));
	  add(address);
	  addressfield = new JTextField();
	  addressfield.setBounds(140,290,250,30);
	  addressfield.setFont(new Font("arial",Font.BOLD,15));
	  add(addressfield);
	  
	  JLabel phone = new JLabel("Phone");
	  phone.setBounds(20,330,100,30);
	  phone.setFont(new Font("arial",Font.BOLD,15));
	  add(phone);
	  phonefield = new JTextField();
	  phonefield.setBounds(140,330,250,30);
	 phonefield.setFont(new Font("arial",Font.BOLD,15));
	  add(phonefield);
	  JLabel email = new JLabel("Email");
	  email.setBounds(20,370,100,30);
	  email.setFont(new Font("arial",Font.BOLD,15));
	  add(email);
	   mailfield = new JTextField();
	  mailfield.setBounds(140,370,250,30);
	  mailfield.setFont(new Font("arial",Font.BOLD,15));
	  add(mailfield);
	  update = new JButton("Update");
	  update.setBounds(140,410,100,30);
	  update.setFont(new Font("arial",Font.BOLD,15));
	  update.setBackground(Color.black);
	  update.setForeground(Color.white);
	  update.addActionListener(this);
	  add(update);
	   back = new JButton("Back");
	  back.setBounds(290,410,100,30);
	  back.setFont(new Font("arial",Font.BOLD,15));
	  back.setBackground(Color.black);
	  back.setForeground(Color.white);
	  back.addActionListener(this);
	  add(back);
	  
	  	JPanel p1 = new JPanel();
	  	p1.setBounds(400,0,450,550);
	  	p1.setLayout(null);
	  	p1.setBackground(Color.white);
	  	add(p1);
	  	ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/travellingperson.jpg"));
		Image i2 = i1.getImage().getScaledInstance(400,500,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0,0,400,500);
		p1.add(image);
		try {
			Conn con = new Conn();
			String query = "select *from account where username ='"+username+"'";
			ResultSet rs = con.s.executeQuery(query);
			if(rs.next()) {
				//String uname = username;
		        String  name1 = rs.getString(2);
		        userfield.setText(username);
		        namefield.setText(name1);
		        
			}
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == update) {
			String gender = "";
			if(male.isSelected()) {
				gender = "male";
			}
			else if(female.isSelected()) {
				gender = "female";
			}
			String uname = username;
			String name1 = namefield.getText();
			String id = (String)ids.getSelectedItem();
			String address1 = addressfield.getText();
			String mail1 = mailfield.getText();
			String phone1 = phonefield.getText();
			String country1=countryfield.getText();
			String number1 = numberfield.getText();
			
			try {
				Conn con = new Conn();
                String query = "update customer set id = '"+id+"',number ='"+number1+"',phone = '"+phone1+"',address='"+address1+"',email='"+mail1+"',country='"+country1+"' where username = '"+username+"'";
                System.out.println(query);
                con.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "customer details updated successfully");
                setVisible(false);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		else {
			setVisible(false);
		}
		
	}
   
	public static void main(String[] args) {
	//new UpdateCustomer("");

	}

}

	

	

