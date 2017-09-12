package com.brightsconsulting.zcom4j.api.identity;

import java.io.IOException;

import org.apache.http.auth.AuthenticationException;
import org.apache.http.client.ClientProtocolException;
import org.junit.Test;

import com.brightsconsulting.zcom4j.json.request.identity.PostTokensRequest;
import com.brightsconsulting.zcom4j.json.response.identity.PostTokensResponse;
import com.brightsconsulting.zcom4j.util.ZcomAuthLoader;

public class PostTokensTest {

	@Test
	public void test() {
		PostTokens postTokens = new PostTokens();
		try {
			PostTokensRequest req = new PostTokensRequest();
			req.auth = ZcomAuthLoader.loadDefault();
			PostTokensResponse postTokensResponse = postTokens.request(req);
			System.out.println(postTokensResponse.access.token.id);
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AuthenticationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
