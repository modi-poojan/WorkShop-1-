package com.gambler;

public class Gamler {

	public static void main(String[] args) {
		
		int dailyStake = 100; // Variable for Total Betting Balance 
		int BET_PER_GAME = 1; // Variable for Betting amount per game
		double gamble_result = Math.floor(Math.random()*2); // Variable to check status of gamble result
		
		System.out.println("Welcome to Gambling game\n\nYou are starting a game with Account balance = $"+ dailyStake);
		
		System.out.println("A Bet is placed \n\nAmount Betted is = $"+BET_PER_GAME);
			// Using if-else to check if player has won or lose
			if (gamble_result== 0) {
				dailyStake -= BET_PER_GAME;
				System.out.println("You loss the bet\n\nAmount loss = $1");
				System.out.println("Balance after bet = $" + dailyStake);
			}
			else {
				dailyStake += BET_PER_GAME;
				System.out.println("You win the bet\n\nAmount won = $1 ");
				System.out.println("Balance after bet = $" + dailyStake);
			}
		
		}
	}



