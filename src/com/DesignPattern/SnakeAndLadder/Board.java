package com.DesignPattern.SnakeAndLadder;

import java.util.HashMap;
import java.util.Map;

public class Board {

	private int size;
	private Map<Integer, Cell> cells;

	public Board(int size) {
		super();
		this.size = size;
		cells = new HashMap<Integer, Cell>();
		for (int i = 1; i <= this.size; i++) {
			cells.put(i, new Cell(i));
		}
	}

	public Map<Integer, Cell> getCells() {
		return cells;
	}

	public int getSize() {
		return this.size;
	}

}
