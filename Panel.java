package 五目並べ;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;




class Panel extends JPanel {
	String num[] = new String[225];
	JButton b[] = new JButton[num.length] ;
	public Panel() {
		
	JPanel p1 = new JPanel();
	
	setBackground(Color.yellow);
	p1.setLayout(new GridLayout(15,15,2,2));
	for(int i = 0; i < num.length; i++) {
		b[i] = new JButton(num[i]);
		b[i].setIcon(null);
        p1.add(b[i]);
        b[i].addActionListener(new Listener());
        b[i].setPreferredSize(new Dimension (50,50));
	}
	
	add(p1);
	
	
}
public class Listener implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
	}
}
}