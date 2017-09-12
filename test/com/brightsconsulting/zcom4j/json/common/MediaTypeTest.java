package com.brightsconsulting.zcom4j.json.common;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.io.IOException;

import org.junit.Test;

import com.brightsconsulting.zcom4j.json.common.MediaType;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MediaTypeTest {

	String json = "{\"base\": \"application/xml\"}";

	@Test
	public void test() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			MediaType mt = mapper.readValue(this.json, MediaType.class);
			assertThat(mt.base, is("application/xml"));
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
