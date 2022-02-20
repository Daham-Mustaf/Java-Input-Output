package io.java;

import java.io.File;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {

		String cwd = System.getProperty("user.dir");
		System.out.println("Working Directory: " + cwd);
		printFilePath("/Users/m-store/Downloads/Dokument8.docx");

	}

	public static void printFilePath(String pathname) {
		File file = new File(pathname);
		System.out.println("File Name: " + file.getName());
		System.out.println("File exists: " + file.exists());
		System.out.println("Absolute Path: " + file.getAbsolutePath());
		try {
			System.out.println("Canonical Path: " + file.getCanonicalPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
