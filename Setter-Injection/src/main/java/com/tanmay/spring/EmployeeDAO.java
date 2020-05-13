package com.tanmay.spring;

public class EmployeeDAO {

	private DBConfig dbConfig;
	
	public DBConfig getDbConfig() {
		return dbConfig;
	}

	public void setDbConfig(DBConfig dbConfig) {
		this.dbConfig = dbConfig;
	}
	
	public void displayConfiguration() {
		System.out.println(dbConfig.getDriverName());
		System.out.println(dbConfig.getUrl());
		System.out.println(dbConfig.getUserName());
		System.out.println(dbConfig.getPassword());
	}


}
