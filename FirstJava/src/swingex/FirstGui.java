package swingex;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

class ClickHandler implements ActionListener{

	Windows w;
	ClickHandler(Windows w){
		this.w=w;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String name=w.user.getText().toString();
		String pwd=w.pass.getText().toString();
		if(name.equalsIgnoreCase("kiet") && pwd.equalsIgnoreCase("mca")) {
			JOptionPane.showMessageDialog(w, "Welcome to Swing");
		} else {
			JOptionPane.showMessageDialog(w, "Invalid username and password");
		}
	}
	
}
class Windows extends JFrame {
	Container c;
	JTextField user;
	JPasswordField pass;
	ClickHandler ch;
	Windows(){  
		ch =new ClickHandler(this);
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
		user=new JTextField();
		user.setSize(300,50);
		user.setLocation(230,100);
		user.setFont(f);
		pass=new JPasswordField();
		pass.setSize(300,50);
		pass.setLocation(230,150);
		pass.setFont(f);
		JButton login=new JButton("Login");
		login.setSize(150,50);
		login.setLocation(230,250);
		login.setFont(f);
		login.addActionListener((ActionEvent e)->{
			String name=user.getText().toString();
			String pwd=pass.getText().toString();
			if(name.equalsIgnoreCase("kiet") && pwd.equalsIgnoreCase("mca")) {
				JOptionPane.showMessageDialog(Windows.this, "Welcome to Swing");
			} else {
				JOptionPane.showMessageDialog(Windows.this, "Invalid username and password");
			}
		
		});
//		login.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				String name=user.getText().toString();
//				String pwd=pass.getText().toString();
//				if(name.equalsIgnoreCase("kiet") && pwd.equalsIgnoreCase("mca")) {
//					JOptionPane.showMessageDialog(null, "Welcome to Swing");
//				} else {
//					JOptionPane.showMessageDialog(null, "Invalid username and password");
//				}
//			}
//			
//			
//		});
		c.add(logininfo);
		c.add(username); 
		c.add(password);
		c.add(user);
		c.add(pass);
		c.add(login);
	}
	
}
public class FirstGui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Windows w =new Windows();
			w.setResizable(false);
			w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			w.setSize(600,400);		
			w.setLocation(200, 200);
			w.setVisible(true);
			
			//w.setBounds(200,200,600,400);
	}

}
