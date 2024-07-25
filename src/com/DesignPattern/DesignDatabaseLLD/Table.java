package com.DesignPattern.DesignDatabaseLLD;

import java.util.ArrayList;
import java.util.List;

public class Table {

	private String tableName;
	private List<Column> columns;
	private List<Row> rows;

	public Table(String tableName, List<Column> columns) {
		super();
		this.tableName = tableName;
		this.columns = columns;
		this.rows = new ArrayList<Row>();
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public List<Column> getColumns() {
		return columns;
	}

	public void setColumns(List<Column> columns) {
		this.columns = columns;
	}

	public List<Row> getRows() {
		return rows;
	}

	public void setRows(List<Row> rows) {
		this.rows = rows;
	}

	public void insertData(List<Row> row) {
		rows.addAll(row);
	}

	public List<Row> select(String columnName, Object value) {
		List<Row> ro = new ArrayList<Row>();
		for (Row row : rows) {
			if (row.getMap().get(columnName).equals(value)) {
				ro.add(row);
			}
		}
		return ro;
	}

	public void updateData(String columnName, Object value, Object newValue) {
		for (Row row : rows) {
			if (row.getMap().get(columnName).equals(value)) {
				row.getMap().remove(columnName);
				row.getMap().put(columnName, newValue);
			}
		}
	}

	public List<Row> getAllRows() {
		List<Row> ro = new ArrayList<Row>();
		for (Row r : rows) {
			ro.add(r);
		}
		return ro;
	}

	public void delete(String columnName, Object value) {
		List<Row> rr = new ArrayList<Row>();
		if (columnName.equals(null)) {
			rows.clear();
			return;
		}
		for (Row r : rows) {
			if (r.getMap().get(columnName).equals(value)) {
				rr.add(r);
			}
		}
		for (Row r : rr) {
			rows.remove(r);
		}
	}

}
