package swingex;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
class Painter extends JPanel implements MouseListener, MouseMotionListener{
	Painter(){
		this.addMouseMotionListener(this);
		this.addMouseListener(this);
	}
	int x, y;
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.RED);
		g.drawString("Dr. Vipin Classes", 50,100);
		g.drawRect(12, 34, 200, 300);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		x=e.getX();
		y=e.getY();
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		Graphics g =getGraphics();
		g.drawRect(x, y, e.getX()-x, e.getY()-y);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
class Shapes extends JFrame{
	Shapes(){
		Painter p =new Painter();
		Container c =this.getContentPane();
		c.add(p);
	}

	
	
}
public class DrawingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         Shapes s =new Shapes();
        // s.setLayout(null);
         s.setSize(800,600);
         s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         s.setLocationRelativeTo(null);
         s.setVisible(true);
	}

}
