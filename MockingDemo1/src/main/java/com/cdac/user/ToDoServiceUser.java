package com.cdac.user;

import java.util.ArrayList;
import java.util.List;

import com.cdac.dao.ToDoService;

public class ToDoServiceUser {

	private ToDoService toDoService;

	public ToDoServiceUser(ToDoService toDoService) {
		this.toDoService = toDoService;
	}
	
	public List<String> getToDosRelatedToFood(String user) {
		
		List<String> lstFoodToDos = new ArrayList<>();
		
		List<String> lstToDos = toDoService.getToDos(user);
		
		for(String str : lstToDos) {
			if(str.contains("food"))
				lstFoodToDos.add(str);
		}
		
		return lstFoodToDos;
	}
}






