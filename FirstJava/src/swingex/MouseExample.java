package swingex;

import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
class MouseHandler implements MouseListener
{
	MouseComponent m;
	MouseHandler(MouseComponent m){
		this.m=m;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		m.info.setText("Mouse Over Button");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		m.info.setText("Mouse Out from Button");
	}
}

class MouseComponent extends JFrame{
	JButton b1;
	Container c;
	JLabel info;
	MouseComponent(){
	 	c=this.getContentPane();
	 	c.setLayout(null);
	 	Font f =new Font("Arial",Font.BOLD,34);
	 	info=new JLabel("");
	 	info.setBounds(200,200,400,300);
	 	info.setFont(f);
	 	Cursor cr =new Cursor(Cursor.HAND_CURSOR);
	 	b1 =new JButton("Click Me");
	 	b1.setBounds(50,50,200,200);
	 	b1.setCursor(cr);
	 	b1.addMouseListener(new MouseHandler(this));
	 	c.add(b1);
	 	c.add(info);
	}
}
public class MouseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MouseComponent m =new MouseComponent();
		m.setVisible(true);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m.setBounds(100,100,600,400);
	}

}
