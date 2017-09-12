package com.brightsconsulting.zcom4j.api.identity;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

import com.brightsconsulting.zcom4j.api.common.APIInvoker;
import com.brightsconsulting.zcom4j.json.response.identity.GetVersionListResponse;

/**
 * バージョン情報取得 https://cloud.z.com/sg/ja/cloud/docs/identity-get_version_list.html
 * 
 * @author kotobuki76
 * 
 */
public class GetVersionList extends APIInvoker {

	public GetVersionList() {
		super();
	}

	GetVersionListResponse request() throws ClientProtocolException,
			IOException {
		String url = "https://identity.tyo1.cloud.z.com/";
		String json = this.getAPIClient().get(url);
		GetVersionListResponse resVersions = this.getObjectMapper().readValue(
				json, GetVersionListResponse.class);
		return resVersions;

	}
}
