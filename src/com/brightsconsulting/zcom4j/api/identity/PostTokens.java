package com.brightsconsulting.zcom4j.api.identity;

import java.io.IOException;

import org.apache.http.auth.AuthenticationException;
import org.apache.http.client.ClientProtocolException;

import com.brightsconsulting.zcom4j.BadRequestException;
import com.brightsconsulting.zcom4j.api.common.APIInvoker;
import com.brightsconsulting.zcom4j.json.request.identity.PostTokensRequest;
import com.brightsconsulting.zcom4j.json.response.identity.PostTokensResponse;

/**
 * トークン発行 https://cloud.z.com/sg/ja/cloud/docs/identity-post_tokens.html
 * 
 * @author kotobuki76
 * @version 1.0
 * 
 */
public class PostTokens extends APIInvoker {
	
	/**
	 * コンストラクタ
	 */
	public PostTokens() {
		super();
	}

	/**
	 * トークン発行APIの呼び出し
	 * @param req　リクエスト用のPostTokensRequestオブジェクト
	 * @return　結果を格納するPostTokensResponseオブジェクト
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @throws AuthenticationException
	 * @throws BadRequestException 
	 */
	public PostTokensResponse request(PostTokensRequest req)
			throws ClientProtocolException, IOException,
			AuthenticationException, BadRequestException {
		String url = "https://identity.tyo1.cloud.z.com/v2.0/tokens";
		String req_json = this.getObjectMapper().writeValueAsString(req);
		String res_json = this.getAPIClient().post(url, req_json);
		// System.out.println(res_json);
		PostTokensResponse postTokensResponse = this.getObjectMapper()
				.readValue(res_json, PostTokensResponse.class);
		return postTokensResponse;

	}
}
