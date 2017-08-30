package InnerClass;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class AnonymousClassEx1 extends Frame implements MouseMotionListener {
	int x = 0;
	int y = 0;	
	public static void main(String[] args){
		new AnonymousClassEx1("호시가...");
	}
	
	public AnonymousClassEx1(String argTitle){
		super(argTitle);
		addMouseMotionListener(this);
		setBounds(100,100,800,700);
		setVisible(true);
	}
	
	public void paint(Graphics g){
		g.drawString("*",x,y);
	}
	
	public void update(Graphics g){
		paint(g);
	}
	public void mouseDragged(MouseEvent e) {}
	public void mouseMoved(MouseEvent e) {
		x = e.getX();
		y= e.getY();
		
		repaint();
	}
}
 