import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;


@SuppressWarnings("serial")
public class Platno extends JPanel implements MouseListener,MouseMotionListener {
	int sirina;
	int visina;
	Graf graf;
	
	public Platno(int sirina, int visina) {
		super();
		this.sirina = sirina;
		this.visina = visina;
		this.graf = null;
	}
	public void narisi (Graf g){
		this.graf = g;
	}
	
	public Dimension getPreferredSize(){
		return new Dimension(sirina,visina);
	}
	
	protected void paintComponent(Graphics g){
		super.paintComponent(g);
		for(Tocka t: graf.tocke.values()){
			g.setColor(Color.BLUE);
			for (Tocka a: t.sosedi){
				g.drawLine((int)(t.x + 0.5), (int)(t.y +0.5),(int)(a.x +0.5), (int)(a.y + 0.5));
			}
			g.setColor(Color.RED);
			g.fillOval((int)(t.x + 0.5), (int)(t.y + 0.5), 5, 5);
			
		}

}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
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
	public void mousePressed(MouseEvent e) {
		Tocka izbrana;
		for(Tocka a: graf.tocke.values()){
			if (Math.abs((int)(a.x + 0.5) - e.getX()) < 20 && Math.abs((int)(a.x + 0.5) - e.getX()) < 20){
				izbrana = a;
			}
		}
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
