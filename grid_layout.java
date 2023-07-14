package full_java;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JButton;


public class grid_layout {
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(5,2,10,10));
		frame.setSize(420,420);
		frame.setVisible(true);
	}

}
