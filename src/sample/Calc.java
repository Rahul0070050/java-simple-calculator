package sample;

import java.awt.Color;
import java.awt.Component;
import java.awt.DisplayMode;
import java.awt.Font;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Expression;
import java.sql.ClientInfoStatus;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;
import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Calc implements ActionListener {
	JFrame jf;
	JLabel DisplayLabal;
	JButton SevenButton;
	JButton EightButton;
	JButton NineButton;
	JButton ClearButton;
	JButton AdditionButton;
	JButton FourButton;
	JButton FiveButton;
	JButton SixButton;
	JButton SubtractionButton;
	JButton TowButton;
	JButton OneButton;
	JButton ThreeButton;
	JButton MultyplicationButton;
	JButton ComaButton;
	JButton ZeroButton;
	JButton DotButton;
	JButton DivitionButton;
	JButton EqualtoButton;
	
	StoreValue val;
	
	String lastChar;
	
	public Calc() {
		val = new StoreValue();
		jf = new JFrame("Calc");
		jf.setLayout(null);
		jf.setSize(500,500);
		jf.setVisible(true);
		jf.setLocation(200,200);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		DisplayLabal = new JLabel();
		DisplayLabal.setFont(new Font("Arial",Font.PLAIN,30));
		DisplayLabal.setBounds(20,20,460,50);
		DisplayLabal.setBackground(Color.cyan);
		DisplayLabal.setOpaque(true);
		DisplayLabal.setHorizontalAlignment(SwingConstants.RIGHT);
		jf.add(DisplayLabal);
		
		// row no 1
		SevenButton = new JButton("7");
		SevenButton.setBounds(32,100,70,70);
		SevenButton.addActionListener(this);
		SevenButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(SevenButton);
		
		EightButton = new JButton("8");
		EightButton.setBounds(122,100,70,70);
		EightButton.addActionListener(this);
		EightButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(EightButton);
		
		NineButton = new JButton("9");
		NineButton.setBounds(212,100,70,70);
		NineButton.addActionListener(this);
		NineButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(NineButton);
		
		ClearButton = new JButton("C");
		ClearButton.setBounds(392,100,70,160);
		ClearButton.addActionListener(this);
		ClearButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(ClearButton);
		
		AdditionButton = new JButton("+");
		AdditionButton.setBounds(302,100,70,70);
		AdditionButton.addActionListener(this);
		AdditionButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(AdditionButton);
		
		EqualtoButton = new JButton("=");
		EqualtoButton.setBounds(392,280,70,160);
		EqualtoButton.addActionListener(this);
		EqualtoButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(EqualtoButton);
		
		// row no 2
		FourButton = new JButton("4");
		FourButton.setBounds(32,190,70,70);
		FourButton.addActionListener(this);
		FourButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(FourButton);
		
		FiveButton = new JButton("5");
		FiveButton.setBounds(122,190,70,70);
		FiveButton.addActionListener(this);
		FiveButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(FiveButton);
		
		SixButton = new JButton("6");
		SixButton.setBounds(212,190,70,70);
		SixButton.addActionListener(this);
		SixButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(SixButton);
		
		SubtractionButton = new JButton("-");
		SubtractionButton.setBounds(302,190,70,70);
		SubtractionButton.addActionListener(this);
		SubtractionButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(SubtractionButton);
		
		// row no 3
		OneButton = new JButton("1");
		OneButton.setBounds(32,280,70,70);
		OneButton.addActionListener(this);
		OneButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(OneButton);
		

		TowButton = new JButton("2");
		TowButton.setBounds(122,280,70,70);
		TowButton.addActionListener(this);
		TowButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(TowButton);

		ThreeButton= new JButton("3");
		ThreeButton.setBounds(212,280,70,70);
		ThreeButton.addActionListener(this);
		ThreeButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(ThreeButton);
		
		MultyplicationButton = new JButton("*");
		MultyplicationButton.setBounds(302,280,70,70);
		MultyplicationButton.addActionListener(this);
		MultyplicationButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(MultyplicationButton);
		
		
		// row no 3				
		ComaButton = new JButton(",");
		ComaButton.setBounds(32,370,70,70);
		ComaButton.addActionListener(this);
		ComaButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(ComaButton);

		ZeroButton = new JButton("0");
		ZeroButton.setBounds(122,370,70,70);
		ZeroButton.addActionListener(this);
		ZeroButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(ZeroButton);

		DotButton = new JButton(".");
		DotButton.setBounds(212,370,70,70);
		DotButton.addActionListener(this);
		DotButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(DotButton);
		
		DivitionButton = new JButton("/");
		DivitionButton.setBounds(302,370,70,70);
		DivitionButton.addActionListener(this);
		DivitionButton.setFont(new Font("Arial",Font.PLAIN,50));
		jf.add(DivitionButton);
	}
	public static void main(String[] args) {
		new Calc();
	}
	
	public Boolean checkCharacter() {
		if(lastChar == "+" || lastChar == "-" || lastChar == "x" || lastChar == "/" || lastChar == "."|| lastChar == ",") {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == SevenButton) {
			DisplayLabal.setText(DisplayLabal.getText() + "7");
			val.addData("7");
		} else if (e.getSource() == EightButton) {
			DisplayLabal.setText(DisplayLabal.getText() + "8");
			val.addData("8");
		} else if (e.getSource() == NineButton){
			DisplayLabal.setText(DisplayLabal.getText() + "9");
			val.addData("9");
		} else if (e.getSource() == FourButton) {
			DisplayLabal.setText(DisplayLabal.getText() + "4");
			val.addData("4");
		} else if (e.getSource() == FiveButton) {
			DisplayLabal.setText(DisplayLabal.getText() + "5");
			val.addData("5");
		} else if (e.getSource() == SixButton) {
			DisplayLabal.setText(DisplayLabal.getText() + "6");
			val.addData("6");
		} else if (e.getSource() == ThreeButton) {
			DisplayLabal.setText(DisplayLabal.getText() + "3");
			val.addData("3");
		} else if (e.getSource() == TowButton) {
			DisplayLabal.setText(DisplayLabal.getText() + "2");
			val.addData("2");
		} else if (e.getSource() == OneButton) {
			DisplayLabal.setText(DisplayLabal.getText() + "1");
			val.addData("1");
		} else if (e.getSource() == ZeroButton) {
			DisplayLabal.setText(DisplayLabal.getText() + "0");
			val.addData("0");
		} else if (e.getSource() == DotButton) {
			if(DisplayLabal.getText() == "" || checkCharacter()) {
				return;
			}
			DisplayLabal.setText(DisplayLabal.getText() + ".");
			val.addData(".");
		} else if (e.getSource() == ClearButton) {
			val.clear();
			DisplayLabal.setText("");
		} else if (e.getSource() == AdditionButton) {
			if(DisplayLabal.getText() == "" || checkCharacter()) {
				return;
			}
			DisplayLabal.setText(DisplayLabal.getText() + "+");
			val.addData("+");
		} else if (e.getSource() == ComaButton) {
			if(DisplayLabal.getText() == "" || checkCharacter()) {
				return;
			}
			DisplayLabal.setText(DisplayLabal.getText() + ",");
			if(DisplayLabal.getText() == "" || checkCharacter()) {
				return;
			}
			val.addData(",");
		} else if (e.getSource() == SubtractionButton) {
			if(DisplayLabal.getText() == "" || checkCharacter()) {
				return;
			}
			DisplayLabal.setText(DisplayLabal.getText() + "-");
			val.addData("-");
		} else if (e.getSource() == MultyplicationButton) {
			if(DisplayLabal.getText() == "" || checkCharacter()) {
				return;
			}
			DisplayLabal.setText(DisplayLabal.getText() + "x");
			val.addData("*");
		}  else if (e.getSource() == DivitionButton) {
			if(DisplayLabal.getText() == "" || checkCharacter()) {
				return;
			}
			DisplayLabal.setText(DisplayLabal.getText() + "/");
			val.addData("/");
		} else if (e.getSource() == EqualtoButton) {
			val.show();
		}
	}
	
	
	private class StoreValue {
		class Data{
			String data;
			Data next;
			Data prev;
			
			Data(String value) {
				this.data = value;
			}
		}
		
		private Data head = null;
		private Data tail = null;
		
		Boolean contains(String data) {
			if(data == "+" || data == "-" || data == "*" || data == "/") {
				return true;
			}
			return false;
		}
		public void addData(String data) {
			lastChar = data;
			// checking: is 'data' an opretor
			if (contains(data)) {
				
				if (head == null) {
					return;
				} else {
					if (contains(this.tail.data)) {
						return;
					}
					Data newData = new Data(data);
					this.tail.next = newData;
					newData.prev = this.tail;
					this.tail = newData;
					return;
				}
				
			} else {
				Data newData = new Data(data);
				if(head == null) {
					this.head = newData;
				} else {
					if (contains(this.tail.data)) {
						this.tail.next = newData;
						newData.prev = this.tail;
						this.tail = newData;
						return;
					}
					 this.tail.data += data;
					 return;
				}
				this.tail = newData;
			}
			return;
		}
		public void show() {
			Data temp = this.head;
			while(temp != null) {
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
		private void clear() {
			this.head = null;
			this.tail = null;
		}
	}
}






