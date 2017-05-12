package Challenges;
import javax .swing.*;
public class Challenge2 {
/*
 * 
Problem 2. Political Fever – Delegate Frenzy

Your program should take in three inputs: The number of delegates, the percentage of votes Candidate 1 got, and the percentage of votes Candidate 2 got. Together with Candidate 3’s percentage (not given), all percentages should sum to 100. Using the Missituckychusets delegate rules described below, tell us how many delegates each candidate will be awarded.

Note: Each candidate will always receive a whole number of delegates – no rounding should be necessary.

Missituckychusets delegate rules:
If a candidate receives less than 15% of the total votes, they receive zero delegates and are considered non-viable.
If a candidate receives more than 50% of the total votes, they receive all of the delegates.
If a candidate receives between 15% and 50% (inclusive on both), they receive that percentage of all available delegates.
If a candidate is non-viable, their votes are split evenly among the other two candidates.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dN = JOptionPane.showInputDialog(null, "How many delegates does this state have?");
		double delegateNumber = Double.parseDouble(dN);
		
		String cOP = JOptionPane.showInputDialog(null, "What percent of the votes did canidate 1 receive? (Decimal Number Please)");
		double canOnePercent = Double.parseDouble(cOP);
		
		String cTP = JOptionPane.showInputDialog(null, "What percent of the votes did canidate 2 receive?(Decimal Number Please)");
		double canTwoPercent = Double.parseDouble(cTP);
		
		double canThreePercent = 1 - canTwoPercent - canOnePercent;
		
		double canOneDelegates = 0;
		double canTwoDelegates = 0;
		double canThreeDelegates = 0;
		
		if(canOnePercent > .5){
			canOneDelegates = delegateNumber;
			 canTwoDelegates = 0;
			 canThreeDelegates = 0;
		}
		else if(canOnePercent<.15){
			canOneDelegates = 0;
			if(canTwoPercent<.5 && canThreePercent<.5){
				canTwoDelegates = delegateNumber*canTwoPercent;
				canThreeDelegates = delegateNumber*canThreePercent;
			}
		}
		else{
			if(canTwoPercent<.5 && canThreePercent<.5){
				canOneDelegates = delegateNumber*canOnePercent;
				canTwoDelegates = delegateNumber*canTwoPercent;
				canThreeDelegates = delegateNumber*canThreePercent;
			}
		}
		if(canTwoPercent > .50){
			canTwoDelegates = delegateNumber;
			canThreeDelegates = 0; 
			canOneDelegates = 0;
		}
		else if(canTwoPercent<.15){
			canTwoDelegates = 0;
			if(canTwoPercent<.5 && canThreePercent<.5){
				canOneDelegates = delegateNumber*canOnePercent;
				canThreeDelegates = delegateNumber*canThreePercent;
			}
		}
		else{
			if(canOnePercent<.5 && canThreePercent<.5){
				canOneDelegates = delegateNumber*canOnePercent;
				canTwoDelegates = delegateNumber*canTwoPercent;
				canThreeDelegates = delegateNumber*canThreePercent;
			}
		}
		if(canThreePercent > .50){
			canThreeDelegates = delegateNumber;
			canOneDelegates = 0;
			canTwoDelegates = 0;
		}
		else if(canThreePercent<.15){
			canThreeDelegates = 0;
			if(canTwoPercent<.5 && canThreePercent<.5){
				canOneDelegates = delegateNumber*canOnePercent;
				canTwoDelegates = delegateNumber*canTwoPercent;
			}
		}
		else{
			if(canTwoPercent<.5 && canOnePercent<.5){
				canOneDelegates = delegateNumber*canOnePercent;
				canTwoDelegates = delegateNumber*canTwoPercent;
				canThreeDelegates = delegateNumber*canThreePercent;
			}
		}
		JOptionPane.showMessageDialog(null, "Did it work? " + "\n"+delegateNumber + "\n"+canOneDelegates+ "\n"+canTwoDelegates + "\n"+canThreeDelegates);
	}

}
