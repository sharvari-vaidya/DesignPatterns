package com.DesignPattern.SnakeAndLadder;

import java.util.List;

public class PlayGame {

	private Player winner;
	private Board board;
	private List<Player> players;
	private Dice dice;

	public PlayGame(Board board, List<Player> players, Dice dice) {
		super();
		this.board = board;
		this.players = players;
		this.dice = dice;
	}

	public void addSnake(Snake snake) {
		board.getCells().get(snake.getStart()).setSnake(snake);
	}

	public void addLadder(Ladder ladder) {
		board.getCells().get(ladder.getStart()).setLadder(ladder);
	}

	public Player playGame() {

		while (winner == null) {

			for (Player p : players) {
				play(p);
				if (winner != null) {
					break;
				}
			}
			System.out.println("*****");
		}

		return winner;
	}

	private void play(Player p) {
		int newPosition = dice.rollDice() + p.getPosition();
		System.out.println(p.getName() + " " + newPosition);
		if (newPosition > board.getSize()) {
			return;
		}
		if (newPosition == board.getSize()) {
			System.out.println(newPosition);
			winner = p;
			return;
		} else {
			Snake snake = board.getCells().get(newPosition).getSnake();
			Ladder ladder = board.getCells().get(newPosition).getLadder();
			if (ladder != null) {
				p.setPosition(ladder.getEnd());
				return;
			}
			if (snake != null) {
				System.out.println("Snake " + p.getName());
				p.setPosition(snake.getEnd());
				return;
			}
			p.setPosition(newPosition);

		}

	}

}
