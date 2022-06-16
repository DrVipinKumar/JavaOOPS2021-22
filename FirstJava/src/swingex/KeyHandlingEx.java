package swingex;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
class KeyHandler implements KeyListener {
 KeyCode kc;
	KeyHandler(KeyCode kc){
	  this.kc=kc;	
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Key Typed=>"+e.getKeyChar());
	//	System.out.println("Key Typed=>"+e.getKeyCode());
		switch(e.getKeyCode())
		{
		case 37:
			kc.name.setLocation(kc.name.getX()-10, kc.name.getY());
			break;
		case 38:
			kc.name.setLocation(kc.name.getX(), kc.name.getY()-10);
			break;
		case 39:
			kc.name.setLocation(kc.name.getX()+10, kc.name.getY());
			break;
		case 40:
			kc.name.setLocation(kc.name.getX(), kc.name.getY()+10);
			break;
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
class KeyCode extends JFrame
{
	JLabel name;
	Container c;
	KeyCode(){
		c=this.getContentPane();
		c.setLayout(null);
		Font f =new Font("Arial",Font.BOLD,34);
		name=new JLabel("KIET");
		name.setFont(f);
		name.setBounds(10,10,100,200);
		c.add(name);
		this.addKeyListener(new KeyHandler(this));
	}
}

public class KeyHandlingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			KeyCode kc =new KeyCode();
			kc.setVisible(true);
			kc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			kc.setBounds(100,100,600,400);
	}

}
