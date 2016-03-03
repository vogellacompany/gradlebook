package com.example.core;

import com.example.model.Todo;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class ExampleJSONRequest {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Todo> todoRequest() {
		List<Todo> todos = new ArrayList<>();
		Todo todo = new Todo();
		todo.setSummary("Go to EclipseCon");
		todos.add(todo);

		todo = new Todo();
		todo.setSummary("Learn Gradle");
		todo.setDescription("Gradle comes with powerful features and can be used inside the Eclipse IDE by using Buildship");
		todos.add(todo);

		return todos;
	}
}
