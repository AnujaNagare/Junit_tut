package com.in28minutes.data.stub;

import java.util.Arrays;
import java.util.List;

import com.in28minutes.data.api.TodoService;

public class TodoServiceStub implements TodoService {
	// Dynamic Conditions 
	// Service Definition 
	
	public List<String> retrieveTodos(String user) {
		return Arrays.asList("Learn Spring MVC", "Learn Spring",
				"Learn to Dance");
	}
}