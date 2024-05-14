package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckPackage extends JFrame {
  CheckPackage(){
	  setBounds(350,100,800,500);
	
	  setVisible(true);
	  String[] package1 = {"GOLD PACKAGE", "6 Days and 7 Nights", "Airport Assistance", "Half Day City Tour","Daily Buffet", "Soft Drinks Free", "Full Day 3 Island Cruise", "English Speaking Guide","BOOK PACKAGE","SUMMER SPECIAL","Rs 12000/-","ooty1.jpg"};
	  String[] package2 = {"SILVER PACKAGE", "5 Days and 6 Nights", "Toll Free "," Entrance Free Tickets", "Meet and Greet at Airport", "Welcome Drinks on Arrival", "Night Safari","Cruise with Dinner","BOOK NOW","WINTER SPECIAL","Rs 24000/-","ooty2.jpg"};
	  String[] package3 = {"BRONZE PACKAGE", "6 Days and 5 Nights", "Return Airfare", "Free Clubbing", "Horse Riding & other Games","Hard Drinks Free", "Daily Buffet","BBQ Dinner","BOOK NOW","WINTER SPECIAL", "Rs 32000/-", "ooty3.jpg"};
	  System.out.println(package1.length);
	  System.out.println(package2.length);
	  System.out.println(package3.length);
	  
	  
	  
	  
	  JTabbedPane tab = new JTabbedPane();
	  JPanel p1 = createPackage(package1);
	  JPanel p2 = createPackage(package2);
	  JPanel p3 = createPackage(package3);
	  tab.addTab("Package 1",null,p1);
	  tab.addTab("Package 2",null,p2);
	  tab.addTab("Package 3",null, p3);
	  add(tab);
	  
	  
	  
  }
  public JPanel createPackage(String[] p) {
	  JPanel p1 = new JPanel();
	  p1.setLayout(null);
	  p1.setBackground(Color.white);
	  
	  JLabel l1 = new JLabel(p[0]);
	  l1.setFont(new Font("Raleway",Font.BOLD,30));
	  l1.setForeground(new Color(255, 215, 0));
	  l1.setBounds(20,10,300,30);
	  p1.add(l1);
	  JLabel l2 = new JLabel(p[1]);
	  l2.setFont(new Font("Raleway",Font.BOLD,20));
	  l2.setForeground(Color.red);
	  l2.setBounds(40,70,300,30);
	  p1.add(l2);
	  
	  JLabel l3 = new JLabel(p[2]);
	  l3.setFont(new Font("Raleway",Font.BOLD,20));
	  l3.setForeground(Color.blue);
	  l3.setBounds(40,110,300,30);
	  p1.add(l3);
	  JLabel l4 = new JLabel(p[3]);
	  l4.setFont(new Font("Raleway",Font.BOLD,20));
	  l4.setForeground(Color.red);
	  l4.setBounds(40,150,300,30);
	  p1.add(l4);
	  JLabel l5 = new JLabel(p[4]);
	  l5.setFont(new Font("Raleway",Font.BOLD,20));
	  l5.setForeground(Color.blue);
	  l5.setBounds(40,190,300,30);
	  p1.add(l5);
	  JLabel l6 = new JLabel(p[5]);
	  l6.setFont(new Font("Raleway",Font.BOLD,20));
	  l6.setForeground(Color.red);
	  l6.setBounds(40,230,300,30);
	  p1.add(l6);
	  JLabel l7 = new JLabel(p[6]);
	  l7.setFont(new Font("Raleway",Font.BOLD,20));
	  l7.setForeground(Color.blue);
	  l7.setBounds(40,270,300,30);
	  p1.add(l7);
	  JLabel l8 = new JLabel(p[7]);
	  l8.setFont(new Font("Raleway",Font.BOLD,20));
	  l8.setForeground(Color.red);
	  l8.setBounds(40,310,300,30);
	  p1.add(l8);
	  JLabel l9 = new JLabel(p[8]);
	  l9.setFont(new Font("Raleway",Font.BOLD,21));
	  l9.setForeground(Color.black);
	  l9.setBounds(60,360,300,30);
	  p1.add(l9);
	  JLabel l10 = new JLabel(p[9]);
	  l10.setFont(new Font("Raleway",Font.BOLD,21));
	  l10.setForeground(Color.magenta);
	  l10.setBounds(70,390,300,30);
	  p1.add(l10);
	  JLabel l11 = new JLabel(p[10]);
	  l11.setFont(new Font("Raleway",Font.BOLD,25));
	  l11.setForeground(Color.cyan);
	  l11.setBounds(370,390,300,30);
	  p1.add(l11);
	  ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/"+p[11]));
		Image i2 = i1.getImage().getScaledInstance(400,300,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image1 = new JLabel(i3);
		image1.setBounds(310,30,400,300);
		p1.add(image1);
		return p1;
	  
  }
 
	
        
	

}
