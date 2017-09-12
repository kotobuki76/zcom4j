package com.brightsconsulting.zcom4j.json.common;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.brightsconsulting.zcom4j.json.common.Link;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LinkTest {
	
	String json = "{\"href\": \"http://docs.openstack.org/\",\"rel\": \"describedby\",\"type\": \"text/html\"}";

	@Test
	public void test() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			Link lk = mapper.readValue(this.json, Link.class);
			assertThat(lk.href, is("http://docs.openstack.org/"));
			assertThat(lk.rel, is("describedby"));
			assertThat(lk.type, is("text/html"));
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
