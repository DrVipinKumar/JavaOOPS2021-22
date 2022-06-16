package swingex;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class LayoutEx extends JFrame{
	Container c;
	LayoutEx(){
		c=this.getContentPane();
	//c.setLayout(new GridLayout(3,2));
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(2,2));
		JButton b1, b2, b3, b4, b5;
		b1=new JButton("Button 1");
		b2=new JButton("Button 2");
		b3=new JButton("Button 3");
		b4=new JButton("Button 4");
		b5=new JButton("Button 5");
		//c.add(b1);c.add(b2);c.add(b3);c.add(b4);c.add(b5);
		c.add(b1,BorderLayout.NORTH);
		c.add(p,BorderLayout.CENTER);
		p.add(b2);p.add(b3);p.add(b4);p.add(b5 );
//		c.add(b2,BorderLayout.WEST);
//		c.add(b3,BorderLayout.CENTER);
//		c.add(b4,BorderLayout.SOUTH);
//		c.add(b5,BorderLayout.EAST);
//		
		
	}
}
public class LayoutExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              LayoutEx f =new LayoutEx();
              f.setVisible(true);
              f.setBounds(300,200,600,400);
              f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
              }

}
