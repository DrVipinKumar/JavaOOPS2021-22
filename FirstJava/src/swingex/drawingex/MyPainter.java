package swingex.drawingex;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

class MouseMotionHandler extends MouseMotionAdapter{

	Painter p;
	MouseMotionHandler(Painter p){
		this.p=p;
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		Graphics g =p.getGraphics();
		g.fillOval(e.getX(), e.getY(), 4, 4);
	}

	
	
}
class Painter extends JFrame{
	
	Painter(){
		this.addMouseMotionListener(new MouseMotionHandler(this));
	}
}
public class MyPainter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Painter p =new Painter();
           p.setSize(800,600);
           p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           p.setLocationRelativeTo(null);
           p.setVisible(true);
	}

}
