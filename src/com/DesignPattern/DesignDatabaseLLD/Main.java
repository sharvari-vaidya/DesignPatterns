package com.DesignPattern.DesignDatabaseLLD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Database db = new Database();

		Column c1 = new Column("id", "int");
		Column c3 = new Column("age", "int");
		Column c2 = new Column("name", "string");
		List<Column> columns = new ArrayList<Column>();
		columns.add(c1);
		columns.add(c2);
		columns.add(c3);

		Table table1 = new Table("Student", columns);
		db.crateTable(table1);
		List<Row> allRows = new ArrayList<Row>();
		Map<String, Object> rows = new HashMap<String, Object>();
		rows.put("id", 1);
		rows.put("age", 10);
		rows.put("name", "sharvari");

		Map<String, Object> rows1 = new HashMap<String, Object>();
		rows1.put("id", 2);
		rows1.put("age", 11);
		rows1.put("name", "abcd");

		Map<String, Object> rows2 = new HashMap<String, Object>();
		rows2.put("id", 3);
		rows2.put("age", 10);
		rows2.put("name", "efgh");

		Map<String, Object> rows3 = new HashMap<String, Object>();
		rows3.put("id", 4);
		rows3.put("age", 10);
		rows3.put("name", "ijkl");
		Row r0 = new Row(rows);
		Row r1 = new Row(rows1);
		Row r2 = new Row(rows2);
		Row r3 = new Row(rows3);
		allRows.add(r0);
		allRows.add(r1);
		allRows.add(r2);
		allRows.add(r3);
		db.insertIntoTable("Student", allRows);
		List<Row> selectData = db.selectData("Student", "age", 10);
		for (Row r : selectData) {
			System.out.println(r.toString());
		}
		db.update("Student", "name", "sharvari", "vaidya");
		System.out.println("******************************");

		List<Row> allData = db.getAllData("Student");
		for (Row r : allData) {
			System.out.println(r.toString());
		}

		db.update("Student", "age", 11, 16);
		db.delete("Student", "age", 16);

		System.out.println("******************************");

		List<Row> list = db.getAllData("Student");
		for (Row r : list) {
			System.out.println(r.toString());
		}

	}

}
