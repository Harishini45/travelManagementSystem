package travel.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Payment extends JFrame implements ActionListener {
	JButton pay,back;
	public Payment() {
		setBounds(350,100,600,500);
		setLayout(null);
		setVisible(true);
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/paytm.jpg"));
		Image i2 = i1.getImage().getScaledInstance(600,500,Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0,0,600,500);
		add(image);
		 back = new JButton("Back");
		  back.setBounds(300,10,100,30);
		  back.setFont(new Font("arial",Font.BOLD,15));
		  back.setBackground(Color.black);
		  back.setForeground(Color.white);
		  back.addActionListener(this);
		  image.add(back);
		  pay = new JButton("Pay");
		  pay.setBounds(450,10,100,30);
		 pay.setFont(new Font("arial",Font.BOLD,15));
		  pay.setBackground(Color.black);
		 pay.setForeground(Color.white);
		  pay.addActionListener(this);
		  image.add(pay);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == "pay") {
			
			
		}
		else if(ae.getSource() == "back") {
			setVisible(false);
		}
	}

	public static void main(String[] args) {
		new Payment();
		

	}

}
