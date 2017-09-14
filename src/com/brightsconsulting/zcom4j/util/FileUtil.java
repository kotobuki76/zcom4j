package com.brightsconsulting.zcom4j.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileUtil {

	public static String loadString(String path) throws IOException {
		StringBuilder builder = new StringBuilder();

		try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
			String string = reader.readLine();
			while (string != null) {
				builder.append(string + System.getProperty("line.separator"));
				string = reader.readLine();
			}
		} catch (FileNotFoundException e) {
			throw new FileNotFoundException();
		}

		return builder.toString();
	}
}
