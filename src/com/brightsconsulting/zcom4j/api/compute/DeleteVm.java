package com.brightsconsulting.zcom4j.api.compute;

import java.io.IOException;

import org.apache.http.auth.AuthenticationException;
import org.apache.http.client.ClientProtocolException;

import com.brightsconsulting.zcom4j.BadRequestException;
import com.brightsconsulting.zcom4j.api.common.APIInvoker;
import com.brightsconsulting.zcom4j.json.common.Token;

/**
 * VM削除 https://cloud.z.com/sg/ja/cloud/docs/compute-delete_vm.html
 * 
 * @author kotobuki76
 * 
 */
public class DeleteVm extends APIInvoker {

	/**
	 * コンストラクタ
	 */
	public DeleteVm() {
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
	public void request(Token token, String serverId)
			throws ClientProtocolException, IOException, AuthenticationException, BadRequestException {

		String url = "https://compute.tyo1.cloud.z.com/v2/" + token.tenant.id + "/servers/" + serverId;
		this.getAPIClient().delete(url, token);

	}
}
