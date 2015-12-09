package com.example.core;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ExampleJSONRequestTest {

	@Test
	public void simpleTodoListSizeTest() {
		ExampleJSONRequest exampleJSONRequest = new ExampleJSONRequest();
		assertThat(exampleJSONRequest.todoRequest().size(), is(2));
	}

	@Test
	public void simpleBrokenTodoListSizeTest() {
		// This code can be used to see the results of test failures
		// ExampleJSONRequest exampleJSONRequest = new ExampleJSONRequest();
		// assertThat(exampleJSONRequest.todoRequest().size(), is(3));
	}
}

