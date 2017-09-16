package com.brightsconsulting.zcom4j.api.compute;

import java.io.IOException;

import org.apache.http.auth.AuthenticationException;
import org.apache.http.client.ClientProtocolException;
import org.junit.Test;

import com.brightsconsulting.zcom4j.BadRequestException;
import com.brightsconsulting.zcom4j.json.common.SecurityGroup;
import com.brightsconsulting.zcom4j.json.common.Token;
import com.brightsconsulting.zcom4j.json.request.compute.CreateVmRequest;
import com.brightsconsulting.zcom4j.json.response.BadRequestResponse;
import com.brightsconsulting.zcom4j.json.response.compute.CreateVmResponse;
import com.brightsconsulting.zcom4j.util.JsonWriter;
import com.brightsconsulting.zcom4j.util.ZcomTokenManager;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CreateVmTest {

	@Test
	public void test() {
		Token token;

		CreateVm createVm = new CreateVm();
		try {
			CreateVmRequest req = new CreateVmRequest();
			req.server.imageRef = "21113ec0-3d41-499b-8733-812eb4230e7b";
			req.server.flavorRef = "945f36dc-b6a2-4cd0-bbda-cda7e02e67b2";
			req.server.adminPass = "1234abcdABCD!@#$";
			// res.server.key_name = "TEST";
			req.server.security_groups.add(new SecurityGroup("default"));
			req.server.security_groups.add(new SecurityGroup("gncs-ipv4-all"));
			req.server.metadata.instance_name_tag = "TEST";
			req.server.links = null;
			token = ZcomTokenManager.loadDefault();
			System.out.println(JsonWriter.toString(token));
			CreateVmResponse res = createVm.request(token, req);
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
		} catch (BadRequestException e) {

			ObjectMapper mapper = new ObjectMapper();
			try {
				BadRequestResponse badreq = mapper.readValue(e.json,
						BadRequestResponse.class);
				System.out.println(badreq.badRequest.message);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			e.printStackTrace();
		}
	}
}
