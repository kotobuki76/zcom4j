package com.brightsconsulting.zcom4j.util;

import java.io.IOException;

import com.brightsconsulting.zcom4j.json.common.Auth;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ZcomAuthLoader {

	private static final String _DS = System.getProperty("file.separator");
	private static final String _DEFAULT = System.getProperty("user.home") + _DS + ".zcom";

	public static Auth loadDefault() throws IOException {

		return ZcomAuthLoader.load(_DEFAULT);
	}

	public static Auth load(String path) throws IOException {
		ObjectMapper mapper;
		mapper = new ObjectMapper();
		Auth auth = mapper.readValue(FileUtil.loadString(path), Auth.class);

		return auth;
	}

}
