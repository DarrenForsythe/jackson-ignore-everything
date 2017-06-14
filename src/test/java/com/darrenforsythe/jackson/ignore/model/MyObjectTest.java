package com.darrenforsythe.jackson.ignore.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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
	public void testObjectMapperSer() throws Exception {
		String myObjectString = objectMapper.writeValueAsString(myObject);
		assertEquals("{\"name\":\"thing\"}", myObjectString);
	}
	
	@Test
	public void testObjectMapperDer() throws Exception{
		myObject = objectMapper.readValue("{\"name\":\"thing\"}", MyObject.class);
		assertEquals("thing", myObject.getName());
		assertNotNull(myObject.getDate());
		assertEquals(1, myObject.getId());
	}

}
		