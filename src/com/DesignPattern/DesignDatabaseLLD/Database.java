package com.DesignPattern.DesignDatabaseLLD;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Database {

	Map<String, Table> tables;

	public Database() {
		this.tables = new HashMap<String, Table>();
	}

	void crateTable(Table table) {
		tables.put(table.getTableName(), table);
		System.out.println("Table " + table.getTableName() + " created successfully!! ");
	}

	void insertIntoTable(String tableName, List<Row> rows) {
		Table table = tables.get(tableName);
		table.insertData(rows);
	}

	List<Row> selectData(String tableName, String columnName, Object value) {
		List<Row> select = tables.get(tableName).select(columnName, value);
		return select;
	}

	void update(String tableName, String columnName, Object value, Object newValue) {
		Table table = tables.get(tableName);
		table.updateData(columnName, value, newValue);
	}

	List<Row> getAllData(String tableName) {
		List<Row> rows = tables.get(tableName).getAllRows();
		return rows;
	}

	void delete(String tableName, String columnName, Object value) {
		Table table = tables.get(tableName);
		table.delete(columnName, value);

	}

}
