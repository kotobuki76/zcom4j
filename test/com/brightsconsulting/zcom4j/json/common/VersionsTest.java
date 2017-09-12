package com.brightsconsulting.zcom4j.json.common;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.brightsconsulting.zcom4j.json.common.VersionList;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class VersionsTest {

	String json = "{\"values\":[{\"id\":\"v2.0\",\"links\":[{\"href\":\"https://identity.tyo1.cloud.z.com/v2.0/\",\"rel\":\"self\"},{\"href\":\"http://docs.openstack.org/\",\"rel\":\"describedby\",\"type\":\"text/html\"}],\"media-types\":[{\"base\":\"application/json\"},{\"base\":\"application/xml\"}],\"status\":\"stable\",\"updated\":\"2014-04-17T00:00:00Z\"}]}";
	
	@Test
	public void test() {
		ObjectMapper mapper = new ObjectMapper();
		try {
			VersionList vs = mapper.readValue(this.json, VersionList.class);
			assertThat(vs.values.get(0).status, is("stable"));
			assertThat(vs.values.get(0).id, is("v2.0"));
			assertThat(vs.values.get(0).links.get(0).href, is("https://identity.tyo1.cloud.z.com/v2.0/"));
			assertThat(vs.values.get(0).mediaTypes.get(0).base, is("application/json"));
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
