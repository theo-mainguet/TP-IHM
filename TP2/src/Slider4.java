import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;


public class Slider4 {
	MouseAdapter e ;
	private JSlider slider;
	private Action label;

	public Slider4() {
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
		e = new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				int button = e.getButton();
				if (button == MouseEvent.BUTTON1){
					label.setValeur(1);
				}else if(button == MouseEvent.BUTTON3){
					label.setValeur(-1);
				}
				slider.setValue(Integer.parseInt(label.getText()));
			}
		};
		fenetre.addMouseListener(e);
	}

	
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Slider4();
			}
		});
	}

	

	
}