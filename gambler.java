package com.bridgelab.gambling;

public class GamblerProblem {
	// UC-1 Stake of $100 and bet of $1
	public static final int STAKE = 100;
	public static final int BET = 1;

	// UC-2 Win or lose method
	public void winOrLoss() {

		// UC-3 Gambling till 50% of stake is lost or won
		int stake = STAKE;
		int target = 150;
		int loss = 50;
		while ((stake < target && stake > loss)) {
			double random = Math.floor(Math.random() * 10) % 2;
			if (random == 1) {
				stake++;
			} else {
				stake--;
			}
		}
		if (stake == 50) {
			System.out.println("gambler lost 50% of the stake");
		} else {
			System.out.println("gambler won 50% of the stake");
		}
	}

	public static void main(String args[]) {
		GamblerProblem gambler = new GamblerProblem();
		gambler.winOrLoss();
	}
}
