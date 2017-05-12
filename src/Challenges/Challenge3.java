package Challenges;
import javax.swing.*;
public class Challenge3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String team1 = JOptionPane.showInputDialog(null,"What is the name of team 1?");
		String team2 = JOptionPane.showInputDialog(null,"What is the name of team 2?");
		char team1First = team1.charAt(0);
		char team2First = team2.charAt(0);
		int team1FirstLocation = alphabet.indexOf(team1First);
		int team2FirstLocation = alphabet.indexOf(team2First);
		String winner;
		if(team1FirstLocation == team2FirstLocation)
		{
			int team1Length = team1.length();
			int team2Length = team2.length();
			if(team1Length > team2Length){
				winner = team1;
			}
			else{
				winner = team2;
			}
		}
		else{
			if(team1FirstLocation>team2FirstLocation){
				winner = team2;
			}
			else{
				winner = team1;
			}
		}
	JOptionPane.showMessageDialog(null,"The winner is: " + winner);
	}
}
