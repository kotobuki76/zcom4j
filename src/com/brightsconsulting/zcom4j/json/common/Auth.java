package com.brightsconsulting.zcom4j.json.common;

public class Auth {

	public PasswordCredentials passwordCredentials;
	public String tenantId;

	public Auth() {
		this.passwordCredentials = new PasswordCredentials();
	}

}
