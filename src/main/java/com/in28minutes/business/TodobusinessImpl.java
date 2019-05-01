package com.in28minutes.business;

import java.util.ArrayList;
import java.util.List;

import com.in28minutes.data.api.TodoService;

public class TodobusinessImpl {
	private TodoService todoservice;


	public TodobusinessImpl(TodoService todoservice) {
		super();
		this.todoservice = todoservice;
	}
	
	public List<String> retrivetodosRelatedtoString (String user){
		
		List<String> filteredTodos = new ArrayList<String>();
		List<String> todos = todoservice.retriveTodos(user); 
		
		for(String todo:todos) {
			if (todo.contains("Spring")) {
				filteredTodos.add(todo);
			}//if
		}//for 
		return filteredTodos;
	}

}
