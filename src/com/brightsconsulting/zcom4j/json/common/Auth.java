package com.brightsconsulting.zcom4j.json.common;

/**
 * JSONオブジェクト 認証情報
 * @author kotobuki76
 *
 */
public class Auth {

	/**
	 * 
	 */
	public PasswordCredentials passwordCredentials;
	/**
	 * 
	 */
	public String tenantId;

	/**
	 * 
	 */
	public Auth() {
		this.passwordCredentials = new PasswordCredentials();
	}

}
