package com.DesignPattern.SnakeAndLadder;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Dice dice = new Dice();
		Board board = new Board(100);
		List<Player> players = new ArrayList<Player>();
		Player p1 = new Player("A");
		Player p2 = new Player("B");
		Player p3 = new Player("C");
		Player p4 = new Player("D");
		Player p5 = new Player("E");
		players.add(p1);
		players.add(p2);
		players.add(p3);
		players.add(p4);
		players.add(p5);

		PlayGame game = new PlayGame(board, players, dice);
		Ladder ladder1 = new Ladder(8, 52);
		Ladder ladder2 = new Ladder(6, 80);
		Ladder ladder3 = new Ladder(26, 42);
		Ladder ladder4 = new Ladder(2, 72);

		game.addLadder(ladder1);
		game.addLadder(ladder2);
		game.addLadder(ladder3);
		game.addLadder(ladder4);

		Snake snake1 = new Snake(51, 19);
		Snake snake2 = new Snake(39, 11);
		Snake snake3 = new Snake(37, 29);
		Snake snake4 = new Snake(81, 3);
		Snake snake5 = new Snake(59, 5);
		Snake snake6 = new Snake(79, 23);
		Snake snake7 = new Snake(53, 7);
		Snake snake8 = new Snake(43, 33);
		Snake snake9 = new Snake(77, 21);
		game.addSnake(snake1);
		game.addSnake(snake2);
		game.addSnake(snake3);
		game.addSnake(snake4);
		game.addSnake(snake5);
		game.addSnake(snake6);
		game.addSnake(snake7);
		game.addSnake(snake8);
		game.addSnake(snake9);

		Player playGame = game.playGame();
		System.out.println(playGame.getName());
	}

}
