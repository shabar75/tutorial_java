package full_java;
import javax.swing.JOptionPane;

public class gui {
	public static void main(String[] args) {
		String name =JOptionPane.showInputDialog("what is your name");
		JOptionPane.showInternalMessageDialog(null,"Hello "+name);
		int age=  Integer.parseInt(JOptionPane.showInputDialog("what is your age"));
		JOptionPane.showMessageDialog(null, name +"  your age is "+age);
		
	}

}
