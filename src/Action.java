import javax.swing.JLabel;


public class Action {

	private JLabel label;
	
	public Action(String valeur) {
		label = new JLabel(valeur);
	}
	
	public void setValeur(int i){
		int a = Integer.parseInt(label.getText()) + i;
		label.setText(""+a);
	}

	public JLabel getJLabel(){
		return this.label;
	}
	
	public void setLabel(String valeur){
		label.setText(valeur);
	}
}