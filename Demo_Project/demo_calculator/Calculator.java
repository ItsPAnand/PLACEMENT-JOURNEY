import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;




public class Calculator implements ActionListener {
	
	JLabel displayLabel;
	JButton sevenButton,eightButton,nineButton,sixButton,fiveButton,fourButton,threeButton,twoButton,oneButton,dotButton,zeroButton,equalButton,divButton,mulButton,subButton,addButton,clearBtton;
	
	boolean isOperatorClicked=false;
	String oldOperand;
	String operator="";
	
	public Calculator() {
		JFrame jf = new JFrame();
		jf.setLayout(null);
		jf.setSize(600,600);
		jf.setLocation(600, 100);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		displayLabel=new JLabel();
		displayLabel.setBounds(30,50,540,40);
		displayLabel.setBackground(Color.GRAY);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.WHITE);
		jf.add(displayLabel);
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(30, 130, 80, 80);
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setBounds(130, 130, 80, 80);
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(230, 130, 80, 80);
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		
		fourButton=new JButton("4");
		fourButton.setBounds(30, 230, 80, 80);
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(130, 230, 80, 80);
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(230, 230, 80, 80);
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		
		threeButton=new JButton("3");
		threeButton.setBounds(30, 330, 80, 80);
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		twoButton=new JButton("2");
		twoButton.setBounds(130, 330, 80, 80);
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(230, 330, 80, 80);
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		
		dotButton=new JButton(".");
		dotButton.setBounds(30, 430, 80, 80);
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(130, 430, 80, 80);
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		equalButton=new JButton("=");
		equalButton.setBounds(230, 430, 80, 80);
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		
		divButton=new JButton("/");
		divButton.setBounds(330, 130, 80, 80);
		divButton.addActionListener(this);
		jf.add(divButton);
		
		mulButton=new JButton("X");
		mulButton.setBounds(330, 230, 80, 80);
		mulButton.addActionListener(this);
		jf.add(mulButton);
		
		subButton=new JButton("-");
		subButton.setBounds(330, 330, 80, 80);
		subButton.addActionListener(this);
		jf.add(subButton);
		
		addButton=new JButton("+");
		addButton.setBounds(330, 430, 80, 80);
		addButton.addActionListener(this);
		jf.add(addButton);
		
		clearBtton=new JButton("Clear");
		clearBtton.setBounds(430, 430, 80, 80);
		clearBtton.addActionListener(this);
		jf.add(clearBtton);
		
	}
	public static void main(String[] args) {
		
		new Calculator();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==nineButton) {
			if(isOperatorClicked) {
				displayLabel.setText("9");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"9");
			}
		}
		
		else if(e.getSource()==eightButton) {
			
			if(isOperatorClicked) {
				displayLabel.setText("8");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"8");
			}
		}
		
		else if(e.getSource()==sevenButton) {

			if(isOperatorClicked) {
				displayLabel.setText("7");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"7");
			}
		}
		
		else if(e.getSource()==sixButton) {

			if(isOperatorClicked) {
				displayLabel.setText("6");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"6");
			}
		}
		
		else if(e.getSource()==fiveButton) {

			if(isOperatorClicked) {
				displayLabel.setText("5");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"5");
			}
		}
		
		else if(e.getSource()==fourButton) {

			if(isOperatorClicked) {
				displayLabel.setText("4");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"4");
			}
		}
		
		else if(e.getSource()==threeButton) {

			if(isOperatorClicked) {
				displayLabel.setText("3");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"3");
			}
		}
		
		else if(e.getSource()==twoButton) {

			if(isOperatorClicked) {
				displayLabel.setText("2");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"2");
			}
		}
		
		else if(e.getSource()==oneButton) {

			if(isOperatorClicked) {
				displayLabel.setText("1");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"1");
			}
		}
		
		else if(e.getSource()==dotButton) {

			if(isOperatorClicked) {
				displayLabel.setText(".");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+".");
			}
		}
		
		else if(e.getSource()==zeroButton) {

			if(isOperatorClicked) {
				displayLabel.setText("0");
				isOperatorClicked=false;
			}
			else {
				displayLabel.setText(displayLabel.getText()+"0");
			}
		}
		
		else if(e.getSource()==equalButton) {
			
			String newOperand=displayLabel.getText();
			
			float oldValueF=Float.parseFloat(oldOperand);
			float newValueF=Float.parseFloat(newOperand);
			
			float result=0;
			switch(operator) {
			case "+":
				result=oldValueF+newValueF;
				isOperatorClicked=true;
				break;
			
			case "-":
				result=oldValueF-newValueF;
				isOperatorClicked=true;
				break;
			
			case "*":
				result=oldValueF*newValueF;
				isOperatorClicked=true;
				break;
			case "/":
				result=oldValueF/newValueF;
				isOperatorClicked=true;
				break;
			}
			
			displayLabel.setText(result+" ");
		}
		
		else if(e.getSource()==addButton) {
			
			oldOperand=displayLabel.getText();
			operator="+";
			isOperatorClicked=true;
				
		}
		
		else if(e.getSource()==subButton) {
			oldOperand=displayLabel.getText();
			operator="-";
			isOperatorClicked=true;
			
		}
		
		else if(e.getSource()==mulButton) {
			oldOperand=displayLabel.getText();
			operator="*";
			isOperatorClicked=true;
	
		}
		
		else if(e.getSource()==divButton) {
			oldOperand=displayLabel.getText();
			operator="/";
			isOperatorClicked=true;
			
		}
		
		else if(e.getSource()==clearBtton) {
			displayLabel.setText("");
		}
	}
}

