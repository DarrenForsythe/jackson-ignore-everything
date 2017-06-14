package com.darrenforsythe.jackson.ignore.model;

import static org.junit.Assert.*;

import org.hamcrest.core.IsEqual;
import org.junit.Before;
import org.junit.Test;

import com.darrenforsythe.jackson.ignore.JacksonConfig;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MyObjectTest {
	
	
	private ObjectMapper objectMapper;
	private MyObject myObject;
	@Before
	public void setup() throws Exception {
		objectMapper = JacksonConfig.getObjectMapper();
		myObject = new MyObject();
	}
	
	@Test
	public void testObjectMapper() throws Exception {
		String myObjectString = objectMapper.writeValueAsString(myObject);
		assertEquals("{\"name\":\"thing\"}", myObjectString);
	}

}
