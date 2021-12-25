package com.bridgeLabs;

import java.util.Random;

public class GamblerSimulator {
	int everyDayStake = 100;
	int bet = 1;

	// empty constructor for Default Value
	public GamblerSimulator() {
	}

	public GamblerSimulator(int stake, int bet) {
		super();
		everyDayStake = stake;
		this.bet = bet;
	}

	public static void main(String[] args) {
		GamblerSimulator gambler1 = new GamblerSimulator();
		Random rand = new Random();
		
		while (gambler1.everyDayStake < 150 && gambler1.everyDayStake>50) {
			int winOrLoose = rand.nextInt(2);
			// win
			if (winOrLoose == 0) {
				gambler1.everyDayStake = gambler1.everyDayStake + gambler1.bet;

			} // loose
			else {
				gambler1.everyDayStake = gambler1.everyDayStake - gambler1.bet;
			}
		}System.out.println("The totel stake after game of every day stake is "+gambler1.everyDayStake );
	}

}
