package com.DesignPattern.DesignDatabaseLLD;

import java.util.Map;

public class Row {

	Map<String, Object> map;

	public Row(Map<String, Object> map) {
		super();
		this.map = map;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "Row [map=" + map + "]";
	}

}
