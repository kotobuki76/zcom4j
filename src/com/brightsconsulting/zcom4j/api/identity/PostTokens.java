package com.brightsconsulting.zcom4j.api.identity;

import java.io.IOException;

import org.apache.http.auth.AuthenticationException;
import org.apache.http.client.ClientProtocolException;

import com.brightsconsulting.zcom4j.api.common.APIInvoker;
import com.brightsconsulting.zcom4j.json.request.identity.PostTokensRequest;
import com.brightsconsulting.zcom4j.json.response.identity.PostTokensResponse;

public class PostTokens extends APIInvoker {
	public PostTokens() {
		super();
	}

	public PostTokensResponse request(PostTokensRequest req)
			throws ClientProtocolException, IOException,
			AuthenticationException {
		String url = "https://identity.tyo1.cloud.z.com/v2.0/tokens";
		String req_json = this.getObjectMapper().writeValueAsString(req);
		String res_json = this.getAPIClient().post(url, req_json);
		// System.out.println(res_json);
		PostTokensResponse postTokensResponse = this.getObjectMapper()
				.readValue(res_json, PostTokensResponse.class);
		return postTokensResponse;

	}
}
