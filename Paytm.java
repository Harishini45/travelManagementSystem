package travel.management.system;
import javax.swing.*;
import java.sql.*;

public class Paytm extends JFrame{
	public Paytm() {
		setBounds(350,100,700,600);
		setLayout(null);
		JEditorPane pane = new JEditorPane();
		pane.setEditable(false);
		try {
			pane.setPage("https://paytm.com/rent-payment");
			
		}
		catch(Exception e) {
			pane.setContentType("text/html");
			pane.setText("<html>could not load, Error 404</html>");
			e.printStackTrace();
		}
		JScrollPane sp = new JScrollPane(pane);
		getContentPane().add(sp);
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
	new Paytm();

	}

}
