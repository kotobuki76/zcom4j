package com.brightsconsulting.zcom4j.api.compute;

import java.io.IOException;

import org.apache.http.auth.AuthenticationException;
import org.apache.http.client.ClientProtocolException;
import org.junit.Test;

import com.brightsconsulting.zcom4j.json.common.Token;
import com.brightsconsulting.zcom4j.json.common.Version;
import com.brightsconsulting.zcom4j.json.response.compute.GetVersionDetailResponse;
import com.brightsconsulting.zcom4j.util.JsonWriter;
import com.brightsconsulting.zcom4j.util.ZcomTokenManager;

public class GetVersionDetailTest {

	@Test
	public void test() {
		Token token;

		GetVersionDetail getVersionDetail = new GetVersionDetail();
		try {
			token = ZcomTokenManager.loadDefault();
			GetVersionDetailResponse res = getVersionDetail.request(
					Version.Type.V2, token);
			System.out.println(JsonWriter.toString(res));
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AuthenticationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
