package io.java;

import java.io.File;
import java.io.IOException;

public class HandlingFiles {

	public static void main(String[] args) throws IOException {
		String cwd = System.getProperty("user.dir");
		System.out.println("Working Directory: " + cwd);

		File tsetFile = new File("test.txt");
		rootDir();

		// Change the dirPath value to list files.
		String dirPath = "/Users/m-store/eclipse-workspace/InputOutput";
		dirPathValueToList(dirPath);

	}

	private static void dirPathValueToList(String dirPath) {
		File dir = new File(dirPath);
		File[] list = dir.listFiles();

		for (File f : list) {
			if (f.isFile()) {
				System.out.println(f.getPath() + " (File)");
			} else if (f.isDirectory()) {
				System.out.println(f.getPath() + " (Directory)");
			}
		}

	}

	private static void rootDir() {

		File[] roots = File.listRoots();
		System.out.println("List of root directories:");
		for (File f : roots) {
			System.out.println(f.getPath());
		}

	}

}
