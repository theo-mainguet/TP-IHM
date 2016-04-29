import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class Adapters {
	
	private MouseAdapter adapter;
	private JSlider slider;
	private Label label;

	public Adapters() {
		JFrame fenetre = new JFrame("Listeners");
		slider = new JSlider(1,100);
		label = new Label(""+slider.getValue());
		this.label.getJLabel().setHorizontalAlignment(SwingConstants.CENTER);
		adapter = new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int button = e.getButton();
				if (button == MouseEvent.BUTTON1 && (e.getX() == label.getJLabel().getX()) && (e.getY() == label.getJLabel().getY())){
					label.setValeur(1);
				}else if(button == MouseEvent.BUTTON3 && (e.getX() == label.getJLabel().getX()) && (e.getY() == label.getJLabel().getY())){
					label.setValeur(-1);
				}
				slider.setValue(Integer.parseInt(label.toString()));
			}
		};
		fenetre.addMouseListener(adapter);
		fenetre.setPreferredSize(new Dimension(200, 80));
		fenetre.pack();
		fenetre.setLocationRelativeTo(null);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setResizable(false);
		fenetre.setVisible(true);
		fenetre.add(label.getJLabel(),BorderLayout.CENTER);
		fenetre.add(slider,BorderLayout.NORTH);
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				label.setLabel(""+slider.getValue());
			}
		});
	}
	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Adapters();
			}
		});
	}


}
