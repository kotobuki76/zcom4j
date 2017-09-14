package com.brightsconsulting.zcom4j.api.compute;

import java.io.IOException;

import org.apache.http.auth.AuthenticationException;
import org.apache.http.client.ClientProtocolException;

import com.brightsconsulting.zcom4j.api.common.APIInvoker;
import com.brightsconsulting.zcom4j.json.common.Token;
import com.brightsconsulting.zcom4j.json.common.Version;
import com.brightsconsulting.zcom4j.json.response.compute.GetVersionDetailResponse;

/**
 * バージョン情報取得 https://cloud.z.com/sg/ja/cloud/docs/compute-get_version_list.html
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
	 * 
	 * @param type
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @throws AuthenticationException
	 */
	GetVersionDetailResponse request(Version.Type type, Token token)
			throws ClientProtocolException, IOException,
			AuthenticationException {

		String url = "https://compute.tyo1.cloud.z.com/" + type.getName();

		String json = this.getAPIClient().get(url, token);
		GetVersionDetailResponse resVersion = this.getObjectMapper().readValue(
				json, GetVersionDetailResponse.class);
		return resVersion;

	}
}
