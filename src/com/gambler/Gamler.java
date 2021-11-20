package com.gambler;

public class Gamler {

	public static int dailyStake = 100; 							// Variable for Total Betting Balance 
	public static int BET_PER_GAME = 1; 							// Variable for Betting amount per game
	public static int lose_range = 50;
	public static int win_range = 150;
	public static int total_won = 0;
	public static int total_loss = 0;	
		
	public int gamble() {
			
		while(dailyStake >= lose_range || dailyStake <= win_range)	// Using WhileLoop to run program till 50% limit
		{
			double gamble_result = Math.floor(Math.random()*2); 	// Variable to check status of gamble result
			
						
						if (gamble_result== 0) {					// Using if-else to check if player has won or lose
							dailyStake -= BET_PER_GAME;
							//System.out.println("You loss the bet\n\nAmount loss = $1");
							//System.out.println("Balance after bet = $" + dailyStake);
							
						}
						else {
							dailyStake += BET_PER_GAME;
							//System.out.println("You win the bet\n\nAmount won = $1 ");
							//System.out.println("Balance after bet = $" + dailyStake);
							
						}
						if(dailyStake == 150) {
							
							//System.out.println("User reached 50% limit"); 
							break;
						}
						else if (dailyStake == 50) {
							//System.out.println("User reached 50% limit");
							break;
						}
					} 
			return dailyStake;
		}	
		
	public void eachMonth() {
			
		int days = 30;
		for (int i = 1; i <= days; i++) {
			int result = gamble();
			if(result == 150) {
				total_won += 50;
				System.out.println("\nGambler earned "+(result-100)+" on day"+i);
			}
			else{
				total_loss -= 50;
				System.out.println("\nGambler made a loss "+result+" on day"+i);
			}
			dailyStake = 100;
			}
		
		System.out.println("\nThe user has won $"+total_won+" in "+days+" days");
		System.out.println("\nThe user has loss $"+total_loss+" in "+days+" days");
		}
	
}


