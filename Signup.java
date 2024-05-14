package travel.management.system;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup extends JFrame implements ActionListener{
	JButton back,create;
	JTextField userfield, namefield,ansfield;
	JPasswordField passwordfield;
	JComboBox questions;
	public Signup() {
		setSize(600,500);
		setLocation(350,150);
		setVisible(true);
		setLayout(null);//new Color(182,237,246)
		getContentPane().setBackground(Color.white);
		Border border1 = BorderFactory.createLineBorder(Color.black, 2);
		// LineBorder whiteBorder = new LineBorder(Color.WHITE);
		 //LineBorder blackBorder = new LineBorder(Color.black);
		JLabel l1 = new JLabel("Username");
	    l1.setBounds(50,30,120,30);
	    l1.setFont(new Font("Raleway",Font.BOLD,19));
	    add(l1);
	    userfield = new JTextField();
	    userfield.setBounds(230,30,250,30);
	    userfield.setBorder(border1);
	    userfield.setFont(new Font("Raleway",Font.BOLD,15));
	    add(userfield);
		JLabel l2 = new JLabel("Name");
	    l2.setBounds(50,82,100,30);
	    l2.setFont(new Font("Raleway",Font.BOLD,19));
	    add(l2);
	    namefield = new JTextField();
	    namefield.setBounds(230,82,250,30);
	    namefield.setBorder(border1);
	    namefield.setFont(new Font("Raleway",Font.BOLD,15));
	    add(namefield);
		JLabel l3 = new JLabel("Password");
	    l3.setBounds(50,125,120,30);
	    l3.setFont(new Font("Raleway",Font.BOLD,19));
	    add(l3);
	  passwordfield = new JPasswordField();
	    passwordfield.setBounds(230,125,250,30);
	    passwordfield.setBorder(border1);
	    
	    add(passwordfield);
		JLabel l4 = new JLabel("Security Question");
	    l4.setBounds(50,165,200,30);
	    l4.setFont(new Font("Raleway",Font.BOLD,19));
	    add(l4);
	    String[] options = {"What is the name of your first pet?","What is your favorite book?","What is your favorite movie?"};
	    questions = new JComboBox(options);
	    questions.setBounds(230,165,250,30);
	    questions.setFont(new Font("Raleway",Font.BOLD,11));
	    questions.setBackground(Color.white);
	    questions.setBorder(border1);
	    add(questions);
	    
	    
	    
		JLabel l5 = new JLabel("Answer");
	    l5.setBounds(50,210,100,30);
	    l5.setFont(new Font("Raleway",Font.BOLD,19));
	    add(l5);
	    ansfield = new JTextField();
	    ansfield.setBorder(border1);
	    ansfield.setBounds(230,210,250,30);
	    ansfield.setFont(new Font("Raleway",Font.BOLD,15));
	    add(ansfield);
	   create = new JButton("Create");
	    create.setBounds(130,280,150,30);
	    create.setBorder(border1);
	    create.setBackground(new Color(182,237,246));
	    create.setFont(new Font("Raleway",Font.BOLD,15));
	    create.setForeground(Color.black);
	    create.addActionListener(this);
	    add(create);
	    back = new JButton("Back");
	    back.setBounds(300,280,150,30);
	    back.setBorder(border1);
	    back.setBackground(new Color(182,237,246));
	    back.setFont(new Font("Raleway",Font.BOLD,15));
	    back.setForeground(Color.black);
	    back.addActionListener(this);
	    add(back);
		
		
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == back) {
			setVisible(false);
			new Login();
		}
		else if(ae.getSource() == create) {
			String user = userfield.getText(); 
			String password = passwordfield.getText();
			String name = namefield.getText();
			String ques = (String)questions.getSelectedItem();
			String ans = ansfield.getText();
			if(user.equals("") || password.equals("") || name.equals("") || ques.equals("") || ans.equals("")){
				{
			}
				JOptionPane.showMessageDialog(null, "all fields are mandatory");
			}
			else {
			try {
				Conn con = new Conn();
				String query = "insert into account values('"+user+"','"+name+"','"+password+"','"+ques+"','"+ans+"')";
				System.out.println(query);
				con.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null, "account created successfully");
				setVisible(false);
				new Login();
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			}
		}
	}
	

	public static void main(String[] args) {
		//new Signup();

	}

}
