package full_java;
import javax.swing.JLabel;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class jlabel {
	public static void main(String[] args) {
		Border boder= BorderFactory.createLineBorder(Color.BLACK,3);
		ImageIcon image =new ImageIcon("download.png");
		JLabel label =new JLabel();
		label.setText("yes ");
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalAlignment(JLabel.TOP);
		label.setForeground(Color.RED);
		label.setFont(new Font("MV BOLI",Font.BOLD,20));
		label.setIconTextGap(100);
		label.setBorder(boder);
		label.setVerticalAlignment(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.CENTER);
		//label.setBounds(100, 100, 100, 100);
		
		JFrame frame=new JFrame();
		//frame.setSize(420,420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		//frame.setLayout(null);
		frame.setTitle("title");
		frame.setVisible(true);
		frame.add(label);
		frame.pack();
	}

}
