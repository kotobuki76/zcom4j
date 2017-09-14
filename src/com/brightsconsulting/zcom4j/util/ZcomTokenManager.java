package com.brightsconsulting.zcom4j.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.brightsconsulting.zcom4j.json.common.Token;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ZcomTokenManager {

	private static final String _DS = System.getProperty("file.separator");
	private static final String _DEFAULT = System.getProperty("user.home")
			+ _DS + ".zcomtoken";

	public static Token loadDefault() throws IOException {

		return ZcomTokenManager.load(_DEFAULT);
	}

	public static void saveDefault(Token token) throws IOException {

		ZcomTokenManager.save(token, _DEFAULT);
	}

	public static Token load(String path) throws IOException {

		try {
			ObjectMapper mapper;
			mapper = new ObjectMapper();
			Token token = mapper.readValue(FileUtil.loadString(path),
					Token.class);

			if (token.isExpired()) {
				return null;
			} else {
				return token;
			}
		} catch (FileNotFoundException e) {
			return null;
		}
	}

	public static void save(Token token, String path) throws IOException {

		ObjectMapper mapper;
		mapper = new ObjectMapper();
		mapper.writeValue(new File(path), token);
	}

}
