package com.brightsconsulting.zcom4j.api.compute;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

import com.brightsconsulting.zcom4j.api.common.APIInvoker;
import com.brightsconsulting.zcom4j.json.response.compute.GetVersionListResponse;

/**
 * バージョン情報取得 https://cloud.z.com/sg/ja/cloud/docs/compute-get_version_list.html
 * 
 * @author kotobuki76
 * 
 */
public class GetVersionList extends APIInvoker {

	/**
	 * コンストラクタ
	 */
	public GetVersionList() {
		super();
	}

	/**
	 * バージョン情報取得APIの呼び出し
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	GetVersionListResponse request() throws ClientProtocolException,
			IOException {
		String url = "https://compute.tyo1.cloud.z.com/";
		String json = this.getAPIClient().get(url);
		GetVersionListResponse resVersions = this.getObjectMapper().readValue(
				json, GetVersionListResponse.class);
		return resVersions;

	}
}
