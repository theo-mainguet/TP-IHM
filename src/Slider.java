import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class Slider {
	
	private JFrame fenetre;
	private JSlider slider;
	//private JLabel label;					CLASSE INTERNE ANONYME
	private Action label;					//CLASSE EXTERNE
	
	public Slider() {
		slider = new JSlider(1, 100);
		label = new Action("" + slider.getValue());	//CLASSE EXTERNE
		this.label.getJLabel().setHorizontalAlignment(SwingConstants.CENTER);
		//label = new JLabel(""+slider.getValue()); 		CLASSE INTERNE ANONYME
		JFrame fenetre = new JFrame("Slider");
		fenetre.setPreferredSize(new Dimension(200, 80));
		fenetre.pack();
		fenetre.setLocationRelativeTo(null);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setResizable(false);
		fenetre.setVisible(true);
		fenetre.add(label.getJLabel(), BorderLayout.NORTH);	//CLASSE EXTERNE
		fenetre.add(slider, BorderLayout.CENTER);
		
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				label.setLabel("" + slider.getValue());
			}
		});
				
		
		/* CLASSE INTERNE ANONYME
		slider.addChangeListener(new ChangeListener() {
			
			public void stateChanged(ChangeEvent arg0) {
				label.setText("" + slider.getValue());
			}
		});
		*/
		
		
	}
	
	
	
	public static void main(String[] args) {
		// Schedule a job for the event-dispatching thread:
		// creating and showing this application’s GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Slider();
			}
		});
	}

}