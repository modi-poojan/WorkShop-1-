package com.gambler;


public class Gambler_Main {

public static void main(String[] args) {


	Gamler game = new Gamler();
	int dailyStake = game.dailyStake;
	System.out.println("Welcome to Gambling game\n\nYou are starting a game with Account balance = $"+ dailyStake);
	System.out.println("\nFor Month \n\n");
	
	game.eachMonth();
	
	}

}
