import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;


public class Slider2 implements MouseListener{
	
	private JSlider slider;
	private Action label;

	public Slider2() {
		JFrame fenetre = new JFrame("Listeners");
		slider = new JSlider(1,100);
		label = new Action(""+slider.getValue());
		this.label.getJLabel().setHorizontalAlignment(SwingConstants.CENTER);
		fenetre.setPreferredSize(new Dimension(200, 80));
		fenetre.pack();
		fenetre.setLocationRelativeTo(null);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setResizable(false);
		fenetre.setVisible(true);
		fenetre.add(label.getJLabel(),BorderLayout.CENTER);
		fenetre.add(slider,BorderLayout.NORTH);
		fenetre.addMouseListener(this);
	}

	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Slider2();
			}
		});
	}

	public void mouseClicked(MouseEvent e) {
		int button = e.getButton();
		if (button == MouseEvent.BUTTON3){
			label.setValeur(1);
		}
	}

	public void mouseEntered(MouseEvent e) {
		
	}

	public void mouseExited(MouseEvent e) {
		
	}

	public void mousePressed(MouseEvent e) {
		
	}

	public void mouseReleased(MouseEvent e) {
		
	}
}