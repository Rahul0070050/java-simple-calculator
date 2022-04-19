package sample;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Calc {
	public Calc() {
		JFrame jf = new JFrame("Calc");
		jf.setLayout(null);
		jf.setSize(500,500);
		jf.setVisible(true);
		jf.setLocation(200,200);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel DisplayLabal = new JLabel("hello");
		DisplayLabal.setBounds(20,20,460,50);
		DisplayLabal.setBackground(Color.cyan);
		DisplayLabal.setOpaque(true);
		DisplayLabal.setHorizontalAlignment(SwingConstants.RIGHT);
		jf.add(DisplayLabal);
		
		// row no 1
		JButton SevenButton = new JButton("7");
		SevenButton.setBounds(32,100,70,70);
		SevenButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(SevenButton);
		
		JButton EightButton = new JButton("8");
		EightButton.setBounds(122,100,70,70);
		EightButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(EightButton);
		
		JButton NineButton = new JButton("9");
		NineButton.setBounds(212,100,70,70);
		NineButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(NineButton);
		
		JButton ClearButton = new JButton("C");
		ClearButton.setBounds(302,100,160,70);
		ClearButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(ClearButton);
		
		JButton AdditionButton = new JButton("+");
		AdditionButton.setBounds(392,190,70,250);
		AdditionButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(AdditionButton);
		
		// row no 2
		JButton FourButton = new JButton("4");
		FourButton.setBounds(32,190,70,70);
		FourButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(FourButton);
		
		JButton FiveButton = new JButton("5");
		FiveButton.setBounds(122,190,70,70);
		FiveButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(FiveButton);
		
		JButton SixButton = new JButton("6");
		SixButton.setBounds(212,190,70,70);
		SixButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(SixButton);
		
		JButton SubtractionButton = new JButton("-");
		SubtractionButton.setBounds(302,190,70,70);
		SubtractionButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(SubtractionButton);
		
		// row no 3
		JButton OneButton = new JButton("1");
		OneButton.setBounds(32,280,70,70);
		OneButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(OneButton);
		
		JButton TowButton = new JButton("2");
		TowButton.setBounds(122,280,70,70);
		TowButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(TowButton);
		
		JButton ThreeButton= new JButton("3");
		ThreeButton.setBounds(212,280,70,70);
		ThreeButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(ThreeButton);
		
		JButton MultyplicationButton = new JButton("*");
		MultyplicationButton.setBounds(302,280,70,70);
		MultyplicationButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(MultyplicationButton);
		
		
		// row no 3				
		JButton ComaButton = new JButton(",");
		ComaButton.setBounds(32,370,70,70);
		ComaButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(ComaButton);

		JButton ZeroButton = new JButton("0");
		ZeroButton.setBounds(122,370,70,70);
		ZeroButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(ZeroButton);

		JButton DotButton = new JButton(".");
		DotButton.setBounds(212,370,70,70);
		DotButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(DotButton);
		
		JButton DivitionButton = new JButton("/");
		DivitionButton.setBounds(302,370,70,70);
		DivitionButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(DivitionButton);
	}
	public static void main(String[] args) {
		new Calc();
	}
}
