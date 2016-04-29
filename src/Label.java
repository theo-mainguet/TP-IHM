import javax.swing.JLabel;


public class Label {

	private JLabel label;
	
	public Label(String valeur) {
		label = new JLabel(valeur);
	}

	public JLabel getJLabel(){
		return this.label;
	}
	
	public void setLabel(String valeur){
		label.setText(valeur);
	}
}
