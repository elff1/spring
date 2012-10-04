package com.helloweenvsfei.spring.example;

import java.util.Calendar;

public class DaoImpl implements IDao {

	@Override
	public String sayHello(String name) {
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		
		if (hour < 6) return "6, " + name;
		if (hour < 12) return "12, " + name;
		if (hour < 13) return "13, " + name;
		if (hour < 18) return "18, " + name;
		return "24, " + name;
	}

}
