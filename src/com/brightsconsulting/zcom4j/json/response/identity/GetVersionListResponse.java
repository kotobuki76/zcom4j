package com.brightsconsulting.zcom4j.json.response.identity;

import com.brightsconsulting.zcom4j.json.common.VersionList;


/**
 * JSONオブジェクト　トークン発行APIのレスポンス
 * @author kotobuki76
 *
 */
public class GetVersionListResponse {
	/**
	 * 
	 */
	public VersionList versions;

	/**
	 * 
	 */
	public GetVersionListResponse() {
		this.versions = new VersionList();
	}
}
