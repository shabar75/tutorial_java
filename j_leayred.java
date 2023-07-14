package full_java;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JFrame;



public class j_leayred {
	public static void main(String[] args) {
		JLabel kk=new JLabel();
		kk.setOpaque(true);
		kk.setBackground(Color.RED);
		kk.setLayout(null);
		kk.setBounds(50, 50, 200, 200);
		
		JLabel b2=new JLabel();
		b2.setOpaque(true);
		b2.setBackground(Color.blue);
		b2.setLayout(null);
		b2.setBounds(100, 100, 200, 200);
		
		JLabel b3=new JLabel();
		b3.setOpaque(true);
		b3.setBackground(Color.black);
		b3.setLayout(null);
		b3.setBounds(150, 150, 200, 200);
		
		
		JFrame f = new JFrame();
		JLayeredPane l=new JLayeredPane();
		l.add(kk);
		l.add(b2);
		l.add(b2);
		l.setBounds(0,0,500,500);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500,500);
		f.setLayout(null);
		f.add(l);
		f.setVisible(true);
		
		
	}

}
