package Challenges;
import javax.swing.*;
public class Challenge5 {
	public static void main(String [] args){
		String input = JOptionPane.showInputDialog(null,"Input a number");
		int n = Integer.parseInt(input);
		
		for(int i = 0;i<=n;i++){
			if(i%3==0){
				System.out.println("Fizz");
			}
			else if(i%5==0){
				System.out.println("Buzz");
			}
			else if(i%7==0){
				System.out.println("Woof");
			}
			else{
				System.out.println(i);
			}
		}
		
	}
}
