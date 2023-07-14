package full_java;
import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.JFrame;

public class j_frame {

	public static void main(String[] args) {
		JFrame frame=new JFrame();
		frame.setSize(420,420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setTitle("title");
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.GREEN);

	}

}
