package travel.management.system;
import javax.swing.*;
import java.awt.*;
public class Splash extends JFrame implements Runnable {
	Thread thread;
	public Splash() {
		//setSize(1200,600);//length,width
		//setLocation(100,100);//left,top
		setVisible(true);
		//setLayout(null);
		//setUndecorated(true);
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/image1.jpg"));
		Image i2 = i1.getImage().getScaledInstance(1200, 600,Image.SCALE_DEFAULT);
		ImageIcon i3 =new  ImageIcon(i2);
		JLabel image = new JLabel(i3);
		//setUndecorated(false);
		
        add(image);	
        thread = new Thread(this);
        thread.start();//this start method internally calls run() method 
		//if i call run method explicitly it behave like a normal method
	}
	public void run() {
		try {
			thread.sleep(7000);//1 sec = 1000 milli seconds
			
			setVisible(false);
            new Login().setVisible(true);
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}

	public static void main(String[] args) {
		Splash frame = new Splash();
		//int x = 1;
	 for(int i = 0;i <= 600;i+=8) {
		 //frame.setLocationRelativeTo(null);
		 frame.setLocation(250,250);
		 //System.out.println((100+i)+","+(i-200));
		 frame.setSize(100+i-7,i-100);
		 //System.out.println((200+i-9)+","+(i-5));
		 try {
			 Thread.sleep(80);
			 
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
	 }
	//frame.setUndecorated(true);
	 frame.setLocationRelativeTo(null);

	}

}
