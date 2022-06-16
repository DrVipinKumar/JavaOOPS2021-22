package swingex;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginApplet extends JApplet{
	Container c;
	public void paint(Graphics g) {
		g.drawString("Hello", 100,100);
		c=this.getContentPane();
		c.setLayout(null);
		Font f =new Font("Arial",Font.BOLD,23);
		//ImageIcon mi=new ImageIcon("src//swingex//hand.png");
		JLabel logininfo=new JLabel("Login Information",JLabel.CENTER);
		logininfo.setSize(300,50);
		logininfo.setLocation(150,50);
		logininfo.setFont(f);
		JLabel username=new JLabel("Username:",JLabel.CENTER);
		username.setSize(300,50);
		username.setLocation(10,100);
		username.setFont(f);
		JLabel password=new JLabel("Password:",JLabel.CENTER);
		password.setSize(300,50);
		password.setLocation(10,150);
		password.setFont(f);
		JTextField user=new JTextField();
		user.setSize(300,50);
		user.setLocation(230,100);
		user.setFont(f);
		JPasswordField pass=new JPasswordField();
		pass.setSize(300,50);
		pass.setLocation(230,150);
		pass.setFont(f);
		JButton login=new JButton("Login");
		login.setSize(150,50);
		login.setLocation(230,250);
		login.setFont(f);
		c.add(logininfo);
		c.add(username); 
		c.add(password);
		c.add(user);
		c.add(pass);
		c.add(login);
	}

}
