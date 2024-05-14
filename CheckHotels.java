package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.lang.*;

public class CheckHotels extends JFrame implements Runnable  {
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	JLabel[] label = {l1,l2,l3,l4,l5,l6,l7,l8,l9,l10};
	JLabel caption;
	
	CheckHotels(){
		setBounds(500,100,500,400);
		setLayout(null);
		
			 caption = new JLabel();
			 caption.setBounds(20, 330, 300, 40); 
			 caption.setForeground(Color.white);
			 caption.setFont(new Font("Raleway",Font.BOLD,18));
			
		

		
		ImageIcon i1=null,i2=null,i3=null,i4=null,i5=null,i6=null,i7=null,i8=null,i9=null,i10=null;
		Image j1 = null,j2 = null,j3=null,j4=null,j5=null,j6=null,j7=null,j8=null,j9=null,j10=null;
		Image[] jimage = {j1,j2,j3,j4,j5,j6,j7,j8,j9,j10};
		ImageIcon[] image = {i1,i2,i3,i4,i5,i6,i7,i8,i9,i10};
		ImageIcon k1=null,k2=null,k3=null,k4=null,k5=null,k6=null,k7=null,k8=null,k9=null,k10=null;
		ImageIcon[] kimage = {k1,k2,k3,k4,k5,k6,k7,k8,k9,k10};
		
		
		for(int i = 0;i <= 9;i++) {
		 image[i] = new ImageIcon(ClassLoader.getSystemResource("icons/hotel"+String.valueOf(i+1)+".jpg"));
		 jimage[i] =image[i].getImage().getScaledInstance(500,400,Image.SCALE_DEFAULT);
		kimage[i] = new ImageIcon(jimage[i]);
		label[i] = new JLabel(kimage[i]);
		label[i].setBounds(0,0,500,400);
		add(label[i]);
		
		}
		Thread t1 = new Thread(this);
		t1.start();
		setVisible(true);
		
		
	}
	public void run() {
		String[] hotelNames = {
			    "Sunset Paradise Resort",
			    "Grand Splendid Hotel",
			    "Azure Bay Inn",
			    "Mountain View Lodge",
			    "Ocean Breeze Resort",
			    "Royal Gardens Hotel",
			    "Golden Sands Retreat",
			    "Silver Moon Resort",
			    "Palm Grove Inn",
			    "Crystal Waters Hotel"
			};

		try {
			 add(caption);
			for(int i = 0;i <= 9;i++) {
			     
				label[i].setVisible(true);
			
			   caption.setText(hotelNames[i]);
		        label[i].add(caption);
		        caption.setVisible(true);
				Thread.sleep(2500);
			  
			  label[i].setVisible(false);
			  //caption.setText("");
				}
		
			this.setVisible(false);
			
		}
				catch(Exception e) {
					e.printStackTrace();
				}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //new CheckHotels();
	}

}
