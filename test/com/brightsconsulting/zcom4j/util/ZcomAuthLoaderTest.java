package com.brightsconsulting.zcom4j.util;

import java.io.IOException;

import org.junit.Test;

import com.brightsconsulting.zcom4j.json.common.Auth;

public class ZcomAuthLoaderTest {

	@Test
	public void test() {
		try {
			Auth auth = ZcomAuthLoader.loadDefault();
			System.out.println(auth.passwordCredentials.username);
			System.out.println(auth.passwordCredentials.password);
			System.out.println(auth.tenantId);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
