package full_java;

import javax.swing.JFrame;


import javax.swing.JButton;

public class A extends JFrame {
	JButton b=new JButton();
	public A() {
		b.setText("abc");
		b.setBounds(100, 100, 50, 50);
		b.addActionListener(e -> System.out.println("pooo"));
		
		
		this.setVisible(true);
		this.setLayout(null);
		this.setSize(420,420);
		this.add(b);
		
	}
	
	
	

}
