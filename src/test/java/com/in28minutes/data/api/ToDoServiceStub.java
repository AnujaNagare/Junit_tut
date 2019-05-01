package com.in28minutes.data.api;


import java.util.Arrays;
import java.util.List;

public class ToDoServiceStub implements TodoService{
	public List<String> retriveTodos(String user){
		return Arrays.asList("1", "2");
	}

}
