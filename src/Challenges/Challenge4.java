package Challenges;
import javax.swing.*;
public class Challenge4 {
	public static void main(String [] args){
		boolean ambig = false;
		String n1 = JOptionPane.showInputDialog(null, "What is the first number?: ");
		String n2 = JOptionPane.showInputDialog(null, "What is the second number?: ");
		String n3 = JOptionPane.showInputDialog(null, "What is the third number?: ");
		int num1 = Integer.parseInt(n1);
		int num2 = Integer.parseInt(n2);
		int num3 = Integer.parseInt(n3);
		
		if(num1<=12){
			if(num2<=12){
				ambig = true;
			}
		}
		else if(num2 > 12){
			if(num3<31){	
			ambig = true;
			}
		}
		if(ambig = true){
			JOptionPane.showMessageDialog(null, "This date is Ambiguous");
		}
		else{
			JOptionPane.showMessageDialog(null, "This date is Unambiguous");
		}
	}
}
