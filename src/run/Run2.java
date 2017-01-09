package run;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import polyomino.Test;

public class Run2 extends JFrame {
	public Run2(String s) {
		JTextArea l = new JTextArea(s);
		l.setEditable(false);
		Container g = this.getContentPane();
		g.add(l, BorderLayout.NORTH);
		setSize(10*s.length(), 100);
		setVisible(true);
		this.setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		String s = Test.task2();
		Run2 r = new Run2(s);
	}
}
