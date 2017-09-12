package com.brightsconsulting.zcom4j.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.brightsconsulting.zcom4j.json.common.Auth;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ZcomAuthLoader {

	private static final String _DS = System.getProperty("file.separator");
	private static final String _DEFAULT = System.getProperty("user.home")
			+ _DS + ".zcom";

	public static Auth loadDefault() throws IOException {

		return ZcomAuthLoader.load(_DEFAULT);
	}

	public static Auth load(String path) throws IOException {
		ObjectMapper mapper;
		mapper = new ObjectMapper();
		Auth auth = mapper.readValue(ZcomAuthLoader.loadString(path),
				Auth.class);

		return auth;
	}

	private static String loadString(String path) throws IOException {
		StringBuilder builder = new StringBuilder();

		try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
			String string = reader.readLine();
			while (string != null) {
				builder.append(string + System.getProperty("line.separator"));
				string = reader.readLine();
			}
		}

		return builder.toString();
	}

}
