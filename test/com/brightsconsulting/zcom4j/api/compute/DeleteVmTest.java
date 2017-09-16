package com.brightsconsulting.zcom4j.api.compute;

import java.io.IOException;

import org.apache.http.auth.AuthenticationException;
import org.junit.Test;

import com.brightsconsulting.zcom4j.BadRequestException;
import com.brightsconsulting.zcom4j.json.common.Token;
import com.brightsconsulting.zcom4j.util.ZcomTokenManager;

public class DeleteVmTest {

	@Test
	public void test() {

		Token token;
		DeleteVm vv = new DeleteVm();
		String serverId = "da2d04a3-cce7-4dff-a945-67288ec67786";
		try {
			token = ZcomTokenManager.loadDefault();
			vv.request(token, serverId);
		} catch (AuthenticationException | IOException | BadRequestException e) {
			e.printStackTrace();
		}
	}

}
