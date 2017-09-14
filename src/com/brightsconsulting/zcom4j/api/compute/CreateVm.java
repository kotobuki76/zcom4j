package com.brightsconsulting.zcom4j.api.compute;

import java.io.IOException;

import org.apache.http.auth.AuthenticationException;
import org.apache.http.client.ClientProtocolException;

import com.brightsconsulting.zcom4j.BadRequestException;
import com.brightsconsulting.zcom4j.api.common.APIInvoker;
import com.brightsconsulting.zcom4j.json.common.Token;
import com.brightsconsulting.zcom4j.json.request.compute.CreateVmRequest;
import com.brightsconsulting.zcom4j.json.response.compute.CreateVmResponse;
import com.brightsconsulting.zcom4j.json.response.compute.GetVersionDetailResponse;

/**
 * VM追加 https://cloud.z.com/sg/ja/cloud/docs/compute-create_vm.html
 * 
 * @author kotobuki76
 * 
 */
public class CreateVm extends APIInvoker {

	/**
	 * コンストラクタ
	 */
	public CreateVm() {
		super();
	}

	/**
	 * VM追加APIの呼び出し
	 * 
	 * @param type
	 * @return
	 * @throws ClientProtocolException
	 * @throws IOException
	 * @throws AuthenticationException
	 * @throws BadRequestException 
	 */
	CreateVmResponse request(Token token, CreateVmRequest req)
			throws ClientProtocolException, IOException,
			AuthenticationException, BadRequestException {

		String url = "https://compute.tyo1.cloud.z.com/v2/" + token.tenant.id
				+ "/servers";
		System.out.println(url);
		String req_json = this.getObjectMapper().writeValueAsString(req);
		System.out.println(req_json);
		String res_json = this.getAPIClient().post(url, req_json, token);
		CreateVmResponse res = this.getObjectMapper().readValue(res_json,
				CreateVmResponse.class);
		return res;

	}
}
