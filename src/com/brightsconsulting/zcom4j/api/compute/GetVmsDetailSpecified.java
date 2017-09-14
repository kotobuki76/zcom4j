package com.brightsconsulting.zcom4j.api.compute;

import java.io.IOException;

import org.apache.http.auth.AuthenticationException;
import org.apache.http.client.ClientProtocolException;

import com.brightsconsulting.zcom4j.api.common.APIInvoker;
import com.brightsconsulting.zcom4j.json.common.Token;
import com.brightsconsulting.zcom4j.json.response.compute.GetVmsDetailSpecifiedResponse;

/**
 * バージョン情報取得 https://cloud.z.com/sg/ja/cloud/docs/compute-get_version_list.html
 * 
 * @author kotobuki76
 * 
 */
public class GetVmsDetailSpecified extends APIInvoker {

	/**
	 * コンストラクタ
	 */
	public GetVmsDetailSpecified() {
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
	public GetVmsDetailSpecifiedResponse request(Token token, String tenantId, String serverId)
			throws ClientProtocolException, IOException, AuthenticationException {

		String url = "https://compute.tyo1.cloud.z.com/v2/" + tenantId + "/servers/" + serverId;

		String json = this.getAPIClient().get(url, token);
		GetVmsDetailSpecifiedResponse res = this.getObjectMapper().readValue(json, GetVmsDetailSpecifiedResponse.class);
		return res;

	}
}
