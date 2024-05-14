package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
public class BookHotel extends JFrame implements ActionListener {
	String username;
	JLabel userlabel,idlabel,numfield,phonefield, pricefield;
	JComboBox p,acfield,foodfield;
	JButton checkprice,bookpackage,back;
	JTextField countfield,daysfield;
	BookHotel(String username){
		this.username = username; 
		setBounds(150,0,900,700);
		setLayout(null);
		setVisible(true);
		getContentPane().setBackground(Color.white);
		JLabel title = new JLabel("BOOK HOTEL");
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
	  String[] hotels= {"Sunset Paradise Resort",
			              "Grand Splendid Hotel",
			               "Azure Bay Inn",
	  		       "Mountain View Lodge",
	  			    "Ocean Breeze Resort",
	  			"Royal Gardens Hotel",
	  			    "Golden Sands Retreat"
	  			,"Silver Moon Resort",
	  		    "Palm Grove Inn",
	  		    "Crystal Waters Hotel"};
	  
	  p = new JComboBox(hotels);
	  p.setBounds(180,110,200,30);
	  p.setFont(new Font("arial",Font.BOLD,15));
	  add(p);
	  JLabel persons = new JLabel("Total Persons");
	  persons.setBounds(20,160,100,30);
	  persons.setFont(new Font("arial",Font.BOLD,15));
	  add(persons);
	   countfield = new JTextField("1");
	  countfield.setBounds(180,160,200,30);
	  countfield.setFont(new Font("arial",Font.BOLD,15));
	  add(countfield);
	  JLabel days = new JLabel("No of Days");
	  days.setBounds(20,210,100,30);
	  days.setFont(new Font("arial",Font.BOLD,15));
	  add(days);
	   daysfield = new JTextField("1");
	  daysfield.setBounds(180,210,200,30);
	  daysfield.setFont(new Font("arial",Font.BOLD,15));
	  add(daysfield);
	  JLabel ac = new JLabel("Ac/Non-Ac");
	  ac.setBounds(20,260,100,30);
	  ac.setFont(new Font("arial",Font.BOLD,15));
	  add(ac);
	  String values[] = {"Ac","Non-Ac"};
	   acfield = new JComboBox(values);
	  acfield.setBounds(180,260,200,30);
	  acfield.setFont(new Font("arial",Font.BOLD,15));
	  add(acfield);
	  JLabel food = new JLabel("Food Included");
	  food.setBounds(20,310,150,30);
	  food.setFont(new Font("arial",Font.BOLD,15));
	  add(food);
	  String v[] = {"Yes","No"};
	   foodfield = new JComboBox(v);
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
		 checkprice = new JButton("Check Price");
		  checkprice.setBounds(30,570,150,30);
		  checkprice.setFont(new Font("arial",Font.BOLD,15));
		  checkprice.setBackground(Color.blue);
		  checkprice.setForeground(Color.white);
		  checkprice.addActionListener(this);
		  add(checkprice);
		  bookpackage = new JButton("Book");
		  bookpackage.setBounds(190,570,150,30);
		  bookpackage.setFont(new Font("arial",Font.BOLD,15));
		  bookpackage.setBackground(Color.blue);
		  bookpackage.setForeground(Color.white);
		  bookpackage.addActionListener(this);
		  add(bookpackage);
		  back = new JButton("Back");
		  back.setBounds(360,570,150,30);
		  back.setFont(new Font("arial",Font.BOLD,15));
		  back.setBackground(Color.blue);
		  back.setForeground(Color.white);
		  back.addActionListener(this);
		  add(back);
		  try {
			  Conn con = new Conn();
			  String query = "select *from customer where username = '"+username+"'";
			  ResultSet rs = con.s.executeQuery(query);
			  if(rs.next()) {
				  
				  userlabel.setText(rs.getString("username"));
				  idlabel.setText(rs.getString("id"));
				  numfield.setText(rs.getString("number"));
				 phonefield.setText(rs.getString("phone"));
				
				 
			  }
		  }
		  catch(Exception e) {
			  e.printStackTrace();
		  }
		
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == checkprice) {
			 String hotel =(String)p.getSelectedItem();
			 String food = (String)foodfield.getSelectedItem();
			 String ac = (String)acfield.getSelectedItem();
			 int persons_count = Integer.parseInt(countfield.getText());
			 int days_count = Integer.parseInt(daysfield.getText());
			 try {
				 Conn con = new Conn();
				 String query = "select *from hotel where hotel_name='"+hotel+"'";
				 System.out.println(query);
				 ResultSet rs = con.s.executeQuery(query);
				 if(rs.next()) {
					 
					 int cost_per_person = Integer.parseInt(rs.getString(2));
					 int ac_room_cost = Integer.parseInt(rs.getString(3));
					 int food_cost = Integer.parseInt(rs.getString(4));
					 int price=0;
					 if(ac.equals("Ac") && food.equals("Yes")) {
						 price = ((cost_per_person*persons_count)+ ac_room_cost+food_cost)*days_count;
						
						 
					 }
					 else if(ac.equals("Non-Ac") && food.equals("Yes")) {
					 price = ((cost_per_person*persons_count)+(food_cost))*days_count;
						 
					 }
					 else if(ac.equals("Ac") && food.equals("No")) {
						  price = ((cost_per_person*persons_count)+(ac_room_cost))*days_count;
						 
					 }
					 else {
						price = (cost_per_person*persons_count)*days_count;
					 }
					 pricefield.setText(""+price);
					 
					 
				 }
				
			 }
			 catch(Exception e) {
				 e.printStackTrace();
			 }
			 
			
		}
		else if(ae.getSource() == bookpackage) {
			 String hotel =(String)p.getSelectedItem();
			 String food = (String)foodfield.getSelectedItem();
			 String ac = (String)acfield.getSelectedItem();
			 int persons_count = Integer.parseInt(countfield.getText());
			 int days_count = Integer.parseInt(daysfield.getText());
			try {
				Conn con = new Conn();
				 String query = "insert into bookhotel values('"+username+"','"+ hotel +"','"+ countfield.getText()+"','"+ daysfield.getText()+"','"+ ac+"','"+ food+"','"+ idlabel.getText()+"','"+numfield.getText()+"','" +phonefield.getText()+"','"+pricefield.getText()+"');";
	System.out.println(query);
	con.s.executeUpdate(query);
	JOptionPane.showMessageDialog(null,"Hotel booked successfully");
	
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		else if(ae.getSource() == back) {
			setVisible(false);
		}
	}


	public static void main(String[] args) {
		//new BookHotel("");
	}
	}
