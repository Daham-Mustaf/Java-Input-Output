package io.java;

import java.io.File;
import java.io.IOException;

public class CreatingFiles {

	public static void main(String[] args) throws IOException {
		String cwd = System.getProperty("user.dir");
		System.out.println("Working Directory: " + cwd);

		File tsetFile = new File("test.txt");
		// Create the file
		boolean fileCreated = tsetFile.createNewFile();
		System.out.println(fileCreated);

	}

}
