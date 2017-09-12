package com.brightsconsulting.zcom4j.json.common;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AuthTest {

	String json = "{\"passwordCredentials\":{\"username\":\"ConoHa\",\"password\":\"paSSword123456#$%\"},\"tenantId\":\"487727e3921d44e3bfe7ebb337bf085e\"}";

	
	@Test
	public void test() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			Auth auth = mapper.readValue(this.json, Auth.class);
			assertThat(auth.passwordCredentials.username, is("ConoHa"));
			assertThat(auth.passwordCredentials.password, is("paSSword123456#$%"));
			assertThat(auth.tenantId, is("487727e3921d44e3bfe7ebb337bf085e"));

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
