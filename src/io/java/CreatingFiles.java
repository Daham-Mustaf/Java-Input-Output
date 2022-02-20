package io.java;

import java.io.File;
import java.io.IOException;

public class CreatingFiles {

	public static void main(String[] args) throws IOException {
		String cwd = System.getProperty("user.dir");
		System.out.println("Working Directory: " + cwd);

		File tsetFile = new File("test.txt");
		rootDir();


	}

	private static void rootDir() {
		
		File[] roots = File.listRoots();
		 System.out.println("List of root directories:");
		 for(File f : roots){
		 System.out.println(f.getPath());
		 }
		
	}

}
