package com.brightsconsulting.zcom4j.api.identity;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;

import com.brightsconsulting.zcom4j.api.common.APIInvoker;
import com.brightsconsulting.zcom4j.json.common.Version;
import com.brightsconsulting.zcom4j.json.response.identity.GetVersionDetailResponse;

/**
 * バージョン情報詳細取得
 * https://cloud.z.com/sg/ja/cloud/docs/identity-get_version_detail.html
 * 
 * @author kotobuki76
 * 
 */
public class GetVersionDetail extends APIInvoker {

	/**
	 * コンストラクタ
	 */
	public GetVersionDetail() {
		super();
	}

	/**
	 * バージョン情報詳細取得APIの呼び出し
	 * @param type
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 */
	GetVersionDetailResponse request(Version.Type type)
			throws ClientProtocolException, IOException {

		String url = "https://identity.tyo1.cloud.z.com/" + type.getName();

		String json = this.getAPIClient().get(url);
		GetVersionDetailResponse resVersion = this.getObjectMapper().readValue(
				json, GetVersionDetailResponse.class);
		return resVersion;

	}
}
