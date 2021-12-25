package com.bridgeLabs;

import java.util.Random;
import java.util.Scanner;

public class GamblerSimulator {
	int everyDayStake = 100;
	int bet = 1;
	int totelAmountLeftInDay = 0;
	int noOFDaysPlay = 20;
	int totelAmountLeftAfterMonth;

	// empty constructor for Default Value
	public GamblerSimulator() {
	}

	public GamblerSimulator(int everyDayStake, int bet, int totelAmountLeftInDay, int noOFDaysPlay) {
		super();
		this.everyDayStake = everyDayStake;
		this.bet = bet;
		totelAmountLeftInDay = totelAmountLeftInDay;
		this.noOFDaysPlay = noOFDaysPlay;
	}

//this fuction counts the every day  stake left in gamblers hand after one day game 
	public int everyDayGame(int stake, int bet) {

		Random rand = new Random();
		while (stake < 150 && stake > 50) {
			int winOrLoose = rand.nextInt(2);
			// win
			if (winOrLoose == 0) {
				stake = stake + bet;

			} // loose
			else {
				stake = stake - bet;
			}
		}

		return stake;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int playOrNot=1;
		GamblerSimulator gambler1 = new GamblerSimulator();
while(playOrNot!=0) {
		for (int i = 1; i <= gambler1.noOFDaysPlay; i++) {
			gambler1.totelAmountLeftInDay = gambler1.everyDayGame(gambler1.everyDayStake, gambler1.bet);
			gambler1.totelAmountLeftAfterMonth += gambler1.totelAmountLeftInDay;
			System.out.printf("In day %d the totel stake left from one day stake i.e %d is %d \n", i,
					gambler1.everyDayStake, gambler1.totelAmountLeftInDay);

		}
		System.out.println("*********************************************************************************** ");
		System.out.println("The totel stake left after a month is :" + gambler1.totelAmountLeftAfterMonth);
		System.out.println(
				"!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println("write 'true' you want to play again else enter 'false' : ");
		 playOrNot = sc.nextInt();
		 
}
		
	}

}
