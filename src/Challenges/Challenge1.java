package Challenges;
import javax.swing.*;
public class Challenge1 {
	/*
	 * 
Problem 1. Roman Numeral Translator

Your program should accept a number expressed using slightly modified Roman numerals as input and output the number as a decimal number. All numbers will be between 1 and 50.

Because real Roman numerals have so many small and complicated rules, we’ll be using a slightly modified form of Roman numerals – no subtraction. Here are the rules your program should use to read in the Roman numerals:
I=1, V=5, X=10, L=50
Repeated numerals are added (XX=20, III=3, XXXXVI=46)
Only I and X can be repeated
Each numeral will be less than or equal to the previous one (XVI=16 and is legal, XIV is not legal for this problem)

	 */
	public static void main(String[]args){
		
		boolean quit = false;
		do{
		int tensCounter = 0; 
		int fiveCounter= 0;
		int onesCounter = 0;
		String numeral = JOptionPane.showInputDialog(null, "Please input a Roman Numeral");
		if (numeral.contains("X"));{
			
			for( int i=0; i<numeral.length(); i++ ) {
			    if( numeral.charAt(i) == 'X' ) {
			        tensCounter++;
			    } 
			}
			
			// JOptionPane.showMessageDialog(null, "The value is at least: " + tensValue);
		}
	    if(numeral.contains("V")){

	    	for(int i = 0; i<numeral.length(); i ++){
	    		if (numeral.charAt(i) == 'V'){
	    			fiveCounter++;
	    		}
	    	}
	    	
	    } 
	    if(numeral.contains("I")){
	    	
	    	for(int i = 0; i<numeral.length(); i ++){
	    		if (numeral.charAt(i) == 'I'){
	    			onesCounter++;
	    		}
	    	}
	    	
	    } 
	     int tensValue = tensCounter * 10;
	     int fiveValue = fiveCounter * 5;
	     int oneValue = onesCounter;
	     int numeralTranslate = tensValue + fiveValue + oneValue;
	     JOptionPane.showMessageDialog(null, "Your Roman Numeral translates to: " + numeralTranslate);
	     
	     int playAgain=JOptionPane.showConfirmDialog(null, "Would you like to play again? ", null, JOptionPane.YES_NO_OPTION);
	     if(playAgain==JOptionPane.YES_OPTION){
	    	 quit = false;
	     }
	     else{
	    	 System.exit(0);
	     }
	     
		}while(quit = true);
	}
}
