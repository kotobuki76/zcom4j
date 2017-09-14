package com.brightsconsulting.zcom4j.api.identity;

import java.io.IOException;

import org.apache.http.auth.AuthenticationException;
import org.apache.http.client.ClientProtocolException;
import org.junit.Test;

import com.brightsconsulting.zcom4j.json.common.Version;
import com.brightsconsulting.zcom4j.json.response.identity.GetVersionDetailResponse;
import com.brightsconsulting.zcom4j.util.JsonWriter;

public class GetVersionDetailTest {

	@Test
	public void test() {
		GetVersionDetail getVersionDetail = new GetVersionDetail();
		try {
			GetVersionDetailResponse res = getVersionDetail
					.request(Version.Type.V2_0);
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
