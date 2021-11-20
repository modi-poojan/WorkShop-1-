package com.gambler;

public class Gamler {

	public static void main(String[] args) {
		
		int dailyStake = 100; // Variable for Total Betting Balance 
		int BET_PER_GAME = 1; // Variable for Betting amount per game
		int lose_range = 50;
		int win_range = 150;
		
		System.out.println("Welcome to Gambling game\n\nYou are starting a game with Account balance = $"+ dailyStake);
		
		System.out.println("A Bet is placed \n\nAmount Betted is = $"+BET_PER_GAME);
		
		// Using WhileLoop to run program till 50% limit
		while(dailyStake >= lose_range || dailyStake <= win_range)
		{
			double gamble_result = Math.floor(Math.random()*2); // Variable to check status of gamble result
			
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
						if(dailyStake == 150) {
							System.out.println("User reached 50% limit");
							break;
						}
						else if (dailyStake == 50) {
							System.out.println("User reached 50% limit");
							break;
							
						}
			
		} 
		
		
	}	
	
}



