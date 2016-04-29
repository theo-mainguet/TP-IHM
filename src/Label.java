import javax.swing.JLabel;

public class Label {

	private JLabel label;
	private int valeur;

	public Label(String valeur) {
		label = new JLabel(valeur);
	}

	public JLabel getJLabel() {
		return this.label;
	}

	public void setValeur(int i){
		int a = Integer.parseInt(label.getText()) + i;
		label.setText(""+a);
		if(Integer.parseInt(label.getText()) + i < 0){
			label.setText("" + 0);
		} else if(Integer.parseInt(label.getText()) + i > 100){
			label.setText("" + 100);
		}
	}

	public void setLabel(String valeur) {
		label.setText(valeur);
	}

	public String toString() {
		return label.getText();
	}
}
