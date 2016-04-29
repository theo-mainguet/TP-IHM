import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;


public class Listeners implements MouseListener{
	
	private JSlider slider;
	private Label label;

	public Listeners() {
		JFrame fenetre = new JFrame("Listeners");
		slider = new JSlider(1,100);
		label = new Label(""+slider.getValue());
		this.label.getJLabel().setHorizontalAlignment(SwingConstants.CENTER);
		fenetre.setPreferredSize(new Dimension(200, 80));
		fenetre.pack();
		fenetre.setLocationRelativeTo(null);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setResizable(false);
		fenetre.setVisible(true);
		fenetre.add(label.getJLabel(),BorderLayout.CENTER);
		fenetre.add(slider,BorderLayout.NORTH);
	}

	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Listeners();
			}
		});
	}

	public void mouseClicked(MouseEvent e) {
		int button = e.getButton();
		if (button == MouseEvent.BUTTON3){
			
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
