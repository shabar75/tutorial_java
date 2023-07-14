package full_java;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class my extends JFrame implements ActionListener {
	JButton button =new JButton();
	JLabel label;
	JLabel lable =new JLabel();
	my(){
		
		label.setText("shbar is great");
		label.setBounds(90, 500, 200, 100);
		label.setVisible(false);
		
		ImageIcon icon =new ImageIcon("download.png");
		button.setFocusable(false);
		button.setText("me asa abutton");
		button.setBounds(90, 100, 200, 100);
		button.addActionListener(this);
		button.setIcon(icon);
		button.setFont(new Font("comic sans",Font.BOLD,25));
		this.setSize(420,420);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setVisible(true);
		this.setResizable(true);
		this.add(button);
		this.add(label);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			//System.out.println("p");
			label.setVisible(true);
		}
		
	}

}
