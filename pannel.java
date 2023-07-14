package full_java;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class pannel {
	public static void main(String[] args) {
		JLabel label = new JLabel();
		label.setText("hello shabar");
		
		JPanel Rpanel=new JPanel();
		Rpanel.setBackground(Color.red);
		Rpanel.setBounds(0, 0, 250,250);
		JPanel bpanel=new JPanel();
		bpanel.setBackground(Color.blue);
		bpanel.setBounds(250, 0, 250,250);
		JPanel Bpanel=new JPanel();
		Bpanel.setBackground(Color.black);
		Bpanel.setBounds(0, 250, 500,250);

		JFrame frame =new JFrame();
		frame.setSize(720,720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setResizable(false);
		frame.setTitle("title");
		frame.setLayout(null);
		frame.setVisible(true);
		Rpanel.add(label);
		//frame.getContentPane().setBackground(null);
		frame.add(Rpanel);
		frame.add(bpanel);
		frame.add(Bpanel);
	}

}
