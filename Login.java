package travel.management.system;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
public class Login extends JFrame implements ActionListener{
	JButton login,signup, password1;
	JTextField userfield;
	JPasswordField passfield;
	Login(){
		setSize(700,300);//width,height
		setLocation(400,200);
		setVisible(true);
		setLayout(null);
		JPanel p1 = new JPanel();
		p1.setBackground(Color.white);
		p1.setLayout(null);
		p1.setBounds(0,0,300,400);
		add(p1);
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/person.png"));
		Image i2 = i1.getImage().getScaledInstance(220, 230,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l1 = new JLabel(i3);
		l1.setBounds(35,10,200,230);
		 
		p1.add(l1);
		//pl.add(i3);
		JPanel p2 = new JPanel();
		p2.setBounds(300,0,400,300);//left,top,width,height
		p2.setBackground(Color.white);
		
		p2.setLayout(null);
		add(p2);
		JLabel user = new JLabel("Username");
		user.setFont(new Font("Arial",Font.BOLD,16));
		user.setBounds(20,10,150,30);
		p2.add(user);
		 userfield = new JTextField();
		userfield.setFont(new Font("Raleway",Font.BOLD,15));
		userfield.setBounds(20,50,300,30);
		userfield.setBackground(Color.white);
		 Border border = BorderFactory.createLineBorder(Color.black, 2);
		 userfield.setBorder(border);
		p2.add(userfield);
		JLabel password = new JLabel("Password");
		password.setFont(new Font("Arial",Font.BOLD,16));
		password.setBounds(20,90,150,30);
		p2.add(password);
		passfield = new JPasswordField();
		passfield.setFont(new Font("Raleway",Font.BOLD,15));
		passfield.setBounds(20,120,300,30);
		passfield.setBackground(Color.white);
		 Border border1 = BorderFactory.createLineBorder(Color.black, 2);
		 passfield.setBorder(border1);
		p2.add(passfield);
		login = new JButton("Login");
		login.setBounds(20,160,130,30);
		login.setFont(new Font("Raleway",Font.BOLD,15));
		login.setBackground(new Color(182,237,246));
		login.addActionListener(this);
		p2.add(login);
		signup = new JButton("Signup");
		signup.setBounds(170,160,130,30);
		signup.setFont(new Font("Raleway",Font.BOLD,15));
		signup.setBackground(new Color(182,237,246));
		signup.addActionListener(this);
		signup.addActionListener(this);
		p2.add(signup);
		
		password1 = new JButton("Forgot Password");
		password1.setBounds(75,210,160,30);
		password1.setFont(new Font("Raleway",Font.BOLD,15));
		password1.setBackground(new Color(182,237,246));
		password1.addActionListener(this);
		p2.add(password1);		
		
		
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == login) {
		   try {
			   Conn con = new Conn();
			   String username = userfield.getText();
			   String password = passfield.getText();
			   String query = "select username,password from account where username = '"+username+"'and password = '"+password+"'";
			   System.out.println(query);
			   ResultSet rs = con.s.executeQuery(query);
			   if(rs.next()) {
				 //String user$name = rs.getString(1);
				// String pass$word = rs.getString(2);
				 //if(username.equals(user$name) && password.equals(pass$word)) {
					 setVisible(false);
					 new Loading(username);
					// new Page(username);
					 
				 }
				
			   
			   else {
				   JOptionPane.showMessageDialog(null, "invalid credentials");
			   }
		   }
		
			   
		   
		   catch(Exception e) {
			   e.printStackTrace();
			   }
		}
		else if(ae.getSource() == signup) {
			setVisible(false);
			new Signup();
		}
		else if(ae.getSource() == password1) {
			setVisible(false);
			new ForgetPassword();
		}
	}

	public static void main(String[] args) {
		//new Login();

	}

}
