package Bridgelab.gambling;
public class GamblerProblem {
	//Stake of $100 and every bet is of $1
	public static final int STAKE = 100;
	public static final int BET = 1;
		
	//Method to determine win or loss
	static void winOrLoss(){
		double gambling = Math.floor(Math.random() * 10) % 2;
		if(gambling == 1) {
			System.out.println("Win");
		}
		else {
			System.out.println("loss");
		}
	}
		
	public static void main(String args[]) {
		System.out.println("Welcome to the java gambler problem");
		winOrLoss();	
		}	
	
	}
