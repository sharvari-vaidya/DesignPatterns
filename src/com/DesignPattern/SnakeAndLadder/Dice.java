package com.DesignPattern.SnakeAndLadder;

import java.util.List;
import java.util.Random;

public class Dice {

	private Random random;

	public Dice() {
		random = new Random();
	}

	public int rollDice() {

		return random.nextInt(6) + 1;
	}

	public Player getRandomPlayer(List<Player> players) {
		return players.get(random.nextInt(players.size() + 1));
	}

}
