import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;


@SuppressWarnings("serial")
public class Platno extends JPanel {
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
	
	public Dimension getPreferedsize(){
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
			g.fillOval((int)(t.x), (int)(t.y), 10, 10);
			
		}
	

}
}
