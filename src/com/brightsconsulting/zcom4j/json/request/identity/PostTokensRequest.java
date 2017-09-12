package com.brightsconsulting.zcom4j.json.request.identity;

import com.brightsconsulting.zcom4j.json.common.Auth;

public class PostTokensRequest {

	public Auth auth;

	public PostTokensRequest() {
		this.auth = new Auth();
	}
}
