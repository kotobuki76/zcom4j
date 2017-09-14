package com.brightsconsulting.zcom4j.api.compute;

import java.io.IOException;

import org.apache.http.auth.AuthenticationException;
import org.apache.http.client.ClientProtocolException;
import org.junit.Test;

import com.brightsconsulting.zcom4j.json.common.Token;
import com.brightsconsulting.zcom4j.json.response.compute.GetVmsDetailSpecifiedResponse;
import com.brightsconsulting.zcom4j.util.JsonWriter;
import com.brightsconsulting.zcom4j.util.ZcomTokenManager;

public class GetVmsDetailSpecifiedTest {

	@Test
	public void test() {
		Token token;

		GetVmsDetailSpecified getVmsDetailSpecified = new GetVmsDetailSpecified();
		try {
			token = ZcomTokenManager.loadDefault();
			GetVmsDetailSpecifiedResponse res = getVmsDetailSpecified.request(token, token.tenant.id, "5c6d6cf8-eba7-4642-8ca9-6fe1c52e96dd");
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
