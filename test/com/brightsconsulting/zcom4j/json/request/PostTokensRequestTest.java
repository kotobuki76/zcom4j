package com.brightsconsulting.zcom4j.json.request;

import org.junit.Test;

import com.brightsconsulting.zcom4j.json.request.identity.PostTokensRequest;
import com.brightsconsulting.zcom4j.util.JsonWriter;

public class PostTokensRequestTest {

	@Test
	public void test() {
		PostTokensRequest req = new PostTokensRequest();
		System.out.println(JsonWriter.toString(req));
	}

}
