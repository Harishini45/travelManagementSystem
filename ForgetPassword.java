package travel.management.system;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ForgetPassword extends JFrame implements ActionListener {
	JButton back,search,retrieve;
	JTextField userfield, namefield,ansfield,passwordfield,securefield;
	String password = "";
	String answer = "";
	
	boolean check = false;
	ForgetPassword(){
		Border border1 = BorderFactory.createLineBorder(Color.black, 2);
		setBounds(350,200,600,400);
		setVisible(true);
		getContentPane().setBackground(Color.white);
		setLayout(null);
		JPanel p1 = new JPanel();
		p1.setBounds(10,10,590,390);
		p1.setLayout(null);
		p1.setBackground(new Color(220,220,220));
		add(p1);
		/*JPanel p2 = new JPanel();
		p2.setBounds(600,0,300,400);
		p2.setLayout(null);
		add(p2);
		p2.setBackground(new Color(182,237,246));
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/passwordunlock.png"));
		Image i2 = i1.getImage().getScaledInstance(300, 250,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l1 = new JLabel(i3);
		l1.setBounds(10,15,300,250);
		p2.add(l1);*/
		JLabel l2 = new JLabel("Username");
	    l2.setBounds(50,30,120,30);
	    l2.setFont(new Font("Raleway",Font.BOLD,19));
	   p1.add(l2);
	    
	    userfield = new JTextField();
	    userfield.setBounds(250,30,200,30);
	    userfield.setBorder(border1);
	    userfield.setFont(new Font("Raleway",Font.BOLD,15));
	    p1.add(userfield);
	    search = new JButton("Search");
	    search.setBounds(470,30,100,30);
	    search.setBorder(border1);
	    search.setBackground(new Color(182,237,246));
	    search.setFont(new Font("Raleway",Font.BOLD,15));
	    search.setForeground(Color.black);
	    search.addActionListener(this);
	    p1.add(search);
		JLabel l3 = new JLabel("Name");
	    l3.setBounds(50,82,100,30);
	    l3.setFont(new Font("Raleway",Font.BOLD,19));
	    p1.add(l3);
	    namefield = new JTextField();
	    namefield.setBounds(250,82,200,30);
	    namefield.setBorder(border1);
	    namefield.setFont(new Font("Raleway",Font.BOLD,15));
	    p1.add(namefield);
		
		JLabel l5 = new JLabel("Security Question");
		l5.setBounds(50,125,170,30);
	    //l5.setBounds(50,165,200,30);
	    l5.setFont(new Font("Raleway",Font.BOLD,19));
	    p1.add(l5);
	    securefield = new JTextField();
	    securefield.setBounds(250,125,200,30);
	    securefield.setBorder(border1);
	    securefield.setFont(new Font("Raleway",Font.BOLD,11));
	    p1.add(securefield);
	  
	    JLabel l6 = new JLabel("Answer");
	    l6.setBounds(50,165,120,30);
	    //l6.setBounds(50,210,100,30);
	    l6.setFont(new Font("Raleway",Font.BOLD,19));
	    p1.add(l6);
	    ansfield = new JTextField();
	    ansfield.setBorder(border1);
	    ansfield.setBounds(250,165,200,30);
	    ansfield.setFont(new Font("Raleway",Font.BOLD,15));
	    p1.add(ansfield);
	    retrieve = new JButton("Retrieve");
	    retrieve.setBounds(470,165,100,30);
	    retrieve.setBorder(border1);
	    retrieve.setBackground(new Color(182,237,246));
	    retrieve.setFont(new Font("Raleway",Font.BOLD,15));
	    retrieve.setForeground(Color.black);
	    retrieve.addActionListener(this);
	   p1.add(retrieve);
	    JLabel l4 = new JLabel("Password");
	    l4.setBounds(50,200,120,30);
	    l4.setFont(new Font("Raleway",Font.BOLD,19));
	   p1.add(l4);
	  passwordfield = new JTextField();
	  passwordfield.setBounds(250,200,200,30);
	  passwordfield.setBorder(border1);
	    p1.add(passwordfield);
	   back = new JButton("Back");
	    back.setBounds(190,260,150,30);
	    back.setBorder(border1);
	    back.setBackground(new Color(182,237,246));
	    back.setFont(new Font("Raleway",Font.BOLD,15));
	    back.setForeground(Color.black);
	    back.addActionListener(this);
	    p1.add(back);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == search) {
			String username = userfield.getText();
			Conn con= new Conn();
			try {
				String query = "select *from account where username ='"+username+"'";
				ResultSet rs = con.s.executeQuery(query);
				
				if(rs.next()) {
					check = true;
					String name = rs.getString(2);
					String securityques = rs.getString(4);
				     answer = rs.getString(5);
					password = rs.getString(3);
					namefield.setText(name);
					securefield.setText(securityques);
					System.out.println("answer"+answer);
					System.out.println("password"+password);
					
				}
				else {
					JOptionPane.showMessageDialog(null,"Invalid user");
				}
				}
			 catch(Exception e) {
				 e.printStackTrace();
			 }
			
		}
		else if(ae.getSource() == retrieve) {
			String ansfromuser = ansfield.getText();
			System.out.println("answer"+answer);
			System.out.println("password"+password);
			if(check && ansfromuser.equals(answer)) {
				passwordfield.setText(password);
				
			}
			else {
				JOptionPane.showMessageDialog(null,"answer unmatched");
			}
		}
		else if(ae.getSource() == back) {
			setVisible(false);
			new Login();
		}
		
	}
	public static void main(String[] args) {
		//new ForgetPassword();
	}

}
