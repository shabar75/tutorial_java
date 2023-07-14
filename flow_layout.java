package full_java;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

public class flow_layout {

	public static void main(String[] args) {
		JButton button1=new JButton("1");
		JFrame frame=new JFrame();
		JPanel p= new JPanel();
		p.setPreferredSize(new Dimension(50,250));
		p.setBackground(Color.gray);
		p.setLayout(new FlowLayout());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		p.add(button1);
		p.add(new JButton("2"));
		p.add(new JButton("3"));
		p.add(new JButton("4"));
		p.add(new JButton("5"));
		p.add(new JButton("6"));
		p.add(new JButton("7"));
		p.add(new JButton("8"));
		p.add(new JButton("9"));
		frame.add(p);
		frame.setVisible(true);

	}

}
