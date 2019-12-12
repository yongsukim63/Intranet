package intranet;

import javax.swing.*;
import java.awt.*;

public class TestPanel extends JFrame {

	JPanel bg;
	JButton jb1, jb2;
	JLabel jl1, jl2;
	JTextField tf;

	public TestPanel() {
		super("ddd");

		Container cp= this.getContentPane();
		cp.add(bg=new JPanel());
		
		bg.add(jb1= new JButton("button1"));
		bg.add(jb2= new JButton("button2"));
		bg.add(jl1= new JLabel("label1"));
		bg.add(jl2= new JLabel("label2"));
		

		//창닫기설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		TestPanel my = new TestPanel();

		my.setSize(400, 400);
		my.setVisible(true);

	}

}